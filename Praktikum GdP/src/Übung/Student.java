package Übung;

public class Student {

	int alter;
	int matrklnmr;
	int groesse;
	String name;
	String geschlecht;
	double semesterschnitt;
	
	
	public Student(String name1, int matrklnmr1, int groesse1, String geschlecht1, double semesterschnitt1) {
		name = name1;
		matrklnmr = matrklnmr1;
		groesse=groesse1;
		geschlecht=geschlecht1;
		semesterschnitt=semesterschnitt1;
	
	public void Vorstellung() {
		System.out.println(name);
		System.out.println(matrklnmr);
		System.out.println(groesse);
		System.out.println(geschlecht);
		System.out.println(semesterschnitt);
		
		
		
		
		
	}

			}
	
	
	
	
	
}
