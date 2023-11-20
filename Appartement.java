package tp5abstraite;

public class Appartement extends ProprietePrivee{

private int numetage;

public Appartement(int nb,int id,Personne p,String adr,double s,int numetage) {
		super(nb,id,p,adr,s);
		this.numetage=numetage;
	}

@Override
public String toString() {
	return this.getClass().getSimpleName()+" " +super.toString()+" :numetage=" + numetage ;
}



}
