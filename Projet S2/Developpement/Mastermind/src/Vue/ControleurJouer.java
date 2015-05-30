package Vue;

import javax.swing.JButton;
import javax.swing.JPanel;

import java.awt.event.*;

public class ControleurJouer implements ActionListener
{
	private Fenetre fenetre;
	private JButton bouton;
	
	
	public ControleurJouer(Fenetre fenetre, JButton bouton)
	{
		this.fenetre = fenetre;
		this.bouton = bouton;
	}

	@Override
	public void actionPerformed(ActionEvent a)
	{
		fenetre.changerPanel();
	}

}
