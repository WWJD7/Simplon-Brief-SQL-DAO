package brief.sql.repo.model;

public class Client {
	
	private long id;
	private String raisonSociale;
	private String adresse;
	
	
	public Client(String raisonSociale, String adresse) {		
		this.raisonSociale = raisonSociale;
		this.adresse = adresse;
	}	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getRaisonSociale() {
		return raisonSociale;
	}
	public void setRaisonSociale(String raisonSociale) {
		this.raisonSociale = raisonSociale;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
}
