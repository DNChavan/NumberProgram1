import java.util.Scanner;
public class DisariumNumber2 {
    public static void main(String[] args)
    {
         
    Scanner sc= new Scanner(System.in);
    System.out.println("enter the number");
    int num =sc.nextInt();

    if(num==power(num))
    {
        System.out.println("it is a disarium number");
    }
    else
    System.out.println("it is not a Disarium number");
   
    }

  public static int power(int num)
    {
         int sum=0;
         int cnt=cnt(num);
        while(num!=0)
        {
           int  rem=num%10;
           int pow=1;
            for(int i=0;i<cnt;i++)
            {
                pow=pow*rem;
            }
            sum=sum+pow;
            cnt--;
            num/=10;
        }
        return sum;
    }

   public static int cnt(int num)
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
