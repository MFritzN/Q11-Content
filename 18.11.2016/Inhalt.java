
public class Inhalt {
	private String nummer;
	private String name;
	
	public Inhalt (String nummer, String name){
		this.nummer = nummer;
		this.name = name;
	}
	
	public String nameGeben(){
		return name;
	}
	
	public String nummerGeben(){
		return nummer;
	}
}
