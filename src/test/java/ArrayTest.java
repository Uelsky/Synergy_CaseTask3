import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayTest {

    @Test
    public void testFunctionalWithMinNumInBegin() {
        Array array = new Array(new int[]{
                -100, -10, -7, 0,
                -3, 10, 100, 20, 30
        });

        Assertions.assertArrayEquals(new int[]{
                -100, -10, -7, 0,
                -3, 10, 100, 20, 30
        }, array.getArray());

        array.setArray(new int[]{
                -100, -10, -7, 0, -5,
                -3, 10, 100, 20, 30
        });

        Assertions.assertArrayEquals(new int[]{
                -100, -10, -7, 0, -5,
                -3, 10, 100, 20, 30
        }, array.getArray());

        Assertions.assertEquals(-25, array.sumNegativeNumBetweenMaxMin());
    }

    @Test
    public void testFunctionalWithMaxNumInBegin() {
        Array array = new Array(new int[]{
                100, -10, -7, 0,
                -3, 10, -100, 20, 30
        });

        Assertions.assertArrayEquals(new int[]{
                100, -10, -7, 0,
                -3, 10, -100, 20, 30
        }, array.getArray());

        array.setArray(new int[]{
                100, -10, -7, 0, -5,
                -3, 10, -100, 20, 30
        });

        Assertions.assertArrayEquals(new int[]{
                100, -10, -7, 0, -5,
                -3, 10, -100, 20, 30
        }, array.getArray());

        Assertions.assertEquals(-25, array.sumNegativeNumBetweenMaxMin());
    }

    @Test
    public void testFunctionalWithArrayLengthOne() {
        Array array = new Array(new int[]{-100});

        Assertions.assertArrayEquals(new int[]{-100}, array.getArray());

        array.setArray(new int[]{100});
        Assertions.assertArrayEquals(new int[]{100}, array.getArray());

        Assertions.assertEquals(0, array.sumNegativeNumBetweenMaxMin());
    }
}
