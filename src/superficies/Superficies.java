package superficies;

/**
 * Examen de MVC 3ª Avaliación
 *
 * @author Patricia Martin Perez
 */
public class Superficies {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vista vista1 = new Vista();
        vista1.menu();

    }

    /**
     * Calcula el area del cuadrado
     *
     * @param square le pasamos el objeto tipo Square
     */
    public static void calcularAreaSquare(Square square) {
        square.setSquareArea(square.getSideLength() * square.getSideLength());
    }

    /**
     * Calcula el area del rectangulo
     *
     * @param rectangle le pasamos el objeto tipo Rectangle
     */
    public static void calcularAreaRectangle(Rectangle rectangle) {
        rectangle.setRectangleArea(rectangle.getSideLength() * rectangle.getSideHeight());

    }

    /**
     * Calcula el area del triangulo
     *
     * @param triangle le pasamos el objeto tipo Triangle
     */
    public static void calcularAreaTriangle(Triangle triangle) {
        triangle.setTriangleArea((float) (0.5 * triangle.getBaseLength() * triangle.getHeight()));

    }

    /**
     * Calcula el area del circulo
     *
     * @param circle le pasamos el objeto tipo Circle
     */
    public static void calcularAreaCircle(Circle circle) {
        circle.setCircleArea((float) (3.14159265 * (circle.getRadius() * circle.getRadius())));

    }

}
