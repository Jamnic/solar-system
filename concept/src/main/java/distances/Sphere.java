package distances;

import java.math.BigDecimal;

public class Sphere {

	public BigDecimal getRadius() {
		return radius;
	}

	public void setRadius(BigDecimal radius) {
		this.radius = radius;
	}

	public BigDecimal getDiameter() {
		return diameter;
	}

	public void setDiameter(BigDecimal diameter) {
		this.diameter = diameter;
	}

	public BigDecimal getSurface() {
		return surface;
	}

	public void setSurface(BigDecimal surface) {
		this.surface = surface;
	}

	public BigDecimal getCircuit() {
		return circuit;
	}

	public void setCircuit(BigDecimal circuit) {
		this.circuit = circuit;
	}

	/* Private */
	private BigDecimal radius;
	private BigDecimal diameter;
	private BigDecimal surface;
	private BigDecimal circuit;

}
