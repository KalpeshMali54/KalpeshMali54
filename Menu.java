/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates

 * and open the template in the editor.
 */
package notepad;

import java.awt.*;
import javax.accessibility.Accessible;


public class Menu extends MenuItem implements MenuContainer, Accessible{
Menustatic {
    Frame f= new Frame("Menu and MenuItem Example"); 
    MenuBar mb=new MenuBar(); 
    Menu menu=new Menu(); 
    Menu submenu=new Menu(); 
    MenuItem i1=new MenuItem("Item 1"); 

    MenuItem i2=new MenuItem("Item 2"); 
    MenuItem i3=new MenuItem("Item 3"); 
    MenuItem i4=new MenuItem("Item 4"); 
    MenuItem i5=new MenuItem("Item 5"); 
    menu.add((Menu) i1); 
    menu.add((Menu) i2); 
    menu.add((Menu) i3); 
    submenu.add((Menu) i4); 
    submenu.add((Menu) i5); 
    menu.add(submenu); 
    mb.add(menu); 
    f.setMenuBar(mb); 
    f.setSize(400,400); 
    f.setLayout(null); 
    f.setVisible(true); 
    } 
public static void main(String args[]) 
 { 
 new Menu(); 
 } 

    private Menu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Menu(String edit_) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void add(Menu submenu) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void add(MenuItem b1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 } 
    
    
    
    
    

    @Override
    public void remove(MenuComponent mc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}