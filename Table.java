import java.util.Scanner;
class Table{
    public static void main(String args[]){
        int n,i;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Please enter the number");
        n = sc.nextInt();

        for(i = 1; i <= 10; i++){
        System.out.println(n + "*" + i +" = " + n * i);
        }
    }
}