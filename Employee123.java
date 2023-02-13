public class Employee123 {
    int empid, salary;
    String empname;

    Employee123() {
        System.out.println("this a default constructor");
    }

    Employee123(int i, int j, String n) {
        empid = i;
        salary = j;
        empname = n;
    }

    public static void main(String[] args)
        {
            Employee123 e = new Employee123();  
            System.out.println("\nDefault Constructor values: \n");  
            System.out.println("Employee123 Id : "+e.empid  + "\nEmployee123 Salary : "+e.salary + "\nEmployee123 Name : "+e.empname);  
      
            System.out.println("\nParameterized Constructor values: \n");  
            Employee123 employee123 = new Employee123(10252125, 0, "David");  
            System.out.println("Employee123 Id : " +employee123.empid  + "\nEmployee123 Salary : "+e.salary + "\n Employee123 Name :"+employee123.empname);  
        }
}
