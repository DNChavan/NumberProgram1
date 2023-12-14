import java.util.Scanner;
public class SpecialNumber {
    public static void main(String[] args)
    {
         
    Scanner sc= new Scanner(System.in);
    System.out.println("enter the number");
    int num =sc.nextInt();
     
      if(fact(num)==num)
      {
        System.out.println("it is a special number");
      }
      else
       {
        System.out.println("it is not a special number");
       }
    }
    public static int fact(int num)
    {
         int sum=0;
        while(num!=0)
        {
           int rem=num%10;
              int fact=1;
             for(int i=1;i<=rem;i++)
             {
               fact=fact*i;
             }
             sum=sum+fact;
             num/=10;     
        }
        return sum;
    }
} 
