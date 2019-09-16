import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*; 
public class Booking {
	Booking(){
		JFrame f3=new JFrame("Booking");
		JLabel l11,l12,l13,l16;
		l11=new JLabel("DeparturePoint");
		l11.setBounds(50,50,125,25);
		f3.add(l11);
		JTextField t3;
		t3=new JTextField();
		t3.setBounds(200,50,125,30);
		f3.add(t3);
		 
	    l12=new JLabel("Destination");
			l12.setBounds(50,150,100,25);
			f3.add(l12);
			String country[]={"India","Aus","U.S.A","England","Newzealand","Germany","Japan"};        
			    JComboBox cb1=new JComboBox(country);    
			    cb1.setBounds(200, 150,100,25);    
			    f3.add(cb1); 
		l13=new JLabel("Mode Of Transport");
				l13.setBounds(50,200,175,50);
				f3.add(l13);
				JRadioButton air= new JRadioButton("Air");
				air.setBounds(200,200,100,30);
				JRadioButton water = new JRadioButton("Water");
				water.setBounds(200,225,100,30);
				ButtonGroup gd1 = new ButtonGroup();
				gd1.add(air);
				gd1.add(water);
				f3.add(air);
				f3.add(water);
		l16=new JLabel("Accommodation Needed?");
				l16.setBounds(50,300,175,30);
				f3.add(l16);
				JRadioButton y= new JRadioButton("Yes");
				y.setBounds(225,300,100,30);
				JRadioButton n = new JRadioButton("No");
				n.setBounds(225,325,100,30);
				ButtonGroup gd2= new ButtonGroup();
				gd2.add(y);
				gd2.add(n);
				f3.add(y);
				f3.add(n);
		JButton b7=new JButton("Save And Continue");
			     b7.setBounds(150,400,175,40);
			     f3.add(b7);
		b7.addActionListener(new ActionListener(){  
			    	 public void actionPerformed(ActionEvent e5){  
			    		 Transportation t=new Transportation();
			    	 }});
		f3.setLayout(null);
		f3.setVisible(true);
		f3.setSize(500,500);
		
			    
	}
}
