package Controleur;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import Jeu.Partie;
import Vue.FenetrePlay;

public class ControleurCouleur implements ActionListener {
	
	private FenetrePlay fenetre;
	private Partie mastermind;
	
	public ControleurCouleur(FenetrePlay fenetre, Partie mastermind ) {
		this.fenetre = fenetre;
		this.mastermind = mastermind;
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		JButton couleurSelect = (JButton )e.getSource();
		Color couleur = couleurSelect.getBackground();

		for( JButton pion : this.fenetre.getbPions()) {
			if (pion.isEnabled())  {
				pion.setBackground(couleur);
			}
		}
		
		if (compteNbPions() <= 3) {
			this.fenetre.getValiderCouleur().setEnabled(false);
		}
		else {
			this.fenetre.getValiderCouleur().setEnabled(true);
		}
		actifBoutonPion(true);
		actifBoutonCouleur(false);
		this.fenetre.getNb_pions().setText( compteNbPions().toString());
	}
	
	private void actifBoutonPion(boolean b) {
		JButton[] bPions = this.fenetre.getbPions();
		for (JButton pion : bPions) {
			pion.setEnabled(b);
		}
	}
	
	private void actifBoutonCouleur(boolean b) {
		this.fenetre.getbBlanc().setEnabled(b);
		this.fenetre.getbBleu().setEnabled(b);
		this.fenetre.getbRouge().setEnabled(b);
		this.fenetre.getbJaune().setEnabled(b);
		this.fenetre.getbNoir().setEnabled(b);
		this.fenetre.getbCyan().setEnabled(b);
		this.fenetre.getbViolet().setEnabled(b);
	}
	
	private Integer compteNbPions()
	{
		int nbPions = 0;
		Color defaultColor = new Color(238,238,238);
		JButton[] bPions = this.fenetre.getbPions();
		for (JButton pion : bPions) {
			if (!pion.getBackground().equals(defaultColor)) {
				nbPions ++;
//				System.out.println(pion.getBackground().toString());
			}
		}
		return nbPions;
	}
}
