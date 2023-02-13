import java.util.Scanner;
class SquareRoot{
    public static void main(String args[]){
        int n;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        n = sc.nextInt();
            System.out.println("Square root of entered number is" + Math.sqrt(n));
        }
    }