package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class Login extends JFrame implements ActionListener{
    JButton login,clear,signup;
    JTextField cardTextField;
    JPasswordField pinTextField;
    Login(){
        
         setTitle("Atomated teller machine");
         setLayout(null);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2=i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(70,10,100,100);
        add(label);
        
        JLabel text=new JLabel("Welcome to ATM");
        text.setFont(new Font("osward",Font.BOLD,38));
        text.setBounds(200,40,400,40);
        add(text);
        
        // add text field that is box
         cardTextField=new JTextField();
        cardTextField.setBounds(300,150,250,30);
        cardTextField.setFont(new Font("Arial",Font.BOLD,17));
        add(cardTextField);


        JLabel cardno=new JLabel("Card.No :");
        cardno.setFont(new Font("raleway",Font.BOLD,28));
        cardno.setBounds(100,150,150,30);
        add(cardno);
        
        // add text field(box) for pin no.
        pinTextField=new JPasswordField();
        pinTextField.setBounds(300,230,250,30);
        cardTextField.setFont(new Font("Arial",Font.BOLD,17));
        add(pinTextField);
        
        JLabel pin=new JLabel("Pin.NO :");
        pin.setFont(new Font("raleway",Font.BOLD,28));
        pin.setBounds(120,220,400,40);
        add(pin);
        
        // add sign in  button
        login=new JButton("SIGN IN");
        login.setBounds(300,300,100,30);
        login.setForeground(Color.BLACK);
        login.addActionListener(this);
        add(login);
        
        // add clear button
        clear=new JButton("CLEAR");
        clear.setBounds(430,300,100,30);
        clear.setForeground(Color.BLACK);
        clear.addActionListener(this);
        add(clear);
        
        // add sign up  button
        signup=new JButton("SIGN UP");
        signup.setBounds(300,350,230,30);
        signup.setForeground(Color.BLACK);
        signup.addActionListener(this);
        add(signup);
        
        getContentPane().setBackground(Color.white);
        setSize(800,480);
        setVisible(true);
        setLocation(350,200);
}
    public void actionPerformed(ActionEvent ae){
	if(ae.getSource()== clear){
		cardTextField.setText("");
		pinTextField.setText("");
	}
	else if(ae.getSource() ==login){
            Conn conn=new Conn();
            String cardnumber =cardTextField.getText();
            String pinnumber = pinTextField.getText();
            String query="select * from login where cardnumber ='"+cardnumber+"'and pin ='"+pinnumber+"'";
            
            try{
                ResultSet rs = conn.s.executeQuery(query);
                if(rs.next()){
                    setVisible(true);
                    new Transactions(pinnumber).setVisible(true);
                }else{
                    JOptionPane.showMessageDialog(null,"Incorrect card Number or pin");
                }
            }catch(Exception e){
                System.out.println(e);
            }
	}
	else if(ae.getSource()==signup){
            setVisible(false);
            new SignupOne().setVisible(true);
	}
}
    public static void main(String[]args){
        new Login();
        
    }
}