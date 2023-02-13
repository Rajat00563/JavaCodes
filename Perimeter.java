public class Perimeter 
{
    double perimeter;
   
    void perimeter(double pi, int r)
    {
        perimeter = 2 * pi * r;
        System.out.println("Perimeter of circle:"+perimeter);
    } 
    void perimeter(int l, int b)
    {
        perimeter = 2 * (l + b);
        System.out.println("Perimeter of rectangle:"+perimeter);
    }
    void perimeter(int s1, int s2, int s3)
    {
        perimeter = s1 + s2 + s3;
        System.out.println("Perimeter of triangle:"+perimeter);
    }
    public static void main(String[] args) 
    {
        Perimeter obj = new Perimeter();
        obj.perimeter(3.14, 5);
        obj.perimeter(8, 5);
        obj.perimeter(5,4,6);
    }
}