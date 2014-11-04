package distances;

public enum Multiplier {

	NON(1), K(1000), M(1000 * 1000), G(1000 * 1000 * 1000), T(1000 * 1000 * 1000 * 1000);

	public double getValue() {
		return value;
	}

	/* Private */
	private Multiplier(double value) {
		this.value = value;
	}

	private double value;

}
