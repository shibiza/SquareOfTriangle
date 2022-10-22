public class Triangle {

    public static double areaOfTriangle(double a, double b, double c) {
        double perimeter = (a + b + c) / 2;
        return Math.sqrt(perimeter * (perimeter - a) * (perimeter - b) * (perimeter - c));
    }
}
