/**
 * Classe Partie
 * 
 *@author Ian CLEMENT
 *@author Nicolas GOUREAU
 *@version 1.0
 *
 */
package Jeu;

import java.util.List;

import Libs.*;
import strategy.Answer;
import strategy.Code;
import strategy.implementations.BasicStrategy;

public class Partie {
	private Joueur joueur;
	private Code combinaison;
	private BasicStrategy ordinateur;
	private int nbToursMax;
	private Code[] combi_Enregistrer;
	private Answer[] combi_indice;
	private int numero_tour;

	/**
	 * Constructeur de la classe Partie
	 * 
	 * @param joueur
	 *            Pseudo du joueur
	 * @param nbToursMax
	 *            nombres d'essais possibles pour le joueur.
	 */

	public Partie(Joueur joueur, int nbToursMax) {
		this.combi_Enregistrer = new Code[nbToursMax];
		this.combi_indice = new Answer[nbToursMax];
		this.joueur = new Joueur("Joueur1");
		this.nbToursMax = nbToursMax;
		this.numero_tour = 0;
		// this.ordinateur = new Ordinateur();
	}

	/**
	 * Constructeur de la classe partie sans paramètres
	 */
	public Partie() {
		this.joueur = new Joueur("Joueur1");
		this.nbToursMax = 8;
		// this.ordinateur = new BasicStrategy();
	}

	/**
	 * Changer la combinaison secr�te
	 */
	public void setCombiJoueur() {

		this.combinaison = this.joueur.getCombi();
		System.out.println(this.combinaison);
	}

	public int getNbPion() {
		return this.joueur.getCombi().getLength();
	}

	/**
	 * Test l'equivalence de la dernière combinaison récupéré . Renvoi vrai si
	 * les meme . Ajoute une combi de pion indice pour lesquels pions sont bien
	 * placés.
	 * @param codordi
	 * 			Last try of the computer to guess the secret Code
	 * 
	 * 
	 * @return Retourne Vrai si la combinaison à été trouvé Faux si non.
	 */
	public boolean testEquivalence(Code codordi) {
		/*
		 * - Test l'equivalence de la derni�re combi r�cup - renvoi vrai si les
		 * meme - ajoute une combi de pion indice pour lesquels pions sont bien
		 * plac�s
		 */
		boolean retour;
		Answer ans = this.combinaison.compare(codordi);
				if(ans.getBlacks() != this.combinaison.getLength()){
	
					retour = false;
				}
				else{
					retour =true;
				}

		return (retour);

	}

	/**
	 * M�thode qui r�cupere la solution de l'ordinateur et l'ajoute dans les
	 * anciennes combinaison.
	 * @param allCodes
	 * 			List of allCodes
	 * @return  this.combi_Enregistrer[this.numero_tour]
	 * 				The last code of the computer
	 * 
	 */
	public Code combiOrdinateur(List<Code> allCodes) {	
		
			this.combi_Enregistrer[this.numero_tour]=allCodes.get(0);
		return this.combi_Enregistrer[this.numero_tour];
		
	}
	public Code intelCombiOrdinateur(List<Code> allCodes, Code yo,Answer  answer) throws IndexOutOfBoundsException{
		
		/*for ( Code c : allCodes){
				System.out.println(c);
			}*/
		this.combi_Enregistrer[this.numero_tour]=yo;
		ordinateur.removeInconsistentCodes(allCodes, yo, answer);
		yo = allCodes.get(0);
		return yo; 
	}
	public Answer getIndice(Code c){
		return c.compare(this.combinaison);
	}
	public void setOrdinateur(BasicStrategy strat){
		this.ordinateur=strat;
	}
	public void setCombiIndice( Answer ans){
		this.combi_indice[this.numero_tour] =ans;
	}
	/**
	 * Méthode qui renvoi le joueur qui joue à la partie.
	 * 
	 * @return le joueur de la partie
	 */
	public Joueur getJoueur() {
		return this.joueur;
	}

	/**
	 * - afficher la combi du joueur - afficher toutes les combi de l'ordi -
	 * afficher nb d'essais - affiche les indices
	 */
	public void affichage() {
		/*
		 * afficher la combi du joueur - afficher toutes les combi de l'ordi
		 * -afficher nb d'essais -( afficher score) -affiche les indices
		 */
		System.out.println("+ - - - Tour " + this.numero_tour + " - - - +\n");
		System.out.println("- - - -  " + this.combinaison.toString()
				+ "  - - - - -\n");
		String chaine = "";

		for (int i = 0; i <= this.numero_tour; i++) {

			chaine = chaine + i + " -- " + this.combi_Enregistrer[i] + "    "
					+ this.combi_indice[i] + "\n";
		}
		System.out.println(chaine);
	}
	public void affichageVictoire(boolean trouve){
		if (trouve) {
			System.out.println("Perdu : L'ordinateur � trouver votre code !");
		}else {
			System.out.println("Gagn� :L'ordinateur n'as pas �t� assez rapide !");
		}
	}
	/**
	 * Méthode qui incrémente le tour d'une partie.
	 */
	public void increTour() {
		this.numero_tour = numero_tour + 1;
	}

	/**
	 * Méthode qui renvoi le nombre de tour effectué.
	 * 
	 * @return le numéro du tour.
	 */
	public int getNbTour() {
		return this.nbToursMax;
	}
	public Code getCombinaison(){
		return this.combinaison;
	}

	public Code getSecretCode() {

		return this.combinaison;
	}


}