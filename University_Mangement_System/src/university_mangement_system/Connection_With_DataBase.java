/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package university_mangement_system;

/**
 *
 * @author Asus
 */
/**
 * Connection_With_DataBase
 */
//package imported
import java.sql.*;

import javax.xml.namespace.QName;

public class Connection_With_DataBase {
    Connection con;
    Statement state;
    //constructor
    Connection_With_DataBase(){
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");   
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/university_management_system", "root","Nishant1234");
            state=con.createStatement();
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Connection_With_DataBase();
    }
}
