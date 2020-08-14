/**
 * Write a description of class RigoTechnology here.
 *
 * @author David Gurung
 * @version 2.0
 */
import javax.swing.*;
import java.awt.*;
import java.awt.Font;
import java.awt.event.*;
public class RigoTechnology 
{//variable declare
    //create Arraylist of type Developer main(){
        //call the gui method;}
        //public void gui(){
            //create all the labels, textbox, button , frame ;
        //}
    JFrame frm;
    JLabel lblTitle,lblPlatfrom,lblBoarder1, lblWorkingHours,lblAppointedBy, lblInterviewer, lblTitle2, lblName, lblJoiningDate, lblDeleloperName, lblRoomNO, lblAdvanceSalary,lblName2,lblTitle3,lblSpecialization,lblDeleloperName2, lblAppointDate,lblTerminatedDate,lblSalary,lblContractPeriod; 
    JTextField txtPlatfrom, txtWorkingHours,txtAppointedBy, txtSpecialization , txtInterviewer, txtName, txtJoiningDate, txtDeveloperName, txtRoomNO, txtAdvanceSalary,txtName2,txtDeveloperName2, txtAppointDate,txtTerminatedDate,txtSalary,txtContractPeriod;
    JButton junior,senior,appointed,terminated, appointJR, display, clear;
     
