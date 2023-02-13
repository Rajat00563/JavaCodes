import java.util.Scanner;
import java.util.function.Function;
class Library
{
    public static void main(String args[]){
        book obj = new book();
        obj.get_data();
        obj.print();
    }
    static class book
    {
        int Book_No, Price, No_of_copies;
        String Book_name, Author, Publisher;
        Scanner sc = new Scanner(System.in);

        void get_data()
        {
        System.out.println("Enter the Book_No");
        this.Book_No = sc.nextInt();

        System.out.println("Enter the Price");
        this.Price = sc.nextInt();

        System.out.println("Enter the No_of_copies");
        this.No_of_copies = sc.nextInt();

        System.out.println("Enter Book name");
        this.Book_name = sc.nextLine();

        System.out.println("Author");
        this.Author = sc.nextLine();

        System.out.print("Publisher");
        this.Publisher = sc.nextLine();
        }

        void print()
        {
            System.out.println("Book No is " + Book_No);
            System.out.println("Price is" + Price); 
            System.out.println("No of copies are" + No_of_copies);
            System.out.println("Book name is" + Book_name);
            System.out.println("Author name is" + Author);
            System.out.println("Publisher name is" + Publisher);
        }
    }
}
