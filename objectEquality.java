class A{
    int i;
    public A()
    {

    }
    public A(int x)
    {
this.i=x;
    }
}

public class objectEqualitydemo {
    public static void main(String[] args) {
        A aobj1=new A(10);
        A aobj2=new A(11);

        System.out.println(aobj1.hashCode());
        System.out.println(aobj2.hashCode());
       // aobj1=aobj2;
        System.out.println(aobj1.hashCode());
        System.out.println(aobj2.hashCode());

        if(aobj1.equals(aobj2))
        {
            System.out.println("objects are identical");
        }
        else {
            System.out.println("not identical");
        }
        System.out.println(aobj1.i);
        System.out.println(aobj2.i);
    }

}
