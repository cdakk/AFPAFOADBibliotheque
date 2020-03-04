package les_bibliotheques.metier;

import java.time.LocalDate;
import les_bibliotheques.metier.Utilisateur;
import les_bibliotheques.metier.Exemplaire;
public class EmpruntEnCours {

	public static final String getExemplaire = null;
	private LocalDate dateEmprunt;
	private Exemplaire exemp;
	private Utilisateur emprunteur;

	// ------------------------------------------------------------------------------------------------------------
	// Constructeur
	
	public EmpruntEnCours(LocalDate dateEmprunt) {
		super();
		this.dateEmprunt = dateEmprunt;
	}

	public EmpruntEnCours(LocalDate dateEmprunt, Exemplaire exemp, Utilisateur ut) {
		super();
		this.dateEmprunt = dateEmprunt;
		this.exemp = exemp;
		this.setEmprunteur(ut);
	}

	public EmpruntEnCours(Exemplaire exemp, Utilisateur emprunteur) {
		super();
		this.exemp = exemp;
		this.emprunteur = emprunteur;
	}
	
	public EmpruntEnCours() {
		super();
	}

	// -------------------------------------------------------------------------------------------------------------
	// Accesseur
	
	public LocalDate getDateEmprunt() {
		return dateEmprunt;
	}
	
	public Exemplaire getExemplaire() {
		return exemp;
	}
	
	public Utilisateur getEmprunteur() {
		return emprunteur;
	}
	
	// ----------------------------------------------------------------------------------------------------------------
	// Mutateur

	public void setDateEmprunt(LocalDate d) {
		this.dateEmprunt = d;
	}
	
	public void setEmprunteur(Utilisateur u) {
		if(this.getEmprunteur()== null) {
			this.emprunteur = u;
			this.getEmprunteur().addEmpruntsEnCours(this);
		}
		else {
			System.out.println("NOK");
		}
	}
	
	public void setExemplaire(Exemplaire exemplaire) {
		if(getExemplaire()==null & exemplaire.getStatus()==EnumStatusExemplaire.DISPONIBLE) {
		this.exemp = exemplaire;
		this.getExemplaire().setTheEmpruntEnCours(this);
	}
}

	// ----------------------------------------------------------------------------------------------------------------
	// ToString
	
	@Override
	public String toString() {
		return "EmpruntEnCours ["+ super.toString() + "dateEmprunt=" + dateEmprunt + ", exemp=" + exemp + ", emprunteur=" + emprunteur+
				 "]";
	}
	
}
