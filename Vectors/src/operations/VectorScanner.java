package operations;

import java.util.Scanner;

import vector.Dimensions;
import vector.Vector;

public class VectorScanner {
	private Vector vector1 = null;
	private Vector vector2 = null;
	
	public VectorScanner(Scanner s, Dimensions dimensions, boolean useComponents) {
		if (useComponents) {
			System.out.println("Enter vector 1 using the notation: \"x-componet y-componet z-componet\", no quotes");
			vector1 = new Vector(dimensions, s.nextDouble(), s.nextDouble(), s.nextDouble());
			System.out.println("Enter vector 2 using the notation: \"x-componet y-componet z-componet\", no quotes");
			vector2 = new Vector(dimensions, s.nextDouble(), s.nextDouble(), s.nextDouble());
		} else {
			System.out.println("Enter vector 1 using the notation: \"magnitude, angle(in degrees)\", no quotes");
			vector1 = new Vector(dimensions, s.nextDouble(), Math.toRadians(s.nextDouble()));
			System.out.println("Enter vector 2 using the notation: \"magnitude, angle(in degrees)\", no quotes");
			vector2 = new Vector(dimensions, s.nextDouble(), Math.toRadians(s.nextDouble()));
		}
	}

	public Vector getVector1() { return vector1; }
	public Vector getVector2() { return vector2; }
}