   public static void main(String[]args){
        new RigoTechnology().deloperGUI();
   }
   public void deloperGUI(){
        frm = new JFrame("RigoTechnology ");
        frm.setSize(750,500);
        frm.setLayout(null);
        frm.setResizable(true);
        frm.setVisible(true);
        
        lblTitle = new JLabel(" Add Platfrom for Developer");
        frm.add(lblTitle);
        lblTitle.setBounds(5,10,400,30);     
       
        Font f = new Font("Arial",Font.BOLD,14);
        lblTitle.setFont(f);
        
        
        lblPlatfrom=new JLabel("Platform :");
        frm.add(lblPlatfrom);
        lblPlatfrom.setBounds(5,40,75,20);
                      
        txtPlatfrom=new JTextField();
        frm.add(txtPlatfrom);
        txtPlatfrom.setBounds(80,40,300,20);  
        
        
        
        lblWorkingHours=new JLabel("Working Hours :");
        frm.add(lblWorkingHours);
        lblWorkingHours.setBounds(390,40,100,20);
                      
        txtWorkingHours=new JTextField();
        frm.add(txtWorkingHours);
        txtWorkingHours.setBounds(490,40,200,20); 
        
        
        lblInterviewer=new JLabel("Interviewer Name:");
        frm.add(lblInterviewer);
        lblInterviewer.setBounds(5,80,400,20);
                      
        txtInterviewer=new JTextField();
        frm.add(txtInterviewer);
        txtInterviewer.setBounds(125,80,100,20);  
        
     
        
        lblSalary=new JLabel("Salary :");
        frm.add(lblSalary);
        lblSalary.setBounds(230,80,70,20);
        
        txtSalary=new JTextField();
        frm.add(txtSalary);
        txtSalary.setBounds(305,80,100,20);  
        
        lblContractPeriod=new JLabel("Contract Period :");
        frm.add(lblContractPeriod);
        lblContractPeriod.setBounds(410,80,100,20);
                      
        txtContractPeriod=new JTextField();
        frm.add(txtContractPeriod);
        txtContractPeriod.setBounds(525,80,150,20); 
        
        junior = new JButton("Add Junior Developer");
        frm.add(junior);
        junior.setBounds(520,105,170,20);
        
        lblBoarder1= new JLabel("===============================================================================================================");
        frm.add(lblBoarder1);
        lblBoarder1.setBounds(0,130,750,20);
        
        
        //Appoint/Terimnate Senior Developer
        
        lblTitle2 = new JLabel("Appoint/Terimnate Junior Developer");
        frm.add(lblTitle2);
        lblTitle2.setBounds(5,140,400,30); 
        
        Font b = new Font("Arial",Font.BOLD,14);
        lblTitle2.setFont(b);
        
        
        lblName =new JLabel("Name :");
        frm.add(lblName );
        lblName .setBounds(5,180,75,20);
                      
        txtName =new JTextField();
        frm.add(txtName );
        txtName .setBounds(80,180,300,20);  
                    
        lblSpecialization=new JLabel("Specialization :");
        frm.add(lblSpecialization);
        lblSpecialization.setBounds(390,180,100,20);
                      
        txtSpecialization=new JTextField();
        frm.add(txtSpecialization);
        txtSpecialization.setBounds(490,180,200,20); 
                               
        txtDeveloperName=new JTextField();
        frm.add(txtDeveloperName);
        txtDeveloperName .setBounds(110,220,150,20); 
        
        lblAppointedBy =new JLabel("Appointed By:");
        frm.add(lblAppointedBy );
        lblAppointedBy.setBounds(300,220,150,20);
                      
        txtAppointedBy=new JTextField();
        frm.add(txtAppointedBy);
        txtAppointedBy.setBounds(400,220,80,20); 
        
        lblAdvanceSalary =new JLabel("Advance Salary:");
        frm.add(lblAdvanceSalary );
        lblAdvanceSalary.setBounds(500,220,100,20);
                      
        txtAdvanceSalary=new JTextField();
        frm.add(txtAdvanceSalary);
        txtAdvanceSalary .setBounds(600,220,80,20); 
        
        lblDeleloperName =new JLabel("Developer Name :");
        frm.add(lblDeleloperName );
        lblDeleloperName.setBounds(5,220,100,20);
        
        
        
       
        
        appointed  = new JButton("Appoint Junior Developer");
        frm.add(appointed );
        appointed.setBounds(285,250,200,20);
        
        terminated = new JButton("Terminate Junior Developer");
        frm.add(terminated);
        terminated.setBounds(490,250,200,20);
        
        
        lblBoarder1= new JLabel("===============================================================================================================");
        frm.add(lblBoarder1);
        lblBoarder1.setBounds(0,270,750,20);
        
        
        
        
        
        //Appoint/Terimnate Senior Developer
        lblTitle3 = new JLabel("Appoint/Terimnate Senior Developer");
        frm.add(lblTitle3);
        lblTitle3.setBounds(5,280,400,30); 
        
        Font c = new Font("Arial",Font.BOLD,14);
        lblTitle3.setFont(c);
        
        lblName2 =new JLabel("Name :");
        frm.add(lblName2 );
        lblName2 .setBounds(5,320,75,20);
                      
        txtName2 =new JTextField();
        frm.add(txtName2 );
        txtName2.setBounds(80,320,300,20);  
                    
        lblJoiningDate=new JLabel("Joining Date :");
        frm.add(lblJoiningDate);
        lblJoiningDate.setBounds(390,320,100,20);
                      
        txtSpecialization=new JTextField();
        frm.add(txtSpecialization);
        txtSpecialization.setBounds(490,320,200,20); 
        
        lblDeleloperName2 =new JLabel("Developer Name :");
        frm.add(lblDeleloperName2 );
        lblDeleloperName2 .setBounds(5,360,100,20);
                      
        txtDeveloperName2=new JTextField();
        frm.add(txtDeveloperName2);
        txtDeveloperName2.setBounds(110,360,150,20);
        
        lblAppointDate =new JLabel("Appointed Date :");
        frm.add(lblAppointDate );
        lblAppointDate.setBounds(270,360,120,20);
                      
        txtAppointDate=new JTextField();
        frm.add(txtAppointDate);
        txtAppointDate.setBounds(390,360,80,20); 
        
        
         lblTerminatedDate =new JLabel("Termination Date:");
        frm.add(lblTerminatedDate );
        lblTerminatedDate.setBounds(500,360,120,20);
                      
        txtTerminatedDate=new JTextField();
        frm.add(txtTerminatedDate);
        txtTerminatedDate .setBounds(620,360,80,20); 
        
        
       
        
        
        appointJR = new JButton("Appoint Senior Developer");
        frm.add(appointJR);
        appointJR.setBounds(490,400,200,20);
        
        display = new JButton("Display");
        frm.add(display);
        display.setBounds(535,430,75,20);
        
        clear= new JButton("Clear");
        frm.add(clear);
        clear.setBounds(615,430,75,20);
        
   }
   //public void actionPerformed (ActionEvent e){
       //if (e.getSource==btnAddsen){
        //  collect the text box values
        //check the empty field
        //convert the string to the integer for numerical values;
        //create the objects of SenoirDeveloper class
        //add that object to the array list.
        //display the sucessful message
      // }
   }
//}