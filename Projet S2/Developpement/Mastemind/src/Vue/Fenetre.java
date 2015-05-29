package Vue;

import javax.swing.*;
import java.awt.*;

public class Fenetre extends JFrame
{
	public Fenetre()
	{
		JPanel principal = new JPanel();
//		ImagePanel panel = new ImagePanel(new ImageIcon("").getImage());
		principal.setLayout(new BorderLayout());
			JPanel bouttons = new JPanel();
			JPanel logo = new JPanel();
		
		principal.add(bouttons, BorderLayout.SOUTH);
		principal.add(logo, BorderLayout.NORTH);
//		principal.add(panel, BorderLayout.CENTER);
		
		this.setContentPane(principal);
		this.pack();
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setVisible(true);
	}
//*-------------------------------------------------------------------------*//		
	public static void main(String[] args)
	{
		ImagePanel panel = new ImagePanel(new ImageIcon("img/18a5kzrhxhqwvjpg.jpg").getImage());

	    JFrame frame = new JFrame();

	    JButton button1 = new JButton("coucou");
	    JButton button2 = new JButton("hey");
	    JButton button3 = new JButton("ollo");
	    JButton button4 = new JButton("heil");
	    
	    JPanel test = new JPanel();
	    test.setLayout(new GridLayout(1,4));
	    test.add(button1);
	    test.add(button2);
	    test.add(button3);
	    test.add(button4);
	    frame.setLayout(new BorderLayout());
	    frame.add(test, BorderLayout.SOUTH);
	    frame.setResizable(false);
	    frame.getContentPane().add(panel);
	    frame.pack();
	    frame.setVisible(true);
	    
	}
}


