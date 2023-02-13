import java.util.Scanner;
public class LastDigit {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int n = sc.nextInt();
        for(int i = 2; i< n/2; i++)
        {
        if(n % i == 0)
            {
                System.out.println("Not a prime number");
                break;
            }
       
        else
        {
            System.out.println("prime number");
        }
    }
    }
}
