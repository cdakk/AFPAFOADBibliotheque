package les_bibliotheques.metier;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class Adherent extends Utilisateur {
	
	private String telephone;
	private static Integer nbMaxPrets=3;
	private static Integer dureeMaxPrets=15;

// ------------------------------------------------------------------------------------------------------------
// Constructeur
	
	public Adherent(Integer idUtilisateur, String nom, String prenom, LocalDate dateNaissance, String sexe, String pwd,
		String pseudonyme, ArrayList<EmpruntEnCours> empruntsEnCours, String telephone) {
	super(idUtilisateur, nom, prenom, dateNaissance, sexe, pwd, pseudonyme, empruntsEnCours);
	this.telephone = telephone;
}

	public Adherent(String telephone) {
		super();
		this.telephone = telephone;
	}

	// -------------------------------------------------------------------------------------------------------------
	// Accesseur
	public String getTelephone() {
		return telephone;
	}
	
	public static Integer getNbMaxPrets() {
		return nbMaxPrets;
	}
	
	public static Integer getDureeMaxPrets() {
		return dureeMaxPrets;
	}
	
	
	
	// ----------------------------------------------------------------------------------------------------------------
	// Mutateur
		
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	
	public static void setNbMaxPrets(Integer nbMaxPrets) {
		Adherent.nbMaxPrets = nbMaxPrets;
	}
	
	public static void setDureeMaxPrets(Integer dureeMaxPrets) {
		Adherent.dureeMaxPrets = dureeMaxPrets;
	}
	
	//------------------------------------------------------------------------------------
	// Méthode
	
	public Integer getNbReatrds() {
		int duree, NbRetards=0;
		for (EmpruntEnCours e: this.getEmpruntEnCours()) {
			duree = (int) ChronoUnit.DAYS.between(e.getDateEmprunt(), LocalDate.now());
			if (duree>15) {NbRetards++;
		}
	}
		return NbRetards;
	}
	
	
	public Boolean getIsConditionsPretAcceptees() {
		if (this.getNbReatrds()==0 && this.getNbEmpruntsEnCours()<3) {
			return true;
		}
		else {
				try {
						throw new BibliothequesException("prêt non accordé");
				} catch (BibliothequesException e) {
					
				}
		return false;
		}

	}
	public void addEmpruntEnCours(EmpruntEnCours em) {
		boolean bo;
		bo = this.isConditionsPretAcceptees();
		if (bo==true) {
			super.addEmpruntsEnCours(em);
			
		} else {			
			try {
				throw new BibliothequesException();
			} catch (BibliothequesException e) {
				e.printStackTrace();
			}
		}
	  
	}

	// ----------------------------------------------------------------------------------------------------------------
	// ToString
	
	@Override
	public String toString() {
		return "Adherent ["+ super.toString() + "idUtilisateur=" + idUtilisateur + ", telephone=" + telephone + "]";
	}
	
}
