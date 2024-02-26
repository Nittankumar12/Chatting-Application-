//package chatting.application2;
//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
////import java.awt.event.*;
////import javax.swing.border.LineBorder;
//public class FrontPage extends JFrame implements ActionListener{
//        JButton loginButton,clearButton,signupButton;
//
//    FrontPage(){
//        
//        setTitle("Chat Application");
//        setLayout(null);
//        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/chat.png"));
//
//        Image i2  = i1.getImage().getScaledInstance(180,180,Image.SCALE_DEFAULT);
////        i2.setBackground(Color.white);
//        ImageIcon i3 = new ImageIcon(i2);
//        
//        JLabel label = new JLabel(i3);
//        label.setBounds(30,30,200,200);
//        label.setForeground(new Color(162, 14, 55));
//        add(label);
//        
//        getContentPane().setBackground(new Color(162, 14, 55));
//        
//        JLabel text = new JLabel("Chat with Us");
//        text.setBounds(250,40,400,40);
//        text.setFont(new Font("Serif",Font.BOLD,36));
//        text.setForeground(new Color(251, 188, 9));
//        add(text);
//        
//        loginButton = new JButton("Group");
//        loginButton.setFont(new Font("Serif",Font.BOLD,18));
//        loginButton.setBackground(Color.black);
//        loginButton.setForeground(new Color(251, 188, 9));
//        loginButton.setBounds(600,300,100,40);
//        loginButton.addActionListener(this);
//        add(loginButton);
//        
//        clearButton = new JButton("Exit");
//        clearButton.setFont(new Font("Serif",Font.BOLD,18));
//        clearButton.setBackground(Color.black);
//        clearButton.setForeground(new Color(251, 188, 9));
//        clearButton.setBounds(240,300,100,40);
//        clearButton.addActionListener(this);
//        add(clearButton);
//        
//        signupButton = new JButton("Chat");
//        signupButton.setFont(new Font("Serif",Font.BOLD,18));
//        signupButton.setBackground(Color.black);
//        signupButton.setForeground(new Color(251, 188, 9));
//        signupButton.setBounds(410,300,100,40);
//        signupButton.addActionListener(this);
//        add(signupButton);
//
//        setSize(800,480);
//        setVisible(true);
//        setLocation(350,200);
//        
//    }
//    public void actionPerformed(ActionEvent ae){
//        if(ae.getSource() == clearButton){
//            setVisible(false);
//        }else if(ae.getSource() == signupButton){
//            new Server().setVisible(true);
//            new Client().setVisible(true);
//        }else if(ae.getSource() == loginButton){
//            setVisible(false);
//        }
//    }
//    public static void main(String[] args) {
//        new FrontPage();
//    }
//}
