public class static1{

    static int a = 3, b = 4, c;
    static {
        c=a*b;
    }

    
    

    static void display()
    {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    public static void main(String args[])
    {
    
        display();
    }
}

