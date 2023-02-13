import javax.swing.*;
import java.applet.*;
class RegistrationForm{
    void rajat(){

    
        JFrame jf = new JFrame();
        JLabel jl1 = new JLabel ("RegistrationForm");
        JLabel jl2 = new JLabel ("Name");
        JLabel jl3 = new JLabel ("Phone Number");
        JLabel jl4 = new JLabel ("Email ID");
        JLabel jl5 = new JLabel ("Password");
        JLabel jl6 = new JLabel ("Confirm Password");
        JTextField jtf1 = new JTextField();
        JTextField jtf2 = new JTextField();
        JTextField jtf3 = new JTextField();
        JTextField jtf4 = new JTextField();
        JTextField jtf5 = new JTextField();
        JTextField jtf6 = new JTextField();
        JButton jb1 = new JButton("Submit");
        jl1.setBounds(200,100,150,130);
        jl2.setBounds(200,250,150,130);
        jl3.setBounds(200,350,150,130);
        jl4.setBounds(200,450,150,130);
        jl5.setBounds(200,550,150,130);
        jl6.setBounds(200,650,150,130);
        jtf1.setBounds(200,650,150,130);
        jtf2.setBounds(500,650,150,130);
        jtf3.setBounds(500,650,150,130);
        jtf4.setBounds(500,650,150,130);
        jtf5.setBounds(500,650,150,130);
        jtf6.setBounds(500, 650,150, 130);
        jb1.setBounds(180,100,150,130);
        jf.add(jl1);
        jf.add(jl2);
        jf.add(jl3);
        jf.add(jl4);
        jf.add(jl5);
        jf.add(jl6);
        jf.add(jtf1);
        jf.add(jtf2);
        jf.add(jtf3);
        jf.add(jtf4);
        jf.add(jtf5);
        jf.add(jtf6);
        jf.add(jb1);

        jf.setLayout(null);
        jf.setVisible(true);
        jf.setSize(700,700);
    }
    public static void main(String args[])
    {
        RegistrationForm obj = new RegistrationForm();
        obj.rajat();
        
    }
} 