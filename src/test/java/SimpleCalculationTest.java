import org.testng.annotations.Test;

public class SimpleCalculationTest {
    @Test
    public void CalculateTwoDigits()
    {
        int a = 5;
        int b = 10;
        int sum = a+ b;
        System.out.println("sum = " + sum);

    }
}
