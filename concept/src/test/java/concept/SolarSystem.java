package concept;

import java.math.BigDecimal;

import kepler.RoundTrajectory;
import kepler.Trajectory;

import org.junit.Test;

import distances.Distance;
import distances.Multiplier;

public class SolarSystem {

	@Test
	public void simulateSolarSystem() {

		System solarSystem = new System();

		Star sun = createSun();
		solarSystem.getCelestialObjects().add(sun);

		Planet earth = createEarth();
		solarSystem.getCelestialObjects().add(earth);

		Planet jupiter = createJupiter();
		solarSystem.getCelestialObjects().add(jupiter);

		CelestialObjectManager manager = new CelestialObjectManager();
		manager.performTrajectory(earth, 1000);
		manager.performTrajectory(earth, 1000);
		manager.performTrajectory(earth, 1000);
		
		
	}

	private Planet createJupiter() {
		BigDecimal jupiterRadius = Distance.of(69.9, Multiplier.K);
		Coordinates jupiterCoordinates = new Coordinates(Distance.of(0), Distance.of(778, Multiplier.T), Distance.of(0));
		Trajectory jupiterTrajectory = new RoundTrajectory(jupiterCoordinates, Distance.of(778, Multiplier.T),
				Distance.of(13, Multiplier.K));

		Planet jupiter = new Planet("Jupiter", jupiterRadius, jupiterTrajectory, PlanetType.GAS_GIANT);

		return jupiter;
	}

	private Star createSun() {

		BigDecimal sunRadius = Distance.of(700, Multiplier.G);
		Coordinates centerOfSolarSystem = new Coordinates(Distance.of(0), Distance.of(0), Distance.of(0));
		Trajectory noTrajectory = new RoundTrajectory(centerOfSolarSystem, Distance.of(0),
				Distance.of(13, Multiplier.K));

		Star sun = new Star("Sun", sunRadius, noTrajectory);

		return sun;
	}

	private Planet createEarth() {

		BigDecimal earthRadius = Distance.of(12.7, Multiplier.K);
		Coordinates earthCoordinates = new Coordinates(Distance.of(0), Distance.of(150, Multiplier.T), Distance.of(0));
		Trajectory earthTrajectory = new RoundTrajectory(earthCoordinates, Distance.of(150, Multiplier.T), Distance.of(
				30, Multiplier.K));

		Planet earth = new Planet("Earth", earthRadius, earthTrajectory, PlanetType.FOREST);

		return earth;
	}

}
