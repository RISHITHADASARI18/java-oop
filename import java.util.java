import java.util.Scanner;
class example
{
public static void main(String args[])
{
  System.out.print("Enter id name sal:");
  Scanner SC = new Scanner (System.in);
  int id = SC.nextInt();
  String name = SC.next();
  float sal = SC.nextFloat();
  System.out.println("My ID="+id);
  System.out.println("My name="+name);
  System.out.println("My sal="+sal);
}
}