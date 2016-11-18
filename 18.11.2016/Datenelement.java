
public class Datenelement {
	private Inhalt inhalt;
	public Datenelement(Inhalt inhalt){
		this.inhalt=  inhalt;
	}
	
	public String nameGeben(){
		return inhalt.nameGeben();
	}
	
	public String nummerGeben(){
		return inhalt.nummerGeben();
	}
}