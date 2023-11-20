package tp5abstraite;

public class Personne {
private int cin;
private String nom;
private String prenom;

public Personne(int cin,String n,String p) {
	this.cin=cin;
	this.nom=n;
	this.prenom=p;
}

public int getCin() {
	return cin;
}

public void setCin(int cin) {
	this.cin = cin;
}

public String getNom() {
	return nom;
}

public void setNom(String nom) {
	this.nom = nom;
}

public String getPrenom() {
	return prenom;
}

public void setPrenom(String prenom) {
	this.prenom = prenom;
}
@Override
public String toString() {
	return " CIN :"+this.cin+", Nom ="+this.nom+" Prenom ="+this.prenom;
}
}
