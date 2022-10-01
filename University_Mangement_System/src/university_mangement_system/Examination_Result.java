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

/**
 *
 * @author Asus
 */
public class Examination_Result extends JFrame implements ActionListener{

    // gobal variable
    Choice choice_Roll_Number;
    JComboBox combo_Box_semester;

    JTextField text_Field_First_Subject;
    JTextField text_Field_Second_Subject;
    JTextField text_Field_Third_Subject;
    JTextField text_Field_Fourth_Subject;
    JTextField text_Field_Fifth_Subject;
    JTextField text_Field_Sixth_Subject;
    JTextField text_Field_Seventh_Subject;
    JTextField text_Field_Eighth_Subject;

    JTextField text_Field_First_Marks;
    JTextField text_Field_Second_Marks;
    JTextField text_Field_Third_Marks;
    JTextField text_Field_Fourth_Marks;
    JTextField text_Field_Fifth_Marks;
    JTextField text_Field_Sixth_Marks;
    JTextField text_Field_Seventh_Marks;
    JTextField text_Field_Eighth_Marks;

    JButton submit;
    JButton close;

    Examination_Result(){

        //frame settings
        setSize(800,700);
        setLocation(250,25);
        setLayout(null);
        

        //heading
        JLabel heading = new JLabel("Enter MarkSheet of Student");
        heading.setBounds(200, 10, 400, 50);
        heading.setFont(new Font("Serif", Font.BOLD, 30));
        add(heading);

        //fields
        JLabel label_Roll_Number= new JLabel("Select with Roll Number");
        label_Roll_Number.setBounds(200, 80, 220, 20);
        label_Roll_Number.setFont(new Font("Serif", Font.BOLD, 20));
        add(label_Roll_Number);
        choice_Roll_Number=new Choice();
        choice_Roll_Number.setBounds(420, 80, 150, 20);
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

        
        JLabel label_Semester = new JLabel("Select Semester");
        label_Semester.setBounds(200, 120, 200, 30);
        label_Semester.setFont(new Font("Serif", Font.PLAIN, 18));
        add(label_Semester);
        String sem[]={"1st Semester","2nd Semester","3rd Semester", "4th Semester", "5th Semester", "6th Semester", "7th Semester", "8th Semester"};
        combo_Box_semester= new JComboBox(sem);
        combo_Box_semester.setBounds(420,120,150, 30);
        combo_Box_semester.setFont(new Font("Serif", Font.PLAIN, 18));
        add(combo_Box_semester);

        JLabel label_Subject_Name = new JLabel("Enter Subject Name");
        label_Subject_Name.setBounds(200, 200, 150, 30);
        label_Subject_Name.setFont(new Font("Serif", Font.PLAIN, 18));
        add(label_Subject_Name);
        JLabel label_Subject_Marks = new JLabel("Enter Subject Marks");
        label_Subject_Marks.setBounds(420, 200, 150, 30);
        label_Subject_Marks.setFont(new Font("Serif", Font.PLAIN, 18));
        add(label_Subject_Marks);

        text_Field_Second_Subject=new JTextField();
        text_Field_Second_Subject.setBounds(200, 240, 150, 30);
        text_Field_Second_Subject.setFont(new Font("Serif", Font.PLAIN, 18));
        add(text_Field_Second_Subject);
        text_Field_Second_Marks=new JTextField();
        text_Field_Second_Marks.setBounds(420, 240, 150, 30);
        text_Field_Second_Marks.setFont(new Font("Serif", Font.PLAIN, 18));
        add(text_Field_Second_Marks);

        text_Field_Third_Subject=new JTextField();
        text_Field_Third_Subject.setBounds(200, 280, 150, 30);
        text_Field_Third_Subject.setFont(new Font("Serif", Font.PLAIN, 18));
        add(text_Field_Third_Subject);
        text_Field_Third_Marks=new JTextField();
        text_Field_Third_Marks.setBounds(420, 280, 150, 30);
        text_Field_Third_Marks.setFont(new Font("Serif", Font.PLAIN, 18));
        add(text_Field_Third_Marks);

        text_Field_Fourth_Subject=new JTextField();
        text_Field_Fourth_Subject.setBounds(200, 320, 150, 30);
        text_Field_Fourth_Subject.setFont(new Font("Serif", Font.PLAIN, 18));
        add(text_Field_Fourth_Subject);
        text_Field_Fourth_Marks=new JTextField();
        text_Field_Fourth_Marks.setBounds(420, 320, 150, 30);
        text_Field_Fourth_Marks.setFont(new Font("Serif", Font.PLAIN, 18));
        add(text_Field_Fourth_Marks);

        text_Field_Fifth_Subject=new JTextField();
        text_Field_Fifth_Subject.setBounds(200, 360, 150, 30);
        text_Field_Fifth_Subject.setFont(new Font("Serif", Font.PLAIN, 18));
        add(text_Field_Fifth_Subject);
        text_Field_Fifth_Marks=new JTextField();
        text_Field_Fifth_Marks.setBounds(420, 360, 150, 30);
        text_Field_Fifth_Marks.setFont(new Font("Serif", Font.PLAIN, 18));
        add(text_Field_Fifth_Marks);

        text_Field_Sixth_Subject=new JTextField();
        text_Field_Sixth_Subject.setBounds(200, 400, 150, 30);
        text_Field_Sixth_Subject.setFont(new Font("Serif", Font.PLAIN, 18));
        add(text_Field_Sixth_Subject);
        text_Field_Sixth_Marks=new JTextField();
        text_Field_Sixth_Marks.setBounds(420, 400, 150, 30);
        text_Field_Sixth_Marks.setFont(new Font("Serif", Font.PLAIN, 18));
        add(text_Field_Sixth_Marks);

        text_Field_Seventh_Subject=new JTextField();
        text_Field_Seventh_Subject.setBounds(200, 440, 150, 30);
        text_Field_Seventh_Subject.setFont(new Font("Serif", Font.PLAIN, 18));
        add(text_Field_Seventh_Subject);
        text_Field_Seventh_Marks=new JTextField();
        text_Field_Seventh_Marks.setBounds(420, 440, 150, 30);
        text_Field_Seventh_Marks.setFont(new Font("Serif", Font.PLAIN, 18));
        add(text_Field_Seventh_Marks);

        text_Field_Eighth_Subject=new JTextField();
        text_Field_Eighth_Subject.setBounds(200, 480, 150, 30);
        text_Field_Eighth_Subject.setFont(new Font("Serif", Font.PLAIN, 18));
        add(text_Field_Eighth_Subject);
        text_Field_Eighth_Marks=new JTextField();
        text_Field_Eighth_Marks.setBounds(420, 480, 150, 30);
        text_Field_Eighth_Marks.setFont(new Font("Serif", Font.PLAIN, 18));
        add(text_Field_Eighth_Marks);

        text_Field_First_Subject=new JTextField();
        text_Field_First_Subject.setBounds(200, 520, 150, 30);
        text_Field_First_Subject.setFont(new Font("Serif", Font.PLAIN, 18));
        add(text_Field_First_Subject);
        text_Field_First_Marks=new JTextField();
        text_Field_First_Marks.setBounds(420, 520, 150, 30);
        text_Field_First_Marks.setFont(new Font("Serif", Font.PLAIN, 18));
        add(text_Field_First_Marks);

        submit=new JButton("Submit");
        submit.setBounds(220,580,120,25);
        submit.setBackground(Color.WHITE);
        submit.setForeground(Color.BLACK);
        add(submit);
        //actionPerformed
        submit.addActionListener(this);

        close=new JButton("Close");
        close.setBounds(440,580,120,25);
        close.setBackground(Color.WHITE);
        close.setForeground(Color.BLACK);
        add(close);
        //actionPerformed
        close.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent event){
        if (event.getSource()==submit) {

            // query
            try {
                String query_For_Subject="insert into subject values('"+choice_Roll_Number.getSelectedItem()+"', '"+combo_Box_semester.getSelectedItem()+"', '"+text_Field_First_Subject.getText()+"', '"+text_Field_Second_Subject.getText()+"', '"+text_Field_Third_Subject.getText()+"', '"+text_Field_Fourth_Subject.getText()+"', '"+text_Field_Fifth_Subject.getText()+"', '"+text_Field_Sixth_Subject.getText()+"', '"+text_Field_Seventh_Subject.getText()+"', '"+text_Field_Eighth_Subject.getText()+"')";

                String query_For_Marks="insert into marks values('"+choice_Roll_Number.getSelectedItem()+"', '"+combo_Box_semester.getSelectedItem()+"', '"+text_Field_First_Marks.getText()+"', '"+text_Field_Second_Marks.getText()+"', '"+text_Field_Third_Marks.getText()+"', '"+text_Field_Fourth_Marks.getText()+"', '"+text_Field_Fifth_Marks.getText()+"', '"+text_Field_Sixth_Marks.getText()+"', '"+text_Field_Seventh_Marks.getText()+"', '"+text_Field_Eighth_Marks.getText()+"')";;

                Connection_With_DataBase cwdb=new Connection_With_DataBase();
                cwdb.state.executeUpdate(query_For_Subject);
                cwdb.state.executeUpdate(query_For_Marks);

                JOptionPane.showMessageDialog(null, "Successsfully Done");
            } catch (Exception e) {
                e.printStackTrace();
            }

        } 
        else if(event.getSource()==close) {
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new Examination_Result();    
    }
}
