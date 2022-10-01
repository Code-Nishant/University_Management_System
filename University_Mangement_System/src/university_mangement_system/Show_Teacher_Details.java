/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package university_mangement_system;

/**
 *
 * @author Asus
 */
// package imported
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import net.proteanit.sql.DbUtils;
import java.sql.*;

public class Show_Teacher_Details extends JFrame implements ActionListener {
    // gobal variable
    Choice choice_Teacher_ID;
    JTable table_Teacher;

    JButton search_Teacher;
    JButton cancel_Teacher;
    JButton update_Teacher;
    JButton print_Teacher;
    JButton add_Teacher;

    Show_Teacher_Details(){

        //frame settings
        setSize(1000,800);
        setLocation(250,25);
        setLayout(null);

        // search with roll number
        JLabel heading= new JLabel("Search with Teacher ID");
        heading.setBounds(300, 20, 150, 20);
        add(heading);
        choice_Teacher_ID=new Choice();
        choice_Teacher_ID.setBounds(450, 20, 150, 20);
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

        // table
        table_Teacher = new JTable();

        try {
            Connection_With_DataBase cwdb= new Connection_With_DataBase();
            ResultSet rs= cwdb.state.executeQuery("select * from teacher");
            table_Teacher.setModel(DbUtils.resultSetToTableModel(rs));
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        // scroller
        JScrollPane j_Scroll_Pane = new JScrollPane(table_Teacher);
        j_Scroll_Pane.setBounds(0, 100, 1000, 800);
        add(j_Scroll_Pane);

        //button
        search_Teacher = new JButton("Search");
        search_Teacher.setBounds(100,70, 80, 20);
        add(search_Teacher);
        
        add_Teacher= new JButton("Add");
        add_Teacher.setBounds(300,70, 80, 20);
        add(add_Teacher);
        
        update_Teacher= new JButton("Update");
        update_Teacher.setBounds(500,70, 80, 20);
        add(update_Teacher);
        
        print_Teacher= new JButton("Print");
        print_Teacher.setBounds(700,70, 80, 20);
        add(print_Teacher);
        
        cancel_Teacher= new JButton("Cancel");
        cancel_Teacher.setBounds(900,70, 80, 20);
        add(cancel_Teacher);
        
        //actionPerformed
        search_Teacher.addActionListener(this);
        print_Teacher.addActionListener(this);
        add_Teacher.addActionListener(this);
        update_Teacher.addActionListener(this);
        cancel_Teacher.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent event){

        if (event.getSource()== search_Teacher) {
            String query="select * from teacher where teacher_ID= '"+choice_Teacher_ID.getSelectedItem()+"'";
            try {
                Connection_With_DataBase cwdb= new Connection_With_DataBase();
                ResultSet rs=cwdb.state.executeQuery(query);
                table_Teacher.setModel(DbUtils.resultSetToTableModel(rs));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        else if(event.getSource()== print_Teacher){
            try {
                table_Teacher.print();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        else if(event.getSource()== add_Teacher){
            setVisible(false);
            new Add_Teacher();
        }
        else if(event.getSource()== update_Teacher){
            setVisible(false);
             new update_Teacher_Details();
        }
        else if(event.getSource()==cancel_Teacher){
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new Show_Student_Details();    
    }
}
