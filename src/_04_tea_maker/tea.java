package _04_tea_maker;

public class tea {
public static void main(String[] args) {
	TeaBag TeaBag=new TeaBag("TeaBag");
	
	String flavor= TeaBag.getFlavor();
	flavor.Water(true);
}
}
