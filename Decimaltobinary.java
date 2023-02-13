import java.util.Scanner;
public class Decimaltobinary {
    public static void main(String args[]){
        int binarynumber = 0, remainder, i=1, num;

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number");
        num = sc.nextInt();

        while(num != 0){
            remainder = num% 2;
            num = num/ 2;
            binarynumber += remainder*i;
            i*=10;
        }
        System.out.print(binarynumber);

    }
    
}
