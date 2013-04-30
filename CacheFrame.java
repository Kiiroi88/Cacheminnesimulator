/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cachesimulator;

import java.awt.*;
import javax.swing.JFrame;

/**
 *
 * @author DELL
 */
public class CacheFrame {
    public void Frame(){
		JFrame gui = new JFrame();
		gui.setTitle("Paint Program");
		gui.setSize(800, 600);
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                CacheJPanel p = new CacheJPanel();
                
                Container pane = gui.getContentPane();
                pane.setLayout (new GridLayout(1,1));
                
                pane.add(p);
                
                gui.setVisible(true);
 } 
    
}
