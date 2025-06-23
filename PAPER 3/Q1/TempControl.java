import javax.swing.*;
import java.awt.*;

public class TempControl  extends JFrame {
    JTextField tempTextField;
    JButton convertBtn;
    JLabel ansLabel;
    public TempControl() {
        setSize(300, 200);
        setTitle("Celsius Converter");
        setLayout(new FlowLayout());

        JPanel p = new JPanel();
        p.setLayout(new GridLayout(2, 2, 10, 10));
        tempTextField = new JTextField("0");

        JLabel unitJLabel = new JLabel("Celsius");

        convertBtn = new JButton("Convert");
        convertBtn.addActionListener(e -> {
            Double x = Double.parseDouble(tempTextField.getText());
            Double y = (9*x)/5.0 + 32;
            ansLabel.setText((y+" Fahrenheit"));
        });

        ansLabel = new JLabel("32 Fahrenheit");

        p.add(tempTextField); p.add(unitJLabel);
        p.add(convertBtn); p.add(ansLabel);


        add(p);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String args[]) {
        new TempControl();
    }
}