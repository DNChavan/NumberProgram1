import java.util.Scanner;
class AutomorphicNumber {
    public static void main(String[] args) 
    {
      Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number");
       int num=sc.nextInt();

       int cnt=count(num);

       int pow= pow(10,cnt);
       int ans=num*num;
       
       if(ans%pow==num)
       {
        System.out.println("it is sutomorphic number");
       }
       else
       {
        System.out.println("it is not automortphic numbrt");
       }
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
