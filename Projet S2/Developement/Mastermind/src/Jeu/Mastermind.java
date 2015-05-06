/**
* Classe Mastermind
* 
*@author 
*@version 1.0
*
*/
package Jeu;

import java.util.Scanner;

import Libs.Combinaison;
import Libs.Joueur;
import Libs.Couleur;
import Libs.Pion;
import Libs.PionCombinaison;

public class Mastermind
{	

			// Teste des classes 
	public static void main(String[] args)
	{
		// ---		---		---		---		---		---		---		---		---
		System.out.println("+ - - - Mastermind - - - +");
		System.out.println("Nouvelle partie.");
		
		System.out.println("Le joueur créer sa combinaison pour que l'ordinateur la trouve.");
		System.out.println("\n\n");
		
		Joueur joueur = new Joueur("Jacquie");
		
		
		// ---		---		---		---		---		---		---		---		---
		nettoyerConsole();
		System.out.println("+ - - - Choix des paramètres - - - +");
			// Le joueur choisit sa combinaison
			// On lui présente les couleurs, il appuis sur une touche  pour choisir
		System.out.println("Combien d'essais :\n");
		boolean bon = false;
		int nb_tours = 0;
		while ( !bon)
		{
			nb_tours = entrerClavier();
			if (nb_tours >= 4 && nb_tours <= 8)
			{
				bon = true;
			}
			
			
		}
		Partie partie = new Partie(joueur,nb_tours);
		
		
		// ---		---		---		---		---		---		---		---		---
		nettoyerConsole();
		System.out.println("+ - - - Choix des paramètres - - - +");
		System.out.println("Combien de pion dans la combinaison ( min 4 - 6 max):\n");
		int nb_pions = 0;
		bon = false;
		while ( !bon)
		{
			nb_pions = entrerClavier();
			if (nb_pions >= 4 && nb_pions <= 6)
			{
				bon = true;
			}
			
			
		}
		// ---		---		---		---		---		---		---		---		---
		nettoyerConsole();
		System.out.println("+ - - - Création Combinaison - - - +");
		
		partie.setNbPion(nb_pions);
		PionCombinaison[] tab_inter = new PionCombinaison[nb_pions];
		int num_couleur;
		String chaine = "";
		for (int i = 0; i < partie.getNbPion(); i++)
		{
			System.out.println("Votre combinaison:\n");
			if ( i>0) {			
				chaine = chaine + " " +tab_inter[i-1].toString();
			}
						
			System.out.println(chaine + "\n\n");
			
			
			System.out.println("Appuyez sur le numéro de la couleur que vous voulez choisir pour votre "+(i+1) + " pion ?");
			afficherCouleur();
			num_couleur = entrerClavier();
			tab_inter[i] = new PionCombinaison(equiNumCouleur(num_couleur));
			nettoyerConsole();
			System.out.println("+ - - - Création Combinaison - - - +");
			
		}
		
		Combinaison comb = new Combinaison(nb_pions);
		comb.setPionCombinaison(tab_inter);
		partie.getJoueur().setCombi(comb);
		partie.setCombiJoueur(); // 
		
		// ---		---		---		---		---		---		---		---		---
		nettoyerConsole();
		System.out.println("+ - - - Lancement - - - +");
		System.out.println("Voici votre combinaison :\n");
		
		System.out.println(comb.toString() + "\n\n");
		System.out.println("L'ordinateur va maintenant essayer de retrouver votre combinaison.\n");
		System.out.println("Appuyez sur une touche pour démarer la partie ...A");
		appuyerContinuer();
		
		// ---		---		---		---		---		---		---		---		---
		nettoyerConsole();
		int i =0;
		boolean trouve = false;
		while ( i < partie.getNbTour()) {
			System.out.println( i);

			partie.combiOrdinateur();
			trouve = partie.testEquivalence();
			partie.affichage();
			partie.increTour();
			i = i+1;
		}
		/*try{
		
		}
		catch (Exception e)
		{ System.out.println("Erreur: " +e.getMessage() );
		
		}*/
		// La partie récupère et conserve les combinaisons proposés par l'ordinateur pour les affichers
		// La partie va tester si elles sont équivalentes
		


		

	}
	
	private static Couleur equiNumCouleur(int num_couleur) {
		Couleur retour = null;
		if ( num_couleur == 1) {
			retour = Couleur.BLACK;
		}
		else if ( num_couleur == 2) {
			retour = Couleur.BLUE;
		}
		else if ( num_couleur == 3) {
			retour = Couleur.CYAN;
		}
		else if ( num_couleur == 4) {
			retour = Couleur.GREEN;
		}
		else if ( num_couleur == 5) {
			retour = Couleur.PURPLE;
		}
		else if ( num_couleur == 6) {
			retour = Couleur.RED;
		}
		else if ( num_couleur == 7) {
			retour = Couleur.WHITE;
		}
		else if ( num_couleur == 8) {
			retour = Couleur.YELLOW;
		}
		return retour;
	}

	public final static void afficherCouleur()
	{
		PionCombinaison[] tab_pion = new PionCombinaison[8];
		tab_pion[0] = new PionCombinaison(Couleur.BLACK);
		tab_pion[1] = new PionCombinaison(Couleur.BLUE);
		tab_pion[2] = new PionCombinaison(Couleur.CYAN);
		tab_pion[3] = new PionCombinaison(Couleur.GREEN);
		tab_pion[4] = new PionCombinaison(Couleur.PURPLE);
		tab_pion[5] = new PionCombinaison(Couleur.RED);
		tab_pion[6] = new PionCombinaison(Couleur.WHITE);
		tab_pion[7] = new PionCombinaison(Couleur.YELLOW);
		
		String chaine = "";
		for(int i = 0; i< 8; i++)
		{
			chaine = chaine + tab_pion[i] + " ";
		}
		chaine = chaine + "\n";
		for(int i = 0; i< 8; i++)
		{
			chaine = chaine + (i+1) + " ";
		}

		System.out.println(chaine);
	}
	
	public final static void nettoyerConsole()
	{
//		System.out.print ("\n\n\n\n\n\n");
		System.out.print("\033[H\033[2J"+Couleur.RESET);

	}
	
	public final static int entrerClavier()
	{
		int nb = 0;
		Scanner sc = new Scanner(System.in);	
		try{
			nb = sc.nextInt();
		}
		catch (Exception e){
			System.out.println("Erreur : " + e.getMessage());
			
		}
		
		return nb;

	}
	
	public final static void appuyerContinuer()
	{
		Scanner sc = new Scanner(System.in);
		sc.nextLine();

	}
}