package personnages;
public class Humain {
	 private String nom;
	 private String boissonFavorite;
	 private int argent;
	 
	 // Constr
	 public Humain(String nom, String boissonFavorite, int argent) {
		 this.nom = nom;
		 this.boissonFavorite = boissonFavorite;
		 this.argent = argent;
		 }
	 
	 // Acces

	 public String getNom() {
		 return nom; 
		 } 
	 
	 public int getArgent() {
		 return argent;	 
	 }
	 
	 // Meth 
	 public void direBonjour() {
		 parler("Bonjour ! Je m’appelle " + nom + " et j’aime boire du " + boissonFavorite + ".");
		 }
	 public void boire() {
		 parler("Mmmm, un bon verre de " + boissonFavorite + "! GLOUPS!");
		 }
	 public void acheter(String bien, int prix) {
		 if (argent >= prix) {
			 argent -= prix;
			 parler("J'ai acheté " + bien + " pour " + prix + " sous.");
			 }
		 else {
			 parler("pas assez  pour m'acheter " + bien + " à " + prix + " sous.");
			 }
		 } 
	 private void parler(String texte) {
		 System.out.println("(" + nom + ") - " + texte);
		 } 
	 private void gagnerArgent(int gain) {
		 argent += gain; parler("J'ai gagné " + gain + " sous.");
		 } 
	 private void perdreArgent(int perte) {
		 argent -= perte; parler("J'ai perdu " + perte + " sous.");
		 }
	 }

	
