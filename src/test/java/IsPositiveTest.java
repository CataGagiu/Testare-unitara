import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class IsPositiveTest
{
    @Test
    public void checkIfNumberIsPositive()
    {
        IsPositive isPositive= new IsPositive();
        boolean result=isPositive.checkIfNumberIsPositive(6);
        Assertions.assertTrue(result);
    }
    @ParameterizedTest

    @ValueSource(ints = {3,6,90,800,67})
    public void testIsPositiveParameterized (int number)
    {
        IsPositive isPositive=new IsPositive();
        Boolean result= isPositive.checkIfNumberIsPositive(number);
        Assertions.assertTrue(result);
    }
}
