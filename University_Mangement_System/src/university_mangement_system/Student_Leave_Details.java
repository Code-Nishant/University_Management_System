/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package university_mangement_system;


//package imported
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import com.toedter.calendar.JDateChooser;

/**
 *
 * @author Asus
 */
public class Student_Leave_Details extends JFrame implements ActionListener {
    //goble variables
    Choice choice_Roll_Number;
    Choice choice_Timing;
    JDateChooser date;
    JButton submit;
    JButton cancel;
    
    Student_Leave_Details(){

        //frame setting
        setSize(600,350);
        setLocation(500,290);
        setLayout(null);
        
        //heading
        JLabel heading= new JLabel("Student Leave Application Details");
        heading.setBounds(120, 20, 400, 20);
        heading.setFont(new Font("Tahoma", Font.BOLD,18));
        add(heading);

        //roll number searching
        JLabel label_Roll_Number= new JLabel("Search with Roll Number");
        label_Roll_Number.setBounds(100, 70, 200, 20);
        label_Roll_Number.setFont(new Font("Tahoma", Font.PLAIN,16));
        add(label_Roll_Number);
        choice_Roll_Number=new Choice();
        choice_Roll_Number.setBounds(350, 70, 150, 20);
        add(choice_Roll_Number);
        // fetching data from database
        try {
            Connection_With_DataBase cwdb= new Connection_With_DataBase();
            ResultSet rs= cwdb.state.executeQuery("select * from student");
            while (rs.next()) {
                choice_Roll_Number.add(rs.getString("rollno"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        //date
        JLabel label_Date= new JLabel("Date For Leave");
        label_Date.setBounds(100, 120, 150, 20);
        label_Date.setFont(new Font("Tahoma", Font.PLAIN,16));
        add(label_Date);
        date=new JDateChooser();
        date.setBounds(350, 120, 150, 20);
        add(date);

        // timing
        JLabel label_Timing= new JLabel("Time");
        label_Timing.setBounds(100, 170, 150, 20);
        label_Timing.setFont(new Font("Tahoma", Font.PLAIN,16));
        add(label_Timing);
        choice_Timing=new Choice();
        choice_Timing.setBounds(350, 170, 150, 20);
        choice_Timing.add("Full Day");
        choice_Timing.add("Half Day");
        add(choice_Timing);

        // button
        submit=new JButton("Submit");
        submit.setBounds(100,250,150,20);
        submit.setBackground(Color.WHITE);
        submit.setForeground(Color.BLACK);
        add(submit);
        //actionPerformed
        submit.addActionListener(this);

        cancel=new JButton("Close");
        cancel.setBounds(350,250,150,20);
        cancel.setBackground(Color.WHITE);
        cancel.setForeground(Color.BLACK);
        add(cancel);
        //actionPerformed
        cancel.addActionListener(this);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent event){
        if (event.getSource()==submit) {
            String roll_Number= choice_Roll_Number.getSelectedItem();
            String String_date=((JTextField)(date.getDateEditor().getUiComponent())).getText();
            String duration= choice_Timing.getSelectedItem();

            // QUERY
            String query= "insert into studentleave values('"+roll_Number+"', '"+String_date+"', '"+duration+"')";
            try {
                Connection_With_DataBase cwdb= new Connection_With_DataBase();
                cwdb.state.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Leave Granted");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (event.getSource()==cancel) {
            setVisible(false);
        }
    }
    public static void main(String[] args) {
        new Student_Leave_Details();
    }
}
