
public class Abschluss extends Listenelement {
	public Abschluss(){
	}
	
	public void naechsterSetzen(Datenknoten k)
	{
		System.out.println("Fehler, Abschluss kann keinen naechsten haben!");
	}
	
	public Listenelement sortiertNamenEinfuegen(Inhalt i){
		return hintenEinfuegen(i);
	}
	
	public Listenelement sortiertNummerEinfuegen(Inhalt i){
	    return hintenEinfuegen(i);
	   }
	
	public Listenelement hintenEinfuegen(Inhalt i){
		return new Datenknoten(this, i);
	}
	
	public int zaehlen(){
		return 0;
	}
	
	public void alleNamenAusgeben(int z){
		z++;
		System.out.println("Abschluss ("+z+")");
		System.out.println("");
	}
	
	public Listenelement platzLoeschen(int index, int platznummer){
		System.out.println("Fehler: Abschluss erreicht");
		System.out.println("");
		return this;
	}

}