import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LogIN extends JFrame implements ActionListener {
    JButton rule,back;
    JTextField tfname;

    LogIN(){

        getContentPane().setBackground(Color.lightGray);
        setLayout(null);


       ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons//3.jpg"));
       JLabel image= new JLabel(i1);
       image.setBounds(0,0,600,500);
       add(image);

       JLabel heading = new JLabel("Present Your Minds");
       heading.setBounds(700,40,500,45);
       heading.setFont(new Font("Viner Hand ITC",Font.BOLD,40));
       add(heading);

      JLabel name = new JLabel("Enter Your Name");
        name.setBounds(800,100,300,40);
        name.setFont(new Font("Mongolian Baiti",Font.BOLD,20));
        add( name);

      tfname= new JTextField();
        tfname.setBounds(730,140,300,25);
        tfname.setFont(new Font("TimesNewRoman", Font.BOLD ,18));
        add(tfname);

         rule= new JButton("Rules");
        rule.setBounds(930,250,100,25);
        rule.setBackground(Color.GRAY);
        rule.addActionListener(this);
        add(rule);

       back= new JButton("Back");
        back.setBounds(730,250,100,25);
        back.setBackground(Color.GRAY);
        back.addActionListener(this);
        add( back);


        setSize(1200,500);
        setLocation(200,200);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae) {
       if(ae.getSource()==rule){
           String name = tfname.getText();
                setVisible(false);
                new Rules(name);
       } else if(ae.getSource()==back)  {
                 setVisible(false );
       }
    }
    public static void main(String[] args) {
        new LogIN();
    }



}
