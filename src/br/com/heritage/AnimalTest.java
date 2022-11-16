package br.com.heritage;

public class AnimalTest {

	public static void main(String[] args) {
		
		Dog lulu = new Dog();
		lulu.food = "ration";
		lulu.toSleep();
		
		Hen cocorico = new Hen();
		cocorico.toSleep();
	}
}
