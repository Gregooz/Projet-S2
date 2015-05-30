/**
* Classe Mastermind
* 
*@author Ian CLEMENT
*@author Nicolas GOUREAU
*@version 1.0
*
*/
package Jeu;

import java.util.List;
import java.util.Scanner;

import strategy.Answer;
import strategy.Code;
import strategy.T;
import strategy.implementations.*;
import strategy.implementations.Simple;
import Libs.Joueur;
import Libs.Couleur;
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
			// On lui prï¿½sente les couleurs, il appuis sur une touche  pour choisir
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
		
		BasicStrategy strategy= new Simple(nb_pions);
		partie.setOrdinateur(strategy);
		AllCodes thisAllCodes = new AllCodes(nb_pions);
		List<Code> allCombi = thisAllCodes.getAllCodes();
		nettoyerConsole();
		System.out.println("+ - - - Création Combinaison - - - +");
		
		T[] tab_inter = new T[nb_pions];
		int num_couleur = 0;
		String chaine = "";
		for (int i = 0; i < nb_pions; i++)
		{
			System.out.println("Votre combinaison:\n");
			if ( i>0) {
				chaine = chaine + " " +tab_inter[i-1].toString();
			}
						
			System.out.println(chaine + Couleur.RESET +"\n\n");
			
			
			System.out.println("Appuyez sur le numéro de la couleur que vous voulez choisir pour votre "+(i+1) + " pion ?");
			afficherCouleur();
			
				num_couleur = entrerClavier();
				tab_inter[i] = T.getValues(num_couleur);
			
			nettoyerConsole();
			System.out.println("+ - - - Création Combinaison - - - +");
			
		}
		
		Code comb = new Code(tab_inter);
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
		System.out.println( i);
		Code ordi = partie.combiOrdinateur(allCombi);
		boolean trouve = false;
		while ( i < partie.getNbTour()&&!trouve) {
			Answer indice =ordi.compare(partie.getSecretCode());
			ordi = partie.intelCombiOrdinateur(allCombi, ordi, indice);
			trouve = partie.testEquivalence(ordi);
			System.out.println(trouve);
			partie.setCombiIndice(indice);
			partie.affichage();
			partie.increTour();
			i++;
			appuyerContinuer();
		}
		partie.affichageVictoire(trouve);
		try{
		
		}
		catch (Exception e)
		{ System.out.println("Erreur: " +e.getMessage() );
		
		}
		
	}
	/** Primary method to obtain colors in the console display
	 * Deprecated by the use of a GUI, 
	 */
	@Deprecated
	public final static void afficherCouleur()
	{
		PionCombinaison[] tab_pion = new PionCombinaison[8];
		tab_pion[0] = new PionCombinaison(new Couleur(1));
		tab_pion[1] = new PionCombinaison(new Couleur(2));
		tab_pion[2] = new PionCombinaison(new Couleur(3));
		tab_pion[3] = new PionCombinaison(new Couleur(4));
		tab_pion[4] = new PionCombinaison(new Couleur(5));
		tab_pion[5] = new PionCombinaison(new Couleur(6));
		tab_pion[6] = new PionCombinaison(new Couleur(7));
		tab_pion[7] = new PionCombinaison(new Couleur(8));
		
		String chaine = "";
		for(int i = 0; i< 8; i++)
		{
			chaine = chaine + tab_pion[i] + " ";
		}
		chaine = chaine + "\n" + Couleur.RESET;
		for(int i = 0; i< 8; i++)
		{
			chaine = chaine + (i+1) + " ";
		}

		System.out.println(chaine);
	}
	/** Method of cleaning for the console, used to reset the display
	 * Deprecated by the use of a GUI
	 */
	@Deprecated
	public final static void nettoyerConsole()
	{
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
	/** Method used to stop the program until the users press a key
	 * deprecated by the use of a GUI
	 * WARNINGS :The scanner isn't closed to ensure the entry will not be spammed by "null".
	 */
	@Deprecated
	public final static void appuyerContinuer()
	{
		Scanner sc = new Scanner(System.in);
		sc.nextLine();

	}
}