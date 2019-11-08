package metier;

public class Annonce {

	private int idAnnonce;
	private String intitule;
	private String detail;
	private Double prix;
	private int idPersonne;
	
	
	
	public int getIdPersonne() {
		return idPersonne;
	}
	public void setIdPersonne(int idPersonne) {
		this.idPersonne = idPersonne;
	}
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
	@Override
	public String toString() {
		return "Annonce [idAnnonce=" + idAnnonce + ", intitule=" + intitule + ", detail=" + detail + ", prix=" + prix
				+ "]";
	}
	
	
	
}
