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
public class Feee_Structure extends JFrame {

    Feee_Structure(){
        
        //frame settings
        setSize(800,700);
        setLocation(250,25);
        setLayout(null);

        //heading
        JLabel heading = new JLabel("Student Fee Details");
        heading.setBounds(260, 10, 400, 50);
        heading.setFont(new Font("Serif", Font.BOLD, 30));
        add(heading);

        JTable table= new JTable();


        JScrollPane scroller= new JScrollPane(table);
        scroller.setBounds(0, 50, 800, 700);
        add(scroller);

        try {
            Connection_With_DataBase cwdb= new Connection_With_DataBase();
            ResultSet rs= cwdb.state.executeQuery("select * from fee");
            table.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (Exception e) {
            e.printStackTrace();    
        }
        





        setVisible(true);
    }
    public static void main(String[] args) {
       new Feee_Structure(); 
    }
}
