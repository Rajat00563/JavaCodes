class Student{
    String college_name = "DIT University";
    String designation = "Student"; 
    int student_ID;
    String[] subjects;
    
    public void name()
    {
        System.out.println("I am a Student");
    }

    public void printData()
    {
        System.out.println("College: " + college_name);
        System.out.println("Designation: " + designation);
        System.out.println("ID: " + student_ID);
        System.out.println("Subjects: ");

        for(int i=0; i<subjects.length; i++)
        {
            System.out.print(subjects[i] + " ");
        }
        System.out.println();
    }
}
class OnlineStudent extends Student{
    String platform ="Java_class";
    double costpersubject = 500;
    double total = 0.0;

    public void name()
    {
        System.out.println("I am an online Student");
    }

    public void print(int num)
    {
        super.name();
        name();
        printData();
        System.out.println("Online platform: " + platform);
        total = costpersubject*num;
        System.out.println("Total Learning cost " + total);
    }
}

class PartTime extends Student
{
    String dayofclass;
    String timeofclass;
    String occupation;

    public void output()
    {
        printData();
        System.out.println("Day of class: " + dayofclass);
        System.out.println("Time of class: " + timeofclass);
        System.out.println("Occupation: " + occupation);

    }
}

class SpecialOnline extends OnlineStudent
{
    double discountrate = 0.3;

    public void name()
    {
        System.out.println("My name is Special Online student");

    }

    public void discount()
    {
        double newtotal = total - (total*discountrate);
        System.out.println("Discounted cost: " + newtotal);
    }
}

class TestStudent{
    public static void main(String args[])
    {
        Student s = new Student();
        s.student_ID = 1000;
        String[] subs = {"Java", "Python", "Data Science", "Artificial Intelligence"};
        s.subjects = subs;
        System.out.println("Super class Output");
        s.printData();
        System.out.println();

        OnlineStudent os = new OnlineStudent();
        os.student_ID = 1001;
        String[] online = {"Programming", "Maths", "English", "History"};
        os.subjects = online;
        int subnumber = online.length;
        System.out.println("Online Student details");
        os.print(subnumber);
        System.out.println();

        PartTime pt = new PartTime();
        pt.student_ID = 1002;
        pt.dayofclass = "Saturday";
        pt.timeofclass = "11am to 1pm";
        pt.occupation = "Manager";
        pt.subjects = subs;
        System.out.println("Part time student details");
        pt.output();
        System.out.println();

        SpecialOnline so = new SpecialOnline();
        so.student_ID = 1003;
        so.subjects = online;
        System.out.println("Special Online student details");
        so.print(subnumber);
        so.discount();
        
    }
}