import java.util.Scanner;
public class BouncyNumber {
    public static void main(String[] args) 
    {
      Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number");
       int num=sc.nextInt();

       boolean inc=false;
       boolean dec=false;
       while(num!=9)
       {
        int last=num%=10;
        num/=10;
        int slast=num%10;

        if(last>slast)
        {
            dec=true;
        }
        else if(last<slast)
        {

            inc =true;
        }
        if(inc && dec)
        {
            break;
        }
    }
    if(inc && dec )
    {
        System.out.println("it is bouncy number");
    }
    else{
        System.out.println("it not is bouncy number");
    }
    } 
}
