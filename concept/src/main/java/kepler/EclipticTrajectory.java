package kepler;

import java.math.BigDecimal;

import concept.Coordinates;

public class EclipticTrajectory extends Trajectory {

	public EclipticTrajectory(Coordinates coordinates, double radiusA, double radiusB) {
		super(coordinates, BigDecimal.ZERO);

		this.radiusA = radiusA;
		this.radiusB = radiusB;
	}

	@Override
	public void calculateTrajectory(double time, double velocity) {

//		double x = currentCoordinates.getX();
//		double y = currentCoordinates.getY();
//
//		System.out.println("X = " + x + ", Y = " + y + ", length = " + length(x, y));
//
//		double angle = Math.toDegrees(Math.asin(x / length(x, y)));
//
//		System.out.println("Angle = " + angle);
//
//		y = radiusA * Math.cos(velocity * time + angle);
//		x = radiusB * -Math.sin(velocity * time + angle);
//
//		currentCoordinates.setX(x);
//		currentCoordinates.setY(y);
//		
	}

	/* Private */
	private double radiusA;
	private double radiusB;

}
