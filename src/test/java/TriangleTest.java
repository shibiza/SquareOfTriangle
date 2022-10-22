import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TriangleTest {

    @ParameterizedTest
    @MethodSource("testAreaCases")
    void testArea(final double expectedArea, Triangle triangle) {
        assertEquals(expectedArea, triangle.areaOfTriangle());
    }

    static Stream<Arguments> testAreaCases() {
        return Stream.of(
                Arguments.of(1.9843134, 2, 2, 3),
                Arguments.of(2.90473, 4, 2, 3),
                Arguments.of(1.9843134, 4, 1, 4)
                );
    }
}

