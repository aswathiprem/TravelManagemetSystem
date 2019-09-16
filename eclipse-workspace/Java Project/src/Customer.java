import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Customer {
	Customer(){
	JFrame f=new JFrame("Customer's Page");
	JLabel l1,l2,l3,l4;
	l1=new JLabel("Username ");
	l1.setBounds(600,400,75,25);
	f.add(l1);
	JTextField t1;
	t1=new JTextField("Enter name");
	t1.setBounds(700,400,200,30);
	f.add(t1);
	
	l2=new JLabel("Password");
	l2.setBounds(600,450,75,25);
	f.add(l2);
	JPasswordField val = new JPasswordField();
	val.setBounds(700,450,200,30);
	f.add(val);
	
	 JDialog d = new JDialog(f , "New Password", true);  
        d.setLayout( new FlowLayout() ); 
        d.add( new JLabel ("E-mail Id"));
        d.add( new JTextField ("Give your E-mail address"));
        d.add( new JButton ("Submit"));
        d.setSize(300,200);  
        d.setLocationRelativeTo(null);
	JButton b=new JButton("Submit");  
     b.setBounds(700,500,95,30);  
     f.add(b);
     b.addActionListener(new ActionListener(){  
    	 public void actionPerformed(ActionEvent e5){  
    		  Booking k=new Booking();
    	 }});
     
     JButton b1=new JButton("Forgot Password?");  
     b1.setBounds(550,550,200,25);  
     f.add(b1);
     b1.addActionListener(new ActionListener(){  
    	 public void actionPerformed(ActionEvent e1){  
    		 d.setVisible(true);
    	 }});
     
     JButton b2=new JButton("Create new Account");
     b2.setBounds(775,550,200,25);
     f.add(b2);
     b2.addActionListener(new ActionListener(){  
    	 public void actionPerformed(ActionEvent e1){  
    		 LogIn l=new LogIn();
    	 }});
     
       
	
	f.setLayout(null);
	f.setVisible(true);
	f.setSize(1500,1500);
	
	  }

	

}

