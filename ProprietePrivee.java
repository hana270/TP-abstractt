package tp5abstraite;

public class ProprietePrivee extends Propriete{
private int nbpieces;

public ProprietePrivee(int nb,int id,Personne p,String adr,double s) {
	super(id,p,adr,s);
	this.nbpieces=nb;
}

public int getNbpieces() {
	return nbpieces;
}

public void setNbpieces(int nbpieces) {
	this.nbpieces = nbpieces;
}
@Override
public String toString() {
    return super.toString() + ", NbPieces: " + this.nbpieces;
}
@Override
double calculImpot() {
	return 50/100+10/nbpieces;
}


}
