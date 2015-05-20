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
	private ImageIcon pionRed= new ImageIcon(getClass().getResource("img/6.png"));
	private ImageIcon pionBlue= new ImageIcon(getClass().getResource("img/1.png"));
	private ImageIcon pionGreen= new ImageIcon(getClass().getResource("img/3.png"));
	private ImageIcon pionOrange= new ImageIcon(getClass().getResource("img/4.png"));
	private ImageIcon pionCyan= new ImageIcon(getClass().getResource("img/2.png"));
	private ImageIcon pionPurple= new ImageIcon(getClass().getResource("img/5.png"));
//	private ImageIcon pionIndicR= new ImageIcon(getClass().getResource("img/indicR.png"));
//	private ImageIcon pionIndicB= new ImageIcon(getClass().getResource("img/indicB.png"));
	private ImageIcon pionVide = new ImageIcon(getClass().getResource("img/8.png"));
//	private ImageIcon indicVide = new ImageIcon("img/indicVide.png");
	
	
	
	private ImageIcon[] pions;
	
	//BOUTTONS DES PIONS
	private JButton boutonRed = new JButton(pionRed);
	private JButton boutonBlue = new JButton(pionBlue);
	private JButton boutonGreen = new JButton(pionGreen);
	private JButton boutonOrange = new JButton(pionOrange);
	private JButton boutonCyan = new JButton(pionCyan);
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
			pions[i] = new ImageIcon("/img/" + i + ".png");
		}
		
		fenetreDemarrage();
		
		
		
		this.setResizable(false);
		this.setPreferredSize(new Dimension(500, 500));
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
		bouton.setBounds(125, 125, 250,250);
		bouton.add(jouer);
		bouton.add(option);
		bouton.add(credit);
		
		principal.setLayout(null);
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
//		for(int i = 0; i < 8; i++)
//		{
//			for(int j = 0; j < 4; j++)
//			{indice[i][j] = new JLabel(indicVide);}
//		}
		
		//SOLUTION AVEC DES CASES VIDES
		for(int i = 0; i < 4; i++)
		{solution[i] = new JLabel(pionVide);}
		
		//AJOUT DES BOUTTONS AU JPANEL
		bouton.add(boutonRed);
		bouton.add(boutonBlue);
		bouton.add(boutonGreen);
		bouton.add(boutonOrange);
		bouton.add(boutonCyan);
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