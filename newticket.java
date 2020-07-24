import java.util.Random;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class newticket implements ActionListener,MouseListener{
	JFrame f1;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l19,l20,l21,l22,l23,l24,l25,l26,l27,l28,l29,l30,l31,l32;
	JTextField t1,t2,t3,t4,t5,t7;
	JButton b1,b2,b3,b5,b6,b7,b8,b9,b10,b11,b12;
	JComboBox j1,j2,j3,j4,j5,j6;
	JRadioButton r1,r2,r3;
	Object data;
	JFrame f2=new JFrame();
	JFrame f3=new JFrame();
	JFrame f4=new JFrame();
	JFrame f5=new JFrame();
	JFrame f6=new JFrame();
	JFrame f7=new JFrame();
	
	newticket(){
		f1=new JFrame("login page");
		l1=new JLabel("User name");
		l2=new JLabel("Password");
		t1=new JTextField(10);
		t2=new JTextField(10);
		b1=new JButton("Login");
		b2=new JButton("signup");
		l3=new JLabel("");
		l4=new JLabel("PVR");
		l4.setFont(l4.getFont().deriveFont(100.0f));         //resizes the label l4
		l11=new JLabel("Cinemas");
		l11.setFont(l11.getFont().deriveFont(40.0f));
		
		l30=new JLabel("mail ID:");                           //Contents for frame f7 for sign up 
		l30.setBounds(100, 10, 100, 100);f7.add(l30);
		t4=new JTextField(10);
		t4.setBounds(230, 50, 100, 20);f7.add(t4);
		l31=new JLabel("Password");
		l31.setBounds(100, 60, 100, 100);f7.add(l31);
		t5=new JTextField(10);
		t5.setBounds(230, 100, 100, 20);f7.add(t5);
		l32=new JLabel("Confirm Password");
		l32.setBounds(100, 110, 200, 100);f7.add(l32);
		t7=new JTextField(10);
		t7.setBounds(230, 150, 100, 20);f7.add(t7);
		b12=new JButton("Sign in");
		b12.setBounds(130, 200, 100, 20);
		f7.add(b12);
		
		r1=new JRadioButton("Udupi");
		r2=new JRadioButton("Manglore");
		r3=new JRadioButton("Karkala");
		b3=new JButton("Proceed");
		b5=new JButton("");
		b6=new JButton("");
		b7=new JButton("");
		l6=new JLabel("joker@gmail.com");
		l6.setBounds(1000,2, 100, 100);
		f2.add(l6);
		l7=new JLabel("<HTML><U>logout</U></HTML>"); //underlines the label l7
		l7.setBounds(1200, 2, 100, 100);
		f2.add(l7);
		l7.addMouseListener(this);                        //adding mouse listener to l7 to detect mouse clicking action on the label l7
		
		l8=new JLabel("Number of tickets :");
		j4=new JComboBox();                                 //combo box for number of tickets
		j4.addItem("");
		j4.addItem("1");
		j4.addItem("2");
		j4.addItem("3");
		j4.addItem("4");
		j4.addItem("5");
		j4.addItem("6");
		j4.addItem("7");
		j4.addItem("8");
		j4.addItem("9");
		j4.addItem("10");
		l8.setBounds(550, 100, 100, 100);f4.add(l8);
		j4.setBounds(700, 140, 100, 20);f4.add(j4);
		l9=new JLabel("Date (DD-MM-YYYY) :");              //label for date of show
		l9.setBounds(550, 200, 200, 100);f4.add(l9);
		t3=new JTextField(10);                             //textfield for date of show
		t3.setBounds(700, 240, 100, 20);f4.add(t3);
		
		l10=new JLabel("Class");                          //label for class selection 
		l10.setBounds(550, 300, 100, 100);
		f4.add(l10);
		j5=new JComboBox();                               //combo box for the class
		j5.addItem("");
		j5.addItem("Gold");
		j5.addItem("Platinum");
		j5.addItem("Silver");
		j5.setBounds(700, 340, 120, 50);
		f4.add(j5);
		
		l12=new JLabel("Show timings");                    //label for time of show
		l12.setBounds(550, 400, 200, 100);
		f4.add(l12);
		j6=new JComboBox();                                 //combo box for time of show
		j6.addItem("");
		j6.addItem("10.00 AM");
		j6.addItem("2.00 PM");
		j6.addItem("7.00 PM");
		j6.setBounds(700, 440, 120, 50);
		f4.add(j6);
		
		b7=new JButton("Proceed");                            //button which proceeds to f5
		b7.setBounds(550, 500, 100, 20);
		f4.add(b7);
		
		b8=new JButton("Previous");                          //button which goes back to f3 
		b8.setBounds(700, 500, 100, 20);
		f4.add(b8);
		
		l13=new JLabel("");
		f5.add(l13);
		
		b9=new JButton("Pay");                               //button that takes u to payment page and displays message after the payment
		b9.setBounds(200, 100, 100, 20);
		f5.add(b9);
		b10=new JButton("Proceed");                          //button which proceeds to f6
		b10.setBounds(200,400, 150, 20);
		f5.add(b10);
		b11=new JButton("Previous");                           //button which goes back to f4 
		b11.setBounds(400, 400, 150, 20);
		f5.add(b11);
		b5.setIcon(new ImageIcon("C:\\Users\\Nikhil\\Desktop\\spider.jpg"));f3.add(b5);  //adds image on b5
	
		b6.setIcon(new ImageIcon("C:\\Users\\Nikhil\\Desktop\\81O3lts6pkL._SY606_.jpg"));   //adds image on b6
		f3.add(b6);

		l5=new JLabel("Select City with Theatre");
		
		
		
		ButtonGroup bg=new ButtonGroup();
				bg.add(r1);
				bg.add(r2);                           //adds 3 radio button
				bg.add(r3);
				
		j1=new JComboBox();
			j1.addItem("");                          //combo box for theatre selection
			j1.addItem("Inox");
			j1.addItem("Bharath cinamas");
			j1.addItem("Diana");
			
		j2=new JComboBox();
			j2.addItem("");                            //combo box for theatre selection
			j2.addItem("Cinepolis");
			j2.addItem("Central Talkies");
			j2.addItem("Bharath cinemas");
			j2.addItem("Jyothi Talkies");
			
		j3=new JComboBox();
			j3.addItem("");	                          //combo box for theatre selection
			j3.addItem("Planet Cinema");
			j3.addItem("Radhika theatre");
			
			
					
	
		l4.setBounds(555, 50, 1000, 100); f1.add(l4);
		l11.setBounds(570, 150, 300, 100); f1.add(l11);
		l1.setBounds(550, 300, 100, 100);f1.add(l1);
		t1.setBounds(650, 340, 100, 20);f1.add(t1);           //setting bounds to the components adding on the the f1
		l2.setBounds(550, 340, 100, 100);f1.add(l2);
		t2.setBounds(650, 380, 100, 20);f1.add(t2);
		b1.setBounds(540, 430, 100, 20);f1.add(b1);
		b2.setBounds(660, 430, 100, 20);f1.add(b2);
		f1.add(l3);
		
		Random rand=new Random();                            //generates random 6 digit numbers in the receipt
		int randint1=rand.nextInt(100000);
		l15=new JLabel("ID no.  :   "+randint1);
		l15.setBounds(100, 50, 300, 100);
		f6.add(l15);
		l16=new JLabel("Movie :");
		l16.setBounds(100, 100, 200, 100);
		f6.add(l16);
		l17=new JLabel("");
		l17.setBounds(150, 100, 200, 100);
		f6.add(l17); 
		l19=new JLabel("Amount payed :");
		l19.setBounds(100,200,200,100);
		f6.add(l19);
		l20=new JLabel(" ");
		f6.add(l20);
		l28=new JLabel("Thank You");
		l28.setFont(l28.getFont().deriveFont(30.0f));
		l28.setBounds(100,350,400,400);
		f6.add(l28);
		l29=new JLabel("");
		
		
		
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);                  // adding action listener on all buttons
		b8.addActionListener(this);
		b9.addActionListener(this);
		b10.addActionListener(this);
		b11.addActionListener(this);
		
		l5.setBounds(200, 150, 200, 100);f2.add(l5);
		r1.setBounds(500, 50, 100, 100);f2.add(r1);
		j1.setBounds(470, 150, 100, 100);f2.add(j1);
		r2.setBounds(700, 50, 100, 100);f2.add(r2);         //setting bounds on components of f2 and adding to f2
		j2.setBounds(695, 150, 100, 100);f2.add(j2);
		r3.setBounds(900, 50, 100, 100);f2.add(r3);
		j3.setBounds(900, 150, 100, 100);f2.add(j3);
		
		b3.setBounds(700, 300, 100, 20);f2.add(b3);
		f1.setVisible(true);
	
	
		f1.setSize(1300, 1000); 
		f1.setLayout(null);
		f2.setLayout(null);
		f4.setLayout(null);                         //setting layout to components of the frame
		f5.setLayout(null);
		f6.setLayout(null);
		f7.setLayout(null);
		f3.setLayout(new GridLayout(1,0));
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String [] args){
		new newticket();
	}
	
	public void actionPerformed(ActionEvent e) {    //detects the respective actions 
		
		String n1=t1.getText();                     //fetching contents of textfield t1
		String n2=t2.getText();                     //fetching contents of textfield t2
		
		if(e.getSource()==b1){                                    //checking for the occurrence of action on b1
			
			if(n1.equals("java4b") && n2.equals("java4b")){       //compparing username and password
				
				f1.setVisible(false);
				f2.setVisible(true);                              //setting visibility to frames f1 f2
				f2.setSize(1300, 400);
			}
			else{
				l3.setText("login failed");                       //if username and password wont match
				l3.setBounds(600, 450, 200, 200);
			}
		}
		
		if(e.getSource()==b2){                                     //checking for the occurrence of action on b2
			f7.setVisible(true);                                   //setting visibility to frames f7,f1
			f7.setSize(800, 500);
			f1.setVisible(false);
		}
		
		if(e.getSource()==b3){                                    //checking for the occurance of action on b3
			f2.setVisible(false);
			f3.setVisible(true);                                  //setting visibility to frames f3 f2
			f3.setSize(1300, 900);		}

		if(e.getSource()==b5){                                    //checking for the occurrence of action on b5
			f3.setVisible(false);
			f4.setVisible(true);                                  //setting visibility to frames f3 f4
			f4.setSize(1300, 1300);		}
		
		if(e.getSource()==b6){                                    //checking for the occurrence of action on b6
			f3.setVisible(false);
			f4.setVisible(true);                                  //setting visibility to frames f3 f4
			f4.setSize(1300, 1300);		} 

		String t=t3.getText();
		
		if(e.getSource()==b7){                                     //checking for the occurrence of action on b7
			f5.setVisible(true);
			f5.setSize(800,500);                                   //setting visibility to frames f5 f4
			f4.setVisible(false);
			l23=new JLabel("Date :    "+t);
			l23.setBounds(100,300,200,100);
			f6.add(l23);l23=new JLabel("Date :    "+t);
			l23.setBounds(100,300,200,100);
			f6.add(l23);
	
		}
		
		
		
		if(e.getSource()==b8){                                    //checking for the occurance of action on b8
			f3.setVisible(true);
			f3.setSize(1300, 900);		
			f4.setVisible(false);
			
		}
		
		 	data =(j4.getItemAt(j4.getSelectedIndex()));                //fetches number of tickets from combo box
		    l18=new JLabel("Number of tickets:  "+data);            
			l18.setBounds(100, 150, 200, 100);
			f6.add(l18);
		
			Object nm=j5.getItemAt(j5.getSelectedIndex());             //fetches class from combo box
			l21=new JLabel("Class :   "+nm);
			l21.setBounds(100, 250, 200, 100);
			f6.add(l21);
			
			Object dt= j6.getItemAt(j6.getSelectedIndex());           //fetches time from combo box  
			l24=new JLabel("Show time : "+dt);
			l24.setBounds(100, 350, 200, 100);
			f6.add(l24);
		
		if(e.getSource()==b9){                                //checking for the occurrence of action on b9
			if(data.equals("1") && nm.equals("Gold")){        //checks number of tickets and class
				
				l13.setText("amount  paid is: 150");
				l13.setBounds(200, 200, 1000, 150);
				l20.setText("150");
				l20.setBounds(200, 200, 100, 100);
								
			}
			
			else
				if(data.equals("2") && nm.equals("Gold")){
				l13.setText("amount  paid is: 300");
				l13.setBounds(200, 200, 1000, 150);
				l20.setText("300");
				l20.setBounds(200, 200, 100, 100);
				
				}
				
			else
				if(data.equals("3") && nm.equals("Gold")){
					l13.setText("amount paid is: 450");
			l13.setBounds(200, 200, 1000, 150);
			l20.setText("450");
			l20.setBounds(200, 200, 100, 100);
			}
			
				else
					if(data.equals("4") && nm.equals("Gold")){
						l13.setText("amount paid is: 600");
			l13.setBounds(200, 200, 1000, 150);
			l20.setText("600");
			l20.setBounds(200, 200, 100, 100);
			}
					
					else
						if(data.equals("5") && nm.equals("Gold")){
						l13.setText("amount  paid is: 750");
			l13.setBounds(200, 200, 1000, 150);	
			l20.setText("750");
			l20.setBounds(200, 200, 100, 100);
			}	
					else
					if(data.equals("6") && nm.equals("Gold")){
						l13.setText("amount paid is: 900");
			l13.setBounds(200, 200, 1000, 150);
			l20.setText("900");
			l20.setBounds(200, 200, 100, 100);
			}
					else
						if(data.equals("7") && nm.equals("Gold")){
						l13.setText("amount paid is: 1050");
			l13.setBounds(200, 200, 1000, 150);
			l20.setText("1050");
			l20.setBounds(200, 200, 100, 100);
			}
					else
						if(data.equals("8") && nm.equals("Gold")){
						l13.setText("amount paid is: 1200");
			l13.setBounds(200, 200, 1000, 150);
			l20.setText("1200");
			l20.setBounds(200, 200, 100, 100);
			}
					else
						if(data.equals("9") && nm.equals("Gold")){
						l13.setText("amount paid is: 1350");
			l13.setBounds(200, 200, 1000, 150);
			l20.setText("1350");
			l20.setBounds(200, 200, 100, 100);
			}
					else
						if(data.equals("10") && nm.equals("Gold")){
						l13.setText("amount paid is: 1500");
			l13.setBounds(200, 200, 1000, 150);
			l20.setText("1500");
			l20.setBounds(200, 200, 100, 100);
			}
						else
							if(data.equals("1") && nm.equals("Platinum")){      //checks number of tickets and class
								
								l13.setText("amount  paid is: 170");
								l13.setBounds(200, 200, 1000, 150);
								l20.setText("170");
								l20.setBounds(200, 200, 100, 100);
												
							}
							
							else
								if(data.equals("2") && nm.equals("Platinum")){
								l13.setText("amount  paid is: 340");
								l13.setBounds(200, 200, 1000, 150);
								l20.setText("340");
								l20.setBounds(200, 200, 100, 100);
								
								}
								
							else
								if(data.equals("3") && nm.equals("Platinum")){
									l13.setText("amount paid is: 510");
							l13.setBounds(200, 200, 1000, 150);
							l20.setText("510");
							l20.setBounds(200, 200, 100, 100);
							}
							
								else
									if(data.equals("4") && nm.equals("Platinum")){
										l13.setText("amount paid is: 680");
							l13.setBounds(200, 200, 1000, 150);
							l20.setText("680");
							l20.setBounds(200, 200, 100, 100);
							}
									
									else
										if(data.equals("5") && nm.equals("Platinum")){
										l13.setText("amount  paid is: 850");
							l13.setBounds(200, 200, 1000, 150);	
							l20.setText("850");
							l20.setBounds(200, 200, 100, 100);
							}	
									else
									if(data.equals("6") && nm.equals("Platinum")){
										l13.setText("amount paid is: 1020");
							l13.setBounds(200, 200, 1000, 150);
							l20.setText("1020");
							l20.setBounds(200, 200, 100, 100);
							}
									else
										if(data.equals("7") && nm.equals("Platinum")){
										l13.setText("amount paid is: 1190");
							l13.setBounds(200, 200, 1000, 150);
							l20.setText("1190");
							l20.setBounds(200, 200, 100, 100);
							}
									else
										if(data.equals("8") && nm.equals("Platinum")){
										l13.setText("amount paid is: 1360");
							l13.setBounds(200, 200, 1000, 150);
							l20.setText("1360");
							l20.setBounds(200, 200, 100, 100);
							}
									else
										if(data.equals("9") && nm.equals("Platinum")){
										l13.setText("amount paid is: 1530");
							l13.setBounds(200, 200, 1000, 150);
							l20.setText("1530");
							l20.setBounds(200, 200, 100, 100);
							}
									else
										if(data.equals("10") && nm.equals("Platinum")){
										l13.setText("amount paid is: 1700");
							l13.setBounds(200, 200, 1000, 150);
							l20.setText("1700");
							l20.setBounds(200, 200, 100, 100);
							}
										else
											if(data.equals("1") && nm.equals("Silver")){            //checks number of tickets and class
												
												l13.setText("amount  paid is: 120");
												l13.setBounds(200, 200, 1000, 150);
												l20.setText("120");
												l20.setBounds(200, 200, 100, 100);
																
											}
											
											else
												if(data.equals("2") && nm.equals("Silver")){
												l13.setText("amount  paid is: 240");
												l13.setBounds(200, 200, 1000, 150);
												l20.setText("240");
												l20.setBounds(200, 200, 100, 100);
												
												}
												
											else
												if(data.equals("3") && nm.equals("Silver")){
													l13.setText("amount paid is: 360");
											l13.setBounds(200, 200, 1000, 150);
											l20.setText("360");
											l20.setBounds(200, 200, 100, 100);
											}
											
												else
													if(data.equals("4") && nm.equals("Silver")){
														l13.setText("amount paid is: 480");
											l13.setBounds(200, 200, 1000, 150);
											l20.setText("480");
											l20.setBounds(200, 200, 100, 100);
											}
													
													else
														if(data.equals("5") && nm.equals("Silver")){
														l13.setText("amount  paid is: 600");
											l13.setBounds(200, 200, 1000, 150);	
											l20.setText("600");
											l20.setBounds(200, 200, 100, 100);
											}	
													else
													if(data.equals("6") && nm.equals("Silver")){
														l13.setText("amount paid is: 720");
											l13.setBounds(200, 200, 1000, 150);
											l20.setText("720");
											l20.setBounds(200, 200, 100, 100);
											}
													else
														if(data.equals("7") && nm.equals("Silver")){
														l13.setText("amount paid is: 840");
											l13.setBounds(200, 200, 1000, 150);
											l20.setText("840");
											l20.setBounds(200, 200, 100, 100);
											}
													else
														if(data.equals("8") && nm.equals("Silver")){
														l13.setText("amount paid is: 960");
											l13.setBounds(200, 200, 1000, 150);
											l20.setText("960");
											l20.setBounds(200, 200, 100, 100);
											}
													else
														if(data.equals("9") && nm.equals("Silver")){
														l13.setText("amount paid is: 1080");
											l13.setBounds(200, 200, 1000, 150);
											l20.setText("1080");
											l20.setBounds(200, 200, 100, 100);
											}
													else
														if(data.equals("10") && nm.equals("Silver")){
														l13.setText("amount paid is: 1200");
											l13.setBounds(200, 200, 1000, 150);
											l20.setText("1200");
											l20.setBounds(200, 200, 100, 100);
											}
						
						
				
			
		}
		 
		if(e.getSource()==b10){                            //checking for the occurrence of action on b10
			f6.setVisible(true);
			f6.setSize(400, 900);
			f5.setVisible(false);
		}
		
		if(e.getSource()==b11){                            //checking for the occurrence of action on b11
			f4.setVisible(true);
			f4.setSize(1300, 1300);
			f5.setVisible(false);
		}
		
		if(e.getSource()==b5)                                
			l17.setText("Spider man Far from home");
		else
			if(e.getSource()==b6)
			l17.setText("Avengers End Game");
		
	
	if(r1.isSelected()){
		Object z1=j1.getItemAt(j1.getSelectedIndex());
		l29.setText(""+z1);
		l29.setFont(l28.getFont().deriveFont(20.0f));
		l29.setBounds(100, 10, 200, 100);
		f6.add(l29);
	}
	else
		if(r2.isSelected()){
			Object z2=j2.getItemAt(j2.getSelectedIndex());        //Radio buttom selection and corresponding combo box 
			l29.setText(""+z2);
			l29.setFont(l28.getFont().deriveFont(20.0f));
			l29.setBounds(100, 10, 200, 100);
			f6.add(l29);
		}else
			if(r3.isSelected()){
				Object z3=j3.getItemAt(j3.getSelectedIndex());
				l29.setText(""+z3);
				l29.setFont(l28.getFont().deriveFont(20.0f));
				l29.setBounds(100, 10, 200, 100);
				f6.add(l29);
			}
	}
	public void mouseClicked(MouseEvent e) {
		f1.setVisible(true);                                    //checks for occurrence of mouse events
		f2.setVisible(false);
	}
	
	public void mousePressed(MouseEvent e) {
		
	}
	
	public void mouseReleased(MouseEvent e) {
		
	}
	
	public void mouseEntered(MouseEvent e) {
		
	}
	
	public void mouseExited(MouseEvent e) {
		
	}
	
}


