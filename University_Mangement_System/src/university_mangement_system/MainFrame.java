package university_mangement_system;

//package imported
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class MainFrame extends JFrame implements ActionListener{

    MainFrame(){
        //frame setting
        setSize(1605, 900);

        // setting image for MainFrame
        ImageIcon image= new ImageIcon(ClassLoader.getSystemResource("Icons/main_frame_image.jpg"));
        Image image2=image.getImage().getScaledInstance(1600, 850, Image.SCALE_DEFAULT);
        ImageIcon image3=new ImageIcon(image2);
        JLabel label = new JLabel(image3);
        add(label);

        //menu bar
        JMenuBar menuBar = new JMenuBar();

        //menu title
        JMenu information=new JMenu("New Information");
        menuBar.add(information);
        //menu items
        JMenuItem faculty_Info= new JMenuItem("New Faculty");
        information.add(faculty_Info);
        faculty_Info.addActionListener(this);

        JMenuItem student_Info= new JMenuItem("New Student");
        information.add(student_Info);
        student_Info.addActionListener(this);

        //menu title
        JMenu details=new JMenu("Details");
        menuBar.add(details);
        //menu items
        JMenuItem faculty_Details= new JMenuItem("View Faculty Details");
        details.add(faculty_Details);
        faculty_Details.addActionListener(this);

        JMenuItem student_Details= new JMenuItem("View Student Details");
        details.add(student_Details);
        student_Details.addActionListener(this);

        //menu title
        JMenu leave=new JMenu("Apply Leave");
        menuBar.add(leave);
        //menu items
        JMenuItem faculty_Leave= new JMenuItem("Faculty Leave");
        leave.add(faculty_Leave);
        faculty_Leave.addActionListener(this);

        JMenuItem student_Leave= new JMenuItem("Student Leave");
        leave.add(student_Leave);
        student_Leave.addActionListener(this);

        //menu title
        JMenu leave_Details=new JMenu("Leave Details");
        menuBar.add(leave_Details);
        //menu items
        JMenuItem faculty_Leave_Details= new JMenuItem("Faculty Leave Details");
        leave_Details.add(faculty_Leave_Details);
        faculty_Leave_Details.addActionListener(this);

        JMenuItem student_Leave_Details= new JMenuItem("Student Leave Details");
        leave_Details.add(student_Leave_Details);
        student_Leave_Details.addActionListener(this);

        //menu title
        JMenu exam=new JMenu("Examination");
        menuBar.add(exam);
        //menu items
        JMenuItem exam_Result= new JMenuItem("Examination Result");
        exam.add(exam_Result);
        exam_Result.addActionListener(this);
        
        JMenuItem add_Exam_Result= new JMenuItem("Update Result");
        exam.add(add_Exam_Result);
        add_Exam_Result.addActionListener(this);

        //menu title
        JMenu update_Info=new JMenu("Update Info");
        menuBar.add(update_Info);
        //menu items
        JMenuItem update_faculty_Info= new JMenuItem("Update Faculty Info");
        update_Info.add(update_faculty_Info);
        update_faculty_Info.addActionListener(this);

        JMenuItem update_Student_Info= new JMenuItem("Update Student Info");
        update_Info.add(update_Student_Info);
        update_Student_Info.addActionListener(this);

        //menu title
        JMenu fee=new JMenu("Fee Details");
        menuBar.add(fee);
        //menu items
        JMenuItem fee_Info= new JMenuItem("Fee Info");
        fee.add(fee_Info);
        fee_Info.addActionListener(this);
        JMenuItem fee_Form= new JMenuItem("Student Fee Form");
        fee.add(fee_Form);
        fee_Form.addActionListener(this);

        //menu title
        JMenu helper=new JMenu("Helper Menu");
        menuBar.add(helper);
        //menu items
        JMenuItem notepad= new JMenuItem("Notepad");
        helper.add(notepad);
        //action performed
        notepad.addActionListener(this);

        JMenuItem calculator= new JMenuItem("Calculator");
        helper.add(calculator);
        //action performed
        calculator.addActionListener(this);

        //menu title
        JMenu about=new JMenu("About");
        menuBar.add(about);
        //menu items
        JMenuItem about_Project= new JMenuItem("About");
        about.add(about_Project);
        about_Project.addActionListener(this);


        //menu title
        JMenu exit=new JMenu("Exit");
        menuBar.add(exit);
        //menu items
        JMenuItem exit_Option= new JMenuItem("Exit");
        exit.add(exit_Option);
        //action performed
        exit_Option.addActionListener(this);

        setJMenuBar(menuBar);
        
        setVisible(true);
    }
    public void actionPerformed(ActionEvent event) {
        String option_Clicked= event.getActionCommand();
        
        if (option_Clicked.equals("Exit")) 
            setVisible(false);
        

        else if(option_Clicked.equals("New Student"))
            new Add_Student();
        
        else if(option_Clicked.equals("New Faculty"))
            new Add_Teacher();

        else if(option_Clicked.equals("View Faculty Details"))
            new Show_Teacher_Details();
        
        else if(option_Clicked.equals("View Student Details"))
            new Show_Student_Details();
        

        else if(option_Clicked.equals("Faculty Leave"))
            new Teacher_Leave_Details();
        
        else if(option_Clicked.equals("Student Leave"))
            new Student_Leave_Details();
        
        else if(option_Clicked.equals("Faculty Leave Details"))
            new Show_Teacher_Leave_Details();
        
        else if(option_Clicked.equals("Student Leave Details"))
            new Show_Student_Leave_Details();
        
        else if(option_Clicked.equals("Update Faculty Info"))
            new update_Teacher_Details();
        
        else if(option_Clicked.equals("Update Student Info"))
            new update_Student_Details();
        
        else if(option_Clicked.equals("Examination Result"))
            new display_Result();
        
        else if(option_Clicked.equals("Update Result"))
            new Examination_Result();

        else if(option_Clicked.equals("Fee Info"))
            new Feee_Structure();
        
        else if(option_Clicked.equals("Student Fee Form"))
            new Student_Fee_Form();
        
        else if(option_Clicked.equals("About"))
            new About();
        
        else if(option_Clicked.equals("Calculator")){
            try {
                Runtime.getRuntime().exec("Calc.exe");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        else if(option_Clicked.equals("Notepad")){
            try {
                Runtime.getRuntime().exec("notepad.exe");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        new MainFrame();    
    }
}