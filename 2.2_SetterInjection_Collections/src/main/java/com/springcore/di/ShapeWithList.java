package com.springcore.di;

import java.util.List; 

public class ShapeWithList {

	List<Point> points;

	public List<Point> getPoints() {
		return points;
	}

	public void setPoints(List<Point> points) {
		this.points = points;
	}
	
	public void draw()
	{
		for(Point point:points)
		{
			System.out.println("Point A ("+point.getX()+","+point.getY()+")");
		}
	}
}
