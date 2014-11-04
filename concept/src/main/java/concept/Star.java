package concept;

import java.math.BigDecimal;

import kepler.Trajectory;

public class Star extends CelestialObject {

	public Star(String name, BigDecimal radius, Trajectory trajectory) {
		super(name, radius, CelestialObjectType.STAR, trajectory);
	}

}
