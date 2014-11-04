package concept;

import java.math.BigDecimal;

import kepler.Trajectory;

public class CelestialObject {

	public CelestialObject(String name, BigDecimal radius, CelestialObjectType type, Trajectory trajectory) {

		this.name = name;
		this.radius = radius;
		this.type = type;
		this.trajectory = trajectory;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getRadius() {
		return radius;
	}

	public void setRadius(BigDecimal radius) {
		this.radius = radius;
	}

	public Trajectory getTrajectory() {
		return trajectory;
	}

	public void setTrajectory(Trajectory trajectory) {
		this.trajectory = trajectory;
	}

	public CelestialObjectType getType() {
		return type;
	}

	public void setType(CelestialObjectType type) {
		this.type = type;
	}

	/* Private */
	private String name;
	private BigDecimal radius;
	private Trajectory trajectory;
	private CelestialObjectType type;

}
