package distances;

import java.math.BigDecimal;

public final class Distance {

	private Distance() {}

	public static BigDecimal of(double value, Multiplier multiplier) {
		return BigDecimal.valueOf(value * multiplier.getValue());
	}
	
	public static BigDecimal of(double value) {
		return of(value, Multiplier.NON);
	}

}
