package superficies;

/**
 * Clase con los atributos propios de un triangulo, setters y getters.
 *
 * @author Patripon
 */
public class Triangle {

    private float baseLength;
    private float height;
    private float triangleArea;

    public Triangle() {

    }

    public float getBaseLength() {
        return baseLength;
    }

    public void setBaseLength(float baseLength) {
        this.baseLength = baseLength;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getTriangleArea() {
        return triangleArea;
    }

    public void setTriangleArea(float triangleArea) {
        this.triangleArea = triangleArea;
    }

}
