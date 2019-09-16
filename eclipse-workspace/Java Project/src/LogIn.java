import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class LogIn {
	LogIn(){
		JFrame f2=new JFrame("LogIn");
		JLabel l5,l6,l7,l8,l9,l10;
		l5=new JLabel("Username ");
		l5.setBounds(50,50,75,25);
		f2.add(l5);
		
		l6=new JLabel("Password");
		l6.setBounds(50,100,75,25);
		f2.add(l6);
		JPasswordField val = new JPasswordField();
		val.setBounds(200,100,200,30);
		f2.add(val);
		l7=new JLabel("ConfirmPassword");
		l7.setBounds(50,150,75,25);
		f2.add(l7);
		JPasswordField val1 = new JPasswordField();
		val1.setBounds(200,150,200,30);
		f2.add(val1);
		JTextField t1,t2;
		t1=new JTextField("Enter name");
		t1.setBounds(200,50,200,30);
		f2.add(t1);
		
		f2.setLayout(null);
		f2.setVisible(true);
		f2.setSize(500,500);
		

		l8=new JLabel("Gender");
		l8.setBounds(50,200,200,30);
		f2.add(l8);
		JRadioButton male= new JRadioButton("Male");
		male.setBounds(200,200,200,30);
		JRadioButton female = new JRadioButton("Female");
		female.setBounds(200,225,200,30);
		ButtonGroup gd1 = new ButtonGroup();
		gd1.add(male);
		gd1.add(female);
		f2.add(male);
		f2.add(female);
		
		l9=new JLabel("Languages Known");
		l9.setBounds(50,250,200,30);
		f2.add(l9);
		
		 JCheckBox checkBox1 = new JCheckBox("English");  
	     checkBox1.setBounds(200,250, 200,30);  
	     f2.add(checkBox1);
	     JCheckBox checkBox2 = new JCheckBox("Japanese");  
	     checkBox2.setBounds(200,275, 200,30);  
	     f2.add(checkBox2);
	     JCheckBox checkBox3 = new JCheckBox("German");  
	     checkBox3.setBounds(200,300, 200,30);  
	     f2.add(checkBox3);
	     
	     l6=new JLabel("Country");
			l6.setBounds(50,350,75,25);
			f2.add(l6);
			String country[]={"India","Aus","U.S.A","England","Newzealand"};        
			    JComboBox cb=new JComboBox(country);    
			    cb.setBounds(200, 350,90,20);    
			    f2.add(cb);    
			 l10=new JLabel("Address");
				l10.setBounds(50,400,200,30);
				f2.add(l10);
			t2=new JTextField("Permanent Address");
			t2.setBounds(200,400,200,30);
			f2.add(t2);
		JDialog d1 = new JDialog(f2 , "Submit", true);  
	        d1.setLayout( new FlowLayout() ); 
	        d1.add( new JLabel ("Submitted Successfully"));	
	        d1.setSize(200,200);  
	        d1.setLocationRelativeTo(null);
				
	     
	     JButton b5=new JButton("Submit");  
	     b5.setBounds(50,450,95,30);  
	     f2.add(b5);
	     b5.addActionListener(new ActionListener(){  
	    	 public void actionPerformed(ActionEvent e3){  
	    		 d1.setVisible(true);
	    	 }});
	     
	     JButton b6=new JButton("Cancel");  
	     b6.setBounds(200,450,95,30);  
	     f2.add(b6); 
	    	
	     b6.addActionListener(new ActionListener(){  
	    	 public void actionPerformed(ActionEvent e4){  
	    		 f2.setVisible(false);
	    	 }});
	}
	
}
