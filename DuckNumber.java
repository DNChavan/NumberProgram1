import java.util.Scanner;
public class DuckNumber {

    public static void main(String []args)
    {
       Scanner sc  = new Scanner(System.in);
       System.out.println("enter the number");
       int num=sc.nextInt();
       boolean duck=false;
       while(num!=0)
       {
        int rem=num%10;

          if(rem==0)
          {
            duck= true;
          }
          num/=10;
       }

        if(duck==true)
        {
            System.out.println("it is a duck number");
        }
        else{
            System.out.println("it is not duck number");
        }
    }

    
}
