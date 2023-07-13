package atm;

public class Client {
	//attributes
	public String name;
	public String lastname;
	private String adress;
	private int postalCode;
	private String city;
	
	//constructeur
	public Client(String pName, String pLastname, String pAdress, int pPostalCode, String pCity) {
		this.name = pName;
		this.lastname = pLastname;
		this.adress = pAdress;
		this.postalCode = pPostalCode;
		this.city = pCity;
	}
	
	//methodes
	public String getName() {
		return name;
	}
	public void setName(String pName) {
		this.name = pName;
	}

	public String getLastname() {
		return lastname;
	}
	public void setLastname(String pLastname) {
		this.lastname = pLastname;
	}
	
	public String getAdress() {
		return adress;
	}
	public void setAdress(String pAdress) {
		this.name = pAdress;
	}
	
	public int getPostal() {
		return postalCode;
	}
	public void sePostal(int pPostal) {
		this.postalCode = pPostal;
	}
	
	public String getCity() {
		return city;
	}
	public void setCity(String pCity) {
		this.city = pCity;
	}
	

}
