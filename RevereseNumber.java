import java.util.Scanner;
class RevereseNumber{
    public static void main(String args[]){
        int n,q;
        int reverse = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        n = sc.nextInt();
        while (n > 0){
            q = n % 10;
            reverse = reverse *10 +q;
            n = n/10;
        }
            System.out.println("Reversed number is " +reverse);
        }
    }