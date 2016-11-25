package Strategy_Pattern;

public class Old_Dog extends Dog{
	public Old_Dog(){
		makeNoiseBehavior = (MakeNoiseBehavior)new HoHo_NoiseMode();
		movebehavior = (MoveBehavior)new Walk_MoveMode();
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
		System.out.println("I'm an old dog!");
	}
}
