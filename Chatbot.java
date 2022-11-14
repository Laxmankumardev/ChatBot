import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;
import java.util.Scanner;

class Chat extends JFrame {
    private JTextArea ta = new JTextArea();
    private JLabel l = new JLabel();
    private JTextField tf = new JTextField();
    private JButton b = new JButton();

    Chat() {
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.setVisible(true);
        f.setResizable(false);
        f.setLocation(500,100);
        f.setLayout(null);
        f.setSize(400, 400);
        f.getContentPane().setBackground(Color.cyan);
        f.setTitle("ChatBot");
        f.add(ta);
        f.add(l);
        f.add(tf);
        ta.setSize(300, 310);
        ta.setLocation(1, 1);
        ta.setBackground(Color.blue);
        tf.setSize(300, 20);
        tf.setLocation(1, 320);
        f.add(b);
        l.setText("SEND");
        b.add(l);
        b.setSize(400, 20);
        b.setLocation(300, 320);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == b) {

                    String text = tf.getText().toLowerCase(Locale.ROOT);
                    ta.append("You--->" + text + "\n");

                    if (text.contains("hi")) {
                        rply("Hi ,Welcome to For-u"+"\n"+"This core are avaliable"+"\n"+"1.python"+"\n"
                                +"2.Java"+"\n");

                    }
                    else if (text.contains("hlo")) {
                        rply("Hi ,Welcome to For-u");
                    }
                    else if (text.contains("python")) {
                        rply("Core -799/- with Advance -1799/-");

                    }
                    else if (text.contains("java")) {
                        rply("Core -699/- with Advance -1699/-");
                    }
                    else if (text.contains("core")) {
                        rply("Tpoic upto OOPs");

                    }


                }

            }
        });
    }

    public void rply(String s) {
        ta.append("FOR-u --->" + s + "\n");
    }
}

public class Chatbot
{
    public static void main(String[] args)
    {


        new Chat();
    }
}


