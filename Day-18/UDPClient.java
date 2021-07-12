import java.io.*;
import java.net.*;

public class UDPClient
{
	public static void main(String args[])
	{
		DatagramSocket socket = null;
		int port =7077;
		String s;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try
		{
			socket = new DatagramSocket();
			InetAddress host = InetAddress.getByName("localhost");
			
                        
			while(true)
			{
				echo("Enter the message to send : ");
				s = (String)br.readLine();
				byte[] b = s.getBytes();
				
				DatagramPacket  dgp = new DatagramPacket(b , b.length , host , port);
				socket.send(dgp);
				
	
				byte[] b1 = new byte[65536];
				DatagramPacket reply = new DatagramPacket(b1, b1.length);
				socket.receive(reply);
				
				byte[] data = reply.getData();
				s = new String(data, 0, reply.getLength());
				
				
				echo(reply.getAddress().getHostAddress() + " : " + reply.getPort() + " - " + s);
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