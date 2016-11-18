
public class Testklasse {
	private Telefonbuch telefonbuch;
	public Testklasse(){
		this.telefonbuch = new Telefonbuch();
		telefonbuch.sortiertNamenEinfuegen(new Inhalt("0800", "Albert"));
		telefonbuch.sortiertNamenEinfuegen(new Inhalt("08821", "Berta"));
		telefonbuch.sortiertNamenEinfuegen(new Inhalt("08831", "Dora"));
	}
	public Telefonbuch telefonbuchGeben(){
	    return telefonbuch;
	   }
}