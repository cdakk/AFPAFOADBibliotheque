# AFPAFOADBibliotheque
Projet fil rouge sur la gestion d'une bibliothèque formation CDA AFPA

Projet de création d'un logiciel de gestion d'une bibliothèque.
<br />Cas étudiés:
<br />Emprunt d'exemplaires de livre;
<br />Gestion des Utilisateurs (Employés/Adhérents)
<br />Gestion des retours et des retards.
<br />
Mardi 3 Mars 2020:<br />
<p>1. Structuration du projet via la création sur Eclipse des Pakagdes (DAO, Metier, Test).<br />
<br />
  2. Création des classes dans le package métier:<br />
  - Adherent<br />
  - BiblioException<br />
  - Employe<br />
  - EmpruntArchive<br />
  - EmpruntEnCours<br />
  - EnumCategorieEmploye (Bibliothécaire; Responsable; Gestionnaire_de_fonds)<br />
  - EnumStatusExemplaire (Disponible; Prêté; Supprimé)<br />
  - Exemplaire<br />
  - Personne (Classe Parent dont hérite: Employé, Adhérent, Utilisateur)<br />
  - Utilisateur.<br />
  <br />
  3. Création des "Classes" Dao:<br />
  - UtilisateursDao<br />
  - EcemplairesDao<br />
  <br />
  4. Recettage - Tests:
  4.1 TestDeBase:<br />
    - Demande de deux exemplaires par leur id aux Dao;<br />
    - Demande d'un Adhérent par son id Dao;<br />
    - Demande d'un employé par son id aux Dao;<br />
    - Création d'un emprunt en cours pour un adhéren;<br />
    - Création d'un emprunt en cours pour un Employé.<br />
  <br />
  4.2 TestAdherentEnReatrd:<br />
    - Si un emprunt en retard alors il est impossible d'emprunter pour l'Adhérent.<br />
  <br />
  4.3 TestEmployeEnRetard:<br />
    - Si un emprunt en retard alors l'emprunt est possible pour l'Employé.<br />
  <br />
  4.4 TestAdherentTroisEmprints:<br />
    - Si trois emprunts alors impossible d'emprunter pour l'Adhérent.<br />
  <br />
  4.5 TestEmployeTroisEmprunts:<br />
    - Si trois emprunts alors Employé peut quand même emprunter (pas de restriction).<br />
  <br />
  4.6 TestRetour:<br />
  Lorsque l'Exemplaire est rendu:<br />
  - Le passer en status DISPONIBLE<br />
  - Faire diminuer la collection de l'Utilisateur<br />
  - Créer l'Emprunt-Archivé<br />
  - GarbageCollecter l'EmpruntEnCours.
