package Vue;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ControleurOptions implements ActionListener
{

	private Fenetre fenetre;
	private JButton bouton;
	
	
	public ControleurOptions(Fenetre fenetre, JButton bouton)
	{
		this.fenetre = fenetre;
		this.bouton = bouton;
	}

	@Override
	public void actionPerformed(ActionEvent a)
	{
		
	}
	

}
