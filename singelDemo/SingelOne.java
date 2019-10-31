class  SingelOne
{
    public static void main(String args[])
    {
         Singel ss1=Singel.getInstance();
         Singel ss2=Singel.getInstance();
         System.out.println(ss1==ss2);
    }
}

class Singel
{
    private static Singel singel=null;

    private Singel(){}

    public static Singel getInstance()
    {
        if(singel==null)
        {singel= new Singel();}
        return singel;

    }

}