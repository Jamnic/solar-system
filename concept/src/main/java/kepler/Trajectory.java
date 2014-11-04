package kepler;

import java.math.BigDecimal;

import concept.Coordinates;

public abstract class Trajectory {

	public Trajectory(Coordinates coordinates, BigDecimal velocity) {
		this.currentCoordinates = coordinates;
		this.velocity = velocity;
	}

	public abstract void calculateTrajectory(double time);

	public Coordinates getCurrentCoordinates() {
		return currentCoordinates;
	}

	/* Protected */
	protected Coordinates currentCoordinates;
	protected BigDecimal velocity;

	protected BigDecimal length(BigDecimal x, BigDecimal y) {
		return BigDecimal.valueOf(Math.sqrt(x.multiply(x).add(y.multiply(y)).doubleValue()));
	}

}
