public class TestCouleurs
{
	public static void main(String[] args)
	{
		Couleur coul1 = new Couleur("bleu");
		PionCombinaison p1 = new PionCombinaison(coul1);
		Couleur coul2 = new Couleur("jaune");
		PionCombinaison p2 = new PionCombinaison(coul2);
		Couleur coul3 = new Couleur("vert");
		PionCombinaison p3 = new PionCombinaison(coul3);
		Couleur coul4 = new Couleur("rouge");
		PionCombinaison p4 = new PionCombinaison(coul4);
		Couleur coul5 = new Couleur("violet");
		PionCombinaison p5 = new PionCombinaison(coul5);
		Couleur coul6 = new Couleur("bleu");
		PionCombinaison p6 = new PionCombinaison(coul6);

		PionCombinaison[] tableau = new PionCombinaison[6];
		tableau[0] = p1;
		tableau[1] = p2;
		tableau[2] = p3;
		tableau[3] = p4;
		tableau[4] = p5;
		tableau[5] = p6;

		Combinaison combi = new Combinaison(6);
		combi.setPionCombinaison(tableau);
		System.out.println(combi.toString());

	}

}