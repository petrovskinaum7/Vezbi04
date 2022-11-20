package zadaca4;

public class MainClass {

	public static void main(String[] args) {
		Avtomobil kola = new Avtomobil("Nissan", "Note", 129000, "Bela");
		
		System.out.println("Marka: " + kola.getMarka());
		System.out.println("Model: " + kola.getModel());
		System.out.println("Pominati kilometri pred mnozenje: " + kola.getPominatiKm());
		System.out.println("Pominati kilometri posle mnozenje: " + kola.mnozenjeKm(6));
		System.out.println("Boja: " + kola.getBoja());
		
	}

}
