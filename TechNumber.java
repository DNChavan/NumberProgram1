import java.util.*;
public class TechNumber
{
    public static void main(String[] args) 
    {
      Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number");
       int num=sc.nextInt();
             int cnt=cnt(num);
        // int rev=TwistedPrime.reverse(num);   
             
      if(cnt%2==0)
       {
          int first=num/pow(10,cnt/2);
         
          int last=num%pow(10,cnt/2);
          
          int sum=first+last;
               
           if(sum*sum==num)
           {
            System.out.println("it is a tech number");
           }
           else{
            System.out.println("it is not tech number");
           }
       }
       
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

    public static int pow(int base , int raise)
    {
        int pow=1;
        for(int i=0;i<raise;i++)
        {
            pow=pow*base;
        }
        return pow;

    }
    
}