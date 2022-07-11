import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JMenuItem;

public class Form2 implements ActionListener{
    
    JFrame frame;
    JPanel panel;
    JLabel title, StudentID, schoolyear, firstname, Lastname, middlename, address1, Dateofbirth, placeofbirth, age, gender, status,
               year2, guardian, relation, address2, contact, text;
    JTextField text1, text2, text3, text4, text5, text6, text7, text8, text9, text10, text11;
    JRadioButton r1, r2;
    JButton jb1,jb2, jb3, jb4, jb5, jb6;
    JComboBox cb1, cb2, cb3, cb4, cb5, cb6;
    JMenuBar MB;
    JMenu menu1,menu2,menu3;
    JMenuItem item1, item2,item3,item4;
    
    Form2(){
        frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(1000,500);
       
        title = new JLabel ("Student Registration Form");
        title.setBounds(250,00,250,50);
        
        StudentID = new JLabel("Student ID");
        StudentID.setBounds(10,50,70,30);
        text1 = new JTextField();
        text1.setBounds(80,50,130,30);
       
       
        schoolyear = new JLabel("School Year");
        schoolyear.setBounds(450,50,70,30);
        String[] year =  {"2014-2015","2015-2016","2016-2017",
            "2017-2018","2018-2019","2019-2020","2020-2021"};
        cb1 = new JComboBox(year);
        cb1.setBounds(530,50,150,30);
       
        firstname = new JLabel("First Name:");
        firstname.setBounds(10,100,70,30);
        text2 = new JTextField();
        text2.setBounds(80,100,100,30);
       
        Lastname= new JLabel("Last Name:");
        Lastname.setBounds(200,100,70,30);
        text3 = new JTextField();
        text3.setBounds(270,100,130,30);
       
        middlename = new JLabel("Middle Name:");
        middlename.setBounds(450,100,100,30);
        text4 = new JTextField();
        text4.setBounds(550,100,130,30);
       
        address1 = new JLabel("Address:");
        address1.setBounds(10,150,60,30);
        text5 = new JTextField();
        text5.setBounds(80,150,90,30);
       
        Dateofbirth = new JLabel("Date of Birth:");
        Dateofbirth.setBounds(200,150,70,30);
        String[]Year = {"1995","1996","1997","1998","1999","2001","2002","2003","2004"};        
        cb2 = new JComboBox(Year);
        cb2.setBounds(270,150,55,30);
       
        String[]months = {"January","February","March","April","May",
            "June","July","August","Sepptember","October","November","December"};
        cb3 = new JComboBox(months);
        cb3.setBounds(325,150,80,30);
        String[]dates = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14",
                "15","16","17","18","19","20","21","22","23","24","25","26",
                "27","28","29","30","31"};
        cb4 = new JComboBox(dates);
        cb4.setBounds(405,150,45,30);
       
        placeofbirth = new JLabel("Place of Birth:");
        placeofbirth.setBounds(450,150,120,30);
        text6 = new JTextField();
        text6.setBounds(550,150,180,30);
       
        age = new JLabel("Age:");
        age.setBounds(10,200,50,30);
        text7 = new JTextField();
        text7.setBounds(80,200,50,30);
       
        gender = new JLabel("Gender:");
        gender.setBounds(200,180,100,60);
        r1 = new JRadioButton ("Male",true);
        r1.setBounds(270,200,70,30);
        r2 = new JRadioButton ("Female");
        r2.setBounds(320,200,70,30);
        ButtonGroup group = new ButtonGroup();
        group.add(r1);
        group.add(r2);
       
        status = new JLabel("Status:");
        status.setBounds(450,200,70,30);
        String[] s = {"Single","Married"};
        cb5 = new JComboBox(s);
        cb5.setBounds(550,200,130,30);
       
        year2 = new JLabel("Year:");
        year2.setBounds(10,250,50,30);
        String[] s2 = {"1st","2nd","3rd","4th"};
        cb6 = new JComboBox(s2);
        cb6.setBounds(80,250,100,30);
       
        guardian = new JLabel("Guardian");
        guardian.setBounds(200,230,100,60);
        text8 = new JTextField();
        text8.setBounds(270,250,130,30);
       
