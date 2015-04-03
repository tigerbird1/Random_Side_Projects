package vector;

public class Vector {

	protected Double x = null;
	protected Double y = null;
	protected Double z = null;
	protected Double magnitude = null;
	protected Double angle = null;
	
	public Vector(Dimensions dimension, Double magnitude, Double angle) {
		switch(dimension) {
		case THREEDIM:
			//TODO finish 3d computations
			break;
		case TWODIM:
			this.x = Math.cos(angle) * magnitude;
			this.y = Math.sin(angle) * magnitude;
			break;
		case ONEDIM:
			this.x = magnitude;
			break;
		default:
			break;
		}
		this.magnitude = magnitude;
		this.angle = angle;
	}
	public Vector(Dimensions dimension, Double x, Double y, Double z) {
		switch(dimension) {
		case THREEDIM:
			this.z = z;
		case TWODIM:
			this.y = y;
		case ONEDIM:
			this.x = x;
			break;
		default:
			break;
		}
		switch(dimension) {
		case THREEDIM:
			//TODO finish 3d computations
			magnitude = Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2) + Math.pow(this.z, 2));
			angle = 0.0;
			break;
		case TWODIM:
			magnitude = Math.hypot(this.x, this.y);
			angle = Math.asin(this.y / this.magnitude);
			break;
		case ONEDIM:
			magnitude = x;
			angle = 0.0;
			break;
		default:
			break;
		}
	}
	
	public void validateAngle() {
		this.angle = Math.asin(this.y / this.magnitude);
	}
	
	public Double getX() { return x; }
	public Double getY() { return y; }
	public Double getZ() { return z; }
	public Double getMagnitude() { return magnitude; }
	public Double getAngle() { return angle; }
	
	@Override
	public String toString() { return String.format("Magnitude: %.4f, Angle: %.2f", magnitude, angle); }
}
