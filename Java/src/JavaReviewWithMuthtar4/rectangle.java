package JavaReviewWithMuthtar4;

public class rectangle {

	public double w,l;
	
	public double area() {
		return w*l;
		
	}
	public double perimiter() {
		
		return 2*w+l;
	}
	@Override
	public String toString() {
		return "rectangle [w=" + w + ", l=" + l + "]";
	}
	
	
	
}
