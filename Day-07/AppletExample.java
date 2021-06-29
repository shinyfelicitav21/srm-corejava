import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;    

//<APPLET CODE= "AppletExample" WIDTH = "500" HEIGHT = "400"></APPLET>

public class AppletExample extends Applet {

  public void paint(Graphics g){
  
  DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
   LocalDateTime now = LocalDateTime.now();  
   System.out.println(dtf.format(now)); 
  }
}