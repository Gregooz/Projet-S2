/**
* Classe Combinaison
* 
*@author 
*@version 1.0
*
*/

package Libs;


public class Combinaison
{
	private static Object getPion;
	private Pion[] pion;
	private int nombrePion;
	public static final String BACK_WHITE = "\u001B[47m";
	public static final String RESET = "\u001B[0m";
	public static final String BRIGHT = "\u001B[1m";

/** 
* Constructeur de la classe Combinaison
*@param nombreDePion Le nombre de pion
*/
	
	public Combinaison(int nombrePion)
		{
			this.nombrePion = nombrePion;
			this.pion = new Pion[nombrePion];
		}

	/**
	 *  Constructeur de la classe Combinaison 
	 * @param c1 Couleur du premier pion
	 * @param c2 Couleur du second pion
	 * @param c3 Couleur du troisième pion
	 * @param c4 couleur du quatrième pion
	 */
	public Combinaison(Couleur c1, Couleur c2, Couleur c3, Couleur c4)
	{
		this(4);
		this.pion[0] = new PionCombinaison(c1);
		this.pion[1] = new PionCombinaison(c2);
		this.pion[2] = new PionCombinaison(c3);
		this.pion[3] = new PionCombinaison(c4);
	}
	
	/**
	 * Constructeur de la classe pion. Par défault la combinaison est de taille 4.
	 */
	public Combinaison()
	{
		this(4);
	}

	/**
	 * Modifie les pions de la combinaison
	 * @param pions Tableau de pion 
	 */
	public void setPionCombinaison(Pion[] pions)
	{		

		for (int i = 0 ;i < this.nombrePion ; i++)
		{
			this.pion[i] = pions[i];
		}
	}
	
	/**
	 * Modifie les pions de la combinaison
	 * @param i L'indice du pion
	 * @param p Le nouveau pion a insérer
	 */
	
	public void setPionCombinaison(int i, Pion p)
	{		
			this.pion[i] = p;

	}

	/**
	 * Modifie le nomber de pion total dans la combinaison
	 * @param nombrePion
	 */
	public void setNombrePion(int nombrePion)
	{
		this.nombrePion =nombrePion;
		this.pion = new PionCombinaison[ this.nombrePion ];
	}

	/**
	 * Récupère le nombre total de pion dans la combinaison
	 * @return
	 */
	public int getNombrePion()
	{
		return this.nombrePion;
	}
	
	/**
	 * Récupère les pions de la combinaison
	 * @return un tableau de pion
	 */
	public Pion[] getPions()
	{
		return this.pion;
	}
	
	/**
	 * Récupère le pion à un indice donnée.
	 * @param i L'indice du pion dans la combinaison.
	 * @return Le pion à l'indice i.
	 */
	public Pion getPion(int i)
	{
		
		return this.pion[i];
	}

	/**
	 * Retourne une chaine de caractère de la combinaison
	 *@return Une chaine de caractère représentant la combinaison
	 */
	public String toString()
	{
		String chaine = "" + BRIGHT;
		for (int i=0;i < this.nombrePion; i++) 
		{
			if (pion[i] == null) {
				chaine =  chaine +"  " + RESET;
			}
			else {
			chaine =  chaine +" "+ pion[i];// + RESET;
			}
		}
		chaine = chaine + RESET;
		return chaine;	
	}
	
	/**
	 * Vérifie si deux combinaisons sont équivalentes
	 * @param c1 une combinaison à tester
	 * @param c2 une combinaison à tester
	 * @return Vrai si les combinaisons sont équivalentes.
	 */
	public static boolean equals(Combinaison c1, Combinaison c2) {
		boolean retour = true;
		
		if (c1.nombrePion == c2.nombrePion) {
			for( int i=0; i<c1.nombrePion; i++) {
				if( !c1.getPion(i).getCouleur().equals( c2.getPion(i).getCouleur() )){
					retour = false;
				}
			} 
		}
		else {
			retour = false;
		}
				
		return retour;
	}

