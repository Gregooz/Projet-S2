package Controleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import Jeu.Partie;
import Vue.FenetrePlay;

public class ControleurPionsCouleur implements ActionListener{
	private FenetrePlay fenetre;
	private Partie mastermind;
	
	public ControleurPionsCouleur(FenetrePlay fenetre, Partie mastermind ) {
		this.fenetre = fenetre;
		this.mastermind = mastermind;
		actifBoutonCouleur(false);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		actifBoutonPion(false);
		JButton pionSelect = (JButton )e.getSource();
		pionSelect.setEnabled(true);
		actifBoutonCouleur(true);
		
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
}