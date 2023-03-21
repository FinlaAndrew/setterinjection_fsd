package ustbatchno3.di_setterinjection;

public class Roles {
	public String charactername;
	public String responsibility;
	public String getCharactername() {
		return charactername;
	}
	public void setCharactername(String charactername) {
		this.charactername = charactername;
	}
	public String getResponsibility() {
		return responsibility;
	}
	public void setResponsibility(String responsibility) {
		this.responsibility = responsibility;
	}
	@Override
	public String toString() {
		return "Roles [charactername=" + charactername + ", responsibility=" + responsibility + "]";
	}
	public void display() {
		System.out.println("My name is " + charactername);
		System.out.println("\nMY responsibility is " + responsibility);
	}
	
}
