package les_bibliotheques.metier;

import java.time.LocalDate;

public class EmpruntArchive {

	private LocalDate dateEmprunt;
	private LocalDate dateRestitutionEff;
	private Exemplaire exemplaire;
	private Utilisateur emprunteur;
	
	
	// ------------------------------------------------------------------------------------------------------------
	// Constructeur	
	
	public EmpruntArchive() {
		super();
	}
	

	public EmpruntArchive(LocalDate dateEmprunt, LocalDate dateRestitutionEff, Exemplaire exemplaire,
			Utilisateur emprunteur) {
		super();
		this.dateEmprunt = dateEmprunt;
		this.dateRestitutionEff = dateRestitutionEff;
		this.exemplaire = exemplaire;
		this.emprunteur = emprunteur;
	}

	// -------------------------------------------------------------------------------------------------------------
	// Accesseur
	public LocalDate getDateEmprunt() {
		return dateEmprunt;
	}

	public LocalDate getDateRestitutionEff() {
		return dateRestitutionEff;
	}

	// ----------------------------------------------------------------------------------------------------------------
	// Mutateur

	public void setDateEmprunt(LocalDate dateEmprunt) {
		this.dateEmprunt = dateEmprunt;
	}
	
	public void setDateRestitutionEff(LocalDate dateRestitutionEff) {
		this.dateRestitutionEff = dateRestitutionEff;
	}

	// ----------------------------------------------------------------------------------------------------------------
	// ToString
	
	@Override
	public String toString() {
		return "EmpruntArchive [dateEmprunt=" + dateEmprunt + ", dateRestitutionEff=" + dateRestitutionEff
				+ ", exemplaire=" + exemplaire + ", emprunteur=" + emprunteur + "]";
	}	

}
