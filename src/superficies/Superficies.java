package superficies;

import java.util.Scanner;

/**
 * Examen de MVC 3ª Avaliación
 *
 * @author damian
 */
public class Superficies {

    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vista vista1 = new Vista();
        vista1.menu();
        
    }
    
    public static void calcularAreaSquare(Square square){
        square.setSquareArea(square.getSideLength()*square.getSideLength());
    }
    
    public static void calcularAreaRectangle(Rectangle rectangle){
        rectangle.setRectangleArea(rectangle.getSideLength()*rectangle.getSideHeight());
        
    }
    
    public static void calcularAreaTriangle(Triangle triangle){      
        triangle.setTriangleArea((float) (0.5 * triangle.getBaseLength()* triangle.getHeight()));
        
    }
    
    public static void calcularAreaCircle(Circle circle){
        circle.setCircleArea((float) (3.14159265 *(circle.getRadius()*circle.getRadius())));
        
    }
    
}
