package tp5abstraite;

public class Lotissement implements GestionProprietee{
	protected Propriete [] tabProp;
	protected int nombre;
	
	public Lotissement(int capacité) {
		tabProp=new Propriete[capacité];
		
	}
	Propriete getpropriétéByIndice (int i) {
		Propriete p=null;
			if((i>0) && (i<nombre)) {
				p= tabProp[i];
			}
		
		return p;
	}
	
	public int getnbPièces() {
		int s=0;
		for(int j=0;j<this.nombre;j++) {
			if(tabProp[j] instanceof ProprietePrivee) {
				s+=((ProprietePrivee) tabProp[j]).getNbpieces();
			}
		}return s;
	}
	
	@Override 
	public void afficherPropriétés() {
		for(int j=0;j<this.nombre;j++) {
			System.out.println(tabProp[j].toString()+" Impot ="+this.tabProp[j].calculImpot());
		}
	}
		
	
	@Override
	public boolean ajouter(Propriete p) {
		if(nombre<tabProp.length) {
			this.tabProp[nombre]=p;
			nombre++;
			return true;
		}return false;
	}
	@Override
	public boolean supprimer(Propriete p) {
		int i=0;
			while(i<this.nombre && !(this.tabProp[i].equals(p))) {
				i++;
			}
			if(this.tabProp[i].equals(p)) {
					for(int j=i;j<this.nombre-1;j++) {
						this.tabProp[j]=tabProp[j+1];
					}
						this.nombre--;
						return true;
					
				}
			return false;
			
	}
	
	
	
}
