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

		for (int i = 1 ;i < this.nombrePion ; i++)
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

	public String toString()
	{
		String chaine = "";
		for (int i=0;i < this.nombrePion ; ) 
		{
			chaine = chaine +"  "+ pionCombinaisons[i].toString();
		}

		return chaine;	
	}


}