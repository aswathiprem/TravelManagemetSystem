import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Transportation {
	Transportation(){
		JFrame f4=new JFrame("Transportation");
		JLabel l14,l15,l17;
		l14=new JLabel("Departure Date ");
		l14.setBounds(50,50,175,75);
		f4.add(l14);
		JTextField t5;
		t5=new JTextField();
		t5.setBounds(200,50,200,30);
		
		f4.add(t5);
		
		l15=new JLabel("Departure Time ");
		l15.setBounds(50,100,175,75);
		f4.add(l15);
		JTextField t6;
		t6=new JTextField();
		t6.setBounds(200,100,200,30);
		f4.add(t6);
		
		
		l17=new JLabel("Expected No. Of Days");
		l17.setBounds(50,150,175,75);
		f4.add(l17);
		JTextField t7;
		t7=new JTextField();
		t7.setBounds(200,150,200,30);
		f4.add(t7);
		JButton b7=new JButton("Save");
		 b7.setBounds(150,200,95,30);  
	     f4.add(b7);
	     JDialog d4 = new JDialog(f4 , "Submit", true);  
	        d4.setLayout( new FlowLayout() ); 
	        d4.add( new JLabel ("Submitted Successfully"));	
	        d4.setSize(200,200);  
	        d4.setLocationRelativeTo(null);
	        b7.addActionListener(new ActionListener(){  
	       	 public void actionPerformed(ActionEvent e6){  
	       		 d4.setVisible(true);
	       	 }});
	     
	

f4.setLayout(null);
f4.setVisible(true);
f4.setSize(500,500);
}}