package Predmet;

public class Predmet {

	public String imeNaPredmet;
	public String profesor;
	public int krediti;
	public int semestar;
	
	public Predmet (){
	}
	
	public Predmet (String imeNaPredmet) {
	
		this.imeNaPredmet = imeNaPredmet;
	}	
	
	public Predmet (String imeNaPredmet, String profesor, int krediti, int semestar) {
		
		this.imeNaPredmet = imeNaPredmet;
		this.profesor = profesor;
		this.krediti = krediti;
		this.semestar = semestar;
	}	

	}

