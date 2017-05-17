package com.quantum.javacore.designpattern;

import java.util.Hashtable;

abstract class Shape1 implements Cloneable {
	   
	   private String id;
	   protected String type;
	   
	   abstract void draw();
	   
	   public String getType(){
	      return type;
	   }
	   
	   public String getId() {
	      return id;
	   }
	   
	   public void setId(String id) {
	      this.id = id;
	   }
	   
	   public Object clone() {
	      Object clone = null;
	      
	      try {
	         clone = super.clone();
	         
	      } catch (CloneNotSupportedException e) {
	         e.printStackTrace();
	      }
	      
	      return clone;
	   }
	}

class Rectangle extends Shape1 {

	   public Rectangle(){
	     type = "Rectangle";
	   }

	   @Override
	   public void draw() {
	      System.out.println("Inside Rectangle::draw() method.");
	   }
}

class Square extends Shape1 {

	   public Square(){
	     type = "Square";
	   }

	   @Override
	   public void draw() {
	      System.out.println("Inside Square::draw() method.");
	   }
}

class Circle extends Shape1 {

	   public Circle(){
	     type = "Circle";
	   }

	   @Override
	   public void draw() {
	      System.out.println("Inside Circle::draw() method.");
	   }
}


class ShapeCache {
	
	   private static Hashtable<String, Shape1> shapeMap  = new Hashtable<String, Shape1>();

	   public static Shape1 getShape(String shapeId) {
	      Shape1 cachedShape = shapeMap.get(shapeId);
	      return (Shape1) cachedShape.clone();
	   }
	   
	   public static void loadCache() {
	      Circle circle = new Circle();
	      circle.setId("1");
	      shapeMap.put(circle.getId(),circle);

	      Square square = new Square();
	      square.setId("2");
	      shapeMap.put(square.getId(),square);

	      Rectangle rectangle = new Rectangle();
	      rectangle.setId("3");
	      shapeMap.put(rectangle.getId(), rectangle);
	   }
	}



public class PrototypeExample {
	
	
	 public static void main(String[] args) {
		      ShapeCache.loadCache();
		      
		      Shape1 clonedShape = (Shape1) ShapeCache.getShape("1");
		      System.out.println("Shape : " + clonedShape.getType());		

		      Shape1 clonedShape2 = (Shape1) ShapeCache.getShape("2");
		      System.out.println("Shape : " + clonedShape2.getType());		

		      Shape1 clonedShape3 = (Shape1) ShapeCache.getShape("3");
		      System.out.println("Shape : " + clonedShape3.getType());		
	}

}
