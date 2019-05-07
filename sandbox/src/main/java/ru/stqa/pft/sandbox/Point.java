package ru.stqa.pft.sandbox;

public class Point {

  public double x;
  public double y;

  public Point (double x, double y){
    this.x = x;
    this.y = y;
  }

  	public double distance(Point k){
		return Math.sqrt((((this.x - k.x) * (this.x - k.x)) + ((this.y - k.y) * (this.y - k.y))));
	}
}
