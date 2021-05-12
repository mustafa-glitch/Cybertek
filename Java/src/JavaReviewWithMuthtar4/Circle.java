package JavaReviewWithMuthtar4;

public class Circle {

	public double radius;
	
	
	public double calculatethearea() {
		return radius * radius * 3.14;
		}
		
		
		public double calculatePerimeter() { //action to calculate perimeter
			return radius * 2 * 3.14;
		}
		
		public String toString() { // convert circle to string
			return "Radius: "+radius
					+", Area: "+calculateArea()
					+", Perimeter: "+calculatePerimeter();
		}


		private String calculateArea() {
			// TODO Auto-generated method stub
			return null;
		}
		
	}

