abstract class AbstractClass{
    AbstractClass(){
        System.out.println("This is a constructor of abstract class .... ");
    }
    abstract void a_method();
    public void normal_method(){
        System.out.println("This is just a normal method inside the abstract class ......");
    }
} 
class SubClass extends AbstractClass{
    @Override
    public void a_method(){
        System.out.println("This is an abstract method...... ");
    }
}
public class Question4 {
    public static void main(String[] args) {
        SubClass obj = new SubClass();
        obj.a_method(); // calling the a_method using the subclass object. 
        obj.normal_method();
    } 
}
