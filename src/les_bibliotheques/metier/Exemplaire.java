package les_bibliotheques.metier;

import java.time.LocalDate;

public class Exemplaire {

	private Integer idExemplaire;
	private LocalDate dateAchat;
	private EnumStatusExemplaire status;
	private String isbn;
	public EmpruntEnCours theEmpruntEnCours;
	

	// ------------------------------------------------------------------------------------------------------------
		// Constructeur
	
	public Exemplaire() {
		super();
	}
	
	public Exemplaire(Integer idExemplaire, LocalDate dateAchat, EnumStatusExemplaire status, String isbn) {
		super();
		this.idExemplaire = idExemplaire;
		this.dateAchat = dateAchat;
		this.status = status;
		this.isbn = isbn;
	}

	
	// -------------------------------------------------------------------------------------------------------------
		// Accesseur
	
	public Integer getIdExemplaire() {
		return idExemplaire;
	}
	
	public LocalDate getDateAchat() {
		return dateAchat;
	}	
	
	public EnumStatusExemplaire getStatus() {
		return status;
	}
	
	public String getIsbn() {
		return isbn;
	}
	
	public EmpruntEnCours getTheEmpruntEnCours() {
		return theEmpruntEnCours;
	}
	
	// ----------------------------------------------------------------------------------------------------------------
	// Mutateur

	public void setIdExemplaire(Integer idExemplaire) {
		this.idExemplaire = idExemplaire;
	}

	public void setDateAchat(LocalDate dateAchat) {
		this.dateAchat = dateAchat;
	}

	public void setStatus(EnumStatusExemplaire status) {
		this.status = status;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public void setTheEmpruntEnCours(EmpruntEnCours theEmpruntEnCours) {
		this.theEmpruntEnCours = theEmpruntEnCours;
	}

	// ----------------------------------------------------------------------------------------------------------------
	// toString
	
	@Override
	public String toString() {
		return "Exemplaire [idExemplaire=" + idExemplaire + ", dateAchat=" + dateAchat + ", status=" + status
				+ ", isbn=" + isbn + ", theEmpruntEnCours=" + theEmpruntEnCours + "]";
	}

}
