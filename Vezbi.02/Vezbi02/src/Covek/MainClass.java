package Covek;

public class MainClass {

	public static void main(String[] args) {
		Covek c = new Covek ();
		c.ime = "Emilija";
		c.prezime = "Spasenovska";
		c.embg = "2302002415555";
		
		System.out.println("Imeto na covekot e: " + c.ime);
		System.out.println("Prezimeto na covekot e: " + c.prezime);
		System.out.println("Covekot ima maticen broj: " + c.embg);

	}

}
