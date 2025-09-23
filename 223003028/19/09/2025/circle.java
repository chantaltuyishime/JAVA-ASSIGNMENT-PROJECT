package com.shape;

public class circle {
	 private double radius;

	  public circle(double radius) {
	        this.radius = radius;
	    }
	    public double calculateArea(){
	        return (Math.PI*Math.pow(this.radius,2));
	    }
	    public double calculateCircumference(){
	        return ((Math.PI*this.radius)*2);
	    }
	}



