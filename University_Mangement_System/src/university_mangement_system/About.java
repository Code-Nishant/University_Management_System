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
public class About extends JFrame implements ActionListener  {
    
    //gobal variable
    JButton close;
    
    About(){

        
        //frame settings
        setSize(800,580);
        setLocation(400,190);
        setLayout(null);

        //heading
        JLabel heading = new JLabel("About Section");
        heading.setBounds(310, 10, 400, 40);
        heading.setFont(new Font("Serif", Font.BOLD, 30));
        add(heading);

        //subheading
        JLabel sub_Heading = new JLabel("This project was developed by CSDS student for minnor project submission");
        sub_Heading.setBounds(90, 60, 700, 50);
        sub_Heading.setFont(new Font("Serif", Font.PLAIN, 20));
        add(sub_Heading);
        
        //rozi
        //name
        JLabel label_Name_One = new JLabel("Name : ");
        label_Name_One.setBounds(50, 150, 100, 30);
        label_Name_One.setFont(new Font("Serif", Font.PLAIN, 18));
        add(label_Name_One);
        JLabel labelName_one= new JLabel("Rozi Karmi");
        labelName_one.setBounds(250, 150, 100, 30);
        labelName_one.setFont(new Font("Serif", Font.PLAIN, 18));
        add(labelName_one);
        //roll number
        JLabel label_Roll_Number_One = new JLabel("Roll Number : ");
        label_Roll_Number_One.setBounds(50, 200, 200, 30);
        label_Roll_Number_One.setFont(new Font("Serif", Font.PLAIN, 18));
        add(label_Roll_Number_One);
        JLabel labelRoll_number_one= new JLabel("2104L06");
        labelRoll_number_one.setBounds(250, 200, 100, 30);
        labelRoll_number_one.setFont(new Font("Serif", Font.PLAIN, 18));
        add(labelRoll_number_one);
        //registration number
        JLabel label_Registration_Number_One = new JLabel("Registration Number : ");
        label_Registration_Number_One.setBounds(50, 250, 200, 30);
        label_Registration_Number_One.setFont(new Font("Serif", Font.PLAIN, 18));
        add(label_Registration_Number_One);
        JLabel labelRegistration_Number_one= new JLabel("2121287060");
        labelRegistration_Number_one.setBounds(250, 250, 100, 30);
        labelRegistration_Number_one.setFont(new Font("Serif", Font.PLAIN, 18));
        add(labelRegistration_Number_one);

        //badal
        JLabel label_Name_two = new JLabel("Name : ");
        label_Name_two.setBounds(400, 150, 100, 30);
        label_Name_two.setFont(new Font("Serif", Font.PLAIN, 18));
        add(label_Name_two);
        JLabel labelName_two= new JLabel("Badal Sharma");
        labelName_two.setBounds(600, 150, 200, 30);
        labelName_two.setFont(new Font("Serif", Font.PLAIN, 18));
        add(labelName_two);
        JLabel label_Roll_Number_two = new JLabel("Roll Number : ");
        label_Roll_Number_two.setBounds(400, 200, 200, 30);
        label_Roll_Number_two.setFont(new Font("Serif", Font.PLAIN, 18));
        add(label_Roll_Number_two);
        JLabel labelRoll_number_two= new JLabel("2004013");
        labelRoll_number_two.setBounds(600, 200, 100, 30);
        labelRoll_number_two.setFont(new Font("Serif", Font.PLAIN, 18));
        add(labelRoll_number_two);
        JLabel label_Registration_Number_two = new JLabel("Registration Number : ");
        label_Registration_Number_two.setBounds(400, 250, 200, 30);
        label_Registration_Number_two.setFont(new Font("Serif", Font.PLAIN, 18));
        add(label_Registration_Number_two);
        JLabel labelRegistration_Number_two= new JLabel("2001287270");
        labelRegistration_Number_two.setBounds(600, 250, 100, 30);
        labelRegistration_Number_two.setFont(new Font("Serif", Font.PLAIN, 18));
        add(labelRegistration_Number_two);
        
        //nishant
        JLabel label_Name_three = new JLabel("Name : ");
        label_Name_three.setBounds(250, 300, 100, 30);
        label_Name_three.setFont(new Font("Serif", Font.PLAIN, 18));
        add(label_Name_three);
        JLabel labelName_three= new JLabel("Nishant Choudhary");
        labelName_three.setBounds(450, 300, 300, 30);
        labelName_three.setFont(new Font("Serif", Font.PLAIN, 18));
        add(labelName_three);
        //roll number
        JLabel label_Roll_Number_three = new JLabel("Roll Number : ");
        label_Roll_Number_three.setBounds(250, 350, 200, 30);
        label_Roll_Number_three.setFont(new Font("Serif", Font.PLAIN, 18));
        add(label_Roll_Number_three);
        JLabel labelRoll_number_three= new JLabel("2003039");
        labelRoll_number_three.setBounds(450, 350, 100, 30);
        labelRoll_number_three.setFont(new Font("Serif", Font.PLAIN, 18));
        add(labelRoll_number_three);
        //registration
        JLabel label_Registration_Number_three = new JLabel("Registration Number : ");
        label_Registration_Number_three.setBounds(250, 400, 200, 30);
        label_Registration_Number_three.setFont(new Font("Serif", Font.PLAIN, 18));
        add(label_Registration_Number_three);
        JLabel labelRegistration_Number_three= new JLabel("2001287235");
        labelRegistration_Number_three.setBounds(450, 400, 100, 30);
        labelRegistration_Number_three.setFont(new Font("Serif", Font.PLAIN, 18));
        add(labelRegistration_Number_three);
        
        close=new JButton("Close");
        close.setBounds(360,470,120,25);
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
         new About();
    }
}
