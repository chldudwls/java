package sec10;

public class Example {
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.sound();
		
		Cat Cat = new Cat();
		Cat.sound();
		
	
		animalSound(new Dog());
		animalSound(new Cat());
	
	}
	public static void animalSound(Animal animal) {
		animal.sound();
	}
}
