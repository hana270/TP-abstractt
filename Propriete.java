package tp5abstraite;

abstract public class  Propriete {

	private int id;
	Personne responsable;
	private String adresse;
	private double surface ;
	
	public Propriete(int id,Personne p,String adr,double s) {
		this.id=id;
		this.responsable=p;
		this.adresse=adr;
		this.surface=s;
	}
public String toString() {
		
	return " Id :"+this.id+" Responsable :"+this.responsable.toString()+" , Adresse :"+this.adresse+" surface ="+this.surface;
	}


abstract  double calculImpot();
}
