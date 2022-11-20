package Zadaca2;

public class MainClass {

	public static void main(String[] args) {
		
		Restoran rest = new Restoran();
		rest.setIme("Aurum");
		rest.setLokacija("Bitola");
		rest.setTelefon("047/555-222");
		rest.setBrSedishta(200);
		
		System.out.println("Restoranot " + rest.getIme() + " so " + rest.getBrSedishta() + " sedishta, se naogja vo " + rest.getLokacija()+ ".");
		System.out.println("KOntakt telefon: " + rest.getTelefon());
		
		
		

	}

}
