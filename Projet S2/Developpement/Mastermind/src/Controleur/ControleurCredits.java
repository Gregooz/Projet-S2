package Vue;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

public class ControleurCredits implements ActionListener
{
	private Fenetre fenetre;
	private JButton bouton;
	
	
	public ControleurCredits(Fenetre fenetre, JButton bouton)
	{
		this.fenetre = fenetre;
		this.bouton = bouton;
	}

	@Override
	public void actionPerformed(ActionEvent a)
	{
		String msg = new String("Jeu réalisé par Nicolas GOUREAU,  Ian CLEMENT,  Fabien DIAS et Grégoire DECAMP\n"
				+"dans le cadre de leur Projet de 2ème Semestre en 1ère année de DUT Informatique");
		JOptionPane.showMessageDialog(bouton, msg, new String("Crédits"), 1);
	}
}
