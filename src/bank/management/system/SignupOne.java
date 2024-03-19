package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

public class SignupOne extends JFrame implements ActionListener {
	long random;
	JTextField nameTextField,fnameTextField,addressTextField,emailTextField,cityTextField,stateTextField,pincodeTextField;
	JButton next;
	JRadioButton male,female,other,married,unmarried;
        JDateChooser dateChooser;
	SignupOne(){
		setLayout(null);

		Random ran=new Random();
		long random=Math.abs((ran.nextLong()%9000L)+1000L);

        // label for form No:
		JLabel formno=new JLabel("APPLICATION FORM NO."+random);
		formno.setFont(new Font("raleway",Font.BOLD,35));
		formno.setBounds(140,20,600,40);
		add(formno);

        // label for perssonal details
		JLabel personalDetails=new JLabel("page 1: personal Details");
		personalDetails.setFont(new Font("raleway",Font.BOLD,25));
		personalDetails.setBounds(230,70,450,40);
		add(personalDetails);

        // label for Name
		JLabel name=new JLabel("Name :");
		name.setFont(new Font("raleway",Font.BOLD,18));
		name.setBounds(100,120,100,40);
		add(name);

        // add text field for name
		nameTextField=new JTextField();
		nameTextField.setFont(new Font("raleway",Font.BOLD,16));
		nameTextField.setBounds(300,120,400,30);
		add(nameTextField);

        // label for father name:
		JLabel fname=new JLabel(" Father Name :");
		fname.setFont(new Font("raleway",Font.BOLD,18));
		fname.setBounds(96,170,150,40);
		add(fname);

		// add text field for father name
		fnameTextField=new JTextField();
		fnameTextField.setFont(new Font("raleway",Font.BOLD,16));
		fnameTextField.setBounds(300,170,400,30);
		add(fnameTextField);

        // label for Date of birthday
		JLabel dob=new JLabel("Date of Birth :");
		dob.setFont(new Font("raleway",Font.BOLD,18));
		dob.setBounds(96,215,150,40);
		add(dob);

		// add textfiel  for date of birthday
		dateChooser=new JDateChooser();
		dateChooser.setBounds(300,220,400,30);
		
		add(dateChooser);
		//JTextField dobTextField=new JTextField();
		//dobTextField.setFont(new Font("raleway",Font.BOLD,16));
		//dobTextField.setBounds(300,225,400,30);
		//add(dobTextField);



        // label for gender
		JLabel gender=new JLabel("Gender :");
		gender.setFont(new Font("raleway",Font.BOLD,18));
		gender.setBounds(96,260,150,40);
		add(gender);

		//text field for gender
		male=new JRadioButton("Male");
		male.setBounds(300,265,60,30);
		add(male);

                female=new JRadioButton("female");
		female.setBounds(440,265,70,30);
		add(female);

		other=new JRadioButton("Other");
		other.setBounds(580,268,70,30);
		add(other);

		ButtonGroup gendergroup=new ButtonGroup();
		gendergroup.add(male);
		gendergroup.add(female);
		gendergroup.add(other);

		// label for email
		JLabel email=new JLabel("Email :");
		email.setFont(new Font("raleway",Font.BOLD,18));
		email.setBounds(96,305,150,40);
		add(email);

		// add text field for email
		emailTextField=new JTextField();
		emailTextField.setFont(new Font("raleway",Font.BOLD,16));
		emailTextField.setBounds(300,310,400,30);
		add(emailTextField);

        // label for marital satus
		JLabel marital=new JLabel("Marital Status :");
		marital.setFont(new Font("raleway",Font.BOLD,18));
		marital.setBounds(96,350,150,40);
		add(marital);

		//text field for material status
		married=new JRadioButton("Married");
		married.setBounds(300,350,80,30);
		add(married);

		unmarried=new JRadioButton("unmarried");
		unmarried.setBounds(440,350,90,30);
		add(unmarried);

        ButtonGroup marriedgroup=new ButtonGroup();
		marriedgroup.add(married);
		marriedgroup.add(unmarried);


        // label for Address
	    JLabel address=new JLabel("Address :");
		address.setFont(new Font("raleway",Font.BOLD,18));
		address.setBounds(96,395,150,40);
		add(address);

        //add textfield for address
		addressTextField=new JTextField();
		addressTextField.setFont(new Font("raleway",Font.BOLD,16));
		addressTextField.setBounds(300,400,400,30);
		add(addressTextField);

        // label for city
	    JLabel city=new JLabel("city :");
		city.setFont(new Font("raleway",Font.BOLD,18));
		city.setBounds(96,440,150,40);
		add(city);

	    //add Textfield for city
	        cityTextField=new JTextField();
		cityTextField.setFont(new Font("raleway",Font.BOLD,16));
		cityTextField.setBounds(300,450,400,30);
		add(cityTextField);

        // label for State
		JLabel state=new JLabel("State :");
		state.setFont(new Font("raleway",Font.BOLD,18));
		state.setBounds(96,485,150,40);
		add(state);

		 //add Textfield for state
		stateTextField=new JTextField();
		stateTextField.setFont(new Font("raleway",Font.BOLD,16));
		stateTextField.setBounds(300,490,400,30);
		add(stateTextField);

        // label for pincode
		JLabel pincode=new JLabel("Pincode :");
		pincode.setFont(new Font("raleway",Font.BOLD,18));
		pincode.setBounds(96,530,150,40);
		add(pincode);

		 //add Textfield for pincode
		pincodeTextField=new JTextField();
		pincodeTextField.setFont(new Font("raleway",Font.BOLD,16));
		pincodeTextField.setBounds(300,530,400,30);
		add(pincodeTextField);

		 next=new JButton("Next");
		next.setBackground(Color.black);
		next.setForeground(Color.red);
		next.setBounds(620,660,80,30);
                next.addActionListener(this);
		add(next);



		setSize(850,800);
		setLocation(350,10);
		setVisible(true);

	}
        
        public void actionPerformed(ActionEvent ae){
            String formno=""+random;//long
            String name=nameTextField.getText();
            String fname=fnameTextField.getText();
            String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
            String gender = null;
            if(male.isSelected()){
                gender ="Male";
            }else if(female.isSelected()){
                 gender="Female";
            }
            String email=emailTextField.getText();
            String marital=null;
            if(married.isSelected()){
                marital="Married";
            }else if(unmarried.isSelected()){
                marital="unmarried";
            }
            
            String address = addressTextField.getText();
            String city=cityTextField.getText();
            String state=stateTextField.getText();
            String pincode=pincodeTextField.getText();
            
            try{
                if(name.equals("")){
                    JOptionPane.showMessageDialog(null,"name is required");
                    
                }else{
                    Conn c=new Conn();
                    String query="insert into signup values('"+formno+"', '"+name+"', '"+fname+"', '"+dob+"','"+gender+"', '"+email+"', '"+marital+"','"+address+"', '"+city+"', '"+pincode+"', '"+state+"')";
                    c.s.executeUpdate(query);
                    
                    setVisible(false);
                    new SignupTwo(formno).setVisible(true);
                }
            }catch(Exception e){
                System.out.println(e);
            }
          }
        



	public static void main(String[]args){
		 new SignupOne();
	 }
 }
