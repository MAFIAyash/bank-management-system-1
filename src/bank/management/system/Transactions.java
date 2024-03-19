package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Transactions extends JFrame implements ActionListener{
    
    JButton deposite,withdraw,fastcash,ministatement,pinchange,balanceenquiry,Exit;
    String pinnumber;
    
    Transactions(String pinnumber){
        this.pinnumber=pinnumber;
        
        setLayout(null);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2=i1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);
        
        JLabel text=new JLabel("plese select your Transactions");
        text.setBounds(235,300,700,35);
        text.setForeground(Color.white);
        text.setFont(new Font("System",Font.BOLD,16));
        image.add(text);
        
        deposite=new JButton("Deposite");
        deposite.setBounds(170,415,150,30);
        deposite.addActionListener(this);
        image.add(deposite);
        
        withdraw=new JButton("Cash withdraw");
        withdraw.setBounds(355,415,150,30);
        withdraw.addActionListener(this);
        image.add(withdraw);
        
        fastcash=new JButton("Fastcash");
        fastcash.setBounds(170,450,150,30);
        fastcash.addActionListener(this);
        image.add(fastcash);
        
        ministatement=new JButton("Mini Statement");
        ministatement.setBounds(355,450,150,30);
        ministatement.addActionListener(this);
        image.add(ministatement);
        
        pinchange=new JButton("Pin Change");
        pinchange.setBounds(170,485,150,30);
        pinchange.addActionListener(this);
        image.add(pinchange);
        
        balanceenquiry=new JButton("Balance Enquiry");
        balanceenquiry.setBounds(355,485,150,30);
        balanceenquiry.addActionListener(this);
        image.add(balanceenquiry);
        
        Exit=new JButton("Exit");
        Exit.setBounds(355,520,150,30);
        Exit.addActionListener(this);
        image.add(Exit);
        
        setSize(900,900);
        setLocation(300,0);
        setUndecorated(true);
        setVisible(true);
    }
      public void actionPerformed(ActionEvent ae){
          if(ae.getSource()==Exit){
              System.exit(0);
          }else if(ae.getSource()==deposite){
              setVisible(false);
              new Deposite(pinnumber).setVisible(true);
          }else if(ae.getSource()==withdraw){
              setVisible(false);
              new Withdraw(pinnumber).setVisible(true);
          }else if(ae.getSource()==fastcash){
              setVisible(false);
              new FastCash(pinnumber).setVisible(true);
          }else if(ae.getSource()==pinchange){
              setVisible(false);
              new PinChange(pinnumber).setVisible(true);
          }else if(ae.getSource()==balanceenquiry){
              setVisible(false);
              new BalanceEnquiry(pinnumber).setVisible(true);
          }else if(ae.getSource()==ministatement){
             
              new MiniStatement(pinnumber).setVisible(true);
          }
          
      }

    public static void main(String args[]) {
        
        new Transactions("");
        
    }
}
