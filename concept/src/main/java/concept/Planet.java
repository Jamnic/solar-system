package concept;

import java.math.BigDecimal;

import kepler.Trajectory;

public class Planet extends CelestialObject {

	public Planet(String name, BigDecimal radius, Trajectory trajectory, PlanetType planetType) {

		super(name, radius, CelestialObjectType.PLANET, trajectory);

		this.planetType = planetType;

	}

	public PlanetType getPlanetType() {
		return planetType;
	}

	public void setPlanetType(PlanetType planetType) {
		this.planetType = planetType;
	}

	/* Private */
	private PlanetType planetType;

}
