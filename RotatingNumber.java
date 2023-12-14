import java.util.Scanner;
class RotatingNumber
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int no =sc. nextInt();
        
        for(int i=0;i<count(no)-1;i++)
        {
            no=rotate(no);
            System.out.println(no);
        }

    }

    public static int rotate(int num)
    {
         int cnt=count(num);
         int last= num%10;
         num/=10;
         int ans = last*(power(10,cnt-1))+num;
         return ans;
    }
 
    public static int power(int base ,int raise)
    {
        int pow=1;
        for(int i=0;i<raise;i++)
        {
            pow=pow*base;
        }
        return pow;
    }

    public static int count(int num)
    {
        int cnt=0;
        while(num!=0)
        {
            num/=10;
            cnt++;
        }
        return cnt;
    }
}