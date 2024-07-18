package hotel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import net.proteanit.sql.*;

public class Department extends JFrame implements  ActionListener{
    JTable table;
    JButton back;
    Department(){

        getContentPane().setBackground(Color.WHITE);
        setLayout(null);


        JLabel l1 = new JLabel("Department");
        l1.setBounds(180, 10, 100, 20);
        add(l1);

        JLabel l2 = new JLabel("Budget");
        l2.setBounds(420, 10, 100, 20);
        add(l2);

//        creating table
//        it takes two arguments 1. data (will put that dynamically) and 2. headers
        table = new JTable();
        table.setBounds(0, 50, 700, 350);
        add(table);

        try{
//            room table se data nikaalenge
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from department");
//            using rs2xml jar package to transfer the data from rs variable to table ,or we can do that manually too using while loop
            table.setModel(DbUtils.resultSetToTableModel(rs));

        }
        catch(Exception e){
            System.out.println(e);
        }

        back = new JButton("Back");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        back.setBounds(280, 400, 120, 30);
        add(back);

        setBounds(400, 200, 700, 480);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new Reception();

    }

    public static void main(String[] args) {
        new Department();
    }
}

