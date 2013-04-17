package simulator;
import java.awt.*;
import javax.swing.*;
public class Frame {
	
	public static void main(String args[]){
		new Frame();
	}
	public Frame(){
		JFrame gui = new JFrame();
		gui.setTitle("Paint Program");
		gui.setSize(400, 400);
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Paint_square panel = new Paint_square ();
		
		Container pane = gui.getContentPane();
		pane.setLayout (new GridLayout(1,1));
		
		pane.add(panel);
		gui.setVisible(true);
		
}
}