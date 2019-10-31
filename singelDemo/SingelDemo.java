class SingleDemo
{
    public static void main(String[] args)
    {
        Single ss1=Single.getInstance();
        Single ss2=Single.getInstance();
        //Single ss=Single.s;
        System.out.println(ss1==ss2);
    }
}

class Single //类一加载，对象就已经存在了
{
    private static Single s =new Single();
    private Single(){}

    public static Single getInstance()
    {
        return s;
    }
}

//懒汉式
class Singel2//类加载进来，没有对象，只有调用getInstance方法时，才会创建对象   延迟加载形式
       
{
    private static Single s=null;
    private Single(){}

    public static Singel2 getInstance()
    {
        if(s==null)
        s=new Single();
        return s;
    }
}