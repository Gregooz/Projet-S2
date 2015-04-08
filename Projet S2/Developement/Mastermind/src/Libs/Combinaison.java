/**
* Classe Combinaison
* 
*@author 
*@version 1.0
*
*/




public class Combinaison
{
	private PionCombinaison[] pionCombinaisons;
	private PionIndice[] pionIndices;
	private Indice[] indices;
	private int nombrePion;

/** 
* Constructeur de la classe Combinaison
*@param nombrePion Le nombre de pions que l'on veut rentrer pour la combinaison (Difficulté)
*/

	public Combinaison(int nombrePion)
	{
		this.pionCombinaisons = new PionCombinaison[4];
		this.pionIndices = new PionIndice[4];
		this.indices = new Indice[4];

	}

/**
 * Méthode qui paramètre une combinaison par défaut
 * @param pions Un tableau contenant 4 couleurs
 */
	public void setPionCombinaison(PionCombinaison[] pions)
	{
		Couleur couleur = new Couleur("V");		
		pions[0] = new PionCombinaison(couleur);

		couleur = new Couleur("J");		
		pions[1] = new PionCombinaison(couleur);

		couleur = new Couleur("R");		
		pions[2] = new PionCombinaison(couleur);

		couleur = new Couleur("B");		
		pions[3] = new PionCombinaison(couleur);

		for (int i = 1 ;i <= 4 ; i++)
		{
			this.pionCombinaisons[i] = pions[i];
		}
	}

/**
 * Méthode qui change le nombre de pions pour la difficulté
 * @param nombrePion Le nombre de pions que l'on veut dans la combinaisons
 */
	public void setNombrePion(int nombrePion)
	{
		this.nombrePion =nombrePion;
		this.pionCombinaisons = new PionCombinaison[ this.nombrePion ];
		this.pionIndices = new PionIndice[ this.nombrePion ];
	}


}