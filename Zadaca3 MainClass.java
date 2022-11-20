package zadaca3;

public class MainClass {

	public static void main(String[] args) {
		Proizvod p = new Proizvod();
		
		System.out.println("Ime na proizvodot: " + p.getIme());
		System.out.println("Proizvoditel: "+ p.getProizvoditel());
		System.out.println("Cena: "+ (int)p.getCena() + " denari.");
		System.out.println("Tezina: " + p.getTezina() + " grama.");
	}

}
