package lekcja1;

public class Lekcja1 {
	public static void main(String[] args) {
	
		Student st1 = new Student();
		Student st2 = new Student();
		st1.wiek = 70;
		st1.imie = "Heniu";
		st1.nazwisko = "Moczydorda";
		st2.wiek = 10;
		st2.imie = "Jasiu";
		st2.nazwisko = "Dupa";
		System.out.println(" Student 1:\n imię: " + st1.imie +  "\n nazwisko: " + st1.nazwisko + "\n wiek: " + st1.wiek);
	}

}
