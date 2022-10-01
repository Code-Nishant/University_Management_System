/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package university_mangement_system;
//imported package
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Asus
 */
public class College extends JFrame implements Runnable{
    //constructor
    Thread t;
    College(){
        //seting image path and scaling     
        ImageIcon image= new ImageIcon(ClassLoader.getSystemResource("Icons/image-1.jpg"));
        Image image2=image.getImage().getScaledInstance(700, 600, Image.SCALE_DEFAULT);
        ImageIcon image3=new ImageIcon(image2);
        JLabel label = new JLabel(image3);
        add(label);
        
        //hidding of main frame
        t=new Thread(this);
        t.start();

        //main frame setting
        setVisible(true);
        setSize(700,600);
        setLocation(500,70);
    }
    public void run(){
        try {
            //halt for 10 seconds
            Thread.sleep(8000);
            setVisible(false);

            //next frame
            Admin_login ad=new Admin_login();
            // MainFrame mf=new MainFrame();
            // Aad_Student as=new Aad_Student();
            // Add_Teacher at=new Add_Teacher();
//            Show_Student_Details ssd= new Show_Student_Details();
            // Show_Teacher_Details ssd= new Show_Teacher_Details();
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    //main method
    public static void main(String arg[]){
        new College();
    }
}
