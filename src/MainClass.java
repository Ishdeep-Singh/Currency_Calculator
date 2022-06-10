import javax.swing.*;
import java.awt.*;

public class MainClass {
    public static void main(String args[]){
        JFrame jframe = new JFrame("Currency Calculator");

        JPanel parent = new JPanel();

        JPanel titlePanel = new JPanel(new BorderLayout());

        JPanel fieldPanel = new JPanel(new GridLayout(1, 6, 3,2));

        JPanel resultPanel = new JPanel(new GridLayout(1, 2, 5, 10));

        jframe.setSize(600, 400);

        JLabel title = new JLabel("Currency Converter");
        title.setFont(new Font("Serif", Font.BOLD, 20));

        JLabel amountLabel = new JLabel("Convert amount:");
        JTextField amount = new JTextField("Enter Amount");

        JLabel convertFromLabel = new JLabel("Convert from:");
        JComboBox convertFrom = new JComboBox();

        JLabel convertToLabel = new JLabel("Convert to:");
        JComboBox convertTo = new JComboBox();

        JLabel resultLabel = new JLabel("Result:");
        JTextField result = new JTextField();

        titlePanel.add(title);

        fieldPanel.add(amountLabel);
        fieldPanel.add(amount);
        fieldPanel.add(convertFromLabel);
        fieldPanel.add(convertFrom);
        fieldPanel.add(convertToLabel);
        fieldPanel.add(convertTo);

        resultPanel.add(resultLabel);
        resultPanel.add(result);

        parent.add(titlePanel);
        parent.add(fieldPanel);
        parent.add(resultPanel);

        jframe.add(parent);

        titlePanel.setVisible(true);
        fieldPanel.setVisible(true);
        resultPanel.setVisible(true);

        jframe.setVisible(true);
    }
}
