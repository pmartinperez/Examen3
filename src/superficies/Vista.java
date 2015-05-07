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

    public void menu() {
        String shapeType;

        sc = new Scanner(System.in);

        System.out.println("What shape would you like to find the area of? (square, circle, triangle, rectangle):");
        shapeType = sc.nextLine();
        System.out.println("You said: " + shapeType);

        if (shapeType.equals("square")) {
            Square square1 = new Square();
            introducirDatosSquare(square1);
            Superficies.calcularAreaSquare(square1);
            this.visualizarSquare(square1);

        }
        if (shapeType.equals("rectangle")) {
            Rectangle rectangle1 = new Rectangle();
            introducirDatosRectangle(rectangle1);
            Superficies.calcularAreaRectangle(rectangle1);
            this.visualizarRectangle(rectangle1);
        }
        if (shapeType.equals("triangle")) {
            Triangle triangle1 = new Triangle();
            introducirDatosTriangle(triangle1);
            Superficies.calcularAreaTriangle(triangle1);
            this.visualizarTriangle(triangle1);
        }
        if (shapeType.equals("circle")) {
            Circle circle1 = new Circle();
            introducirDatosCircle(circle1);
            Superficies.calcularAreaCircle(circle1);
            this.visualizarCircle(circle1);
        }
    }

    public void introducirDatosSquare(Square square) {
        System.out.println("what is the side length?");
        square.setSideLength(sc.nextFloat());
    }

    public void introducirDatosRectangle(Rectangle rectangle) {
        System.out.println("what is the rectangles width?");
        rectangle.setSideLength(sc.nextFloat());
        System.out.println("What is the rectangles height?");
        rectangle.setSideHeight(sc.nextFloat());
    }

    public void introducirDatosTriangle(Triangle triangle) {
        System.out.println("What is the base length of the triangle?");
        triangle.setBaseLength(sc.nextFloat());
        System.out.println("What is the height of the triangle?");
        triangle.setHeight(sc.nextFloat());
    }
    public void introducirDatosCircle(Circle circle){
        System.out.println("What is the radius of the circle?");
        circle.setRadius(sc.nextFloat());
    }

    public void visualizarRectangle(Rectangle rectangle) {
        System.out.println("The area for your rectangle: " + rectangle.getRectangleArea());
    }

    public void visualizarSquare(Square square) {
        System.out.println("The area for your square: " + square.getSquareArea());
    }

    public void visualizarTriangle(Triangle triangle) {
        System.out.println("Your triangles area is: " + triangle.getTriangleArea());
    }

    public void visualizarCircle(Circle circle) {
        System.out.println("Your Circles area is " + circle.getCircleArea());
    }
}
