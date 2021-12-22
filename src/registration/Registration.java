/*
 * For Burger Manager Project
 */

package registration;

/**
 * Team: Sajid & Iftekhar
 * @author Sajid
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Registration extends JFrame{

    Registration(){
        JPanel leftP, topP, bottomP, merunP, whiteP;
        JLabel nameL, emailL, mobileL, passL, cpassL;
        JTextField nameT, emailT, mobileT, passT, cpassT;
        JButton confirmB;
        Font h1 = new Font(Font.MONOSPACED, Font.BOLD, 40);
        Font h3 = new Font(Font.MONOSPACED, Font.BOLD, 17);
        Color orangClr = new Color(255,160,0);
        Color merunClr = new Color(35,0,0);
        
        // alsdkjflsdf
        bottomP = new JPanel();
        bottomP.setLayout(null);
        bottomP.setBounds(150, 400, 650, 100);
        bottomP.setBackground(Color.white);
        add(bottomP);
        
        confirmB = new JButton("CONFIRM");
        confirmB.setBounds(240, 0, 110, 30);
        confirmB.setBackground(orangClr);
        confirmB.setForeground(merunClr);
        confirmB.setFont(h3);
        bottomP.add(confirmB);
        
        topP = new JPanel();
        topP.setLayout(null);
        topP.setBounds(150, 0, 650, 400);
        topP.setBackground(Color.white);
        add(topP);
        
        nameL = new JLabel("NAME:");
        nameL.setBounds(150, 55, 300, 20);
        nameL.setForeground(Color.black);
        nameL.setFont(h3);
        topP.add(nameL);
        
        nameT = new JTextField();
        nameT.setBounds(150, 75, 300, 25);
        nameT.setBackground(merunClr);
        nameT.setForeground(orangClr);
        nameT.setFont(h3);
        topP.add(nameT);
        
        emailL = new JLabel("E-MAIL:");
        emailL.setBounds(150, 110, 300, 20);
        emailL.setForeground(Color.black);
        emailL.setFont(h3);
        topP.add(emailL);
        
        emailT = new JTextField();
        emailT.setBounds(150, 130, 300, 25);
        emailT.setBackground(merunClr);
        emailT.setForeground(orangClr);
        emailT.setFont(h3);
        topP.add(emailT);
        
        mobileL = new JLabel("MOBILE:");
        mobileL.setBounds(150, 165, 300, 20);
        mobileL.setForeground(Color.black);
        mobileL.setFont(h3);
        topP.add(mobileL);
        
        mobileT = new JTextField();
        mobileT.setBounds(150, 185, 300, 25);
        mobileT.setBackground(merunClr);
        mobileT.setForeground(orangClr);
        mobileT.setFont(h3);
        topP.add(mobileT);
        
        passL = new JLabel("PASSWORD:");
        passL.setBounds(150, 220, 300, 20);
        passL.setForeground(Color.black);
        passL.setFont(h3);
        topP.add(passL);
        
        passT = new JTextField();
        passT.setBounds(150, 240, 300, 25);
        passT.setBackground(merunClr);
        passT.setForeground(orangClr);
        passT.setFont(h3);
        topP.add(passT);
        
        cpassL = new JLabel("CONFIRM PASSWORD:");
        cpassL.setBounds(150, 275, 300, 20);
        cpassL.setForeground(Color.black);
        cpassL.setFont(h3);
        topP.add(cpassL);
        
        cpassT = new JTextField();
        cpassT.setBounds(150, 295, 300, 25);
        cpassT.setBackground(merunClr);
        cpassT.setForeground(orangClr);
        cpassT.setFont(h3);
        topP.add(cpassT);
        
        
        
        leftP = new JPanel();
        leftP.setLayout(null);
        leftP.setBounds(0,0,150,500);
        leftP.setBackground(merunClr);
        add(leftP);
        
        JLabel r,e,g,i,s,t,a,o,n;
        r = new JLabel("R");
        r.setBounds(55, 25, 40, 30);
        r.setFont(h1);
        r.setForeground(orangClr);
        leftP.add(r);
        
        e = new JLabel("E");
        e.setBounds(56, 60, 40, 30);
        e.setFont(h1);
        e.setForeground(orangClr);
        leftP.add(e);
        
        g = new JLabel("G");
        g.setBounds(55, 95, 40, 30);
        g.setFont(h1);
        g.setForeground(orangClr);
        leftP.add(g);
        
        i = new JLabel("I");
        i.setBounds(56, 130, 40, 30);
        i.setFont(h1);
        i.setForeground(orangClr);
        leftP.add(i);
        
        s = new JLabel("S");
        s.setBounds(56, 165, 40, 30);
        s.setFont(h1);
        s.setForeground(orangClr);
        leftP.add(s);
        
        t = new JLabel("T");
        t.setBounds(56, 200, 40, 30);
        t.setFont(h1);
        t.setForeground(orangClr);
        leftP.add(t);
        
        r = new JLabel("R");
        r.setBounds(56, 235, 40, 30);
        r.setFont(h1);
        r.setForeground(orangClr);
        leftP.add(r);
        
        a = new JLabel("A");
        a.setBounds(56, 270, 40, 30);
        a.setFont(h1);
        a.setForeground(orangClr);
        leftP.add(a);
        
        t = new JLabel("T");
        t.setBounds(56, 305, 40, 30);
        t.setFont(h1);
        t.setForeground(orangClr);
        leftP.add(t);
        
        i = new JLabel("I");
        i.setBounds(56, 340, 40, 30);
        i.setFont(h1);
        i.setForeground(orangClr);
        leftP.add(i);
        
        o = new JLabel("O");
        o.setBounds(56, 375, 40, 30);
        o.setFont(h1);
        o.setForeground(orangClr);
        leftP.add(o);
        
        n = new JLabel("N");
        n.setBounds(56, 410, 40, 30);
        n.setFont(h1);
        n.setForeground(orangClr);
        leftP.add(n);
        
        setTitle("Registration");
        setSize(800, 538);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new Registration();
    }
    
}
