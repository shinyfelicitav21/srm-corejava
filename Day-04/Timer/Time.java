package Timer;
import java.util.Scanner;
public class Time {
	
	int hours,seconds,minutes;
	int input;
	
	Scanner sc = new Scanner(System.in);
	
	public void secondsToHours()
	{
	System.out.print("Enter the no.of.seconds: ");
	input = sc.nextInt();
	hours = input / 3600;
	minutes = (input % 3600) / 60;
	seconds = (input % 3600) % 60;
	System.out.println("Hours: " + hours);
	System.out.println("Minutes: " + minutes);
	System.out.println("Seconds: " + seconds);
	}
	
	public void minutesToHours()
	{
	System.out.print("Enter the no.of.minutes: ");
	System.out.println("");
	minutes=sc.nextInt();
	hours=minutes/60;
	minutes=minutes%60;
	System.out.println("Hours: " + hours);
	System.out.println("Minutes: " + minutes);
	}
	
	public void hoursToMinutes()
	{ 
	System.out.println("Enter the no.of.hours:");
	hours=sc.nextInt();
	minutes=(hours*60);
	System.out.println("Minutes: " + minutes);
	}
	
	public void hoursToSeconds()
	{ 
	System.out.println("Enter the no.of.hours:");
	hours=sc.nextInt();
	seconds=(hours*3600);
	System.out.println("Minutes: " + seconds);
	
	}
	}