	public void test() {
		
		this.pion[0] = new PionCombinaison(new Couleur(1));
		this.pion[1] = new PionCombinaison(new Couleur(3));
		this.pion[2] = new PionCombinaison(new Couleur(1));
		this.pion[3] = new PionCombinaison(new Couleur(4));

		for (int i = 3 ;i < this.nombrePion ; i++)
		{
			this.pion[i] = new PionCombinaison(new Couleur(7));
		}
	}

	/**
	 * Calcul les pions ayant le bon indice avec la bonne couleur.
	 * @param combinaison Une combinaisons de pion
	 * @return Retourne le nombre de pion ayant la meme couleur et meme indice dans les combinaisons
	 */
	public int getNbBienPlaceCouleur(Combinaison combinaison) {
		int pion_equi =0;
		
		for (int i = 0; i< this.nombrePion ; i++) {
			if ( combinaison.getPion(i).equals(this.pion[i]) ) {
				pion_equi = pion_equi+1;
			}
		}
		return pion_equi;
	}
/**
 * Calcul les pions n'ayant pas la  bonne couleur.
 * @param combinaison Une combinaisons de pion
 * @return Retourne le nombre de pion n'ayant pas la bonne couleur.
 */
	public int nb_mauvaise_couleur(Combinaison combinaison) {
		
		boolean pion_equi = false;
		int non_pion_equi = 0;
		for (int i = 0; i< this.nombrePion ; i++) {
			pion_equi = false;
			for (int j = 0; j< this.nombrePion ; j++) {
				if (combinaison.getPion(j).equals(this.pion[i]) ) {
				pion_equi = true;
				}				
			}
			if (!pion_equi) {
				non_pion_equi = non_pion_equi + 1;
			}
		}
		return non_pion_equi;
	}
	/**
	 * Calcul les pions n'ayant pas la  bonne couleur.
	 * @param combinaison Une combinaisons de pion
	 * @return Retourne le nombre de pion n'ayant pas la bonne couleur.
	 */
		public Combinaison combiIndice(Combinaison combinaison) {
			int pion_equi =0;
			Combinaison copie = new Combinaison(this.nombrePion);
			copie.setPionCombinaison(this.pion);
			
			Combinaison combiCopie = new Combinaison(this.nombrePion);
			combiCopie.setPionCombinaison(combinaison.getPions());
			
			int pion_blanc = 0;
			
			for (int i = 0; i< this.nombrePion ; i++) {
				if ( combiCopie.getPion(i).equals(copie.pion[i]) ) {
					pion_equi = pion_equi+1;
					copie.setPionCombinaison(i, new Pion(new Couleur(-1)));
					combiCopie.setPionCombinaison(i, new Pion(new Couleur(-1)));
				}
			}

			System.out.println("copie sans rouge: " + copie.toString() +"nb pions: "+copie.getNombrePion());
			System.out.println("Combi sans rouge: " + combiCopie.toString() +"nb pions: "+copie.getNombrePion());
			for (int i =0; i <this.nombrePion; i++){
				for (int j = 0; j<combiCopie.nombrePion; j++){
					if (combiCopie.getPion(j).equals(copie.getPion(i)) && combiCopie.getPion(i).getCouleur().getNum() != -1 ) {
						pion_blanc = pion_blanc +1;
						}		
				}
			}
			// A partir d'un moment il enlève toute la suite de combiCopie a couleur -1
			System.out.println("Pion blanc: "+ pion_blanc);
			Combinaison combiIndice = new Combinaison(this.nombrePion);
			for (int i = 0; i< pion_equi ; i++) {
				combiIndice.setPionCombinaison(i, new Pion(new Couleur(2)));
			}
			for (int i = 0; i< pion_blanc ; i++) {
				combiIndice.setPionCombinaison(i+pion_equi, new Pion(new Couleur(7)));
			}
			return combiIndice;
		}

}