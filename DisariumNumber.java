import java.util.Scanner;
public class DisariumNumber {
    public static void main(String[] args)
    {
         
    Scanner sc= new Scanner(System.in);
    System.out.println("enter the number");
    int num =sc.nextInt();
    int fact=1;
         
      int cnt=0,temp=num;
        int sum=0;
       for(int i=num;i!=0;i/=10)
       {
          cnt++;
       }
    
           while(num!=0)
           {
                 int rem=num%10;
                 int pow=1;
                for(int i=1;i<=cnt;i++)
                {
                   pow=pow*rem; 
                }
               sum=sum+pow;
                cnt--;
                num/=10;
           }
           if(temp==sum)
           {
            System.out.println("it is a disarium number");
           }
           else
           System.out.println("it is not a Disarium number");
      }
     
    }

