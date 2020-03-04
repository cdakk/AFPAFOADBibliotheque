package les_bibliotheques.metier;

import java.time.LocalDate;
import java.util.ArrayList;

public class Employe extends Utilisateur {

	// ------------------------------------------------------------------------------------------------------------
	// Constructeur
	
	private String codeMatricule;
	private EnumCategorieEmploye categorieEmploye;
	
	public Employe() {
		super();
	}
	
	public Employe(String codeMatricule, EnumCategorieEmploye categorieEmploye) {
		super();
		this.codeMatricule = codeMatricule;
		this.categorieEmploye = categorieEmploye;
	}

public Employe(Integer idUtilisateur, String nom, String prenom, LocalDate dateNaissance, String sexe, String pwd,
			String pseudonyme, ArrayList<EmpruntEnCours> empruntsEnCours, String codeMatricule,
			EnumCategorieEmploye categorieEmploye) {
		super(idUtilisateur, nom, prenom, dateNaissance, sexe, pwd, pseudonyme, empruntsEnCours);
		this.codeMatricule = codeMatricule;
		this.categorieEmploye = categorieEmploye;
		
	// -------------------------------------------------------------------------------------------------------------
	// Accesseur


	
	}

	public String getCodeMatricule() {
		return codeMatricule;
	}
	
	public EnumCategorieEmploye getCategorieEmploye() {
		return categorieEmploye;
	}

	// ----------------------------------------------------------------------------------------------------------------
	// Mutateur
	
	public void setCodeMatricule(String codeMatricule) {
		this.codeMatricule = codeMatricule;
	}

	public void setCategorieEmploye(EnumCategorieEmploye categorieEmploye) {
		this.categorieEmploye = categorieEmploye;
	}

	// ----------------------------------------------------------------------------------------------------------------
	// ToString
	
	@Override
	public String toString() {
		return "Employe ["+ super.toString() + "codeMatricule=" + codeMatricule + ", categorieEmploye=" + categorieEmploye + "]";
	}
}


