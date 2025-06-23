import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashSet;
public class WordFind extends JFrame {
    HashSet s = new HashSet<String>();
    JLabel output;
    JButton findBtn;
    public WordFind() {
        s.add("A");
        s.add("B");
        s.add("C");
        s.add("D");
        s.add("E");
        s.add("F");
        setSize(300,200);
        setTitle("Word Finder :-");
        setLayout(new FlowLayout());
        

        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(3,1,10,10));

        JPanel p2 = new JPanel();
        p2.setLayout(new GridLayout(1,2,10,10));

        JLabel word = new JLabel("Word");

        JTextField wordTextField = new JTextField("");
        p2.add(word); p2.add(wordTextField);

        output = new JLabel("");
        
        findBtn = new JButton("Find Word");
        findBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(s.contains(wordTextField.getText())) {
                    output.setText(("Found Word - "+wordTextField.getText()));
                } else {
                    output.setText(("Not Found Word - "+wordTextField.getText()));
                }
            }
        });

        p1.add(p2);
        p1.add(output);
        p1.add(findBtn);

        add(p1);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String args[]) {
        new WordFind();
    }
}