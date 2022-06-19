package Final;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class eventDriven 
{

    public static void main(String[] args) 
    {
    	
    	JFrame frame = new JFrame("Car Purchase"); // setup button
        frame.setSize(500, 400);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLabel label = new JLabel("Would you like to buy a car?");
        label.setVisible(true);
        label.setSize(500, 20);
        frame.add(label);
        
        JCheckBox check = new JCheckBox("Do you agree with our terms of condition?"); //setup check box
        frame.add(check);
        check.setBounds(10, 170, 500, 50);

        Font font = new Font("Arial", Font.ITALIC, 12);

        JButton modelXButton = new JButton("Yes");
        modelXButton.setBounds(130, 50, 100, 50);
        modelXButton.setFont(font);
        modelXButton.setForeground(Color.black);
        modelXButton.setBackground(Color.green);
        frame.add(modelXButton);
        
        JButton ModelYButton = new JButton("No");
        ModelYButton.setBounds(270, 50, 100, 50);
        ModelYButton.setFont(font);
        ModelYButton.setForeground(Color.black);
        ModelYButton.setBackground(Color.red);
        frame.add(ModelYButton);
        
        JButton setButton = new JButton("Yes, using monthly plan");
        setButton.setBounds(170, 110, 160, 50);
        setButton.setFont(font);
        setButton.setForeground(Color.black);
        setButton.setBackground(Color.cyan);
        frame.add(setButton);

        modelXButton.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                JOptionPane.showMessageDialog(frame, "Thank you for your purchase!");
            }
        });
        ModelYButton.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                JOptionPane.showMessageDialog(frame, "Goodbye!");
            }
        });
        setButton.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                JOptionPane.showMessageDialog(frame, "Okay!");
            }
        });
    }
}
