import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;
public class CricularPrime {
    public static void main(String[] args)
    {
         
       Scanner sc= new Scanner(System.in);
       System.out.println("Enter the  number");
       int no =sc.nextInt();
       int temp=no;
        
        if(isPrime(no))
        {      no=rotate(no);
              while(temp!=no)
              {
                if(isPrime(no))
                {
                    no=rotate(no);  
                }
             }
              if(temp==no)
              {
                System.out.println("it is cricular prime nubber");
              }
              else
              {
                System.out.println("it is not a cricular prime nubber");
              }

         }
         else 
         {
            System.out.println("it is not a prime nubber");
         }
    }   
       
    

    public static int rotate(int num)
    {
        int cnt=count(num);
        int last=num%10;
        num/=10;

        int rot=(last*power(10,cnt-1))+num;
        return rot;
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
    public static int count (int num)
    {
        int cnt=0;
        while(num!=0)
        {
            num/=10;
            cnt++;
        }
        return cnt;
    }  
  
    public static int power (int base,int raise)
    {
        int pow=1;
        for(int i=0;i<raise;i++)
        {
            pow=pow*base;
        }
        return pow;
    }


}
