import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Admin {
	Admin(){
		JFrame f5=new JFrame("Admin's Page");
		JLabel l18,l19,l20,l21;
		l18=new JLabel("Username ");
		l18.setBounds(600,400,75,25);
		f5.add(l18);
		JTextField t8;
		t8=new JTextField("Enter name");
		t8.setBounds(700,400,200,30);
		f5.add(t8);
		
		l19=new JLabel("Password");
		l19.setBounds(600,450,75,25);
		f5.add(l19);
		JPasswordField val = new JPasswordField();
		val.setBounds(700,450,200,30);
		f5.add(val);JButton b2=new JButton("Create new Account");
	     b2.setBounds(775,550,200,25);
	     f5.add(b2);
	     b2.addActionListener(new ActionListener(){  
	    	 public void actionPerformed(ActionEvent e1){  
	    		 LogIn l=new LogIn();
	    	 }});
		JButton b8=new JButton("Submit");  
	     b8.setBounds(700,500,95,30);  
	     f5.add(b8);
	     f5.setLayout(null);
	 	f5.setVisible(true);
	 	f5.setSize(1500,1500);
	 	JButton b9=new JButton("Create new Account");
	     b9.setBounds(775,550,200,25);
	     f5.add(b9);
	     b9.addActionListener(new ActionListener(){  
	    	 public void actionPerformed(ActionEvent e1){  
	    		 LogIn l1=new LogIn();
	    	 }});
	 	
	}
}
