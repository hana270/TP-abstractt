package tp5abstraite;

public class Villa extends ProprietePrivee{


private boolean avecPiscine;


public Villa(int nb, int id, Personne p, String adr,boolean avecPiscine,double s) {
		super(nb, id, p, adr,s);
		
		this.avecPiscine=avecPiscine;
	}


@Override
public String toString() {
	return this.getClass().getSimpleName()+" " +super.toString()+" , avecPiscine = " + avecPiscine ;
}
double calculImpot() {
	double total=0.0;
	
	if(this.avecPiscine==true) {
		total=super.calculImpot()+200;
	}else {
		total=super.calculImpot();
	}
	return total;
}






}
