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

        int x1 = 10;
        int xx1 = 10;
        int y1 = 10;
        int yy1 = 10;
        int x2 = 100;
        int y2 = 25;
        int x3 = 25;
        int y3 = 5;
        int column = 3;
        int rows = 5;
        int box = column;
        int scounter = 0;
        int lcounter = 0;
        int rcounter = 0;
        while (rcounter < rows) {
            scounter = 0;
            while (scounter < box) {
                lcounter = 0;
                g.setColor(Color.BLACK); //färg på miss-rutan 
                Graphics2D g2 = (Graphics2D) g;
                g2.setStroke(new BasicStroke(2));
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


            x1 = 10;
            xx1 = 10;
            x2 = 100;
            x3 = 25;


            rcounter++;
            System.out.println("ksksk");

        }
    }
}