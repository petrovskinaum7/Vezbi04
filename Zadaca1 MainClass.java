package zadaca1;

public class MainClass {

	public static void main(String[] args) {
		Covek s = new Covek();
	    s.setIme("Naum");
	    s.setPrezime("Petrovski");
	    s.setMatichen_broj("3002002410022");

	        System.out.println("Imeto na covekot e: " + s.getIme());
	        System.out.println("Prezimeto na covekot e: " + s.getPrezime());
	        System.out.println("Matichniot broj na chovekot e: " + s.getMatichen_broj());
	}

}
