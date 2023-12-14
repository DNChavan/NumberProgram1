import java.util.Scanner;
public class HappySadNumber {
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the number");
      int no = sc.nextInt(); 
    
          no=PowDigi(no);
        while(no!=1 && no!=4)
       {
           no=PowDigi(no);
       }

       if(no==1)
       {
        System.out.println("IT is a Happy number ");
       }
       else
       {
        System.out.println("It is a Sad number");
       }
    
    }

     public static int PowDigi(int num)
     {
       int sum=0; 
       while(num!=0)
       {
        int rem=num%10;
        sum=sum+(rem*rem);
        num/=10;
        
     }
     return sum;
 }
}