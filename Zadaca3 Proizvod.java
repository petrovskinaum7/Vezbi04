package zadaca3;

public class Proizvod {
	private String ime;
	private double cena;
	private String proizvoditel;
	private double tezina;
	
	public Proizvod() {
		this.ime = "Milka";
		this.cena = 39;
		this.proizvoditel = "Mondelez International Corporation";
		this.tezina = 100;
	}
	
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	
	public double getCena() {
		return cena;
	}
	public void setCena(double cena) {
		this.cena = cena;
	}
	
	public String getProizvoditel() {
		return proizvoditel;
	}
	public void setProizvoditel(String proizvoditel) {
		this.proizvoditel = proizvoditel;
	}
	
	public double getTezina() {
		return tezina;
	}
	public void setTezina(double tezina) {
		this.tezina = tezina;
	}
}
