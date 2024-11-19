package edu.Lig03.poo.jeuCarte;

import java.util.ArrayList;
import java.util.List;

/**
 * Jeu de cartes : un ensemble de cartes
 */
public class Jeu {

	private List<Carte> cartes;

	public Jeu() {
		super();
		// creation du paquet vide
		cartes = new ArrayList<>();
	}

	/**
	 * Ajout de la carte en fin de paquet
	 * 
	 * @param laCarte
	 */
	public void ajouterCarte(Carte laCarte) {
		cartes.add(laCarte);
	}

	/**
	 * Sépare aléatoirement le paquet de carte en deux paquets puis dépose le second
	 * paquet sur le premier
	 */
	public void couper() {
		int positionCoupe = (int) (Math.random() * (cartes.size() - 1));
		System.out.println("coupe à " + positionCoupe);
		for (int i = 0; i < positionCoupe; i++) {
			Carte carteretiree = cartes.remove(i);
			cartes.add(carteretiree);
		}
	}

	/**
	 * prends aléatoirement 20 cartes et les remet à des positions aléatoire dans le
	 * paquet
	 */
	public void melanger() {
		int nbMelange = 20;
		for (int i = 0; i <= nbMelange; i++) {
			int positionRetire = (int) (Math.random() * (cartes.size() - 1));
			Carte carteRetiree = cartes.remove(positionRetire);
			Carte carteAAjouter = new Carte(carteRetiree.getCouleur(), carteRetiree.getValeur());
			int positionAdd = (int) (Math.random() * (cartes.size() - 1));
			cartes.add(positionAdd, carteAAjouter);
		}

	}

	/**
	 * Crée une liste avec les nombreCartesADistribuer du haut du paquet et la
	 * renvoie
	 * 
	 * @param nombreCartesADistribuer
	 * @return
	 */
	public List<Carte> distribuer(Integer nombreCartesADistribuer) {
		List<Carte> cartesDistribue;
		cartesDistribue = new ArrayList<>();
		for (int i = 0; i < nombreCartesADistribuer; i++) {
			cartes.remove(0);
			cartesDistribue.add(cartes.remove(0));
		}
		return cartesDistribue;
	}

	public Integer getNombreCartes() {
		int compteur = 0;
		for (Carte carte : cartes) {
			compteur++;
		}
		return compteur;
	}

	@Override
	public String toString() {
		String str = "{";
		for (Carte carte : cartes) {
			str += " " + carte.toString();
		}
		str += "}";
		return str;
	}

	public static void main(String[] args) {
		// Création d'un petit jeu
		Jeu jeu = new Jeu();

		jeu.ajouterCarte(new Carte(Couleur.CARREAU, Valeur.SEPT));
		jeu.ajouterCarte(new Carte(Couleur.COEUR, Valeur.HUIT));
		jeu.ajouterCarte(new Carte(Couleur.CARREAU, Valeur.ROI));
		jeu.ajouterCarte(new Carte(Couleur.TREFLE, Valeur.DAME));
		jeu.ajouterCarte(new Carte(Couleur.PIQUE, Valeur.DIX));
		jeu.ajouterCarte(new Carte(Couleur.CARREAU, Valeur.DIX));
		jeu.ajouterCarte(new Carte(Couleur.PIQUE, Valeur.AS));
		jeu.ajouterCarte(new Carte(Couleur.TREFLE, Valeur.DIX));
		jeu.ajouterCarte(new Carte(Couleur.PIQUE, Valeur.CINQ));
		jeu.ajouterCarte(new Carte(Couleur.CARREAU, Valeur.AS));
		jeu.ajouterCarte(new Carte(Couleur.COEUR, Valeur.DIX));
		jeu.ajouterCarte(new Carte(Couleur.PIQUE, Valeur.DAME));
		jeu.ajouterCarte(new Carte(Couleur.COEUR, Valeur.DIX));
		jeu.ajouterCarte(new Carte(Couleur.TREFLE, Valeur.AS));
		jeu.ajouterCarte(new Carte(Couleur.PIQUE, Valeur.DEUX));
		jeu.ajouterCarte(new Carte(Couleur.CARREAU, Valeur.CINQ));
		jeu.ajouterCarte(new Carte(Couleur.PIQUE, Valeur.HUIT));
		jeu.ajouterCarte(new Carte(Couleur.PIQUE, Valeur.NEUF));
		jeu.ajouterCarte(new Carte(Couleur.PIQUE, Valeur.QUATRE));
		jeu.ajouterCarte(new Carte(Couleur.TREFLE, Valeur.NEUF));
		jeu.ajouterCarte(new Carte(Couleur.COEUR, Valeur.DAME));
		jeu.ajouterCarte(new Carte(Couleur.CARREAU, Valeur.HUIT));
		jeu.ajouterCarte(new Carte(Couleur.PIQUE, Valeur.ROI));
		jeu.ajouterCarte(new Carte(Couleur.PIQUE, Valeur.SEPT));

//		System.out.println(jeu);
//		
//		jeu.couper();
//		
//		System.out.println(jeu);

//		System.out.println(jeu.getNombreCartes());
		
//		System.out.println(jeu);
//		jeu.melanger();		
//		System.out.println(jeu);
		
		
//		System.out.println(jeu.distribuer(5));
	}

}
