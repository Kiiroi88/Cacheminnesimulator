package simulator;
import java.awt.*;
import javax.swing.*;
public class Paint_square extends JPanel {
	
	public Paint_square(){
		setBackground(Color.WHITE);
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g); 
		
		//koden för bild här
		int x = 10;
		int y = 10;
		
		g.setColor(Color.RED);						//färg på miss-rutan 
		g.fillRect(10, 10, 25, 25);
		g.setColor(Color.BLACK);
		Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(2));
		g.drawRect(10, 10, 100,25);
		g.drawLine(35, 10, 35, 35);
		g.drawLine(60, 10, 60, 35);
		g.drawLine(85, 10, 85, 35);
		g.setColor(Color.WHITE);
		
		g.drawLine(35, 15, 35, 30);
		g.drawLine(60, 15, 60, 30);
		g.drawLine(85, 15, 85, 30);
		g.setColor(Color.RED);
		g.fillRect(11, 11, 23, 23);
		
	}
}