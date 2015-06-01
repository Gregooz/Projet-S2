package Controleur;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import strategy.Code;
import strategy.T;
import strategy.implementations.BasicStrategy;
import strategy.implementations.Simple;
import Jeu.AllCodes;
import Jeu.Partie;
import Libs.Joueur;
import Vue.FenetrePlay;

public class ControleurValider  implements ActionListener{
	private FenetrePlay fenetre;
	private Partie mastermind;
	
	public ControleurValider(FenetrePlay fenetre, Partie mastermind ) {
		this.fenetre = fenetre;
		this.mastermind = mastermind;
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Joueur joueur = this.mastermind.getJoueur();
		
		BasicStrategy strategy= new Simple(compteNbPions());
		this.mastermind.setOrdinateur(strategy);
		

		T[] tab_inter = new T[compteNbPions()];
		int j =0;
		JButton[] pion = this.fenetre.getbPions();
		JButton[] pionBis = new JButton[compteNbPions()];
		
		System.out.println("Nombre de pions :" + compteNbPions());
		for (int i=0; i< 6;i++) {
			
			if (! (equiCouleurInt(pion[i].getBackground())  == 0)) 
			{
				tab_inter[j] = T.getValues( equiCouleurInt(pion[i].getBackground() ));
				pionBis[j] = new JButton(" ");
				pionBis[j].setBackground(pion[i].getBackground());
				System.out.println((i+1)+" :t["+j+"]" + equiCouleurInt(pion[i].getBackground() ));
				j++;
				
			}
			
		}
		this.fenetre.getJpanBas().setVisible(false);		
		this.fenetre.getJpanHautCombi().setVisible(true);
		this.fenetre.setPionCombi(pionBis);
		this.fenetre.affichageCombiHaut();

		
		Code comb = new Code(tab_inter);
		
		// prendre le tabmeau pion de jbutton et les afficher sans le vide dan jpanhautcombi
		joueur.setCombi(comb);
		this.mastermind.setCombiJoueur();
		this.fenetre.getbDebut().setEnabled(true);
		System.out.println(this.mastermind.getCombinaison());
		
		
	}
	    

	
	private Integer compteNbPions()
	{
		int nbPions = 0;
		Color defaultColor = new Color(238,238,238);
		JButton[] bPions = this.fenetre.getbPions();
		for (JButton pion : bPions) {
			if (!pion.getBackground().equals(defaultColor)) {
				nbPions ++;
			}
		}
		return nbPions;
	}

	
	
	private int equiCouleurInt(Color couleur) {
		int numCouleur = 0;
		if ( couleur.equals(Color.BLACK)) {
			numCouleur = 1;
		}
		else if (couleur.equals(Color.white)) {
			numCouleur = 7;
		}
		else if (couleur.equals(Color.cyan)) {
			numCouleur = 8;
		}
		else if (couleur.equals(Color.blue)) {
			numCouleur = 5;
		}
		else if (couleur.equals(Color.yellow)) {
			numCouleur = 3;
		}
		else if (couleur.equals(Color.red)) {
			numCouleur = 2;
		}
		else if (couleur.equals(Color.magenta)) {
			numCouleur = 6;
		}
		else if (couleur.equals(Color.GREEN)) {
			numCouleur = 4;
		}
		return numCouleur;
	}
}
