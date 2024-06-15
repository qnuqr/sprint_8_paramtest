import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class ParamTest {

    private final String color;
    private final String expectedString;

    public ParamTest(String color, String expectedString) {
        this.color = color;
        this.expectedString = expectedString;
    }

    @Parameterized.Parameters
    public static Object[][] dataForTest() {
        return new Object[][] {
                {"красный", "Произошёл взрыв!"},
                {"зелёный", "Обезврежено!"},
                {"чёрный", "Произошёл взрыв!"},
                {"жёлтый", "Обезврежено!"}
        };
    }

    @Test
    public void paramTest() {
        Bomb bomb = new Bomb();
        Assert.assertEquals(expectedString, bomb.cutTheWire(color));
        System.out.println("Аккуратно режь " + color + " провод. " + expectedString);
    }
}