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


    /* @ParameterizedTest
    @CsvSource({"5,5,2", "10,20,7", "9384,12384,9"})
    void fill_Unique_number(int width, int height, int num) {
    }*/

    @ParameterizedTest
    @CsvSource({"5,5,2", "10,20,7", "9384,12384,9"})
    void count(int width, int height, int num) {
        Matrix m = new Matrix(width, height);
        m.fill(num);
        int count = width * height;
        Assertions.assertEquals(count, m.Count(num));
    }

    @ParameterizedTest
    @CsvSource({"5,7,2", "30,50,7", "6000,1444,9"})
    void found(int width, int height, int num) {
        Matrix m = new Matrix(width,height);
        m.fill(num);
        Assertions.assertTrue(m.Found(num));
    }

    @org.junit.jupiter.api.Test
    void _toString() {
    }
}