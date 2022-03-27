

package travel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class ViewPackage extends JFrame implements ActionListener{
    
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l10,l11,l12,l13,l14,l15,l16,l17;
    JButton b1;
    JTextField t1,t2,t3,t4,t5,t6,t7;
    
    ViewPackage(String username){
        setBounds(650,240,900,450);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("travel/icons/bookedDetails.jpg"));
        Image i2=i1.getImage().getScaledInstance(500, 400, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        l10=new JLabel(i3);
        l10.setBounds(450,20,500,400);
        add(l10);
        
        l1=new JLabel("VIEW PACKAGE DETAILS");
        l1.setBounds(60,0,250,30);
        l1.setFont(new Font("Tahoma",Font.PLAIN,20));
        add(l1);
        
        l2=new JLabel("Username");
        l2.setBounds(30,50,100,30);
        add(l2);
        
        l11=new JLabel();
        l11.setBounds(250,50,100,30);
        add(l11);
        
        l3=new JLabel("Package");
        l3.setBounds(30,90,100,30);
        add(l3);
        
        l12=new JLabel();
        l12.setBounds(250,90,100,30);
        add(l12);
        
        l4=new JLabel("Total Persons");
        l4.setBounds(30,130,100,30);
        add(l4);
        
        l13=new JLabel();
        l13.setBounds(250,130,100,30);
        add(l13);
        
        l5=new JLabel("ID");
        l5.setBounds(30,170,100,30);
        add(l5);
        
        l14=new JLabel();
        l14.setBounds(250,170,100,30);
        add(l14);
        
        l6=new JLabel("Number");
        l6.setBounds(30,210,100,30);
        add(l6);
        
        l15=new JLabel();
        l15.setBounds(250,210,100,30);
        add(l15);
        
        l7=new JLabel("Phone");
        l7.setBounds(30,250,100,30);
        add(l7);
        
        l16=new JLabel();
        l16.setBounds(250,250,100,30);
        add(l16);
        
        l8=new JLabel("Price");
        l8.setBounds(30,290,100,30);
        add(l8);
        
        l17=new JLabel();
        l17.setBounds(250,290,100,30);
        add(l17);
        
        try{
            Conn c=new Conn();
            ResultSet rs=c.s.executeQuery("Select * from bookPackage where username='"+username+"'");      
            while(rs.next()){
                l11.setText(rs.getString(1));
                l12.setText(rs.getString(2));
                l13.setText(rs.getString(3));
                l14.setText(rs.getString(4));
                l15.setText(rs.getString(5));
                l16.setText(rs.getString(6));
                l17.setText(rs.getString(7));
                
            }
            
        }catch(Exception e){}
        
        b1=new JButton("BACK");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(130,360,100,25);
        b1.addActionListener(this);
        add(b1);
        
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){
            this.setVisible(false);
        }
    }
    
    public  static void main(String args[]){
        new ViewPackage(" ").setVisible(true);
    }
}
