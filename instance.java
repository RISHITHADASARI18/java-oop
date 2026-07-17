public class instance {
    int a=10,b=15,c;
    instance()
    {
    c=a+b;
    }
    void display()
    {
       
     System.out.println(a);
      System.out.println(b);
       System.out.println(c);

    }
    public static void main(String args[])
    {
        instance ob=new instance();
         System.out.println(+ob.a);
          System.out.println(+ob.b);
           System.out.println(+ob.c);
           ob.display();
    }
    
}
