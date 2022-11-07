package Predmet;


public class MainClass {

	public static void main(String[] args) {
	Predmet object1 = new Predmet (); 
	object1.imeNaPredmet = "Objektno Orientirano Programiranje"; 
	object1.profesor = "Ilija Jolevski";
	object1.krediti = 6;
	object1.semestar = 3;
	
	System.out.println("Prv Predmet:");
	System.out.println("   Ime na predmetot: " + object1.imeNaPredmet);
	System.out.println("   Ime na profesorot: " + object1.profesor);
	System.out.println("   Broj na krediti: " + object1.krediti);
	System.out.println("   Semestar: " + object1.semestar);
			
	Predmet object2 = new Predmet (); 
	object2.imeNaPredmet = "Sistemski Softver"; 
	object2.profesor = "Kostadina Veljanovska";
	object2.krediti = 6;
	object2.semestar = 3;
	
	System.out.println();
	System.out.println("Vtor Predmet:");
	System.out.println("   Ime na predmetot: " + object2.imeNaPredmet);
	System.out.println("   Ime na profesorot: " + object2.profesor);
	System.out.println("   Broj na krediti: " + object2.krediti);
	System.out.println("   Semestar: " + object2.semestar);
	
	Predmet object3 = new Predmet ();
	object3.imeNaPredmet = "Algoritmi i strukturi na Podatoci"; 
	object3.profesor = "Violeta Manevska";
	object3.krediti = 6;
	object3.semestar = 3;
	
	System.out.println();
	System.out.println("Tret Predmet:");
	System.out.println("   Ime na predmetot: " + object3.imeNaPredmet);
	System.out.println("   Ime na profesorot: " + object3.profesor);
	System.out.println("   Broj na krediti: " + object3.krediti);
	System.out.println("   Semestar: " + object3.semestar);
		
		
		
	}

}
