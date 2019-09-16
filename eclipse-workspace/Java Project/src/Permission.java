
import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import java.awt.GridLayout;
import javax.swing.JButton;

import javax.swing.JFrame;




public class Permission {
	Permission(){
		JFrame f1=new JFrame("Travel Mannagementt System");
		JButton b3,b4;
		b3=new JButton("Admin");
		b3.setBounds(600,400,75,25);
		f1.add(b3);
		b3.addActionListener(new ActionListener(){  
	    	 public void actionPerformed(ActionEvent e1){  
	    		Admin a=new Admin();
	    	 }});
		b4=new JButton("Customer");
		b4.setBounds(650,400,75,25);
		b4.addActionListener(new ActionListener(){  
	    	 public void actionPerformed(ActionEvent e1){  
	    		Customer c=new Customer();
	    	 }});
		f1.add(b4);
		f1.setTitle("Welcome");
		
		f1.setLayout(new GridLayout() );
		f1.setVisible(true);
		f1.setSize(500,500);
	}
	
}
		
	
         
        

