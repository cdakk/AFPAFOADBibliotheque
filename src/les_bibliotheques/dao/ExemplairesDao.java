package les_bibliotheques.dao;
import java.time.LocalDate;
import les_bibliotheques.metier.Exemplaire;
import les_bibliotheques.metier.EnumStatusExemplaire;

//Cette Classe permet l'accès aux données (dao)
//version "Mock object" : objet bouchon pour les tests
public class ExemplairesDao {

	private Exemplaire [] ExemplaireDB= {
	
	new Exemplaire(1, LocalDate.of(1990,04,27), EnumStatusExemplaire.DISPONIBLE, "isbn"),
	new Exemplaire(2, LocalDate.of(1990, 05, 5), EnumStatusExemplaire.SUPPRIME, "isbn2"),
	new Exemplaire(3, LocalDate.of(1990,05,5), EnumStatusExemplaire.PRETE, "isbn3"),
	new Exemplaire(4, LocalDate.of(1990, 05, 5), EnumStatusExemplaire.DISPONIBLE, "isbn4"),
	new Exemplaire(5, LocalDate.of(1990,05,5), EnumStatusExemplaire.PRETE, "isbn5"),
	new Exemplaire(6, LocalDate.of(1990, 06, 10), EnumStatusExemplaire.DISPONIBLE, "isbn6"),
	new Exemplaire(7, LocalDate.of(1990, 06,10), EnumStatusExemplaire.DISPONIBLE, "isbn7"),
	new Exemplaire(8, LocalDate.of(1990, 06, 10), EnumStatusExemplaire.DISPONIBLE, "isbn8"),
	};

public Exemplaire findByKey(int id) {
	
	for (Exemplaire exemplaire:ExemplaireDB)
		if ((exemplaire.getIdExemplaire()==id)) return exemplaire;
	// Exception utilisateur inconnu retourne exeception
	return null;
}
}
