package _04_tea_maker;

public class tea {
public static void main(String[] args) {
	TeaBag teaBag=new TeaBag(TeaBag.GREEN);
	Cup cup= new Cup();
	Kettle kettle=new Kettle();
	
	
	kettle.boil();
	cup.makeTea(teaBag, kettle.getWater());
	
	
}
}
