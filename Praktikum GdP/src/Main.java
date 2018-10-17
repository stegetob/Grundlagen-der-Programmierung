 
public class Main {

	public static void main(String[] args) {
		Konto kontok1 = new Konto (501,1912452800,500); 
		Konto kontok2 = new Konto (532,1912452801,300);
		
		// System.out.println("Hello World");
		
		kontok1.print();
		kontok1.kontowecker();
		kontok2.print();
		kontok2.kontowecker();
		kontok1.zinsen(2);
		kontok1.print();
		kontok1.ueberweisen(10, kontok2);
		
		kontok1.print();
		kontok2.print();
		
		int zinsen = kontok1.berechneZinsen(5);
		System.out.println("Der berechnete Zinsbetrag lautet: ");
		System.out.println(zinsen);
		
				}
	}



