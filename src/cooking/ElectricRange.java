package cooking;

public class ElectricRange implements Powered {
	public String cook() {
		return "Cooking on a hot surface!";
	}

	boolean powered;

	@Override
	public void powerOn() {
		powered = true;

	}

	@Override
	public boolean isTurnedOn() {
		return powered;
	}

}
