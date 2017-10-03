package cooking;

public abstract class Cooker {
	public String getCookerType() {
		String className = getClass().getSimpleName();

		return className;
	}

	public abstract String cook();
}