/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package university_mangement_system;

// package imported
import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Asus
 */

public class Show_Student_Leave_Details extends JFrame implements ActionListener {

    // gobal variable
    Choice choice_Roll_Number;
    JTable table_Student;
 
    JButton search_Student;
    JButton cancel_Student;
    JButton print_Student;

    Show_Student_Leave_Details(){
        //frame settings
        setSize(1000,800);
        setLocation(250,25);
        setLayout(null);

        // search with roll number
        JLabel heading= new JLabel("Search with Roll Number");
        heading.setBounds(300, 20, 150, 20);
        add(heading);
        choice_Roll_Number=new Choice();
        choice_Roll_Number.setBounds(550, 20, 150, 20);
        add(choice_Roll_Number);
        // fetching data from database
        try {
            Connection_With_DataBase cwdb= new Connection_With_DataBase();
            ResultSet rs= cwdb.state.executeQuery("select * from studentleave");
            while (rs.next()) {
                choice_Roll_Number.add(rs.getString("rollno"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        // table
        table_Student = new JTable();

        try {
            Connection_With_DataBase cwdb= new Connection_With_DataBase();
            ResultSet rs= cwdb.state.executeQuery("select * from studentleave");
            table_Student.setModel(DbUtils.resultSetToTableModel(rs));
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        // scroller
        JScrollPane j_Scroll_Pane = new JScrollPane(table_Student);
        j_Scroll_Pane.setBounds(0, 100, 1000, 800);
        add(j_Scroll_Pane);

        //button
        search_Student = new JButton("Search");
        search_Student.setBounds(250,70, 80, 20);
        add(search_Student);
        
        print_Student = new JButton("Print");
        print_Student.setBounds(450,70, 80, 20);
        add(print_Student);
        
        cancel_Student = new JButton("Close");
        cancel_Student.setBounds(650,70, 80, 20);
        add(cancel_Student);
        
        //actionPerformed
        print_Student.addActionListener(this);
        cancel_Student.addActionListener(this);
        search_Student.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent event){

        if (event.getSource()== search_Student) {
            String query="select * from studentleave where rollno= '"+choice_Roll_Number.getSelectedItem()+"'";
            try {
                Connection_With_DataBase cwdb= new Connection_With_DataBase();
                ResultSet rs=cwdb.state.executeQuery(query);
                table_Student.setModel(DbUtils.resultSetToTableModel(rs));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        else if(event.getSource()== print_Student){
            try {
                table_Student.print();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        else if(event.getSource()==cancel_Student){
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new Show_Student_Leave_Details();
    }
}
