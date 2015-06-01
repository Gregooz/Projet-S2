package Vue;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;










import com.sun.org.apache.bcel.internal.classfile.Code;

import Controleur.ControleurCommencer;
import Controleur.ControleurCouleur;
import Controleur.ControleurNettoyerCouleur;
import Controleur.ControleurParametre;
import Controleur.ControleurPionsCouleur;
import Controleur.ControleurValider;
import Jeu.Partie;
import Libs.Joueur;

public class FenetrePlay extends JFrame{

	protected static final String TITRE = "Mastermind";
	protected static final String AIDE = "BLALBLABLBABLABLABLAB\nLABLABLLBABLABLBABLABLA";
	private Partie partie;
	
	private JLabel nb_tours;
	private JLabel nb_pions;
	private JLabel nomJoueur;
	
	private JButton bRouge;
	private JButton bBleu;
	private JButton bBlanc;
	private JButton bJaune;
	private JButton bNoir;
	private JButton bCyan;
	private JButton bViolet;
	
//	private JButton p1;
//	private JButton p2;
//	private JButton p3;
//	private JButton p4;
//	private JButton p5;
//	private JButton p6;
	private JButton[] bPions;
	private JButton[] pionCombi;
	private JButton bDebut;
	
	


	private JButton validerCouleur ;
	private JPanel jpanBas;
	private JPanel jpanHautCombi;
	private JPanel jpanHautCenter;
	
	
	public FenetrePlay() {
		super(TITRE);
		this.partie = new Partie(new Joueur("Jacquie"),5);
		this.bPions = new JButton[6];
		
		JPanel principal = new JPanel();
		principal.setPreferredSize(new Dimension(500,400));
		principal.setLayout(new GridLayout(2,1));
		
		/* ==== ==== === === === === === === === === === === === === === === */
		JPanel jpanHaut = new JPanel();
		jpanHaut.setLayout(new BorderLayout());
		
		JPanel panParam = new JPanel();
		jpanHaut.add(panParam, BorderLayout.EAST);
		panParam.setLayout(new GridLayout(6,1));
		panParam.setBorder(BorderFactory.createTitledBorder("Paramètres"));
		
		JLabel Textnb_tours = new JLabel("Nombre de tours:");
		JLabel Textnb_pions= new JLabel("Nombre de pions: ");
		
		nb_tours = new JLabel("    ?");
		nb_pions= new JLabel("     ?");
		nomJoueur= new JLabel("nom");
		
		bDebut = new JButton ("Commencer");
		
		bDebut.setEnabled(false);
		
		
		panParam.add(nomJoueur);	
		panParam.add(Textnb_tours);
		panParam.add(nb_tours);		
		panParam.add(Textnb_pions);
		panParam.add(nb_pions);
		panParam.add(bDebut);
		jpanHautCombi = new JPanel();
		jpanHautCenter = new JPanel();
		jpanHautCenter.setLayout(new GridLayout(1,4));
		jpanHaut.add(jpanHautCombi,BorderLayout.NORTH);
		jpanHaut.add(jpanHautCenter,BorderLayout.CENTER);
		
		
		/* ==== ==== === === === === === === === === === === === === === === */
		JPanel jpancentre = new JPanel();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/* ==== ==== === === === === === === === === === === === === === === */
		jpanBas = new JPanel();
		jpanBas.setLayout(new BorderLayout());
		jpanBas.setBorder(BorderFactory.createEtchedBorder());
		
		JPanel jpanBasCombiCenter = new JPanel();
		JPanel jpanBasCombiNorth = new JPanel();
		JPanel jpanBasCombi = new JPanel();
		jpanBasCombi.setLayout(new BorderLayout());
		jpanBasCombi.add(jpanBasCombiCenter, BorderLayout.CENTER);
		jpanBasCombi.add(jpanBasCombiNorth, BorderLayout.EAST);
		
		jpanBasCombiCenter.setLayout(new BoxLayout(jpanBasCombiCenter, BoxLayout.X_AXIS));
		
//		p1 = new JButton("1");
//		p2 = new JButton("2");
//		p3 = new JButton("3");
//		p4 = new JButton("4");
//		p5 = new JButton("5");
//		p6 = new JButton("6");
		
		bPions[0]  = new JButton("1");
		bPions[1] = new JButton("2");
		bPions[2] = new JButton("3");
		bPions[3] = new JButton("4");
		bPions[4] = new JButton("5");
		bPions[5] = new JButton("6");
		for (JButton pion : bPions) {
			jpanBasCombiCenter.add(pion);
		}
		
//		jpanBasCombiCenter.add(p1);
//		jpanBasCombiCenter.add(p2);
//		jpanBasCombiCenter.add(p3);
//		jpanBasCombiCenter.add(p4);
//		jpanBasCombiCenter.add(p5);
//		jpanBasCombiCenter.add(p6);
		
		
		
		JPanel jpanBasCouleur = new JPanel();
		jpanBasCouleur.setBorder(BorderFactory.createTitledBorder(""));
		bRouge = new JButton("");
		bRouge.setBackground(Color.RED);
		bBleu= new JButton("");
		bBleu.setBackground(Color.BLUE);
		bBlanc= new JButton("");
		bBlanc.setBackground(Color.WHITE);
		bJaune= new JButton("");
		bJaune.setBackground(Color.YELLOW);
		bNoir= new JButton("");
		bNoir.setBackground(Color.BLACK);
		bCyan= new JButton("");
		bCyan.setBackground(Color.CYAN);
		bViolet= new JButton("");
		bViolet.setBackground(Color.MAGENTA);
		
		jpanBasCouleur.add(bRouge);
		jpanBasCouleur.add(bBleu);
		jpanBasCouleur.add(bBlanc);
		jpanBasCouleur.add(bJaune);
		jpanBasCouleur.add(bNoir);
		jpanBasCouleur.add(bCyan);
		jpanBasCouleur.add(bViolet);
		
		
		
		ControleurParametre controleurParametre = new ControleurParametre(this, this.partie);
		ControleurPionsCouleur controleurPionsCouleur = new ControleurPionsCouleur(this, this.partie);
		for (JButton pion : bPions) {
			pion.addActionListener(controleurPionsCouleur);
		}
//		p1.addActionListener(controleurPionsCouleur);
//		p2.addActionListener(controleurPionsCouleur);
//		p3.addActionListener(controleurPionsCouleur);
//		p4.addActionListener(controleurPionsCouleur);
//		p5.addActionListener(controleurPionsCouleur);
//		p6.addActionListener(controleurPionsCouleur);
		
		ControleurCouleur controleurCouleur = new ControleurCouleur(this, this.partie);
		bRouge.addActionListener(controleurCouleur);
		bJaune.addActionListener(controleurCouleur);
		bNoir.addActionListener(controleurCouleur);
		bCyan.addActionListener(controleurCouleur);
		bViolet.addActionListener(controleurCouleur);
		bBleu.addActionListener(controleurCouleur);
		bBlanc.addActionListener(controleurCouleur);
		
		JButton resetCouleur = new JButton("Nettoyer");
		ControleurNettoyerCouleur controleurNettoyerCouleur = new ControleurNettoyerCouleur(this, this.partie);
		resetCouleur.addActionListener(controleurNettoyerCouleur);
		validerCouleur = new JButton("Valider");
		validerCouleur.setEnabled(false);
		ControleurValider controleurValider = new ControleurValider(this, this.partie);
		validerCouleur.addActionListener(controleurValider);
		jpanBasCombiNorth.add(resetCouleur);
		jpanBasCombiNorth.add(validerCouleur);
		ControleurCommencer controleurCommencer = new ControleurCommencer(this, this.partie);
		bDebut.addActionListener(controleurCommencer);
		/* Le controleur ajoutera le bouton p1,p2... sa dépendera du nomb de pions*/
		
		jpanBasCouleur.setLayout(new GridLayout(7,1));
		
		
		
		ajoutCombi();
		
		
		
		
		jpanBas.add(jpanBasCombi, BorderLayout.CENTER);
		jpanBas.add(jpanBasCouleur, BorderLayout.EAST);
		
		/* ==== ==== === === === === === === === === === === === === === === */

		principal.add(jpanHaut);
		//principal.add(jpancentre);
		principal.add(jpanBas);
		
		this.setContentPane(principal);
		
		this.pack();
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setVisible(true);
		
		}

