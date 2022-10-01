package university_mangement_system;
//imported package
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;

public class Add_Student extends JFrame implements ActionListener{
    //gobal variables
    JTextField text_Field_Name;
    JTextField text_Field_Father_Name;
    JTextField text_Field_Address;
    JTextField text_Field_Ph_Number;
    JTextField text_Field_EMail;
    JTextField text_Field_Twelve_Percent;
    JTextField text_Field_Tenth_Percent;
    JTextField text_Field_Aadhar_Number;
    JLabel label_Roll_Number;
    JDateChooser date;
    JComboBox combo_Box_Course;
    JComboBox combo_Box_Branch;

    JButton submit;
    JButton cancel;

    Random ran=new Random();
    long num=Math.abs((ran.nextLong()%9000)+1000);

    Add_Student(){

        //frame settings
        setSize(900,700);
        setLocation(250,25);
        setLayout(null);

        //heading
        JLabel heading = new JLabel("New Student Information");
        heading.setBounds(250,20 ,500 , 50);
        heading.setFont(new Font("Serif", Font.BOLD, 30));
        add(heading);

        //feilds
        JLabel labelName = new JLabel("Name");
        labelName.setBounds(50, 150, 100, 30);
        labelName.setFont(new Font("Serif", Font.BOLD, 20));
        add(labelName);
        text_Field_Name= new JTextField();
        text_Field_Name.setBounds(250,150,150, 30);
        text_Field_Name.setFont(new Font("Serif", Font.BOLD, 20));
        add(text_Field_Name);

        JLabel label_Father_Name = new JLabel("Father's Name");
        label_Father_Name.setBounds(500, 150, 200, 30);
        label_Father_Name.setFont(new Font("Serif", Font.BOLD, 20));
        add(label_Father_Name);
        text_Field_Father_Name= new JTextField();
        text_Field_Father_Name.setBounds(670,150,150, 30);
        text_Field_Father_Name.setFont(new Font("Serif", Font.BOLD, 20));
        add(text_Field_Father_Name);
        
        JLabel label_rollnumber = new JLabel("Roll Number");
        label_rollnumber.setBounds(50, 200, 200, 30);
        label_rollnumber.setFont(new Font("Serif", Font.BOLD, 20));
        add(label_rollnumber);
        label_Roll_Number = new JLabel("200"+num);
        label_Roll_Number.setBounds(250, 200, 200, 30);
        label_Roll_Number.setFont(new Font("Serif", Font.BOLD, 20));
        add(label_Roll_Number);

        JLabel label_dob = new JLabel("D.O.B");
        label_dob.setBounds(500, 200, 200, 30);
        label_dob.setFont(new Font("Serif", Font.BOLD, 20));
        add(label_dob);
        date=new JDateChooser();
        date.setBounds(670, 200, 150, 30);
        add(date);

        JLabel label_Address = new JLabel("Address");
        label_Address.setBounds(50, 250, 200, 30);
        label_Address.setFont(new Font("Serif", Font.BOLD, 20));
        add(label_Address);
        text_Field_Address= new JTextField();
        text_Field_Address.setBounds(250,250,150, 30);
        text_Field_Address.setFont(new Font("Serif", Font.BOLD, 20));
        add(text_Field_Address);

        JLabel label_Ph_Number = new JLabel("Phone Number");
        label_Ph_Number.setBounds(500, 250, 200, 30);
        label_Ph_Number.setFont(new Font("Serif", Font.BOLD, 20));
        add(label_Ph_Number);
        text_Field_Ph_Number= new JTextField();
        text_Field_Ph_Number.setBounds(670,250,150, 30);
        text_Field_Ph_Number.setFont(new Font("Serif", Font.BOLD, 20));
        add(text_Field_Ph_Number);

        JLabel label_EMail = new JLabel("Email Address");
        label_EMail.setBounds(50, 300, 100, 30);
        label_EMail.setFont(new Font("Serif", Font.BOLD, 20));
        add(label_EMail);
        text_Field_EMail= new JTextField();
        text_Field_EMail.setBounds(250,300,150, 30);
        text_Field_EMail.setFont(new Font("Serif", Font.BOLD, 20));
        add(text_Field_EMail);

        JLabel label_Tenth_percent = new JLabel("Class 10 Percentage");
        label_Tenth_percent.setBounds(500, 300, 200, 30);
        label_Tenth_percent.setFont(new Font("Serif", Font.BOLD, 18));
        add(label_Tenth_percent);
        text_Field_Tenth_Percent= new JTextField();
        text_Field_Tenth_Percent.setBounds(670,300,150, 30);
        text_Field_Tenth_Percent.setFont(new Font("Serif", Font.BOLD, 18));
        add(text_Field_Tenth_Percent);

        JLabel label_Twelve_percent = new JLabel("Class 12 Percentage");
        label_Twelve_percent.setBounds(50, 350, 200, 30);
        label_Twelve_percent.setFont(new Font("Serif", Font.BOLD, 18));
        add(label_Twelve_percent);
        text_Field_Twelve_Percent= new JTextField();
        text_Field_Twelve_Percent.setBounds(250,350,150, 30);
        text_Field_Twelve_Percent.setFont(new Font("Serif", Font.BOLD, 18));
        add(text_Field_Twelve_Percent);

        JLabel label_Aadhar_Number = new JLabel("Aadhar Number");
        label_Aadhar_Number.setBounds(500, 350, 200, 30);
        label_Aadhar_Number.setFont(new Font("Serif", Font.BOLD, 20));
        add(label_Aadhar_Number);
        text_Field_Aadhar_Number= new JTextField();
        text_Field_Aadhar_Number.setBounds(670,350,150, 30);
        text_Field_Aadhar_Number.setFont(new Font("Serif", Font.BOLD, 20));
        add(text_Field_Aadhar_Number);

        JLabel label_Course= new JLabel("Courses");
        label_Course.setBounds(50, 400, 100, 30);
        label_Course.setFont(new Font("Serif", Font.BOLD, 20));
        add(label_Course);
        String course[]={"B.Tech","M.Tech","B.BA","M.BA","B.Sc","M.Sc","B.COM","M.COM","B.A","M.A"};
        combo_Box_Course=new JComboBox(course);
        combo_Box_Course.setBounds(250, 400, 150, 30);
        add(combo_Box_Course);

        JLabel label_Branch= new JLabel("Branch");
        label_Branch.setBounds(500, 400, 200, 30);
        label_Branch.setFont(new Font("Serif", Font.BOLD, 20));
        add(label_Branch);
        String branch[]={"CSE","CS-IT","ELECTRICAL","EEE","ETC","MEACHANICAL","CIVIL","PRODUCTION","MEGRATRONIC","ELECTRONIC","ROBOTIC","AI","DS"};
        combo_Box_Branch=new JComboBox(branch);
        combo_Box_Branch.setBounds(670, 400, 150, 30);
        add(combo_Box_Branch);

        submit=new JButton("Submit");
        submit.setBounds(250,550,120,25);
        submit.setBackground(Color.WHITE);
        submit.setForeground(Color.BLACK);
        add(submit);
        //actionPerformed
        submit.addActionListener(this);

        cancel=new JButton("Cancel");
        cancel.setBounds(500,550,120,25);
        cancel.setBackground(Color.WHITE);
        cancel.setForeground(Color.BLACK);
        add(cancel);
        //actionPerformed
        cancel.addActionListener(this);

        setVisible(true);
    }   
    public void actionPerformed(ActionEvent event){
        if (event.getSource()==submit) {
            // fetching the details
            String name=text_Field_Name.getText();
            String father_name=text_Field_Father_Name.getText();
            String roll_no=label_Roll_Number.getText();
            String dob=((JTextField)(date.getDateEditor().getUiComponent())).getText();
            String address=text_Field_Address.getText();
            String phone_Number=text_Field_Ph_Number.getText();
            String Email_ID=text_Field_EMail.getText();
            String x_Percentage=text_Field_Tenth_Percent.getText();
            String xii_Percetage=text_Field_Twelve_Percent.getText();
            String aadhar_Number=text_Field_Aadhar_Number.getText();
            String course=(String)(combo_Box_Course.getSelectedItem());
            String branch=(String)(combo_Box_Branch.getSelectedItem());

            // query
            try {
                String query="insert into student values('"+name+"', '"+father_name+"', '"+roll_no+"', '"+dob+"', '"+address+"', '"+phone_Number+"', '"+Email_ID+"', '"+x_Percentage+"', '"+xii_Percetage+"', '"+aadhar_Number+"', '"+course+"', '"+branch+"')";

                Connection_With_DataBase cwdb=new Connection_With_DataBase();
                cwdb.state.executeUpdate(query);

                JOptionPane.showMessageDialog(null, "Student Details Updated");
            } catch (Exception e) {
                e.printStackTrace();
            }

        } 
        else if(event.getSource()==cancel) {
            setVisible(false);
        }
    }
    public static void main(String[] args) {
        new Add_Student();
    } 
}
