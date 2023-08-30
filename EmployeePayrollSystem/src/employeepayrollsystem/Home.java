package employeepayrollsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Home extends JFrame implements ActionListener {

    JButton view, update, remove, add, clickhere;

    Home() {
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1540, 850, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 1540, 850);
        add(image);

        JLabel heading = new JLabel("EMPLOYEE MANAGEMENT SYSTEM");
        heading.setBounds(250, 30, 1200, 60);
        heading.setFont(new Font("serif", Font.PLAIN, 60));
        heading.setForeground(Color.RED);
        image.add(heading);

        add = new JButton("Add Employee");
        add.setBounds(950, 170, 150, 40);
        add.addActionListener(this);
        image.add(add);

        view = new JButton("View Employee");
        view.setBounds(1120, 170, 150, 40);
        view.addActionListener(this);
        image.add(view);

        update = new JButton("Update Employee");
        update.setBounds(950, 240, 150, 40);
        update.addActionListener(this);
        image.add(update);

        remove = new JButton("Remove Employee");
        remove.setBounds(1120, 240, 150, 40);
        remove.addActionListener(this);
        image.add(remove);

        clickhere = new JButton("BACK");
        clickhere.setBounds(950, 350, 300, 70);
        clickhere.setBackground(Color.BLACK);
        clickhere.setForeground(Color.WHITE);
        clickhere.addActionListener(this);
        image.add(clickhere);

        setSize(1540, 850);
        setLocation(0, 0);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == add) {
            setVisible(false);
            new AddEmployee();
        } else if (ae.getSource() == view) {
            setVisible(false);
            new ViewEmployee("");

        } else if (ae.getSource() == update) {
            setVisible(false);
            new ViewEmployee("");
        } else if (ae.getSource() == remove) {

            setVisible(false);
            new RemoveEmployee();

        } else if (ae.getSource() == clickhere) {
            setVisible(false);

        }

    }

    public static void main(String args[]) {
        new Home();
    }

}
