package org.saikrishna.test;

/*import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;*/

//import java.util.List;

public class Triangle implements shape {
	
	private Point pointA;
	private Point pointB;
	private Point pointC;
	
	public Point getPointA() {
		return pointA;
	}



	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}



	public Point getPointB() {
		return pointB;
	}



	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}



	public Point getPointC() {
		return pointC;
	}



	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}



	public void draw() {
		System.out.println("Drawing Triangle");
		System.out.println("Point A = ("+getPointA().getX()+", "+getPointA().getY()+")");
		System.out.println("Point B = ("+getPointB().getX()+", "+getPointB().getY()+")");
		System.out.println("Point C = ("+getPointC().getX()+", "+getPointC().getY()+")");
		}


/*
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Initializing Beans init method called for triangle");
		
	}



	@Override
	public void destroy() throws Exception {
		System.out.println("Disposable Beans init method called for triangle");
		
	}*/
	public void myInit() {
		System.out.println("My init method called for triangle");
	}
	
	public void cleanup() {
		System.out.println("My cleanup method called for triangle");
	}
		}