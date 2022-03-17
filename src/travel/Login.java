
package travel;


import javax.swing.*; //import subclasses but not subpackage import explicitly
import java.awt.*;
import javax.swing.border.*;

public class Login extends JFrame {
    Login(){
        //setSize(400,400);
        //setLocation(400,200);
        
        setLayout(null); //Border Layout ,Flow Layout ,GridLayout ,Grid 
        getContentPane().setBackground(Color.WHITE);
        setBounds(500,300,900,400);
        
        JPanel p1= new JPanel(); //For Division start with container's origin
        p1.setBackground(new Color(131,193,233));
        p1.setBounds(0,0,400,400);
        p1.setLayout(null);
        add(p1);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("travel/icons/login.png"));
        Image i2=i1.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel l1=new JLabel(i3);
        l1.setBounds(100,120,200,200);
        p1.add(l1);
        
        JPanel p2=new JPanel();
        p2.setLayout(null);
        p2.setBounds(400,30,450,300);
        add(p2);
        
        JLabel l2=new JLabel("Username");
        l2.setBounds(60,20,100,25);
        l2.setFont(new Font("SAN_SERIF",Font.PLAIN,20));
        p2.add(l2);
        
        JTextField t1=new JTextField();
        t1.setBounds(60,60,300,30);
        t1.setBorder(BorderFactory.createEmptyBorder());
        p2.add(t1);
        
        JLabel l3=new JLabel("Password");
        l3.setBounds(60,110,100,25);
        l3.setFont(new Font("SAN_SERIF",Font.PLAIN,20));
        p2.add(l3);
        
        JPasswordField t2=new JPasswordField();
        t2.setBounds(60,150,300,30);
        t2.setBorder(BorderFactory.createEmptyBorder());
        p2.add(t2);
        
        JButton b1=new JButton("Login");
        b1.setBounds(60,200,130,30);
        b1.setBackground(new Color(133,193,233));
        b1.setForeground(Color.WHITE);
        b1.setBorder(BorderFactory.createEmptyBorder());
        p2.add(b1);
        
        JButton b2=new JButton("Signup");
        b2.setBounds(230,200,130,30);
        b2.setForeground(new Color(133,193,233));
        b2.setBackground(Color.WHITE);
        b2.setBorder(new LineBorder (new Color(133,193,233)));
        p2.add(b2);
        
        JButton b3=new JButton("Forgot Password");
        b3.setBounds(148,250,130,30);
        b3.setForeground(new Color(133,193,233));
        b3.setBackground(Color.WHITE);
        b3.setBorder(new LineBorder (new Color(133,193,233)));
        p2.add(b3);
        
        
        JLabel l4=new JLabel("Trouble in Login......");
        l4.setForeground(Color.red);
        l4.setBounds(300,250,100,30);
        p2.add(l4);
        
        
        setVisible(true);
    }
    
    public static void main(String args[]){
        new Login();
    }
}
