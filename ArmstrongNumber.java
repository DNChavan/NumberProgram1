import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args)
    {
         
    Scanner sc= new Scanner(System.in);
    System.out.println("enter the number");
    int num =sc.nextInt();

     int temp=num;
     int sum=0,cnt=count(num);
     
    while( num!=0)
    {
        int rem=num%10;
        sum=sum+power(rem,cnt);
        num/=10;
        
    }
    System.out.println(sum);

    if(temp==sum )
    {
        System.out.println("it is a armstron number");
    }
    else 
    { 
        System.out.println("it is not a armstrong number");
    }

    
 }
        public static int power(int base ,int raise)
        {
            int pow=1;
            for(int i=0;i<raise;i++)
            {
                pow=pow*base;
            }
            return pow;
        }

    public static int count(int num)
    {
        int cnt=0;
        while(num!=0)
        {
            num/=10;
            cnt++;
        }
        return cnt;
    }


}