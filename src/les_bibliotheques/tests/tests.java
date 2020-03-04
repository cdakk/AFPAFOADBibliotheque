package les_bibliotheques.tests;
import les_bibliotheques.dao.ExemplairesDao;
import les_bibliotheques.dao.UtilisateursDao;
import les_bibliotheques.metier.Adherent;
import les_bibliotheques.metier.Employe;
import les_bibliotheques.metier.EmpruntEnCours;
import les_bibliotheques.metier.EnumCategorieEmploye;
import les_bibliotheques.metier.EnumStatusExemplaire;
public class tests {
public static void main(String[] args) {
	ExemplairesDao dao = new ExemplairesDao();
	UtilisateursDao uao = new UtilisateursDao();
	
	System.out.println("***** 1.1 TestDeBase.java ****");
	System.out.println("***** Demande de deux exmplaires par leur id aux Dao ****");
	System.out.println();
	System.out.println(dao.findByKey(1));
	System.out.println(dao.findByKey(3));
	
	System.out.println();
	System.out.println("***** Demande d'un adhérent par son id aux Dao ****");
	System.out.println();
	System.out.println(uao.findByKey(05));
	
	System.out.println();
	System.out.println("***** Demande d'un employé par son id aux Dao ****");
	System.out.println();
	System.out.println(uao.findByKey(06));
	
	System.out.println();
	System.out.println(uao.findByKey(07));
	}

}
