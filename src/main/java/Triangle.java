public class Triangle {

    private double a;
    private double b;
    private double c;


    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double areaOfTriangle() {
        double perimeter = (a + b + c) / 2;
        double triangleSquare = Math.sqrt(perimeter * (perimeter - a) * (perimeter - b) * (perimeter - c));
        return triangleSquare;
    }
}
