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

    public CacheJPanel() {
        setBackground(Color.WHITE);

    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        int x1 = 110;
        int xx1 = 10;
        int y1 = 10;
        int yy1 = 10;
        int x2 = 100;
        int y2 = 25;
        int x3 = 25;
        int y3 = 5;
        
        
        int column = 8;// Columns in cache
        int rows = 8;// Rows in cache
        int scounter = 0; // Counter for Rectangel
        int lcounter = 0; // Counter for lines
        int rcounter = 0; // Counter for rows
        while (rcounter < rows) {
            scounter = 0;
            g.setColor(Color.BLACK);
            Graphics2D g2 = (Graphics2D) g;
            g2.setStroke(new BasicStroke(2));
            g.drawRect(xx1, y1, x3, y2);

            x3 = x3 + 25;
            xx1 = xx1 + 25;

            g.drawRect(xx1, y1, x2, y2);

            xx1 = xx1 + x2;
            // x2=x2+100;
            // xx1=xx1+100;


            while (scounter < column) {
                lcounter = 0;
                g.setColor(Color.BLACK); //färg på miss-rutan 

                g.drawRect(xx1, y1, x2, y2); //Rektangeln

                while (lcounter < 3) {
                    g.setColor(Color.BLACK);
                    g.drawLine(x1 + x3, yy1, x1 + x3, yy1 + y3); //Överstrecken
                    g.drawLine(x1 + x3, y1 + y2, x1 + x3, y1 + y2 - y3);//Understrecken
                    x3 = x3 + 25;
                    lcounter++;
                }
                x3 = x3 + 25;
                xx1 = xx1 + x2;
                scounter++;
            }

            yy1 = yy1 + 25;
            y2 = y2 + 25;


            x1 = 110;
            xx1 = 10;
            x2 = 100;
            x3 = 25;


            rcounter++;


        }
    }
}