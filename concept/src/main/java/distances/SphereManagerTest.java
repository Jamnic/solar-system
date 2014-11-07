package distances;

import java.math.BigDecimal;

import org.junit.Test;

public class SphereManagerTest {

	private SphereManager manager = new SphereManager();
	
	@Test
	public void test() {
		
		BigDecimal earthRadius = Distance.mega(6.35);
		manager.createNewSphere(earthRadius);
		
		BigDecimal jupiterRadius = Distance.mega(35.00);
		manager.createNewSphere(jupiterRadius);
		
	}
	
}
