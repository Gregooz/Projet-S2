package Vue;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

public class ControleurFrame implements KeyListener
{
	private Fenetre fenetre;
	private JPanel panel;
	
	
	
	public ControleurFrame(Fenetre fenetre, JPanel panel)
	{
		this.fenetre = fenetre;
		this.panel = panel;
	}



	@Override
	public void keyPressed(KeyEvent e)
	{
		
		if(e.getKeyChar() =='j')
		{
//			fenetre.revenirMenu();
			System.out.println("J");
		}
	}


	@Override
	public void keyReleased(KeyEvent e)
	{
		//TODO
	}


	@Override
	public void keyTyped(KeyEvent e)
	{
		//TODO
		
	}

}
