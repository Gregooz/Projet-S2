package Vue;

import javax.swing.*;
import java.awt.*;

public class Fenetre extends JFrame
{
	//CONTENEURS
	private JPanel principal = new JPanel();
	private JPanel bouton= new JPanel();
	private JLabel[][] plateau = new JLabel[8][4];
	private JLabel[][] indice = new JLabel[8][4];
	private JLabel[] solution = new JLabel[4];
	
	//IMAGES DE PIONS
	private ImageIcon pionRed= new ImageIcon(Fenetre.class.getClass().getResource("/img/red.png"));
	private ImageIcon pionBlue= new ImageIcon(Fenetre.class.getClass().getResource("/img/blue.png"));
	private ImageIcon pionGreen= new ImageIcon(Fenetre.class.getClass().getResource("/img/green.png"));
	private ImageIcon pionOrange= new ImageIcon(Fenetre.class.getClass().getResource("/img/orange.png"));
	private ImageIcon pionYellow= new ImageIcon(Fenetre.class.getClass().getResource("/img/yellow.png"));
	private ImageIcon pionPurple= new ImageIcon(Fenetre.class.getClass().getResource("/img/purple.png"));
	private ImageIcon pionIndicR= new ImageIcon(Fenetre.class.getClass().getResource("/img/indicR.png"));
	private ImageIcon pionIndicB= new ImageIcon(Fenetre.class.getClass().getResource("/img/indicB.png"));
	private ImageIcon pionVide = new ImageIcon(Fenetre.class.getClass().getResource("/img/vide.png"));
	private ImageIcon indicVide = new ImageIcon(Fenetre.class.getClass().getResource("/img/indicVide.png"));
	
	
	private ImageIcon[] pions;
	
	//BOUTTONS DES PIONS
	private JButton boutonRed = new JButton(pionRed);
	private JButton boutonBlue = new JButton(pionBlue);
	private JButton boutonGreen = new JButton(pionGreen);
	private JButton boutonOrange = new JButton(pionOrange);
	private JButton boutonYellow = new JButton(pionYellow);
	private JButton boutonPurple = new JButton(pionPurple);
	
	//BOUTTONS DU MENU PRINICPAL
	private JButton jouer = new JButton("Jouer");
	private JButton option = new JButton("Options");
	private JButton credit = new JButton("Crédits");
	
	
	public Fenetre(String s)
	{
		super(s);
		pions = new ImageIcon[9];
		for(int i = 1; i < 9; i++)
		{
			pions[i] = new ImageIcon(Fenetre.class.getClass().getResource("/img/" + i + ".png"));
		}
		
		fenetreDemarrage();
		
		
		
		this.setResizable(false);
		this.setContentPane(principal);
		this.pack();
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setVisible(true);
	}
//*-------------------------------------------------------------------------*//		
	/**
	 * Méthode qui initialise la fenetre principale
	 */
	public void fenetreDemarrage()
	{
		bouton.setLayout(new GridLayout(3, 1, 5, 5));
		bouton.add(jouer);
		bouton.add(option);
		bouton.add(credit);
		
		principal.add(bouton);
		
	}
	
	/**
	 * Méthode qui initialise le plateau de jeu avec ses composants et des images dites "vides"
	 */
	public void composants()
	{
		bouton.setLayout(new GridLayout(2, 3, 5, 5));
		
		//PLATEAU AVEC CASES VIDES
		for(int i = 0; i < 8; i++)
		{
			for(int j = 0; j < 4; j++)
			{plateau[i][j] = new JLabel(pionVide);}
		}
		
		//INDICES AVEC DES CASES VIDES
		for(int i = 0; i < 8; i++)
		{
			for(int j = 0; j < 4; j++)
			{indice[i][j] = new JLabel(indicVide);}
		}
		
		//SOLUTION AVEC DES CASES VIDES
		for(int i = 0; i < 4; i++)
		{solution[i] = new JLabel(pionVide);}
		
		//AJOUT DES BOUTTONS AU JPANEL
		bouton.add(boutonRed);
		bouton.add(boutonBlue);
		bouton.add(boutonGreen);
		bouton.add(boutonOrange);
		bouton.add(boutonYellow);
		bouton.add(boutonPurple);
		
		//AJOUT DES COMPOSANTES A LA FENETRE
		for(int i = 0; i < 10; i++)
		{
			for(int j = 0; i < 4; i++)
			{principal.add(plateau[i][j]);}
		}
		
		for(int i = 0; i < 10; i++)
		{
			for(int j = 0; i < 4; i++)
			{principal.add(indice[i][j]);}
		}
		for(int i = 0; i < 4; i++)
		{principal.add(solution[i]);}
	}
	
	public static void main(String[] args)
	{
		new Fenetre("Mastermind");
	}
}