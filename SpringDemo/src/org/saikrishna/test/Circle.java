package org.saikrishna.test;

public class Circle implements shape {

	private Point Center;
	@Override
	public void draw() {
		
		System.out.println("Drawing Circle");
		System.out.println("Circle : Points is "+ Center.getX() + ", "+ Center.getX() + ")");
		
	}
	
	
	public Point getCenter() {
		return Center;
	}
	
	
	public void setCenter(Point center) {
		Center = center;
	}

}
