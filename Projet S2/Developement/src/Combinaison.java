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
*@param 
*/

	public Combinaison(int nombrePion)
		{
			this.pionCombinaisons = new PionCombinaison[4];
			this.pionIndices = new PionIndice[4];
			this.indices = new Indice[4];

		}

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

	public void setNombrePion(int nombrePion)
	{
		this.nombrePion =nombrePion;
		this.pionCombinaisons = new PionCombinaison[ this.nombrePion ];
		this.pionIndices = new PionIndice[ this.nombrePion ];
	}

	public int getNombrePion()
	{
		return this.nombrePion;
	}


}