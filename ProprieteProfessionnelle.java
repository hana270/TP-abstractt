package tp5abstraite;

public class ProprieteProfessionnelle extends Propriete {
private int nbemp;
	private boolean estEtatique;	
	
	
	public ProprieteProfessionnelle(int id, Personne p, String adr,int nbemp,boolean est,double s) {
		super(id, p, adr,s);
		this.nbemp=nbemp;
		this.estEtatique=est;
	}
	 @Override
	    public String toString() {
	        return super.toString() + ", NbEmployes: " + nbemp + ", EstEtatique: " + estEtatique;
	    }
	@Override
	double calculImpot() {
		if(this.estEtatique==false) {
			return 0;
		}else {
			return 100/100+30/nbemp;
		}
		
	}
	

}
