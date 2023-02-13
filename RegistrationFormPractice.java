import javax.swing.*;
import java.applet.*;

class RegistrationFormPractice {
    void form(){
        JFrame jf = new JFrame();
        
        JLabel jl1 = new JLabel("Registration Form");
        JTextField jtf1 = new JTextField();
        jl1.setBounds (80, 20, 150, 50);
        jf.add(jl1);
        
        JLabel jl2 = new JLabel("Name");
        JTextField jtf2 = new JTextField();
        jl2.setBounds (50, 50, 100, 50);
        jf.add(jl2);
        

        JLabel jl3 = new JLabel("Email-ID");
        JTextField jtf3 = new JTextField();
        jl3.setBounds (80, 20, 150, 50);
        jf.add(jl3);
        

        JLabel jl4 = new JLabel("Phone Number");
        JTextField jtf4 = new JTextField();
        jl4.setBounds (80, 20, 150, 50);
        jf.add(jl4);
        

        JLabel jl5 = new JLabel("Password");
        JTextField jtf5 = new JTextField();
        jl5.setBounds (80, 20, 150, 50);
        jf.add(jl5);
        

        JLabel jl6 = new JLabel("Confirm Password");
        JTextField jtf6 = new JTextField();
        jl6.setBounds (80, 20, 150, 50);
        jf.add(jl6);
      

        JButton jb1 = new JButton("Submit");
        JButton jb2 = new JButton("Clear");

        jtf1.setBounds (170, 80, 120, 20);
        jtf1.add(jtf1);

        jtf2.setBounds (170, 80, 120, 20);
        jtf2.add(jtf2);

        jtf3.setBounds (170, 80, 120, 20);
        jtf3.add(jtf3);

        jtf4.setBounds (170, 80, 120, 20);
        jtf4.add(jtf4);

        jtf5.setBounds (170, 80, 120, 20);
        jtf5.add(jtf5);

        jtf6.setBounds (170, 80, 120, 20);
        jtf6.add(jtf6);

        jb1.addActionListener(null);
        jb2.addActionListener(null);

        jf.setLayout(null);
        jf.setVisible(true);
        jf.setSize(1000, 1000);

    }
    public static void main(String args[]){
        
        RegistrationFormPractice obj = new RegistrationFormPractice();
        obj.form();
    }
}
