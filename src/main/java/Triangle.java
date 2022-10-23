import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Triangle {
    public static double areaOfTriangle(double a, double b, double c) {

        log.info("double a: " + a + ", double b: " + b + ", double c: " + c);
        double perimeter = (a + b + c) / 2;
        double square = Math.sqrt(perimeter * (perimeter - a) * (perimeter - b) * (perimeter - c));
        log.info("square of triangle is: " + square);
        return square;
    }
}
