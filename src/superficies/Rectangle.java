package superficies;

/**
 * Clase con los atributos propios de un rectangulo, setters y getters.
 *
 * @author Patripon
 */
public class Rectangle {

    private float sideLength;
    private float sideHeight;
    private float rectangleArea;

    public Rectangle() {

    }

    public float getSideLength() {
        return sideLength;
    }

    public void setSideLength(float sideLength) {
        this.sideLength = sideLength;
    }

    public float getSideHeight() {
        return sideHeight;
    }

    public void setSideHeight(float sideHeight) {
        this.sideHeight = sideHeight;
    }

    public float getRectangleArea() {
        return rectangleArea;
    }

    public void setRectangleArea(float rectangleArea) {
        this.rectangleArea = rectangleArea;
    }

}
