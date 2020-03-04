package les_bibliotheques.metier;

import java.time.LocalDate;
import java.util.ArrayList;
import les_bibliotheques.metier.EmpruntEnCours;;

public class Utilisateur extends Personne {
	
	public Integer idUtilisateur;
	private String pwd;
	private String pseudonyme;
	
	public ArrayList<EmpruntEnCours> empruntEnCours = new ArrayList<EmpruntEnCours>();

	
	// ------------------------------------------------------------------------------------------------------------
	// Constructeur		
	
	public Utilisateur () {
		super();
	}
	
	public Utilisateur(Integer idUtilisateur, String nom, String prenom, LocalDate dateNaissance, String sexe,
			String pwd, String pseudonyme, ArrayList<EmpruntEnCours> empruntsEnCours) {
		super(nom, prenom, dateNaissance, sexe);
		this.idUtilisateur = idUtilisateur;
		this.setPwd (pwd);
		this.setPseudonyme (pseudonyme);
	}
	

	// -------------------------------------------------------------------------------------------------------------
	// Accesseur
	
	public Integer getIdUtilisateur() {
		return idUtilisateur;
	}
	
	public String getPwd() {
		return pwd;
	}
	
	public String getPseudonyme() {
		return pseudonyme;
	}
	
	public ArrayList<EmpruntEnCours> getEmpruntEnCours() {
		return empruntEnCours;
	}
	
	// ----------------------------------------------------------------------------------------------------------------
	// Mutateur

	

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public void setPseudonyme(String pseudonyme) {
		this.pseudonyme = pseudonyme;
	}
	
	public void setIdUtilisateur(Integer idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}
		
	public void setEmpruntEnCours(ArrayList<EmpruntEnCours> empruntEnCours) {
		this.empruntEnCours = empruntEnCours;
	}
	
//-------------------------------------------------------------------	
// Methodes
	
	public Integer getNbEmpruntsEnCours() {
		return empruntEnCours.size();
	}
	
	public void addEmpruntsEnCours(EmpruntEnCours em) {
		this.empruntEnCours.add(em);
	}
	
//------------------------------------------------------------------	
//Polymorphe
	   public Boolean isConditionsPretAcceptees()  {
			return true;
	   }

	@Override
	public String toString() {
		return "Utilisateur [" + super.toString() + "idUtilisateur=" + idUtilisateur + ", pwd=" + pwd + ", pseudonyme=" + pseudonyme
				+ ", empruntEnCours=" + empruntEnCours + "]";
	}

}
