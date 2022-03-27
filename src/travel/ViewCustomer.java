

package travel;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class ViewCustomer extends JFrame implements ActionListener{
   
    JButton b2;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,ll1,ll2,ll3,ll4,ll5,ll6,ll7,ll8,ll9;
    
    ViewCustomer(String username){
        setBounds(700,250,870,625);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
             
        l1=new JLabel("Username");
        l1.setBounds(30,50,150,25);
        add(l1);
        
        ll1=new JLabel("");
        ll1.setBounds(220,50,150,25);
        add(ll1);
        
        l2=new JLabel("ID");
        l2.setBounds(30,110,150,25);
        add(l2);
        
        ll2=new JLabel("");
        ll2.setBounds(220,110,150,25);
        add(ll2);
        
        l3=new JLabel("Number");
        l3.setBounds(30,170,150,25);
        add(l3);
        
        ll3=new JLabel("");
        ll3.setBounds(220,170,150,25);
        add(ll3);
        
        l4=new JLabel("Name");
        l4.setBounds(30,230,150,25);
        add(l4);
        
        ll4=new JLabel("");
        ll4.setBounds(220,230,150,25);
        add(ll4);
        
        l5=new JLabel("Gender");
        l5.setBounds(30,290,150,25);
        add(l5);
        
        ll5=new JLabel("");
        ll5.setBounds(220,290,150,25);
        add(ll5);
        
        l6=new JLabel("Country");
        l6.setBounds(500,50,150,25);
        add(l6);
        
        ll6=new JLabel("");
        ll6.setBounds(690,50,150,25);
        add(ll6);
        
        l7=new JLabel("Address");
        l7.setBounds(500,110,150,25);
        add(l7);
        
        ll7=new JLabel("");
        ll7.setBounds(690,110,150,25);
        add(ll7);
        
        l8=new JLabel("Phone");
        l8.setBounds(500,170,150,25);
        add(l8);
        
        ll8=new JLabel("");
        ll8.setBounds(690,170,150,25);
        add(ll8);
        
        l9=new JLabel("Email");
        l9.setBounds(500,230,150,25);
        add(l9);
        
        ll9=new JLabel("");
        ll9.setBounds(690,230,150,25);
        add(ll9);
               
        b2=new JButton("Back");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(350,350,100,25);
        b2.addActionListener(this);
        add(b2);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("travel/icons/viewall.jpg"));
        Image i2=i1.getImage().getScaledInstance(620, 200, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        l10=new JLabel(i3);
        l10.setBounds(20,400,600,200);
        add(l10);
        
        ImageIcon i4=new ImageIcon(ClassLoader.getSystemResource("travel/icons/viewall.jpg"));
        Image i5=i4.getImage().getScaledInstance(620, 200, Image.SCALE_DEFAULT);
        ImageIcon i6=new ImageIcon(i5);
        l11=new JLabel(i3);
        l11.setBounds(600,400,600,200);
        add(l11);
        
        System.out.println(username);
        try{
            Conn c=new Conn();
            ResultSet rs=c.s.executeQuery("Select * from addacustomer where username='"+username+"'");      
            while(rs.next()){
                ll1.setText(rs.getString("username"));
                ll2.setText(rs.getString("id"));
                ll3.setText(rs.getString("number"));
                ll4.setText(rs.getString("name"));
                ll5.setText(rs.getString("gender"));
                ll6.setText(rs.getString("country"));
                ll7.setText(rs.getString("address"));
                ll8.setText(rs.getString("phone"));
                ll9.setText(rs.getString("email"));
            }
            
        }catch(Exception e){
            
        }
    }
    
    public void actionPerformed(ActionEvent ae){if(ae.getSource()==b2){
                    this.setVisible(false);
                    }
    }
    public  static void main(String args[]){
        new ViewCustomer(" ").setVisible(true);
    }
}
