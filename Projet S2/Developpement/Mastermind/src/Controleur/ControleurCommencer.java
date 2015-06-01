package Controleur;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;

import strategy.Answer;
import strategy.Code;
import Jeu.AllCodes;
import Jeu.Partie;
import Vue.FenetrePlay;

public class ControleurCommencer implements ActionListener{
	private FenetrePlay fenetre;
	private Partie mastermind;
	
	private Code ordi;
	private List<Code> allCombi;
	
	public ControleurCommencer(FenetrePlay fenetre, Partie mastermind ) {
		this.fenetre = fenetre;
		this.mastermind = mastermind;
		
		AllCodes thisAllCodes = new AllCodes(compteNbPions());
		this.allCombi = thisAllCodes.getAllCodes();
		
		this.ordi = this.mastermind.combiOrdinateur(allCombi);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(ordi.getLength());
		
		Answer indice =ordi.compare(this.mastermind.getSecretCode());
		ordi = this.mastermind.intelCombiOrdinateur(this.allCombi, this.ordi, indice);
		boolean trouve = this.mastermind.testEquivalence(ordi);
		this.mastermind.setCombiIndice(indice);
		
		
		//equiIntCouleur(int num)
		//this.fenetre.ajoutCombi(la combi que l'ordi vient de créer, la combi de pion indices);
		//               void->    int[], int[]
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
	
	
}
