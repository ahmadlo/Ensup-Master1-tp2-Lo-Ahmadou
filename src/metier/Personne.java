package metier;

import java.util.Date;

public class Personne {

	private int personneId;
	private String nom;
	private String prenom;
	private String login;
	private String motDePasse;
	private Date dateDeNaissance;
	
	
	
	public Personne(int personneId, String nom, String prenom, String login, String motDePasse, Date dateDeNaissance) {
		this.personneId = personneId;
		this.nom = nom;
		this.prenom = prenom;
		this.login = login;
		this.motDePasse = motDePasse;
		this.dateDeNaissance = dateDeNaissance;
	}
	public int getPersonneId() {
		return personneId;
	}
	public void setPersonneId(int personneId) {
		this.personneId = personneId;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getMotDePasse() {
		return motDePasse;
	}
	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}
	public Date getDateDeNaissance() {
		return dateDeNaissance;
	}
	public void setDateDeNaissance(Date dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}
	@Override
	public String toString() {
		return "Personne [personneId=" + personneId + ", nom=" + nom + ", prenom=" + prenom + ", login=" + login
				+ ", motDePasse=" + motDePasse + ", dateDeNaissance=" + dateDeNaissance + "]";
	}
	
	
}
