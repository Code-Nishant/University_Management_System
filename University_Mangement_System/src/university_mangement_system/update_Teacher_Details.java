/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package university_mangement_system;

// imported package
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.util.jar.Attributes.Name;

import net.proteanit.sql.DbUtils;


/**
 *
 * @author Asus
 */

public class update_Teacher_Details extends JFrame implements ActionListener{

    //gobal variables
    JLabel label_Name;
    JLabel label_Father_Name;
    JTextField text_Field_Address;//changeable
    JTextField text_Field_Ph_Number;//changeable
    JTextField text_Field_EMail;//changeable
    JLabel label___Teacher_ID;
    JLabel label___Qulification;
    JLabel label___Dept;
    JLabel label___Twelve_Percent;
    JLabel label___Tenth_Percent;
    JLabel label___Aadhar_Number;
    JLabel label_Roll_Number;
    JLabel date;

    JButton update;
    JButton close;

    Choice choice_Teacher_ID;

    update_Teacher_Details(){
        //frame settings
        setSize(900,700);
        setLocation(250,25);
        setLayout(null);

        //heading
        JLabel heading = new JLabel("Update Teacher Information");
        heading.setBounds(250, 20, 500, 50);
        heading.setFont(new Font("Serif", Font.BOLD, 30));
        add(heading);

        //fields
        JLabel label_TeacherID= new JLabel("Select with Teacher ID");
        label_TeacherID.setBounds(230, 100, 250, 20);
        label_TeacherID.setFont(new Font("Serif", Font.BOLD, 20));
        add(label_TeacherID);
        choice_Teacher_ID=new Choice();
        choice_Teacher_ID.setBounds(500, 100, 150, 20);
        add(choice_Teacher_ID);
        // fetching data from database
        try {
            Connection_With_DataBase cwdb= new Connection_With_DataBase();
            ResultSet rs= cwdb.state.executeQuery("select * from teacher");
            while (rs.next()) {
                choice_Teacher_ID.add(rs.getString("teacher_ID"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        JLabel labelName = new JLabel("Name");
        labelName.setBounds(50, 150, 100, 30);
        labelName.setFont(new Font("Serif", Font.BOLD, 20));
        add(labelName);
        label_Name= new JLabel();
        label_Name.setBounds(250,150,150, 30);
        label_Name.setFont(new Font("Serif", Font.PLAIN, 18));
        add(label_Name);

        JLabel labelFather_Name = new JLabel("Father's Name");
        labelFather_Name.setBounds(500, 150, 300, 30);
        labelFather_Name.setFont(new Font("Serif", Font.BOLD, 20));
        add(labelFather_Name);
        label_Father_Name= new JLabel();
        label_Father_Name.setBounds(670,150,150, 30);
        label_Father_Name.setFont(new Font("Serif", Font.PLAIN, 18));
        add(label_Father_Name);
        
        JLabel label_Teacher_ID = new JLabel("Teacher ID");
        label_Teacher_ID.setBounds(50, 200, 200, 30);
        label_Teacher_ID.setFont(new Font("Serif", Font.BOLD, 20));
        add(label_Teacher_ID);
        label___Teacher_ID= new JLabel();
        label___Teacher_ID.setBounds(250,200,150, 30);
        label___Teacher_ID.setFont(new Font("Serif", Font.PLAIN, 18));
        add(label___Teacher_ID);
        

        JLabel label_dob = new JLabel("D.O.B");
        label_dob.setBounds(500, 200, 200, 30);
        label_dob.setFont(new Font("Serif", Font.BOLD, 20));
        add(label_dob);
        date=new JLabel();
        date.setBounds(670, 200, 150, 30);
        date.setFont(new Font("Serif", Font.PLAIN, 18));
        add(date);

        JLabel label_Address = new JLabel("Address");
        label_Address.setBounds(50, 250, 200, 30);
        label_Address.setFont(new Font("Serif", Font.BOLD, 20));
        add(label_Address);
        text_Field_Address= new JTextField();
        text_Field_Address.setBounds(250,250,150, 30);
        text_Field_Address.setFont(new Font("Serif", Font.PLAIN, 18));
        add(text_Field_Address);

        JLabel label_Ph_Number = new JLabel("Phone Number");
        label_Ph_Number.setBounds(500, 250, 200, 30);
        label_Ph_Number.setFont(new Font("Serif", Font.BOLD, 20));
        add(label_Ph_Number);
        text_Field_Ph_Number= new JTextField();
        text_Field_Ph_Number.setBounds(670,250,150, 30);
        text_Field_Ph_Number.setFont(new Font("Serif", Font.PLAIN, 18));
        add(text_Field_Ph_Number);

        JLabel label_EMail = new JLabel("Email Address");
        label_EMail.setBounds(50, 300, 200, 30);
        label_EMail.setFont(new Font("Serif", Font.BOLD, 20));
        add(label_EMail);
        text_Field_EMail= new JTextField();
        text_Field_EMail.setBounds(250,300,150, 30);
        text_Field_EMail.setFont(new Font("Serif", Font.PLAIN, 18));
        add(text_Field_EMail);

        JLabel label_Tenth_percent = new JLabel("Class 10 percentage");
        label_Tenth_percent.setBounds(500, 300, 200, 30);
        label_Tenth_percent.setFont(new Font("Serif", Font.BOLD, 18));
        add(label_Tenth_percent);
        label___Tenth_Percent= new JLabel();
        label___Tenth_Percent.setBounds(670,300,150, 30);
        label___Tenth_Percent.setFont(new Font("Serif", Font.PLAIN, 18));
        add(label___Tenth_Percent);

        JLabel label_Twelve_percent = new JLabel("Class 12 percentage");
        label_Twelve_percent.setBounds(50, 350, 200, 30);
        label_Twelve_percent.setFont(new Font("Serif", Font.BOLD, 18));
        add(label_Twelve_percent);
        label___Twelve_Percent= new JLabel();
        label___Twelve_Percent.setBounds(250,350,150, 30);
        label___Twelve_Percent.setFont(new Font("Serif", Font.PLAIN, 18));
        add(label___Twelve_Percent);

        JLabel label_Aadhar_Number = new JLabel("Aadhar Number");
        label_Aadhar_Number.setBounds(500, 350, 200, 30);
        label_Aadhar_Number.setFont(new Font("Serif", Font.BOLD, 20));
        add(label_Aadhar_Number);
        label___Aadhar_Number= new JLabel();
        label___Aadhar_Number.setBounds(670,350,150, 30);
        label___Aadhar_Number.setFont(new Font("Serif", Font.PLAIN, 18));
        add(label___Aadhar_Number);

        JLabel label_Qulification= new JLabel("Qulification");
        label_Qulification.setBounds(50, 400, 150, 30);
        label_Qulification.setFont(new Font("Serif", Font.BOLD, 20));
        add(label_Qulification);
        label___Qulification=new JLabel();
        label___Qulification.setBounds(250, 400, 150, 30);
        label___Qulification.setFont(new Font("Serif", Font.PLAIN, 18));
        add(label___Qulification);

        JLabel label_Dept= new JLabel("Department");
        label_Dept.setBounds(500, 400, 200, 30);
        label_Dept.setFont(new Font("Serif", Font.PLAIN, 20));
        add(label_Dept);
        label___Dept=new JLabel();
        label___Dept.setBounds(670, 400, 150, 30);
        label___Dept.setFont(new Font("Serif", Font.PLAIN, 18));
        add(label___Dept);

        // fetching details from database for non changable details
        try {
            Connection_With_DataBase cwdb= new Connection_With_DataBase();
            String query = "select * from teacher where teacher_ID='"+choice_Teacher_ID.getSelectedItem()+"'";
            ResultSet rs = cwdb.state.executeQuery(query);

            while(rs.next()){
                label_Name.setText(rs.getString("name"));
                label_Father_Name.setText(rs.getString("fname"));
                date.setText(rs.getString("dob"));
                label___Teacher_ID.setText(rs.getString("teacher_ID"));
                label___Tenth_Percent.setText(rs.getString("x_percentage"));
                label___Twelve_Percent.setText(rs.getString("xii_percentage"));
                label___Aadhar_Number.setText(rs.getString("aadhar"));
                label___Qulification.setText(rs.getString("qulification"));
                label___Dept.setText(rs.getString("dept"));
                text_Field_Address.setText(rs.getString("address"));
                text_Field_EMail.setText(rs.getString("email"));
                text_Field_Ph_Number.setText(rs.getString("phone"));
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        //choice function
        choice_Teacher_ID.addItemListener(new ItemListener(){
            public void itemStateChanged(ItemEvent ie){
                try {
                    Connection_With_DataBase cwdb= new Connection_With_DataBase();
                    String query = "select * from teacher where teacher_ID='"+choice_Teacher_ID.getSelectedItem()+"'";
                    ResultSet rs = cwdb.state.executeQuery(query);
        
                    while(rs.next()){
                        label_Name.setText(rs.getString("name"));
                        label_Father_Name.setText(rs.getString("fname"));
                        date.setText(rs.getString("dob"));
                        label___Teacher_ID.setText(rs.getString("teacher_ID"));
                        label___Tenth_Percent.setText(rs.getString("x_percentage"));
                        label___Twelve_Percent.setText(rs.getString("xii_percentage"));
                        label___Aadhar_Number.setText(rs.getString("aadhar"));
                        label___Qulification.setText(rs.getString("qulification"));
                        label___Dept.setText(rs.getString("dept"));
                        text_Field_Address.setText(rs.getString("address"));
                        text_Field_EMail.setText(rs.getString("email"));
                        text_Field_Ph_Number.setText(rs.getString("phone"));
                        
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        update=new JButton("Update");
        update.setBounds(250,550,120,25);
        update.setBackground(Color.WHITE);
        update.setForeground(Color.BLACK);
        add(update);
        //actionPerformed
        update.addActionListener(this);

        close=new JButton("Close");
        close.setBounds(500,550,120,25);
        close.setBackground(Color.WHITE);
        close.setForeground(Color.BLACK);
        add(close);
        //actionPerformed
        close.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent event){
        if (event.getSource()==update) {
            // fetching the details
            String name=label_Name.getText();
            String father_name=label_Father_Name.getText();
            String teacher_ID=label___Teacher_ID.getText();
            String dob=date.getText();
            String address=text_Field_Address.getText();
            String phone_Number=text_Field_Ph_Number.getText();
            String email_ID=text_Field_EMail.getText();
            String x_Percentage= label___Tenth_Percent.getText();
            String xii_Percetage= label___Twelve_Percent.getText();
            String aadhar_Number=label___Aadhar_Number.getText();
            String dept=label___Dept.getText();
            String qulification=label___Qulification.getText();

            // query
            try {
                String query="update teacher set address='"+address+"', phone='"+phone_Number+"', email='"+email_ID+"'where teacher_ID='"+teacher_ID+"'";

                Connection_With_DataBase cwdb=new Connection_With_DataBase();
                cwdb.state.executeUpdate(query);

                JOptionPane.showMessageDialog(null, "Teacher Details Updated Successfully");
            } catch (Exception e) {
                e.printStackTrace();
            }

        } 
        else if(event.getSource()==close) {
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new update_Teacher_Details();
    }
}
