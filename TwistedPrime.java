import java.util.Scanner;

class TwistedPrime {

    public static void main(String[] args)
    {
         
       Scanner sc= new Scanner(System.in);
       System.out.println("Enter the  number");
       int no =sc.nextInt();

       if(isPrime(no))
       {
             if(isPrime(reverse(no)))
             {
               System.out.println("it is a Twisted prime number");
             }
             else{
                System.out.println("it is not a Twisted prime number");
             }
       }
       else{
        System.out.println("it is not a  prime number");
       }

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
        return  true;
    }

    public static int reverse(int num)
    {   int rev=0;
        while(num!=0)
        {
           int rem=num%10;
           rev=(rev*10)+rem;
           num/=10;
        }
        return rev;

    }

}
