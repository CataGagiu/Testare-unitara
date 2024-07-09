public class MyString
{
    public int nrCaractere(String string)
    {   int lungimeString=string.length();
        return lungimeString;
    }
    public boolean incepeCuMajuscula(String string)
    {
        char prmaLitera=string.charAt(0);
        boolean upperCase = Character.isUpperCase(prmaLitera);
        if (upperCase==true)
        {return upperCase=true;
        }
        return upperCase=false;
    }
    public String inversString(String cuvant)
    {
        String cuvantInversat="";
        int lungimeCuvant=cuvant.length();
        for (int i=lungimeCuvant-1; i>=0; i--)
        {
            cuvantInversat += cuvant.charAt(i);
        }
        return cuvantInversat;
    }
}
