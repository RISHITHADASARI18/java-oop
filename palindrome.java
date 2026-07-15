public class palindrome 
{
    public static void main(String[] args)
    {
        int num=323,rem=0,rev=0,temp;
        temp=num;
        while(num>0)
        {
            rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        if(temp==rev)
             System.out.println("palindrome");
        else
            System.out.println("not a palindrome");
    }
}
