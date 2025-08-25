import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.services.MaxServise;

import java.util.Scanner;

public class MaxServiseTest {

    @Test
    public void shouldFindMax() {
        MaxServise servise = new MaxServise();

        int a = 5;
        int b = 3;

        int expected = a;
        int actual = servise.max(a, b);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindMaxIfB(){
        MaxServise servise = new MaxServise();

        int a = 3;
        int b = 5;

        int expected = b;
        int actual = servise.max(a,b);
        Assertions.assertEquals(expected, actual);
    }
}
