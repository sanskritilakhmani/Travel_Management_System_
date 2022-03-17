

package travel;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;


public class Signup extends JFrame{
    Signup(){
        setBounds(600,250,900,400); //Location Size
        getContentPane().setBackground(Color.WHITE);
        setLayout(null); //By default border layout
        
        JPanel p1=new JPanel();
        p1.setBackground(new Color(133,196,233));
        p1.setBounds(0,0,500,400);
        p1.setLayout(null);
        add(p1);
        
        JLabel l1=new JLabel("Username");
        l1.setFont(new Font("Tahoma", Font.BOLD ,14));
        l1.setBounds(50,20,125,25);
        p1.add(l1);
        
        JTextField t1=new JTextField();
        t1.setBounds(190,20,180,25);
        t1.setBorder(BorderFactory.createEmptyBorder());
        p1.add(t1);
        
        JLabel l2=new JLabel("Name");
        l2.setFont(new Font("Tahoma", Font.BOLD ,14));
        l2.setBounds(50,60,125,25);
        p1.add(l2);
        
        JTextField t2=new JTextField();
        t2.setBounds(190,60,180,25);
        t2.setBorder(BorderFactory.createEmptyBorder());
        p1.add(t2);
        
        JLabel l3=new JLabel("Password");
        l3.setFont(new Font("Tahoma", Font.BOLD ,14));
        l3.setBounds(50,100,125,25);
        p1.add(l3);
        
        JTextField t3=new JTextField();
        t3.setBounds(190,100,180,25);
        t3.setBorder(BorderFactory.createEmptyBorder());
        p1.add(t3);
        
        JLabel l4=new JLabel("Security Question");
        l4.setFont(new Font("Tahoma", Font.BOLD ,14));
        l4.setBounds(50,140,125,25);
        p1.add(l4);
        
        
        Choice c1=new Choice();
        c1.add("Your Fav Animal?");
        c1.add("Your Fav Food?");
        c1.add("Where do you live?");
    }
    
    public static void main(String agrs[]){
        new Signup().setVisible(true);
        
    }
    
}

