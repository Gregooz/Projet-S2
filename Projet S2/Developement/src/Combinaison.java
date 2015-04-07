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

/** 
* Constructeur de la classe Combinaison
*@param 
*/

	public Combinaison()
		{
			this.pionCombinaisons = new PionCombinaison[4];
			this.pionIndices = new PionIndice[4];
			this.indices = new Indice[4];

		}

	public void setPionCombinaison(PionCombinaison[] couleur)
	{
		couleur[1] = new PionCombinaison("V");
		couleur[2] = new PionCombinaison("J");
		couleur[3] = new PionCombinaison("B");
		couleur[4] = new PionCombinaison("R");
		for (int i = 1 ;i <= 4 ; i++)
		{
			this.pionCombinaisons[i] = couleur[i];
		}
	}



}