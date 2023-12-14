import java.util.Scanner;
public class TwinPrime {
    
    public static void main(String[] args)
    {
         
       Scanner sc= new Scanner(System.in);
       System.out.println("Enter the first number");
       int no1 =sc.nextInt();
       System.out.println("Enter the Second number");
       int no2 =sc.nextInt();
      

       if(no1-no2== -2 || no1-no2==2)
       {
       if(isPrime(no1)==true && isPrime(no2)==true)
            {
                 System.out.println("it is a coprime number");
            }
       else
             {
                  System.out.println("it is not a coprime number");
             }
         }
         System.out.println("the differnce is more than two");


    }
    public static boolean isPrime(int num)
    {
        for(int i=2;i<num/2;i++)
        {
            if(num%i==0)
            {
                return false;
            }
            
        }
        return true;
    }
}
