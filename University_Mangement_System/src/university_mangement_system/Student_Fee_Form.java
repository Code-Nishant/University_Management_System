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
public class Student_Fee_Form extends JFrame implements ActionListener {

    // gobal variable
    Choice choice_Roll_Number;
    JLabel label_Name;
    JLabel label_Father_Name;
    JComboBox combo_Box_Course;
    JComboBox combo_Box_Branch;
    JComboBox combo_Box_semester;
    JLabel label_Total;

    JButton update;
    JButton close;
    JButton pay;

    Student_Fee_Form(){

        //frame settings
        setSize(800,420);
        setLocation(350,120);
        setLayout(null);

        //heading
        JLabel heading = new JLabel("Student Fee Form");
        heading.setBounds(290, 10, 400, 40);
        heading.setFont(new Font("Serif", Font.BOLD, 30));
        add(heading);

        //fields
        JLabel label_Roll_Number= new JLabel("Select with Roll Number");
        label_Roll_Number.setBounds(220, 60, 220, 20);
        label_Roll_Number.setFont(new Font("Serif", Font.BOLD, 20));
        add(label_Roll_Number);
        choice_Roll_Number=new Choice();
        choice_Roll_Number.setBounds(450, 60, 150, 20);
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

        JLabel labelName = new JLabel("Name :");
        labelName.setBounds(50, 110, 100, 30);
        labelName.setFont(new Font("Serif", Font.BOLD, 20));
        add(labelName);
        label_Name= new JLabel();
        label_Name.setBounds(180,110,150, 30);
        label_Name.setFont(new Font("Serif", Font.PLAIN, 18));
        add(label_Name);

        JLabel labelFather_Name = new JLabel("Father's Name :");
        labelFather_Name.setBounds(400, 110, 150, 30);
        labelFather_Name.setFont(new Font("Serif", Font.BOLD, 20));
        add(labelFather_Name);
        label_Father_Name= new JLabel();
        label_Father_Name.setBounds(550,110,300, 30);
        label_Father_Name.setFont(new Font("Serif", Font.PLAIN, 18));
        add(label_Father_Name);

        // fetching details from database for non changable details
        try {
            Connection_With_DataBase cwdb= new Connection_With_DataBase();
            String query = "select * from student where rollno='"+choice_Roll_Number.getSelectedItem()+"'";
            ResultSet rs = cwdb.state.executeQuery(query);

            while(rs.next()){
                label_Name.setText(rs.getString("name"));
                label_Father_Name.setText(rs.getString("fname"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

         //choice function
         choice_Roll_Number.addItemListener(new ItemListener(){
            public void itemStateChanged(ItemEvent ie){
                try {
                    Connection_With_DataBase cwdb= new Connection_With_DataBase();
                    String query = "select * from student where rollno='"+choice_Roll_Number.getSelectedItem()+"'";
                    ResultSet rs = cwdb.state.executeQuery(query);
        
                    while(rs.next()){
                        label_Name.setText(rs.getString("name"));
                        label_Father_Name.setText(rs.getString("fname"));
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        JLabel label_Course= new JLabel("Courses :");
        label_Course.setBounds(50, 160, 100, 30);
        label_Course.setFont(new Font("Serif", Font.BOLD, 20));
        add(label_Course);
        String course[]={"B-Tech","M-Tech","BBA","MBA","BSc","MSc","BCOM","MCOM","BA","MA"};
        combo_Box_Course=new JComboBox(course);
        combo_Box_Course.setBounds(180, 160, 150, 30);
        add(combo_Box_Course);

        JLabel label_Branch= new JLabel("Branch :");
        label_Branch.setBounds(400, 160, 200, 30);
        label_Branch.setFont(new Font("Serif", Font.BOLD, 20));
        add(label_Branch);
        String branch[]={"CSE","CS-IT","ELECTRICAL","EEE","ETC","MEACHANICAL","CIVIL","PRODUCTION","MEGRATRONIC","ELECTRONIC","ROBOTIC","AI","DS"};
        combo_Box_Branch=new JComboBox(branch);
        combo_Box_Branch.setBounds(550, 160, 150, 30);
        add(combo_Box_Branch);

        JLabel label_Semester = new JLabel("Select Semester :");
        label_Semester.setBounds(260, 210, 200, 30);
        label_Semester.setFont(new Font("Serif", Font.BOLD, 18));
        add(label_Semester);
        String sem[]={"Semester1","Semester2","Semester3", "Semester4", "Semester5", "Semester6", "Semester7", "Semester8"};
        combo_Box_semester= new JComboBox(sem);
        combo_Box_semester.setBounds(420,210,150, 30);
        combo_Box_semester.setFont(new Font("Serif", Font.PLAIN, 18));
        add(combo_Box_semester);
        
        JLabel total = new JLabel("Amount :");
        total.setBounds(260, 260, 200, 40);
        total.setFont(new Font("Serif", Font.BOLD, 18));
        add(total);

        label_Total = new JLabel();
        label_Total.setBounds(420, 260, 100, 40);
        label_Total.setFont(new Font("Serif", Font. PLAIN, 18));
        add(label_Total);

        update=new JButton("Update");
        update.setBounds(50,330,100,25);
        update.setBackground(Color.WHITE);
        update.setForeground(Color.BLACK);
        add(update);
        //actionPerformed
        update.addActionListener(this);

        pay=new JButton("Pay");
        pay.setBounds(360,330,100,25);
        pay.setBackground(Color.WHITE);
        pay.setForeground(Color.BLACK);
        add(pay);
        //actionPerformed
        pay.addActionListener(this);

        close=new JButton("Close");
        close.setBounds(630,330,100,25);
        close.setBackground(Color.WHITE);
        close.setForeground(Color.BLACK);
        add(close);
        //actionPerformed
        close.addActionListener(this);

        setVisible(true);

    }

    public void actionPerformed(ActionEvent event){
        if(event.getSource()==update){
            String course= (String)combo_Box_Course.getSelectedItem();
            String semester=(String)combo_Box_semester.getSelectedItem();
            try {
                Connection_With_DataBase cwdb= new Connection_With_DataBase();
                ResultSet rs= cwdb.state.executeQuery("select * from fee where course ='"+ course+"'");
                while(rs.next()){
                    label_Total.setText(rs.getString(semester));
                }
            } 
            catch (Exception e) {
                e.printStackTrace();
            }
        }
        else if(event.getSource()==pay){
            String rollno=choice_Roll_Number.getSelectedItem();
            String course= (String)combo_Box_Course.getSelectedItem();
            String semester=(String)combo_Box_semester.getSelectedItem();
            String branch=(String)combo_Box_Branch.getSelectedItem();
            String total= label_Total.getText();

            try {
                Connection_With_DataBase cwdb= new Connection_With_DataBase();
                String query="insert into collegefee values('"+rollno+"', '"+course+"', '"+branch+"', '"+semester+"', '"+total+"')";
                cwdb.state.executeUpdate(query);
                
                JOptionPane.showMessageDialog(null, "College Fee Updated");
            } 
            catch (Exception e) {
                e.printStackTrace();
            }
        }
        else{
            setVisible(false);
        }

    }

    public static void main(String[] args) {
        new Student_Fee_Form();
    }
}
