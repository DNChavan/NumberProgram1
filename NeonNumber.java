import java.util.Scanner;
public class NeonNumber {
    public static void main(String[] args)
    {
         
    Scanner sc= new Scanner(System.in);
    System.out.println("enter the number");
    int num =sc.nextInt();

      int sq=num*num;
      int sum=0;
      

      while(sq!=0)
       {
         int rem=sq%10;
         System.out.println(rem);
          sum=sum+rem;
          sq/=10;
        }

        System.out.println(sum);
         if(sum==num)
         {
            System.out.println("it is Neon number");
         }
         else
           System.out.println("it is not a Neon number");
    }
}
