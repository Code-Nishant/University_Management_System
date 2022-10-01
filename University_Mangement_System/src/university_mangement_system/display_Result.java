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

public class display_Result extends JFrame implements ActionListener {
    
    // gobal variable
    JTextField text_Field_Search;
    JButton result;
    JButton close;
    JTable tabel;

    display_Result(){

        //frame settings
        setSize(800,700);
        setLocation(250,25);
        setLayout(null);
        
        //heading
        JLabel heading = new JLabel("MarkSheet of Student");
        heading.setBounds(200, 10, 400, 50);
        heading.setFont(new Font("Serif", Font.BOLD, 30));
        add(heading);

        text_Field_Search= new JTextField();
        text_Field_Search.setBounds(200, 80, 220, 20);
        text_Field_Search.setFont(new Font("Serif", Font.PLAIN, 18));
        add(text_Field_Search);

        result=new JButton("Result");
        result.setBounds(220,580,120,25);
        result.setBackground(Color.WHITE);
        result.setForeground(Color.BLACK);
        add(result);
        //actionPerformed
        result.addActionListener(this);

        close=new JButton("Close");
        close.setBounds(440,580,120,25);
        close.setBackground(Color.WHITE);
        close.setForeground(Color.BLACK);
        add(close);
        //actionPerformed
        close.addActionListener(this);

        tabel =new JTable();
        tabel.setFont(new Font("Serif", Font.PLAIN, 16));
        JScrollPane scroll_Pane=new JScrollPane(tabel);
        scroll_Pane.setBounds(0, 110, 800, 4080);
        add(scroll_Pane);

        try {
            Connection_With_DataBase cwdb= new Connection_With_DataBase();
            ResultSet rs= cwdb.state.executeQuery("select * from student");
            tabel.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (Exception e) {
            e.printStackTrace();    
        }

        tabel.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent me){
                int row= tabel.getSelectedRow();
                text_Field_Search.setText(tabel.getModel().getValueAt(row, 2).toString());
            }
        });

        



        setVisible(true);
    }

    public void actionPerformed(ActionEvent event){

        if (event.getSource()==result ) {
            setVisible(false);
            new Individual_Student_Mark( text_Field_Search.getText());
        }
       else if(event.getSource()==close){
           setVisible(false);
       }
    }

    public static void main(String[] args) {
        new display_Result();    
    }
}
