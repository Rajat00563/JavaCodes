import java.util.Scanner;
public class Sort {
    public static void main(String args[]){
        int a [] = new int[10];
        int temp;
        int i,j, n;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array size");
        n =sc.nextInt();

        System.out.println("Enter the array elements");
        for(i = 0; i<n; i++)
        {
        a[i] = sc.nextInt();
        }
        for(i =0; i<n; i++)
        {
        for(j= i+1; j<n; j++)
        {
            if(a[i]< a[j])
            {
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;

            }
        }
    }
    System.out.println("The first smallest number is" +a[0]);
    System.out.println("The second smallest number is" +a[1]);
}
}
