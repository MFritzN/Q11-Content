
public class Telefonbuch {
	private Listenelement erster;
	public Telefonbuch (){
		erster = new Abschluss();
	}
	
	public void vorneEinfuegen(Inhalt inhalt){
		erster = new Datenknoten (erster, inhalt);
	}
	public void hintenEinfuegen(Inhalt i){
		erster = erster.hintenEinfuegen(i);
	}
	public void sortiertNamenEinfuegen(Inhalt i){
		erster = erster.sortiertNamenEinfuegen(i);
	}
	public void sortiertNummerEinfuegen(Inhalt i){
	    erster = erster.sortiertNummerEinfuegen(i);
	   }
	public int zaehlen(){
		return erster.zaehlen();
	}
	
	public void platzLoeschen(int platznummer){
		int index = 0;
		System.out.println("Platz "+platznummer+" wird gelöscht");
		System.out.println("");
		if (platznummer<1){
			System.out.println("Fehler: Platznummern müssen größer als 1 sein");
			System.out.println("");
		}
		if (platznummer>zaehlen()){
			System.out.println("-------------------------------------");
			System.out.println("");
			System.out.println("Fehler: Es sind nur "+zaehlen()+" Eintraege vorhanden");
			}
		else{
			System.out.println("-------------------------------------");
			System.out.println("");
			erster = erster.platzLoeschen(index, platznummer);
			}
		}
	
	public void alleNamenAusgeben(){
		System.out.println("Funktion alleNamenAusgeben aufgerufen");
		System.out.println("Telefonbuch (0)");
		System.out.println("");
		System.out.println("-------------------------------------");
		System.out.println("");
		erster.alleNamenAusgeben(0);
	}
}