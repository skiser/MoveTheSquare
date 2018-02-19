package edu.ycp.cs320.movethesquare.model;

public class Game {
	public static final double MOVE_DIST = 2.0; // x/y distance square moves each tick 
	private double width, height;
	private Square square;
	private double squareDx;
	private double squareDy;
	private double radius;
	private Circle circle;
	private double circleDx;
	private double circleDy;
	
	public Game() {
		
	}
	
	public void setSquare(Square square) {
		this.square = square;
	}
	
	public Square getSquare() {
		return square;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	public double getWidth() {
		return width;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getHeight() {
		return height;
	}
	
	public void setSquareDx(double squareDx) {
		this.squareDx = squareDx;
	}
	
	public double getSquareDx() {
		return squareDx;
	}
	
	public void setSquareDy(double squareDy) {
		this.squareDy = squareDy;
	}
	
	public double getSquareDy() {
		return squareDy;
	}
	
	public void setCircle(Circle circle) {
		this.circle = circle;
	}
	
	public Circle getCircle() {
		return circle;
	}
	
	public void setCircleDx(double circleDx) {
		this.circleDx = circleDx;
	}
	
	public double getCircleDx() {
		return circleDx;
	}
	
	public void setCircleDy(double circleDy) {
		this.circleDy = circleDy;
	}
	
	public double getCircleDy() {
		return circleDy;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}
		
}