package Strategy_Pattern;

public class Young_Dog extends Dog{
	public Young_Dog(){
		makeNoiseBehavior = (MakeNoiseBehavior)new WoWo_NoiseMode();
		movebehavior = (MoveBehavior)new Run_MoveMode();
	}
	
	@Override
    public void makeNoise(){
		makeNoiseBehavior.makeNoise();
	}
	
	@Override
    public void move(){
		movebehavior.move();
	}
	
	@Override
    public void display(){
		System.out.println("I'm a young dog!");
	}
}
