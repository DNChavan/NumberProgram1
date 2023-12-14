import java.util.Scanner;
public class CoprimeNumber {
    
    public static void main(String[] args)
    {
         
       Scanner sc= new Scanner(System.in);
       System.out.println("Enter the first number");
       int no1 =sc.nextInt();
       System.out.println("Enter the Second number");
       int no2 =sc.nextInt();

       if(isPrime(no1) || isPrime(no2))
      {
          if(HCF(no1,no2)==1)
             {
                System.out.println("co-prime numbers");
             }
          else
             {
                 System.out.println("not co-prime numbers");
              }
      }
      else
      {
        System.out.println("both are not prime");
      }
    
    }
    public static int HCF(int no1 , int no2)
    {
        int small=no1<no2?no1:no2;
        int hcf=0;   
        for(int i=1 ;i<=small;i++)
          {
               if(no1%i==0 && no2%i==0)
               {
                  hcf=i;
               }
          }
          return hcf;
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