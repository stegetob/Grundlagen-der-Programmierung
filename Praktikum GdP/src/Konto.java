
public class Konto {
	int Kontostand; 
	int Kontonummer;
	int kontowecker;
	
	public Konto(int meinKontostand,int meineKontonummer, int meinKontowecker) {
		Kontostand = meinKontostand;
		Kontonummer = meineKontonummer;
		kontowecker = meinKontowecker;
	}

	public void print() {
		System.out.println("Mein Kontostand: ");
		System.out.println(Kontostand);
		System.out.println("Meine Kontonummer lautet: ");
		System.out.println(Kontonummer);
		
	}
	public void ueberweisen(int wieviel, Konto Ziel) {
		Kontostand = Kontostand - wieviel;
		Ziel.Kontostand = Ziel.Kontostand + wieviel;
		
	}
	
	
	public void zinsen(int zins) {
		Kontostand = Kontostand + (Kontostand * zins)/100;
		
	}
	
	public int berechneZinsen(int zins) {
		int berechneZinsen = (Kontostand * zins)/100;
		return berechneZinsen; 
		
	}
	
	 public void kontowecker() {
		if (Kontostand <= kontowecker);
		System.out.println("Untergang");
		
	
	
	}
}