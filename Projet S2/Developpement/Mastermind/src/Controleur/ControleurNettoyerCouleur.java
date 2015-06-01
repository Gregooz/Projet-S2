package Controleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import Jeu.Partie;
import Vue.FenetrePlay;

public class ControleurNettoyerCouleur implements ActionListener {
	private FenetrePlay fenetre;
	private Partie mastermind;
	
	public ControleurNettoyerCouleur(FenetrePlay fenetre, Partie mastermind ) {
		this.fenetre = fenetre;
		this.mastermind = mastermind;		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton[] bPions = this.fenetre.getbPions();
		for (JButton pion : bPions) {
			pion.setBackground(null);
		}
		this.fenetre.getValiderCouleur().setEnabled(false);

	}
}
