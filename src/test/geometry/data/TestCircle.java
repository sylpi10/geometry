package test.geometry.data;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

import geometry.data.Circle;
import geometry.data.Figure;
import geometry.data.Measurable2d;
import geometry.data.Point;

class TestCircle {

	@Test
	void testPerimeter() {
		Point pA = new Point("pA", 10, 10);
		Circle cA = new Circle("cA", 12.0, pA);
		Circle cB = new Circle("cB", 4.0, pA);

		System.out.println(cA);
		System.out.println("perimeter : " + cA.perimeter());
		System.out.println("area : " + cA.area());
	
		System.out.println("\n"+cB);
		System.out.println("perimeter : " + cB.perimeter());
		System.out.println("area : " + cB.area());
	}
	
	@Test
	void isMeasurable() {
		Point pA = new Point("pA", 10, 10);
		Circle cA = new Circle("cA", 12.0, pA);
		
		System.out.println(cA instanceof Measurable2d);
		System.out.println(pA instanceof Measurable2d);
		
		List<Figure> figures = List.of(pA, cA);
		
		for (Figure fig : figures) {
			System.out.print(" - " + fig + "is measurable2d : " );
			System.out.println(fig instanceof Measurable2d);
			
			if (fig instanceof Measurable2d) {
				Measurable2d m = (Measurable2d) fig;
				System.out.println("\n\t* area: " + m.area());
				System.out.println("\t* perimeter: " + m.perimeter());
			}
		}
	}
}
