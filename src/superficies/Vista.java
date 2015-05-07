/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superficies;

import java.util.Scanner;

/**
 *
 * @author Patripon
 */
public class Vista {
    
    private static Scanner sc;
    
    public void introducirDatos(){
        String shapeType;

        sc = new Scanner(System.in);
        
        System.out.println("What shape would you like to find the area of? (square, circle, triangle, rectangle):");
        shapeType = sc.nextLine();
        System.out.println("You said: " + shapeType);
        
        if (shapeType.equals("square")){
            Square square1 = new Square();
            System.out.println("what is the side length?");
            square1.setSideLength(sc.nextFloat());
                
        }
        if (shapeType.equals("rectangle")){
            Rectangle rectangle1 = new Rectangle();
            System.out.println("what is the rectangles width?");
            rectangle1.setSideLength(sc.nextFloat());
            System.out.println("What is the rectangles height?");
            rectangle1.setSideHeight(sc.nextFloat());
        }
        if (shapeType.equals("triangle")){
            Triangle triangle1 = new Triangle();
            System.out.println("What is the base length of the triangle?");
            triangle1.setBaseLength(sc.nextFloat());
            System.out.println("What is the height of the triangle?");
            triangle1.setHeight(sc.nextFloat());
        }
        if (shapeType.equals("circle")){
            Circle circle1 = new Circle();
            System.out.println("What is the radius of the circle?");
            circle1.setRadius(sc.nextFloat());
        }
    }
    
    public void visualizarRectangle(Rectangle rectangle){
        System.out.println("The area for your rectangle: " + rectangle.getRectangleArea());
    }
    
    public void visualizarSquare(Square square){
        System.out.println("The area for your square: " + square.getSquareArea());
    }
    
    public void visualizarTriangle(Triangle triangle){
        System.out.println("Your triangles area is: " + triangle.getTriangleArea());
    }
    
    public void visualizarCircle(Circle circle){
        System.out.println("Your Circles area is " + circle.getCircleArea());
    }
}