		public JButton getbDebut() {
			return bDebut;
		}
		
		public void ajoutCombi() {
//			strategy.Code[] codes =  this.partie.getCombi_Enregistrer();
//			for (strategy.Code code : codes) {
//				System.out.println(code);
//			}
			
			
			JPanel panel = new JPanel();
			panel.setLayout(new GridLayout(2,2));
			JButton[] pions = new JButton[4];
			for (int k =0 ;k< 4;k++) {
				pions[k] = new JButton("p"+k);
				jpanHautCenter.add(pions[k]);
			}
			JButton[] pionsI1 = new JButton[4];
			for (int k =0 ;k< 4;k++) {
				pionsI1[k] = new JButton("p"+k);
				panel.add(pionsI1[k]);
				jpanHautCenter.add(panel);
			}
			
			

			
		}
		private Color equiIntCouleur(int num) {
			Color couleur=null;
			if ( num == 1) {
				couleur = Color.BLACK;
			}
			else if (num == 7 ){
				couleur =Color.white;
			}
			else if (num == 8) {
				couleur = Color.CYAN;
			}
			else if (num == 5) {
				couleur = Color.BLUE;
			}
			else if (num == 3) {
				couleur = Color.YELLOW;
			}
			else if (num == 2) {
				couleur =Color.red ;
			}
			else if ( num == 6) {
				couleur = Color.MAGENTA;
			}
			else if (num == 4) {
				couleur = Color.GREEN;
			}
			return couleur;
		}

		public void affichageCombiHaut(){
			for (JButton pion : pionCombi) {
				pion.setEnabled(false);
				jpanHautCombi.add(pion);
			}
			
		}
		public JButton[] getPionCombi() {
			return pionCombi;
		}

		public void setPionCombi(JButton[] pionCombi) {
			this.pionCombi = pionCombi;
		}
		
		public JPanel getJpanHautCombi() {
			return jpanHautCombi;
		}

	public void setValiderCouleur(JButton validerCouleur) {
		this.validerCouleur = validerCouleur;
	}

	public JPanel getJpanBas() {
			return jpanBas;
		}
	
	public Partie getPartie() {
			return partie;
		}
	
		public JButton getValiderCouleur() {
			return validerCouleur;
		}
	
	public JButton[] getbPions() {
			return bPions;
		}
	
	public JLabel getNb_tours() {
			return nb_tours;
		}

	public JLabel getNb_pions() {
		return nb_pions;
	}

	public JLabel getNomJoueur() {
		return nomJoueur;
	}

	public JButton getbRouge() {
		return bRouge;
	}

	public JButton getbBleu() {
		return bBleu;
	}

	public JButton getbBlanc() {
		return bBlanc;
	}

	public JButton getbJaune() {
		return bJaune;
	}

	public JButton getbNoir() {
		return bNoir;
	}

	public JButton getbCyan() {
		return bCyan;
	}

	public JButton getbViolet() {
		return bViolet;
	}


public static void main(String[] args)
{
		new FenetrePlay();
    
	}
}