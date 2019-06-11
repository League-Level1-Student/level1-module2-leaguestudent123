package _03_smurf;

public class handy_smurf {
public static void main(String[] args) {
	Smurf Papa= new Smurf("Papa");
	Smurf Smurfette= new Smurf("Smurfette");
	
	String getName= Papa.getName();
	System.out.println(getName);
	
	String getName1= Smurfette.getName();
	System.out.println(getName1);
	
	
	Papa.eat();
	
	Smurfette.eat();
	
	String getHatColor=Papa.getHatColor();
	System.out.println(getHatColor);
	
	String isGirlOrBoy=Smurfette.getHatColor();
	System.out.println(isGirlOrBoy);
}
}
