import java.util.Scanner;
public class Factorial {
    public static void main(String args[]){
        int num;
        long factorial = 1;

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number");
        num = sc.nextInt();

        for(int i = 1; i <= num; ++i)
        {
            factorial *= i;
        }
        System.out.println("The factorial of" + " ", num, " "+ "is" + " ", factorial);
    }
}

