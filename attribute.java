public class attribute {
    int a=5,b=10,c;
    attribute()
    {
    c=a+b;
    }
    void display()
    {
        System.out.println(c);
    }
    public static void main(String args[])
    {
        attribute ob = new attribute();
        ob.display();
    }
    
}
