

package notepad;
import java.awt.*;
public class icon {


public icon(){ 
 Frame f=new Frame(); 
 Image icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\91954\\Downloads"); 

f.setIconImage(icon); 
f.setLayout(null); 
f.setSize(400,400); 
f.setVisible(true); 
 } 
 public static void main(String args[]){ 
 new ToolkitExample(); 
 } 
 }    

