package _02_sea_creature;

public class spongebob {
public static void main(String[] args) {
	SeaCreature squidward =new SeaCreature("squidward");
	SeaCreature spongeBob =new SeaCreature("spongeBob");
	SeaCreature patrick =new SeaCreature("patrick");
	String  person= spongeBob.getName();
	
	
	spongeBob.eat();
	squidward.eat();
	patrick.eat();
	
	
	squidward.laugh();
	spongeBob.laugh();
	patrick.laugh();
}
}

