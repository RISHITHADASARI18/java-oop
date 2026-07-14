public class armstrong {
    public static void main(String[] args) {
        int num=323,rem=0,sum=0,temp;
        temp=num;
        while(num>0)
        {
            rem=num%10;
            sum=sum+rem*rem*rem;
            num=num/10;
        }
        if(temp==sum)
             System.out.println("armstrong");
        else
            System.out.println("not a armstrong");
    }
    
        
    }

    

