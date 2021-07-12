import java.io.*;
import java.net.*;

public class UDPServer
{
	public static void main(String args[]) {
		DatagramSocket socket = null;
	
	try
	{
		socket = new DatagramSocket(7077);
		
		byte[] b = new byte[65536];
		DatagramPacket datain = new DatagramPacket(b, b.length);
		
		echo("Server socket created. Waiting for incoming data...");
		
		while(true)
		{
			socket.receive(datain);
			byte[] data = datain.getData();
			String s = new String(data, 0, datain.getLength());
			
			echo(datain.getAddress().getHostAddress() + " : " + datain.getPort() + " - " + s);
			
			s = "YES : " + s;
			DatagramPacket dgp = new DatagramPacket(s.getBytes() , s.getBytes().length ,datain.getAddress() , datain.getPort());
			socket.send(dgp);
			
		}
	}
	
	catch(IOException e)
	{
		System.err.println("IOException " + e);
	}
}

public static void echo(String msg)
{
	System.out.println(msg);
}
}