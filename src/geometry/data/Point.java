package geometry.data;

import java.util.Objects;

public class Point extends Figure{
	private int x;
	private int y;
	
	public Point(String name, int x, int y) {
		super(name);
		this.x = x;
		this.y = y;
	}
	
	public Point(int x, int y) {
		this(null, x, y);
	}
	
	public Point() {
		this("O",0,0);
	}

	public int getx() {
		return x;
	}

	public void setx(int x) {
		this.x = x;
	}

	public int gety() {
		return y;
	}

	public void sety(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return super.toString() + "(" + x + "," + y + ")";
		
	}
	
	@Override
	public int hashCode() {	
		return Objects.hash(getName(), x, y);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point other = (Point) obj;
		return Objects.equals(this.getName(),other.getName()) 
				              && this.x == other.y && this.y == other.y;
	}
	
	public double calcDistance(Point otherP) {
		
//		return Math.sqrt(
//					Math.pow(this.x-otherP.x, 2) +
//					Math.pow(this.y-otherP.y, 2)
//				);
		return Math.hypot(this.x-otherP.x, this.y-otherP.y);
	}

	@Override
	public void translate(int deltaX, int deltaY) {
		x += deltaX;
		y += deltaY;
	}
	
}
