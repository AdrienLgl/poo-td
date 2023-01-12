package poo.esiea.td_geometry;

public class Launcher {
	
	public static void main(String[] args) {
		double[] rectangleSides = {4.0, 5.0, 4.0, 5.0};
		Polygon rectangle = new Polygon();
		rectangle.setNumberSide(4);
		rectangle.setSideSize(rectangleSides);
		System.out.println("Rectangle area is " + rectangle.calculateArea());
		System.out.println("Rectangle perimeter is " + rectangle.calculatePerimeter());
	}
	

}
