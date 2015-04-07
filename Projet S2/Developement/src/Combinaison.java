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

	public setPionCombinaison(Couleur[] couleur)
	{
		couleur[1] = "V";
		couleur[2] = "B";
		couleur[3] = "R";
		couleur[4] = "J";
		for (int i=1;i<=4 ;i++ )
		{
			this.pionCombinaisons[i] = couleur[i];
		}
	}



}