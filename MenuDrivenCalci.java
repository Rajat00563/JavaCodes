import java.util.Scanner;
class MenuDrivenCalci{
    public static void main(String args[]){
        int a,b,c;
        int choice;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Press 1 for addition");
            System.out.println("Press 2 for subtraction");
            System.out.println("Press 3 for multiplication");
            System.out.println("Press 4 for divide");
            System.out.println("Press 5 to Quit");

            System.out.println("Please make a choice");
            choice = sc.nextInt();
            switch(choice) {

                case 1:
                System.out.println("Enter first number");
                a = sc.nextInt();
                System.out.println("Enter Second number");
                b = sc.nextInt();
                c = a + b;
                System.out.println("Sum of two numbers is = " + c);
                break;

                case 2:
                System.out.println("Enter first number");
                a = sc.nextInt();
                System.out.println("Enter Second number");
                b = sc.nextInt();
                c = a - b;
                System.out.println("Difference between two numbers is = " + c);
                break;

                case 3:
                System.out.println("Enter first number");
                a = sc.nextInt();
                System.out.println("Enter Second number");
                b = sc.nextInt();
                c = a * b;
                System.out.println("Product of two numbers is = " + c);
                break;

                case 4:
                System.out.println("Enter first number");
                a = sc.nextInt();
                System.out.println("Enter Second number");
                b = sc.nextInt();
                c = a/b;
                System.out.println("Quotient of two numbers is = " + c);
                break;

                case 5:
                System.exit(0);
                default:
                System.out.println("Please make a valid option");   
            }
        }
    }
}