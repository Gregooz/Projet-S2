package Controleur;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.UIManager;

import Jeu.Partie;
import Vue.FenetrePlay;

public class ControleurParametre  {

		private FenetrePlay fenetre;
		private Partie mastermind;
		
		public ControleurParametre(FenetrePlay fenetre, Partie mastermind )   {
			this.fenetre = fenetre;
			this.mastermind = mastermind;
			
			
			//this.fenetre.getNb_tours().setText(nbPions.toString());
			
			this.fenetre.getNomJoueur().setText(this.mastermind.getJoueur().getPseudo());

			
		
			
		}



	
}