        relation = new JLabel("Relation:");
        relation.setBounds(450,250,70,30);
        text9 = new JTextField();
        text9.setBounds(550,250,190,30);
       
        address2 = new JLabel("Address:");
        address2.setBounds(10,300,60,30);
        text10 = new JTextField();
        text10.setBounds(80,300,230,70);
       
        contact = new JLabel("Contact#:");
        contact.setBounds(450,300,70,30);
        text11 = new JTextField();
        text11.setBounds(545,300,200,30);
       
        jb1 = new JButton("New");
        jb1.setBounds(430,500,130,50);
        jb2 = new JButton("Save");
        jb2.setBounds(530,500,150,50);
        jb3 = new JButton("|<");
        jb3.setBounds(10,500,60,30);
        jb4 = new JButton("<<");
        jb4.setBounds(50,500,60,30);
        jb5 = new JButton(">>");
        jb5.setBounds(100,500,60,30);
        jb6 = new JButton(">|");
        jb6.setBounds(150,500,60,30);
       
        text = new JLabel("0 of 0");
        text.setBounds(220,500,70,30);
       
        panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(0,0,500,500);
        panel.setBackground (Color.gray);
       
        frame.add(panel);
        panel.add(title);
        panel.add(StudentID);
        panel.add(text1);
        panel.add(schoolyear);
        panel.add(cb1);
        panel.add(firstname);
        panel.add(text2);
        panel.add(Lastname);
        panel.add(text3);
        panel.add(middlename);
        panel.add(text4);
        panel.add(address1);
        panel.add(text5);
        panel.add(Dateofbirth);
        panel.add(cb2);
        panel.add(cb3);
        panel.add(cb4);
        panel.add(placeofbirth);
        panel.add(text6);
        panel.add(age);
        panel.add(text7);
        panel.add(gender);
        panel.add(r1);
        panel.add(r2);
        panel.add(status);
        panel.add(cb5);
        panel.add(cb6);
        panel.add(year2);
        panel.add(guardian);
        panel.add(text8);
        panel.add(relation);
        panel.add(text9);
        panel.add(address2);
        panel.add(text10);
        panel.add(contact);
        panel.add(text11);
        panel.add(jb1);
        panel.add(jb2);
        panel.add(jb3);
        panel.add(jb4);
        panel.add(jb5);
        panel.add(jb6);
        panel.add(text);
    
        
        //creating JMenuBar
        MB = new JMenuBar();
        menu1 = new JMenu("File");
        menu2 = new JMenu("About");
        menu3 = new JMenu("Help");
        
        //creating JMenuItems
        item1 = new JMenuItem("Open");
        item2 = new JMenuItem("New");
        item3 = new JMenuItem("Save");
        item4 = new JMenuItem("Exit");
        
        //adding menu items to specific menu
        menu1.add(item1);
        menu1.add(item2);
        menu1.add(item3);
        menu1.add(item4);
        
        MB.add(menu1);
        MB.add(menu2);
        MB.add(menu3);
        MB.setBounds(0,0,200,15);
        
        panel.add(MB);
        
        jb1.addActionListener(this);
        jb2.addActionListener(this);
        item2.addActionListener(this);
        item3.addActionListener(this);
        item4.addActionListener(this);
        
        
        frame.setSize(1000,700); // setsize(int width,int height)
        frame.setVisible(true); // by default frame is invisible
        frame.setLayout(null); // we can position our components absolute
        title.setFont(new Font("",Font.BOLD,17));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == jb1 || e.getSource() == item2){
            text1.setText("");
            text2.setText("");
            text3.setText("");
            text4.setText("");
            text5.setText("");
            text6.setText("");
            text7.setText("");
            text8.setText("");
            text9.setText("");
            text10.setText("");
            text11.setText("");

        }
        else if(e.getSource() == jb2 || e.getSource() == item3){
            JOptionPane.showMessageDialog(frame,"Hello,Your record is being saved");
        }
        else if(e.getSource() == item4){
            System.exit(0);
        
        }
        
    }
}
