package concept;

public class CelestialObjectManager {

	public void performTrajectory(CelestialObject object, double time) {
		
		object.getTrajectory().calculateTrajectory(time);
		
	}
	
}
