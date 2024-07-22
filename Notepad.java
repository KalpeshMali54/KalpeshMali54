
package notepad;

import java.awt.*;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;
import javax.accessibility.Accessible;
public class Notepad  extends MenuItem implements MenuContainer, Accessible{


Menu l1=new Menu("File ");
MenuBar mb=new MenuBar();
JFrame f=new JFrame("Notepad");
Image icon= Toolkit.getDefaultToolkit().getImage("C:\\Users\\91954\\Downloads");
Menu  l2=new Menu("Edit ");
Menu l3=new Menu("View ");
MenuItem b1=new MenuItem ("NewFile");
MenuItem b2=new MenuItem("OpenFile");
TextField tf=new TextField();
MenuItem c1=new MenuItem("Copy");
MenuItem c2=new MenuItem("Paste");
MenuItem c3=new MenuItem("Delete");



    public Notepad(){
        l1.add(b1);
        l1.add(b2);
        l2.add(c1);
        l2.add(c2);
        l2.add(c3);

        tf.setBounds(0,60,10090,10090);
        f.add(tf);
        f.setIconImage(icon); 
        f.setLayout(null);
        f.setVisible(true);
        f.setSize(10000,10000);
    }
    public static void main(String[] args) {
        Notepad np=new Notepad();
        
    }

    @Override
    public void remove(MenuComponent mc) {
       
    }


}

    

