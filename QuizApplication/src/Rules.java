import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Rules extends JFrame implements ActionListener {
    JButton start,back;
    String name;
    Rules(String name ){
        this.name= name;
        getContentPane().setBackground(Color.white);
        setLayout(null);

        JLabel heading = new JLabel("Welcome "+ name+ " Present Your Mind ");
        heading.setBounds(50,30,700,40);
        heading.setFont(new Font("Times New Roman",Font.BOLD,25));
        add(heading);

        JLabel rules = new JLabel();
        rules.setBounds(20,70,700,350);
        rules.setFont(new Font("Tahoma",Font.PLAIN,15));
        rules.setText( "<html>"+
                "1. You are trained to be a programmer and not a story teller, answer point to point" + "<br><br>" +
                "2. Do not unnecessarily smile at the person sitting next to you, they may also not know the answer" + "<br><br>" +
                "3. You may have lot of options in life but here all the questions are compulsory" + "<br><br>" +
                "4. Crying is allowed but please do so quietly." + "<br><br>" +
                "5. Only a fool asks and a wise answers (Be wise, not otherwise)" + "<br><br>" +
                "6. Do not get nervous if your friend is answering more questions, may be he/she is doing Jai Mata Di" + "<br><br>" +
                "7. Brace yourself, this paper is not for the faint hearted" + "<br><br>" +
                "8. May you know more than what John Snow knows, Good Luck" + "<br><br>" +
                "<html>"
        );
        add(rules);
        start= new JButton("Start");
        start.setBounds(650,500,100,25);
        start.setBackground(Color.GRAY);
        start.addActionListener(this);
        add(start);

        back= new JButton("Back");
        back.setBounds(30,500,100,25);
        back.setBackground(Color.GRAY);
        back.addActionListener(this);
        add( back);

        setSize(800,600);
        setLocation(350,130);
        setVisible(true);
    }



    public void actionPerformed(ActionEvent ae) {
 if (ae.getSource()==start){
     setVisible(false);
     new Quiz(name);
     setVisible(true);

 }else if(ae.getSource()==back){
     setVisible(false);
     new LogIN();
        }

    }


    public static void main(String[] args) {
          new Rules("user ");
    }



}
