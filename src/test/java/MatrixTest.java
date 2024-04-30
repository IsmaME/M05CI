import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class MatrixTest {

    @ParameterizedTest
    @CsvSource({"5,5", "10,20", "9384,12384"})
    void getWidth_OK(int width, int height) {
        Matrix m = new Matrix(width, height);
        Assertions.assertEquals(width, m.getWidth());
    }
    @org.junit.jupiter.api.Test
    void getWidth_NEGATIVE() {
        int width = -1;
        int height = 5;
        Assertions.assertThrows(NegativeArraySizeException.class, () -> {
            new Matrix(width, height);
        });
    }
    @ParameterizedTest
    @CsvSource({"5,5", "10,20", "9384,12384"})
    void getHeight_OK(int width, int height) {
        Matrix m = new Matrix(width, height);
        Assertions.assertEquals(height, m.getHeight());
    }


    @org.junit.jupiter.api.Test
    void fill() {
    }

    @org.junit.jupiter.api.Test
    void count() {
    }

    @org.junit.jupiter.api.Test
    void found() {
    }

    @org.junit.jupiter.api.Test
    void _toString() {
    }
}