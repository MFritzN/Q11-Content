
public abstract class Listenelement {
	public abstract Listenelement hintenEinfuegen(Inhalt i);
	public abstract void naechsterSetzen(Datenknoten k);
	public abstract Listenelement sortiertNamenEinfuegen(Inhalt inhaltNeu);
	public abstract int zaehlen();
	public abstract void alleNamenAusgeben(int z);
	public abstract Listenelement sortiertNummerEinfuegen(Inhalt i);
	public abstract Listenelement platzLoeschen(int index, int platznummer);
}