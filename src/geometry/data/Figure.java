package geometry.data;

import java.util.Objects;

public abstract class Figure {
	
	private String name;
	
	protected Figure(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return Objects.toString(name, "_");
	}
	
	public abstract void translate(int deltaX, int deltaY);
		
}
