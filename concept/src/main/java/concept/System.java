package concept;

import java.util.HashSet;
import java.util.Set;

public class System {

	private Set<CelestialObject> celestialObjects = new HashSet<CelestialObject>();

	public Set<CelestialObject> getCelestialObjects() {
		return celestialObjects;
	}

	public void setCelestialObjects(Set<CelestialObject> celestialObjects) {
		this.celestialObjects = celestialObjects;
	}

}
