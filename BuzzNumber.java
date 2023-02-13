import java.util.Scanner;
public class BuzzNumber {
    public static void main(String args[]){
        int num;

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number");
        num = sc.nextInt();

        if(num % 10 == 7 || num % 7 == 0) {
        System.out.println(num + "Number is buzz");
        } else {
        System.out.println(num + "Number is not buzz");
        }
    }
}
