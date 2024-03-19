package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SignupTwo extends JFrame implements ActionListener {
	long random;
        JTextField pan,aadhar;
	JButton next;
	JRadioButton syes,sno,eyes,eno;
        JComboBox religion,category,occupation,education,income; 
        String formno;
        
	SignupTwo(String form){
                this.formno=formno;
		setLayout(null);
                setTitle("NEW ACCOUNT APPLICATION FORM- PAGE 2");

        // label for perssonal details
		JLabel additionalDetails=new JLabel("page 2: Additional Details");
		additionalDetails.setFont(new Font("raleway",Font.BOLD,25));
		additionalDetails.setBounds(230,70,450,40);
		add(additionalDetails);

        // label for Name
		JLabel name=new JLabel("Religion :");
		name.setFont(new Font("raleway",Font.BOLD,18));
		name.setBounds(100,120,100,40);
		add(name);

        // add text field for name
		String valReligion[]={"Hindu","Muslim","Chirstian","other"};
		religion = new JComboBox(valReligion);
                religion.setBounds(300,120,400,30);
                religion.setBackground(Color.white);
		add(religion);

        // label for father name:
		JLabel fname=new JLabel(" category :");
		fname.setFont(new Font("raleway",Font.BOLD,18));
		fname.setBounds(96,170,150,40);
		add(fname);

		// add text field for father name
		String valcategory[]={"general","obc","SC","ST","other"};
		category = new JComboBox(valcategory);
                category.setBounds(300,170,400,30);
                category.setBackground(Color.white);
		add(category);
		
        // label for Date of birthday
		JLabel dob=new JLabel("Income :");
		dob.setFont(new Font("raleway",Font.BOLD,18));
		dob.setBounds(96,215,150,40);
		add(dob);
                
                String incomecategory[]={"Null","<1,50,000","<2,50,000","<5,00,000","upto 10,00,000"};
		income = new JComboBox(incomecategory);
                income.setBounds(300,220,400,30);
                income.setBackground(Color.white);
		add(income);
                
        		
	        // label for gender
		JLabel gender=new JLabel("Education");
		gender.setFont(new Font("raleway",Font.BOLD,18));
		gender.setBounds(96,260,150,40);
		add(gender);

		// label for email
		JLabel email=new JLabel("Qualification :");
		email.setFont(new Font("raleway",Font.BOLD,18));
		email.setBounds(100,290,200,30);
		add(email);
                
                //TExtfield for education qualification
                
                String educationvalue []={"NOn gratuate","gratuate","post gratuate","doctrate","other"};
		education = new JComboBox(educationvalue);
                education.setBounds(300,280,400,30);
                education.setBackground(Color.white);
		add(education);
  
                // label for oocupatin
		JLabel marital=new JLabel("Occupation:");
		marital.setFont(new Font("raleway",Font.BOLD,18));
		marital.setBounds(96,350,150,40);
		add(marital);
                
                //textfield for occupation
                String occupationvalue []={"Salaried","self Employee","Bussiness","Student","Retired","other"};
		occupation = new JComboBox(occupationvalue);
                occupation.setBounds(300,350,400,30);
                occupation.setBackground(Color.white);
		add(occupation);

		// label for pan No
	        JLabel pan_no=new JLabel("Pan No :");
		pan_no.setFont(new Font("raleway",Font.BOLD,18));
		pan_no.setBounds(96,395,150,40);
		add(pan_no);

        //add textfield for address
		pan=new JTextField();
		pan.setFont(new Font("raleway",Font.BOLD,16));
		pan.setBounds(300,400,400,30);
		add(pan);

        // label for city
	      JLabel aadhar_no=new JLabel("Aadhar No :");
	      aadhar_no.setFont(new Font("raleway",Font.BOLD,18));
	      aadhar_no.setBounds(96,440,150,40);
              add(aadhar_no);

	    //add Textfield for city
	        aadhar=new JTextField();
		aadhar.setFont(new Font("raleway",Font.BOLD,16));
		aadhar.setBounds(300,450,400,30);
		add(aadhar);

        // label for State
		JLabel state=new JLabel("Senior Citizen :");
		state.setFont(new Font("raleway",Font.BOLD,18));
		state.setBounds(96,485,150,40);
		add(state);
                
                syes=new JRadioButton("Yes");
		syes.setBounds(300,490,80,30);
		add(syes);
                
                sno=new JRadioButton("No");
		sno.setBounds(400,490,80,30);
		add(sno);
                
                ButtonGroup marriedgroup=new ButtonGroup();
		marriedgroup.add(syes);
		marriedgroup.add(sno);

		 

        // label for pincode
		JLabel pincode=new JLabel("Existing  Account :");
		pincode.setFont(new Font("raleway",Font.BOLD,18));
		pincode.setBounds(96,530,170,40);
		add(pincode);
                
                eyes=new JRadioButton("Yes");
		eyes.setBounds(300,540,80,30);
		add(eyes);
                
                eno=new JRadioButton("No");
		eno.setBounds(400,540,80,30);
		add(eno);

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
            String sreligion=(String)religion.getSelectedItem();
            String scategory=(String)category.getSelectedItem();
            String sincome= (String)income.getSelectedItem();
            String seducation =(String)education.getSelectedItem();
            String soccupation=(String)occupation.getSelectedItem();
            String seniorcitizen=null;
            if(syes.isSelected()){
                seniorcitizen ="Yes";
            }else if(sno.isSelected()){
                 seniorcitizen="No";
            }
            
            String exisitingaccount=null;
            if(eyes.isSelected()){
               exisitingaccount="Yes";
            }else if(eno.isSelected()){
               exisitingaccount="No";
            }
            
            String span = pan.getText();
            String saadhar=aadhar.getText();
            
            
            try{
                Conn c=new Conn();
                String query="insert into signuptwo values('"+formno+"', '"+sreligion+"', '"+scategory+"', '"+sincome+"','"+seducation+"', '"+soccupation+"', '"+span+"','"+saadhar+"', '"+seniorcitizen+"', '"+exisitingaccount+"')";
                c.s.executeUpdate(query);
                
                //signup3 object
                setVisible(false);
                new SignupThree(formno).setVisible(true);
                
            }catch(Exception e){
                System.out.println(e);
            }
          }
        



	public static void main(String[]args){
		 new SignupTwo("");
	 }
 }
