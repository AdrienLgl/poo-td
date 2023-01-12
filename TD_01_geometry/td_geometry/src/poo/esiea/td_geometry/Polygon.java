package poo.esiea.td_geometry;

public class Polygon extends Geometry
{

	protected double[] sideSize = {};	
	protected int numberSide;

	public Polygon(){
		super();
	}
	
	public double calculateArea() {
	  double aire = 0;
	  for (int i = 0; i < numberSide; i++) {
		  aire += sideSize[i] * Math.sin(Math.PI / numberSide);
	  }
	  aire /= 2;
	  return aire;
	}
	
	public double calculatePerimeter() {
		double perimetre = 0;
		for (int i = 0; i < numberSide; i++) {
			perimetre += sideSize[i];
		}
		return perimetre;
	}
	
	public String monType() {
		return "Polygon" + " -> " + super.monType();
	}
	
	public double[] getSideSize() {
		return sideSize;
	}

	public void setSideSize(double[] sideSize) {
		this.sideSize = sideSize;
	}

	public int getNumberSide() {
		return numberSide;
	}

	public void setNumberSide(int numberSide) {
		this.numberSide = numberSide;
	}

	
}
