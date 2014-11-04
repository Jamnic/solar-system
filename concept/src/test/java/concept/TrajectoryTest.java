package concept;

import kepler.RoundTrajectory;
import kepler.Trajectory;

import org.junit.Test;

public class TrajectoryTest {

	@Test
	public void test() {
		
		Coordinates coordinates = new Coordinates(2.0, 0.0, 0.0);
		
		Trajectory trajectory = new RoundTrajectory(coordinates, 2.0);
		
		trajectory.calculateTrajectory(1, 1);
		trajectory.calculateTrajectory(1, 1);
		trajectory.calculateTrajectory(1, 1);
		trajectory.calculateTrajectory(1, 1);
		trajectory.calculateTrajectory(1, 1);
	}
	
}
