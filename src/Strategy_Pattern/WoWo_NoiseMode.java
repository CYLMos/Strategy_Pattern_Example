package Strategy_Pattern;

public class WoWo_NoiseMode implements MakeNoiseBehavior{

	@Override
	public void makeNoise() {
		System.out.println("WoWoWo!!!");
	}
}
