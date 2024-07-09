import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyStringTest
{
    @Test
    public void nrCaractere()
    {
    MyString myString=new MyString();
    int result= myString.nrCaractere("masina si caruta");
        Assertions.assertEquals(16,result, " rezultatul nu este cel asteptat");
    }
    @Test

    public  void incepeCuMajuscula()
    {
        MyString myString= new MyString();
        boolean rezultat= myString.incepeCuMajuscula("Catalin");
        Assertions.assertTrue(rezultat);
    }
    @Test

    public void setMyString()
    {
        MyString myString= new MyString();
        String rezultat= myString.inversString("cal");
        Assertions.assertEquals(rezultat,"lac");
    }
}
