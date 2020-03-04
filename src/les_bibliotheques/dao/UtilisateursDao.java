package les_bibliotheques.dao;
import java.time.LocalDate;
import java.util.*;

import les_bibliotheques.metier.*;

public class UtilisateursDao {

	private Utilisateur [] UtilisateurDB= {
		new Utilisateur (01, "LOPEZ", "Julien", LocalDate.of(1999, 05, 26), "homme", "lulu", "Lama", null),
		new Utilisateur (02, "LOUPER", "Julienne", LocalDate.of(1960, 03, 03), "femme", "tac", "Lola", null),
		new Utilisateur (03, "LORI", "Daniela", LocalDate.of(1988, 12, 20), "femme", "luciole", "Naima", null),
		new Utilisateur (04, "ARMAND", "Jul", LocalDate.of(1980, 02, 23), "homme", "Dodo", "Lot", null),
		new Adherent (05, "NomAdherent", "PrenomAdherent", LocalDate.of(1986, 01, 12), "homme", "pwd", "psd", null, "010000000"),//Ajout Adhérent
		new Employe (06, "NomEmp", "PrenomEmp", LocalDate.of(1978, 04, 16), "femme", "psw", "psd", null, "AB008", EnumCategorieEmploye.BIBLIOTHECAIRE),//Ajout employe
		new Adherent (07, "NomAdherent2", "PrenomAdherent3", LocalDate.of(1986, 01, 12), "homme", "pwd", "psd", new ArrayList<EmpruntEnCours>(02), "010100000"),
	};
	
	public Utilisateur findByKey(int idu) {
		
		for (Utilisateur utilisateur:UtilisateurDB)
			if ((utilisateur.getIdUtilisateur()==idu)) return utilisateur;
		// Exception utilisateur inconnu retourne exeception
		return null;
	}

//	public void ajouterUtilisateur(Utilisateur ut) {
//		UtilisateurDB.put(ut.idUtilisateur, ut);
//	}
	
	//Méthode qui retourne tous les utilisateurs dans une Arraylist
	
	public List <Utilisateur> findAll(){
		List<Utilisateur> utilisateursPresents = new ArrayList <Utilisateur>();
		for (Utilisateur u : UtilisateurDB) {
			utilisateursPresents.add(u);
		}
		return utilisateursPresents;
	}

	//-----------------------------------------------------------------------------------------
	// Autres futures méthodes CRUD
	
	public boolean insertUtilisateur (Utilisateur utilisateur) {
		return false;}
	
	public boolean updateUtilisateur(Utilisateur utilisateur) {
		return false;}
	
	public boolean deleteUtilisateur (Integer idUtilisateur) {
		return false;}
	
	public boolean deleteUtilisateurByPseudonyme (String pseudonyme) {
		return false;
	}
	
}
