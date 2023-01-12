package poo.esiea.td_geometry;

public class Ellipse extends Geometry
{
	
	protected double axis1;
	protected double axis2;
	
	public Ellipse(){
		super();
	}
	
	public double calculateArea() {
		double area = Math.PI*this.axis1*this.axis1;
		return area;	
	}
	
	public double calculatePerimeter() {
		double perimeter = Math.PI * Math.sqrt(2 * (this.axis1 * this.axis1 + this.axis2 * this.axis2));
		return perimeter;	
	}
	
	public String monType() {
		return "Ellipse -> " + super.monType();
	}
	
	public double getAxis1() {
		return axis1;
	}

	public void setAxis1(double axis1) {
		this.axis1 = axis1;
	}

	public double getAxis2() {
		return axis2;
	}

	public void setAxis2(double axis2) {
		this.axis2 = axis2;
	}
	
}
