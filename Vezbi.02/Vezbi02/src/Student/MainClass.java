package Student;

public class MainClass {

	public static void main(String[] args) {
		Student object1 = new Student (); 
		object1.firstName = "Петар"; 
		object1.lastName = "Петровски";
		object1.index = 886;
		
		System.out.println("Податоци за прв објект:");
		System.out.println(object1.firstName + " " + object1.lastName + " " + object1.index);
		
		Student object2 = new Student("Филип","Јовановски",840); 

		System.out.println ("Податоци за втор објект:");
		System.out.println (object2.firstName + " " + object2.lastName + " " + object2.index);

	}

}
