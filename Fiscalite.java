package tp5abstraite;

public class Fiscalite {
	public static void main(String[] args) {
			Lotissement l=new Lotissement(5);
	
	Personne p1=new Personne(15434621,"Hana","Belhadj");
	Personne p2=new Personne(45621852,"Amal","Belhadj");
	Personne p3=new Personne(14325487,"Salma","Belhadj");
	
	
	ProprietePrivee P1=new ProprietePrivee(11, 1, p1,"Corniche", 350.4);
	ProprietePrivee V1=new Villa(2, 400,p2,"Dar Chaabane",true,6);
	ProprietePrivee A1=new Appartement(3,1200,p2,"Hammamet",8,3); 
	ProprieteProfessionnelle P2=new ProprieteProfessionnelle(4,p3,"Korba", 1000, true,50);
	ProprieteProfessionnelle P3=new ProprieteProfessionnelle(5,p1,"Bir Bouragba",2500, false, 400);
	
	l.ajouter(P1);
	l.ajouter(P2);
	l.ajouter(P3);
	l.ajouter(A1);
	l.ajouter(V1);

	l.afficherPropriétés();
	 System.out.println("\n**********************************************************************************************");
	System.out.println("Le nombre global des pieces est = : " + l.getnbPièces());
	System.out.println("\n***************************** la propriété privée qui paye le moins d’impôts **********************" );
	ProprietePrivee a = null; 
	for (int i = 0; i < l.nombre; i++) {
	    if (l.getpropriétéByIndice(i) instanceof ProprietePrivee) { 
	        ProprietePrivee b = (ProprietePrivee) l.getpropriétéByIndice(i);
	        if (a == null || a.calculImpot() > b.calculImpot()) {
	            a = b;
	        }
	    }
	}
	if (a != null) { 
	    System.out.println("Le proprietaire : " + a.toString() + " le montant a payer =" + a.calculImpot());
	} else {
	    System.out.println("Aucune propriété privée trouvée dans le lotissement.");
	}

	 System.out.println("\n***************************************************************************************");
	 System.out.println("Supprimer : \n"+ l.getpropriétéByIndice(3));
	 Propriete appartementHammamet = l.getpropriétéByIndice(3);
     if (l.supprimer(appartementHammamet)) {
         System.out.println("Appartement de Hammamet est supprimer avec succee.");
     } else {
         System.out.println("Impossible de supprimer Hammamet.");
     }
     System.out.println("\n**************************************************************************************");
     l.afficherPropriétés();
     System.out.println("\n**************************************************************************************");
     System.out.println("\n**************************************************************************************");

     Lotissement lt= new LotissementPrivee(10);
     lt.ajouter(A1);
     lt.ajouter(V1);
     lt.ajouter(P3);
     lt.afficherPropriétés();
     System.out.println("Nombre de piece total = "+lt.getnbPièces());

}}
