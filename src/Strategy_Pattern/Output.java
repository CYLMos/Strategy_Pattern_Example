package Strategy_Pattern;

public class Output {
	public static void main(String[] args){
		Old_Dog old_dog = new Old_Dog();
		Young_Dog young_Dog = new Young_Dog();
		
		old_dog.display();
		old_dog.move();
		old_dog.makeNoise();
		
		System.out.println("-----------------------------");
		
		young_Dog.display();
		young_Dog.move();
		young_Dog.makeNoise();
	}
}
