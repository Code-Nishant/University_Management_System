/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package university_mangement_system;

//imported package
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import net.proteanit.sql.DbUtils;


/**
 *
 * @author Asus
 */

public class Individual_Student_Mark extends JFrame implements ActionListener{
    
    // gobal Variable
    String student_Roll_Number;
    JButton close;

    Individual_Student_Mark(String student_Roll_Number){
        this.student_Roll_Number= student_Roll_Number;

        //frame settings
        setSize(800,520);
        setLocation(250,25);
        setLayout(null);

        //heading
        JLabel heading = new JLabel("Gita Autonomous College");
        heading.setBounds(230, 10, 400, 50);
        heading.setFont(new Font("Serif", Font.BOLD, 30));
        add(heading);

        //sub heading
        JLabel sub_Heading = new JLabel("Result Details for Admin");
        sub_Heading.setBounds(280, 60, 400, 50);
        sub_Heading.setFont(new Font("Serif", Font.PLAIN, 20));
        add(sub_Heading);

        //sub heading
        JLabel label_Name = new JLabel("Name : ");
        label_Name.setBounds(100, 100, 500, 30);
        label_Name.setFont(new Font("Serif", Font.PLAIN, 20));
        add(label_Name);

        //sub heading
        JLabel sub_Sub_Heading = new JLabel("Roll Number : "+student_Roll_Number);
        sub_Sub_Heading.setBounds(500, 100, 200, 30);
        sub_Sub_Heading.setFont(new Font("Serif", Font.PLAIN, 20));
        add(sub_Sub_Heading);

        //sub heading
        JLabel label_Course = new JLabel("Course : ");
        label_Course.setBounds(100, 140, 200, 30);
        label_Course.setFont(new Font("Serif", Font.PLAIN, 20));
        add(label_Course);

        //sub heading
        JLabel label_Branch = new JLabel("Branch : ");
        label_Branch.setBounds(500, 140, 200, 30);
        label_Branch.setFont(new Font("Serif", Font.PLAIN, 20));
        add(label_Branch);

         //sub heading
         JLabel sub_Heading_Semester = new JLabel("Semester : ");
         sub_Heading_Semester.setBounds(270, 180, 400, 30);
         sub_Heading_Semester.setFont(new Font("Serif", Font.PLAIN, 20));
         add(sub_Heading_Semester);

        JLabel label_Subject_one = new JLabel();
        label_Subject_one.setBounds(100, 220, 400, 50);
        label_Subject_one.setFont(new Font("Serif", Font.PLAIN, 20));
        add(label_Subject_one);

        JLabel label_Subject_two = new JLabel();
        label_Subject_two.setBounds(500, 220, 400, 50);
        label_Subject_two.setFont(new Font("Serif", Font.PLAIN, 20));
        add(label_Subject_two);

        JLabel label_Subject_three = new JLabel();
        label_Subject_three.setBounds(100, 260, 400, 50);
        label_Subject_three.setFont(new Font("Serif", Font.PLAIN, 20));
        add(label_Subject_three);

        JLabel label_Subject_Four = new JLabel();
        label_Subject_Four.setBounds(500, 260, 400, 50);
        label_Subject_Four.setFont(new Font("Serif", Font.PLAIN, 20));
        add(label_Subject_Four);

        JLabel label_Subject_Five = new JLabel();
        label_Subject_Five.setBounds(100, 300, 400, 50);
        label_Subject_Five.setFont(new Font("Serif", Font.PLAIN, 20));
        add(label_Subject_Five);

        JLabel label_Subject_Six = new JLabel();
        label_Subject_Six.setBounds(500, 300, 400, 50);
        label_Subject_Six.setFont(new Font("Serif", Font.PLAIN, 20));
        add(label_Subject_Six);

        JLabel label_Subject_Seven = new JLabel();
        label_Subject_Seven.setBounds(100, 340, 400, 50);
        label_Subject_Seven.setFont(new Font("Serif", Font.PLAIN, 20));
        add(label_Subject_Seven);

        JLabel label_Subject_Eight = new JLabel();
        label_Subject_Eight.setBounds(500, 340, 400, 50);
        label_Subject_Eight.setFont(new Font("Serif", Font.PLAIN, 20));
        add(label_Subject_Eight);

        //fetching of details from database
        try {
            Connection_With_DataBase cwdb= new Connection_With_DataBase();
            ResultSet rs1= cwdb.state.executeQuery("select * from subject where rollno= '"+student_Roll_Number+"'");
            while (rs1.next()) {
                label_Subject_one.setText(rs1.getString("subject1"));
                label_Subject_two.setText(rs1.getString("subject2"));
                label_Subject_three.setText(rs1.getString("subject3"));
                label_Subject_Four.setText(rs1.getString("subject4"));
                label_Subject_Five.setText(rs1.getString("subject5"));
                label_Subject_Six.setText(rs1.getString("subject6"));
                label_Subject_Seven.setText(rs1.getString("subject7"));
                label_Subject_Eight.setText(rs1.getString("subject8"));
                System.out.println("afdsk");
            }
            ResultSet rs2= cwdb.state.executeQuery("select * from marks where rollno= '"+student_Roll_Number+"'");
            while (rs2.next()) {
                label_Subject_one.setText(label_Subject_one.getText()+"<-------->"+rs2.getString("mark1"));
                label_Subject_two.setText(label_Subject_two.getText()+"<-------->"+rs2.getString("mark2"));
                label_Subject_three.setText(label_Subject_three.getText()+"<-------->"+rs2.getString("mark3"));
                label_Subject_Four.setText(label_Subject_Four.getText()+"<-------->"+rs2.getString("mark4"));
                label_Subject_Five.setText(label_Subject_Five.getText()+"<-------->"+rs2.getString("mark5"));
                label_Subject_Six.setText(label_Subject_Six.getText()+"<-------->"+rs2.getString("mark6"));
                label_Subject_Seven.setText(label_Subject_Seven.getText()+"<-------->"+rs2.getString("marks7"));
                label_Subject_Eight.setText(label_Subject_Eight.getText()+"<-------->"+rs2.getString("marks8"));

                sub_Heading_Semester.setText("Semester "+ rs2.getString("semester"));
            }
            ResultSet rs3= cwdb.state.executeQuery("select * from student where rollno= '"+student_Roll_Number+"'");
            while (rs3.next()) {
                label_Name.setText(label_Name.getText()+rs3.getString("name"));
                label_Branch.setText(label_Branch.getText()+rs3.getString("branch"));
                label_Course.setText(label_Course.getText()+rs3.getString("course"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        close=new JButton("Close");
        close.setBounds(290,440,120,25);
        close.setBackground(Color.WHITE);
        close.setForeground(Color.BLACK);
        add(close);
        //actionPerformed
        close.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent event){
        setVisible(false);
    }
    
    public static void main(String[] args) {
        new Individual_Student_Mark("");
    }    
}
