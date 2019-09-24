package hola_mundo;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
//import javax.swing.JTextField;

public class Hola_mundo  extends JFrame {
    
String resouesta = JOptionPane.showInputDialog(null, "Bienvenido ingresa tu nombre "); 
 public Hola_mundo(){
 this.setSize(500,500);
 setTitle("HOLA MUNDO EN 5 IDIOMAS");
 //setLocation(100,200);
 //setBounds(100,200,500,500);
 setLocationRelativeTo(null);
 
 setMinimumSize(new Dimension(200,200));
 //this.getContentPane().setBackground(Color.red);
 iniciarComponentes();
 setDefaultCloseOperation(EXIT_ON_CLOSE);
 
 }
 
  JButton ing,ale,rus,jap,chi;
  //JPanel panel;
  private void iniciarComponentes(){
      JPanel panel =new JPanel();
      panel.setLayout(null);
      panel.setBackground(Color.yellow);
      this.getContentPane().add(panel);
      JLabel etiqueta = new JLabel();
      etiqueta.setText("Hola mundo en los 5 idiomas mas conocidos ");
      etiqueta.setBounds(85,10,300,90);
      etiqueta.setHorizontalAlignment(SwingConstants.CENTER);
      etiqueta.setForeground(Color.BLUE);  
      //etiqueta.setOpaque(true);
      //etiqueta.setBackground(Color.GREEN);
     etiqueta.setFont(new Font ("arial",Font.PLAIN,15));
      panel.add(etiqueta);
     ImageIcon imga = new ImageIcon("51LXmTtdeFL._SX466_.jpg");
     JLabel img = new JLabel (imga);
     img.setBounds(80,90,300,200);
     img.setIcon(new ImageIcon(imga.getImage().getScaledInstance(img.getWidth(),img.getHeight(),Image.SCALE_SMOOTH)));
      panel.add(img);
      
    JButton  ing = new JButton ();
    ing.setBounds(50,300,100,40);
   // ing.setForeground(Color.BLUE);
    //ing.setFont(new Font ("cooper black",Font.BOLD,15));
    ImageIcon imga2 = new ImageIcon("usa-1960922_960_720.jpg");
    ing.setIcon(new ImageIcon(imga2.getImage().getScaledInstance(img.getWidth(),img.getHeight(),Image.SCALE_SMOOTH)));
    //ing.setVisible(true);
    panel.add(ing);
    JOptionPane.showMessageDialog(null,"HELLO WORD"); 
    
    JButton ale = new JButton ();
    ale.setBounds(160,300,100,40);
    //ale.setForeground(Color.BLUE);
    ImageIcon imga3 = new ImageIcon("bandera-alemania-760x500.jpg");
    ale.setIcon(new ImageIcon(imga3.getImage().getScaledInstance(img.getWidth(),img.getHeight(),Image.SCALE_SMOOTH)));
    panel.add(ale); 
    
    JButton  rus = new JButton ();
    rus.setBounds(280,300,100,40);
   // rus.setForeground(Color.BLUE);
   // rus.setFont(new Font ("cooper black",Font.BOLD,15));
    ImageIcon imga4 = new ImageIcon("bandera-rusia.jpg");
    rus.setIcon(new ImageIcon(imga4.getImage().getScaledInstance(img.getWidth(),img.getHeight(),Image.SCALE_SMOOTH)));
    panel.add(rus);
    
    JButton  jap = new JButton ();
    jap.setBounds(50,350,100,40);
    //jap.setForeground(Color.BLUE);
    //jap.setFont(new Font ("cooper black",Font.BOLD,15));
    ImageIcon imga5 = new ImageIcon("descarga.jpg");
    jap.setIcon(new ImageIcon(imga5.getImage().getScaledInstance(img.getWidth(),img.getHeight(),Image.SCALE_SMOOTH)));
    panel.add(jap);
    
    JButton  chi = new JButton ();
    chi.setBounds(160,350,100,40);
    //chi.setForeground(Color.BLUE);
    //chi.setFont(new Font ("cooper black",Font.BOLD,15));
    ImageIcon imga6 = new ImageIcon("bandera-china-forma-circulo_97458-18.jpg");
    chi.setIcon(new ImageIcon(imga6.getImage().getScaledInstance(img.getWidth(),img.getHeight(),Image.SCALE_SMOOTH)));
    panel.add(chi);
  
    
  }
  
  }



