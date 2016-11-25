package Strategy_Pattern;

public class Walk_MoveMode implements MoveBehavior{

	@Override
	public void move() {
		System.out.println("Just Walk.");
	}

}
