package tp5abstraite;

public interface GestionProprietee {

	public static final int max_proprietes = 100;
	void afficherPropriétés() ;
	boolean ajouter(Propriete p) ;
	boolean supprimer(Propriete p);

}
