import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class TriangleTest {

    @ParameterizedTest
    @MethodSource("testAreaCases")
    public void methodForTestTriangle(double expected, double a, double b, double c) {
        assertEquals(expected, Triangle.areaOfTriangle(a, b, c));
    }

    static Stream<Arguments> testAreaCases() {
        return Stream.of(
                arguments(0.49607837082461076, 1.0, 1.0, 1.5),
                arguments(0.7261843774138906, 2.0, 1.0, 1.5),
                arguments(1.3331705629813464, 2.0, 3.0, 1.5),
                arguments(2.4803918541230536, 2.0, 3.0, 2.5),
                arguments(2.0453835214941964, 2.0, 4.0, 2.5),
                arguments(13.57487914310842, 5.0, 5.5, 8.0)
        );
    }
}