package com.pranavshinde.testing;
import com.pranavshinde.shape.three_dimensional.Cube;
import com.pranavshinde.shape.two_dimensional.Circle;
import com.pranavshinde.shape.two_dimensional.Rectangle;

public class Testing {

	public static void main(String[] args) {
		Cube c1=new Cube();
		c1.displayCube();
		
		Rectangle r1=new Rectangle();
		r1.displayRectangle();
		
		Circle cr1=new Circle();
		cr1.displayCircle();

	}

}
