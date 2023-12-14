import java.util.Scanner;
public class ChangSecondLastSecond {
    
        public static void main(String[] args)
        {
           Scanner sc=new Scanner(System.in);
           System.out.println("Enter the number");
           int ip =sc.nextInt();
           int cnt= TechNumber.cnt(ip);
           
           int first=ip/TechNumber.pow(10,cnt/2);
           int last =ip%TechNumber.pow(10,cnt/2);

           int rev1=TwistedPrime.reverse(first);
           int rev2=TwistedPrime.reverse(last);
          
           int num=(rev1*power(10,cnt-2))+rev2;
           
           System.out.println(num);
        }

        public static int power(int base,int raise)
        {
            int pow=1;
            for(int i=0;i<raise;i++)
            {
              pow=pow*base;  
            }
            return pow;
        }
        
    }
    
