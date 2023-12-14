import java.util.Scanner;
public class UglyNumber {
    public static void main(String[] args)
    {
         
    Scanner sc= new Scanner(System.in);
    System.out.println("enter the number");
    int num =sc.nextInt();

      while(num!=1)
      {
        if(num%2==0)
        {
            num=num/2;
        }
        else if(num%3==0)
        {
            num=num/3;
        }
        else if(num%5==0)
        {
             num=num/5;
         }
         else 
         {
            break;
         }
    }
         if(num==1)
        {
            System.out.println("it is ugly number");

        }
        else
        {
            System.out.println("it is not ugly number");
        }
       
      }
    }
}
