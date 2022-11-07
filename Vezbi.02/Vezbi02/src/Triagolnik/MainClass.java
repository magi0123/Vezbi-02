package Triagolnik;
import java.util.Scanner;

public class MainClass {

	private static Scanner s;

	public static void main(String[] args) {
		int s1, s2, s3, s4;
		
		s = new Scanner(System.in);
		
		System.out.print("Dolzinata na stranata A e: ");
		s1= s.nextInt();
		System.out.print("Dolzinata stranata B e: ");
		s2= s.nextInt();
		System.out.print("Dolzinata na stranata C e: ");
		s3= s.nextInt();
		System.out.print("Visinata na triagolnikot e: ");
		s4= s.nextInt();
		
	
		Triagolnik Perimetar = new Triagolnik();
		System.out.println("Perimetarot na triagolnikot e " + Perimetar.Perimetar(s1, s2, s3) + " cm.");
		
		Triagolnik Plostina = new Triagolnik();
		System.out.println("Plostinata na triagolnikot e " + Plostina.Plostina(s2,s4) + " cm2." );
	
	}

	}


