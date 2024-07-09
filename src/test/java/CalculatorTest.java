import org.junit.jupiter.api.*;

public class CalculatorTest
{   Calculator calculator;
    @AfterAll
    public static void afterAll()
    {
        System.out.println("After All");
    }
    @BeforeEach
    public void  beforeEach()
    {
        System.out.println("Befor Each");
        //calculator = new Calculator();
    }
    @BeforeAll
    public  static void beforeAll()
    {
        System.out.println("Before All");
    }
    @AfterEach
    public  void afterEach()
    {
        System.out.println("After each");
    }
    @Test
    public void  addTest()
    {
        Calculator calculator=new Calculator();
        int result=calculator.add(3,4);
        Assertions.assertEquals(7,result," rezultatul nu este cel asteptat");
    }
    @Test

    public  void diffTest()
    {
        Calculator calculator=new Calculator();
        int result=calculator.diff(9,2);
        Assertions.assertEquals(7,result,"rezultatul nu este cel asteptat");
    }
    @Test
    public void inmultireTest()
    {
        Calculator calculator=new Calculator();
        int result=calculator.inmultire(3,4);
        Assertions.assertEquals(12,result," rezultatul nu este cel asteptat");
    }
    @Test
    public void impartireTest()
    {
        Calculator calculator=new Calculator();
        int result=calculator.impartire(12,4);
        Assertions.assertEquals(3,result," rezultatul nu este cel asteptat");
    }


}
