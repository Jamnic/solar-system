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
	
	public static BigDecimal kilo(double value) {
		return BigDecimal.valueOf(value * Multiplier.K.getValue());
	}
	
	public static BigDecimal mega(double value) {
		return BigDecimal.valueOf(value * Multiplier.M.getValue());
	}
	
	public static BigDecimal giga(double value) {
		return BigDecimal.valueOf(value * Multiplier.G.getValue());
	}
	
	public static BigDecimal tera(double value) {
		return BigDecimal.valueOf(value * Multiplier.T.getValue());
	}

}
