package test.geometry.data;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

import geometry.data.Figure;
import geometry.data.Point;

class TestPoint {

	@Test
	void test() {
		Point pointA = new Point("A", 12, 18);
		Point pointB = new Point("B", 24, 54);
		Point pointC = new Point(54, 66);
		List<Point> points = List.of(pointA, pointB, pointC);
		System.out.println(points.toString());
	}
	
	@Test 
	void testPointAsFigure(){
		Point pA = new Point("X", 17, 35);
		Figure f = pA;
		System.out.println(pA.getClass());
		System.out.println(f.getClass());
		System.out.println(f);
		System.out.println(pA);
		System.out.println(pA instanceof Figure);
		Figure fb = new Point("fb", 12, 14);
		List<Figure> figs = List.of(pA, fb);
		System.out.println(figs);
	}
	
	@Test
	void testDistance() {
		Point pA = new Point("X", 4, 5);
		Point pO = new Point();
		Point pB = new Point("X", 7, 7);
		var d1 = pA.calcDistance(pO);
		var d2 = pB.calcDistance(pA);
		System.out.println(d1);
		System.out.println(d2);
	}
	
	@Test 
	void testTranslate() {
		Point pA = new Point("A", 3, 4);
		pA.translate(2, 3);
		System.out.println(pA);
	}
}
