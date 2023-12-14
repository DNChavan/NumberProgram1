import java.util.Scanner;
class HarshadNumber {
    
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int no =sc. nextInt();

        if(no % SumOfDigi(no)==0)
        {
           System.out.println("It is a harshad number");
        }
        else
        {
            System.out.println("It is not a harshad number"); 
        }
    }

    public static int SumOfDigi(int num)
    {
         int sum=0;
        while (num!=0)
        {
           int rem=num%10;
            sum+=rem;
            num/=10;
        }
        return sum;
    }
}
