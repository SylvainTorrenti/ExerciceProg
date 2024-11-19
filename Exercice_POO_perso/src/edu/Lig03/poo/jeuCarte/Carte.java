package edu.Lig03.poo.jeuCarte;

/**
 * Classe reprsentant une carte
 */
public class Carte {
	/**
	 * la couleur de la carte
	 */
	private Couleur couleur;
	
	/**
	 * la valeur de la carte
	 */
	private Valeur valeur;

	public Carte(Couleur couleur, Valeur valeur) {
		super();
		this.couleur = couleur;
		this.valeur = valeur;
	}

	public Couleur getCouleur() {
		return couleur;
	}

	public Valeur getValeur() {
		return valeur;
	}
	
	@Override
	public String toString() {

		return "[" + valeur + " de " + couleur + "]";
	}
}
