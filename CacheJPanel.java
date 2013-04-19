/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cachesimulator;
import java.awt.*;
import javax.swing.*;
/**
 *
 * @author DELL
 */
public class CacheJPanel extends JPanel {

    

public CacheJPanel(){
    setBackground(Color.WHITE);
    
}
public void paintComponent(Graphics g) {
	super.paintComponent(g); 
        g.setColor(Color.BLACK);						//färg på miss-rutan 
    g.drawRect(10, 10, 25, 25);
   
    
} 
 
        
    
      
}