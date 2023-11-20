package tp5abstraite;

public class LotissementPrivee extends Lotissement{

	public LotissementPrivee(int capacité) {
		super(capacité);
	}
	
	@Override
	public boolean ajouter(Propriete p) {
		if(p instanceof ProprietePrivee)
			 super.ajouter(p);
		 return false;
	 }
	
	 @Override
	Propriete getpropriétéByIndice (int i) {
		Propriete p=super.getpropriétéByIndice(i);
			if(p instanceof ProprietePrivee) {
				return (ProprietePrivee) p;
			}
		
		return p;
	}
	@Override
	public int getnbPièces() {
		int s=0;
		for(int j=0;j<this.nombre;j++) {
			if(tabProp[j] instanceof ProprietePrivee) {
				s+=((ProprietePrivee) tabProp[j]).getNbpieces();
			}
		}return s;
	}
	
	
}