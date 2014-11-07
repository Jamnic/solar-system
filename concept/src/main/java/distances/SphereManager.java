package distances;

import java.math.BigDecimal;

public class SphereManager {

	public Sphere createNewSphere(BigDecimal radius) {

		Sphere sphere = new Sphere();

		BigDecimal circuit = calculateCircuit(radius);
		BigDecimal surface = calculateSurface(radius);
		BigDecimal diameter = calculateDiameter(radius);

		sphere.setRadius(radius);
		sphere.setCircuit(circuit);
		sphere.setSurface(surface);
		sphere.setDiameter(diameter);

		System.out.println("Radius " + radius);
		System.out.println("Diameter " + diameter);
		System.out.println("Surface " + surface);
		System.out.println("Circuit " + circuit);

		return sphere;
	}

	/* Private */
	private static final BigDecimal PI = new BigDecimal(Math.PI);

	private BigDecimal calculateDiameter(BigDecimal radius) {
		return radius.add(radius);
	}

	private BigDecimal calculateSurface(BigDecimal radius) {
		return new BigDecimal(4).multiply(PI).multiply(radius.multiply(radius));
	}

	private BigDecimal calculateCircuit(BigDecimal radius) {
		return (radius.add(radius)).multiply(PI);
	}

	private BigDecimal calculateRadius(BigDecimal diameter) {
		return diameter.divide(new BigDecimal(2));
	}

}
