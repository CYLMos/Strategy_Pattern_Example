package Strategy_Pattern;

public class NoNoiseMode implements MakeNoiseBehavior{

	@Override
	public void makeNoise() {
		System.out.println("No Noise!");
	}

}
