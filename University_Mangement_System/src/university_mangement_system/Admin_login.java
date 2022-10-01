/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package university_mangement_system;

//imported package
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
/**
 *
 * @author Asus
 */

public class Admin_login extends JFrame implements ActionListener {
    //gobal button 
    JButton loginButton;

    //gobal text field
    JTextField userTextField;
    JPasswordField passwordTextField;

    //default constructor
    Admin_login(){

        //background color...
        getContentPane().setBackground(Color.GRAY);
        setLayout(null);

        //fields for login
        //user fields
        JLabel user=new JLabel("UserName=");
        user.setBounds(40,20,100,20);
        add(user);
        userTextField= new JTextField();
        userTextField.setBounds(150,20,100,20);
        add(userTextField);
        //password fields
        JLabel password=new JLabel("PassWord=");
        password.setBounds(40,70,100,20);
        add(password);
        passwordTextField= new JPasswordField();
        passwordTextField.setBounds(150,70,100,20);
        add(passwordTextField);
        //login button
        loginButton=new JButton("Login");
        loginButton.setBounds(150,120,100,25);
        loginButton.setBackground(Color.WHITE);
        loginButton.setForeground(Color.BLACK);
        add(loginButton);

        //listeners function call
        loginButton.addActionListener(this);

        //frame setting
        setSize(400, 200);
        setLocation(600, 250);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent event) {
        if (event.getSource()==loginButton) {
            // System.out.println("button clicked");
            //fetching of data form user
            String userName;
            String passWord;
            userName=userTextField.getText();
            passWord=passwordTextField.getText();

            String query = "select * from login where username='"+userName+"' and passWord='"+passWord+"'";

            try {
                Connection_With_DataBase cwdb=new Connection_With_DataBase();
                ResultSet rs=cwdb.state.executeQuery(query);
                if(rs.next()) {
                    setVisible(false);
                    new MainFrame();
                }
                else{
                    JOptionPane.showMessageDialog(null,"Invalid username or passWord");
                    setVisible(false);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }
    public static void main(String arg[]){
        new Admin_login();
    }
}
