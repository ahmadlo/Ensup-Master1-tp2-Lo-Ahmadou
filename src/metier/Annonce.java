package metier;

public class Annonce {

	private int idAnnonce;
	private String intitule;
	private String detail;
	private Double prix;
	public int getIdAnnonce() {
		return idAnnonce;
	}
	public void setIdAnnonce(int idAnnonce) {
		this.idAnnonce = idAnnonce;
	}
	public String getIntitule() {
		return intitule;
	}
	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public Double getPrix() {
		return prix;
	}
	public void setPrix(Double prix) {
		this.prix = prix;
	}
	public Annonce(int idAnnonce, String intitule, String detail, Double prix) {
		this.idAnnonce = idAnnonce;
		this.intitule = intitule;
		this.detail = detail;
		this.prix = prix;
	}
	
	
	
}
