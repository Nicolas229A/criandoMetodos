import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterfaceMethods2 extends JFrame{

    JTextField number1 = new JTextField();
    JTextField number2 = new JTextField();
    JComboBox <String> options = new JComboBox<>();
    JButton equation = new JButton("=");
    JLabel result = new JLabel();

    Font font1 = new Font("Arial", Font.BOLD,50);
    Color color1 = new Color(198, 115, 255);

    InterfaceMethods2() {

        options.addItem(" +");
        options.addItem(" -");
        options.addItem(" /");
        options.addItem(" *");

        equation.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                int option = options.getSelectedIndex();
                int n1 = Integer.parseInt(number1.getText());
                int n2 = Integer.parseInt(number2.getText());
                double n3 = Double.parseDouble(number1.getText());
                double n4 = Double.parseDouble(number2.getText());

                if (option == 0) {
                    int sum = n1 + n2;
                    result.setText(sum + "");
                }

                if (option == 1) {
                    int sub = n1 - n2;
                    result.setText(sub + "");
                }

                if (option == 2) {
                    double div = n3 / n4;
                    result.setText(div + "");
                }

                if (option == 3) {
                    int mult = n1 * n2;
                    result.setText(mult + "");
                }
            }
        });

        setLayout(new GridLayout(1, 5));
        add(number1);
        add(options);
        add(number2);
        add(equation);
        add(result);

        number1.setFont(font1);
        number2.setFont(font1);
        options.setFont(font1);
        equation.setFont(font1);
        result.setFont(font1);

        number1.setForeground(color1);
        number2.setForeground(color1);
        options.setForeground(color1);
        equation.setForeground(color1);
        result.setForeground(color1);


        setSize(600, 100);
        setTitle("Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new InterfaceMethods2();
    }
}
