import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main {

	public static void main(String[] args) {
		JFrame obj = new JFrame();
		Gameplay gameplay = new Gameplay();
		
		// ImageIcon icon = new
		// ImageIcon("C:\\Users\\MAHFUZ\\eclipse-workspace\\SnakeGame\\snakeback.png");
		// obj.setBounds(10,10,905,700);
		// obj.setBackground(icon);
		ImageIcon background = new ImageIcon(
				"C:\\\\Users\\\\MAHFUZ\\\\eclipse-workspace\\\\SnakeGame\\\\snakeback.png");
		Image img = background.getImage();
		Image temp = img.getScaledInstance(905, 700, Image.SCALE_SMOOTH);
		background = new ImageIcon(temp);
		JLabel ob = new JLabel(background);
		obj.add(ob);
	    JLabel jl1 = new JLabel();
	     jl1.setFont(new Font("Times new roman" ,Font.BOLD,24));
	     jl1.setText("Welcome");
	 
	 
		obj.setFont(new Font("arial",Font.BOLD,50));
		obj.setBounds(0, 0, 905, 700);
		obj.setResizable(false);
		obj.setVisible(true);
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		obj.add(gameplay);
	    obj.setTitle("SnakeGame By Fantastic Four" );
	 
	     jl1.setSize(100, 150);
	    
	    
		obj.setAlwaysOnTop(false);
	
		obj.setLocation(170, 50);
	

	}
}
