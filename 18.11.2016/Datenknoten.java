
public class Datenknoten extends Listenelement {
	private Listenelement naechster;
	private Datenelement datene;
	
	public Datenknoten (Listenelement naechster, Inhalt inhalt){
		this.datene = new Datenelement (inhalt);
		this.naechster = naechster;
	}
	
	public void naechsterSetzen(Datenknoten d){
		naechster = d;
	}
	
	public Listenelement hintenEinfuegen(Inhalt i){
		naechster = naechster.hintenEinfuegen(i);
		return this;
	}
	
	public Listenelement sortiertNamenEinfuegen(Inhalt inhaltNeu){
		int erg = inhaltNeu.nameGeben().compareTo(datene.nameGeben());
		if (erg <= 0){
			return new Datenknoten (this, inhaltNeu);
		}
		else{
			naechster = naechster.sortiertNamenEinfuegen(inhaltNeu);
			return this;
		}
	}
	
	public Listenelement sortiertNummerEinfuegen(Inhalt inhaltNeu){
		int erg = inhaltNeu.nummerGeben().compareTo(datene.nummerGeben());
		if (erg <= 0){
			return new Datenknoten (this, inhaltNeu);
		}
		else{
			naechster = naechster.sortiertNummerEinfuegen(inhaltNeu);
			return this;
		}
	}
	
	public int zaehlen(){
		return naechster.zaehlen()+1;
	}
	
	public void alleNamenAusgeben(int z)
	{
		z++;
		System.out.println("Knoten ("+z+")");
		System.out.println("");
		System.out.println("Name: " +datene.nameGeben());
		System.out.println("Nummer: " +datene.nummerGeben());
		System.out.println("");
		System.out.println("-------------------------------------");
		System.out.println("");
		naechster.alleNamenAusgeben(z);
	}
	public Listenelement platzLoeschen(int index, int platznummer)
	{
	    index ++;
		if(platznummer == index){
			System.out.println("Platznummer "+index+" wurde geloescht");
			System.out.println("Verlorener Inhalt:");
			System.out.println("Name: "+this.datene.nameGeben());
			System.out.println("Nummer: "+this.datene.nummerGeben());
			return naechster;
		}
		else{
		    naechster = naechster.platzLoeschen(index, platznummer);
			return this;
		}
	}
}