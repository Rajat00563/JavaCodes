import java.util.Scanner;
class MahajanBank{
    public static void main(String args[]){
        int Ac_number, withdraw_amount, deposit, choice, remaining_bal, available_bal = 1000;
        Scanner sc = new Scanner(System.in);

            System.out.println("Please entre your name");
            String Name = sc.nextLine();
            System.out.println("Please entre your Ac number");
            Ac_number = sc.nextInt();
        
        while(true)
        {
            System.out.println("Press 1 to check Available balance");
            System.out.println("Press 2 to Withdraw");
            System.out.println("Press 3 to deposit amount");
            System.out.println("Press 4 to exit");
            
            System.out.println("Please make a choice");

        choice = sc.nextInt();
        switch (choice)
        {
            case 1:
            System.out.println("Your ac balance is" +available_bal);
            System.out.println("Thank you :)");
            break;

            case 2:
            System.out.println("Please enter the withdral amount");
            withdraw_amount = sc.nextInt();
            if(withdraw_amount <  1000)
                System.out.println("You cannot withdraw amount as your ac balance is below One thousand");
                    else {
                        remaining_bal = available_bal - withdraw_amount;
                        System.out.println("The transaction is sucsesful, please collect the amount");
                        System.out.println("Your remaining balance is" +remaining_bal);
                        System.out.println("Thank you :)");
                    }
                    break;

                        case 3:
                        System.out.println("Please enter the deposit amount");
                        deposit = sc.nextInt();
                        System.out.println("Your ammount is deposited");
                        available_bal = available_bal  +  deposit;
                        System.out.println("The Total available balance is" +available_bal);
                        System.out.println("Thank you :)");
                        break;

                        case 4:
                        System.exit(0);
                        default:
                        System.out.println("Please make a valid choice");
                }
            
        }
    }
}