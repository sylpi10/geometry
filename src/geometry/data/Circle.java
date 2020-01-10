package geometry.data;

import java.util.Objects;

public class Circle extends Figure implements Measurable2d{
	
	private Point center;
	private double radius;
	
	
	public Circle(String name, double radius, Point center) {
		super(name);
		this.radius = radius;
		this.center = Objects.requireNonNull(center);
	}
	
	public Circle( double radius, Point center) {
		this(null, radius, center);
	}

	public Circle(String name, Point center) {
		this(name, 1, center);
	}

	public Point getCenter() {
		return center;
	}


	public void setCenter(Point center) {
		this.center = center;
	}


	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	
	
	@Override
	public String toString() {
		return super.toString() + " (c=" + center + ", r=" + radius + ")";
	}
	
	@Override
	public double perimeter() {
		return this.radius * Math.PI*2;
	}
	
	@Override
	public double area() {
//		return (Math.PI * (this.radius * this.radius));
		return Math.PI * Math.pow(radius,2);
	}

	@Override
	public void translate(int deltaX, int deltaY) {
		center.translate(deltaX, deltaY);
	}
}
