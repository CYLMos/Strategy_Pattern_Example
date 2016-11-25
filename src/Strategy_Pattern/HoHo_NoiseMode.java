package Strategy_Pattern;

public class HoHo_NoiseMode implements MakeNoiseBehavior{

	@Override
	public void makeNoise() {
		System.out.println("HoHoHo!!!");
	}

}
