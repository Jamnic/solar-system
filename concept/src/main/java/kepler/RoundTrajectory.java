package kepler;

import java.math.BigDecimal;

import concept.Coordinates;

public class RoundTrajectory extends Trajectory {

	public RoundTrajectory(Coordinates coordinates, BigDecimal radius, BigDecimal velocity) {
		super(coordinates, velocity);

		this.radius = radius;
	}

	@Override
	public void calculateTrajectory(double time) {

		BigDecimal x = currentCoordinates.getX();
		BigDecimal y = currentCoordinates.getY();

		System.out.println("X = " + x + ", Y = " + y + ", length = " + length(x, y));

		double angleBetween = Math.toDegrees(Math.asin(x.divide(length(x, y)).doubleValue()));

		System.out.println("Angle = " + angleBetween);
		
		double radianAngle = 180 / Math.PI;
		
		double velocityAngle = radianAngle * velocity.doubleValue() / radius.doubleValue();
		
		System.out.println("Velocity angle = " + velocityAngle);

		y = radius.multiply(BigDecimal.valueOf(Math.cos(velocityAngle * time + angleBetween)));
		x = radius.multiply(BigDecimal.valueOf(-Math.sin(velocityAngle * time + angleBetween)));

		currentCoordinates.setX(x);
		currentCoordinates.setY(y);
		
	}

	/* Private */
	private BigDecimal radius;

}
