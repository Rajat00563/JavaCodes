import java.util.Scanner;
class Swapping
{
    public static void main(String args[])
{
    Scanner obj=new Scanner(System.in);
    int x,y;
    
    System.out.println("before swapping");
    
    System.out.println("enter x:");
    x=obj.nextInt();
    
    System.out.println("x is:"+x);
    
    System.out.println("enter y:");
    y=obj.nextInt();
    
    System.out.println("y is:"+y);
    System.out.println("after swapping");
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("y is:"+y);
        System.out.println("x is:"+x);
}
}