import java.util.Scanner;
public class PronicNumber {
    public static void main(String[] args) 
    {
      Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number");
       int num=sc.nextInt();

       int n1=1,n2=2 ,n3;

       while(true)
       {
          n3=n1*n2;
          if(n3==num)
          {
            System.out.println("it is pronic number");
            break;
          }
          else if(n3>num)
          {
            System.out.println("is not pronic numbers");
            break;
          }
          else {
            n1++;
            n2++;
          }
       }
  
    }
}
