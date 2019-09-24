package hola_mundo;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import javax.imageio.ImageIO;


//import javax.swing.JTextField;

class Hola_mundo extends JFrame{
    
     
   
    
    
    //se instancian botones
      JButton ingb = new JButton (new ImageIcon("1.jpg"));
      JButton rusb = new JButton ();
      JButton aleb = new JButton ();
      JButton japb = new JButton ();
      JButton chib = new JButton ();

 JFrame ventana = new JFrame();
 public Hola_mundo(){
 	


 ventana.setSize(800,600);
 ventana.setTitle("HOLA MUNDO EN 5 IDIOMAS");
 ventana.setLocation(100,200);
 ventana.setLocationRelativeTo(null);
 ventana.setLayout(null);
 ventana.setBackground(Color.yellow);
 ventana.setMinimumSize(new Dimension(200,200));
 //this.getContentPane().setBackground(Color.red);
 ventana.setDefaultCloseOperation(EXIT_ON_CLOSE);
 

 }


 
  public void iniciarComponentes(){
      JPanel p = new JPanel(); 
      p.setBounds(0,0,800,600); 
      p.setBackground(Color.yellow);  
      //se instancian iconos
      
      
      //se instancian etiquetas
      JLabel etiqueta = new JLabel();
      JLabel img = new JLabel ();
      
      //definir etiqueta de texto      
      etiqueta.setText("Hola mundo en los 5 idiomas mas conocidos ");
      etiqueta.setBounds(85,10,300,90);
      etiqueta.setHorizontalAlignment(SwingConstants.CENTER);
      etiqueta.setForeground(Color.BLUE);  
      //etiqueta.setOpaque(true);
      //etiqueta.setBackground(Color.GREEN);
      etiqueta.setFont(new Font ("arial",Font.PLAIN,15));
      
      
     

      
   
        
    ingb.setBounds(50,300,100,100);
    //ing.setForeground(Color.BLUE);
    //ing.setFont(new Font ("cooper black",Font.BOLD,15));
    
    try {
        
        
      Image imga = ImageIO.read(getClass().getResource("1.jpg"));
      ingb.setIcon(new ImageIcon(imga));
      
      Image imga1 = ImageIO.read(getClass().getResource("2.jpg"));
      aleb.setIcon(new ImageIcon(imga1));
      
      Image imga2 = ImageIO.read(getClass().getResource("3.jpg"));
      rusb.setIcon(new ImageIcon(imga2));
      
      Image imga3 = ImageIO.read(getClass().getResource("4.jpg"));
      japb.setIcon(new ImageIcon(imga3));
      
      Image imga4 = ImageIO.read(getClass().getResource("5.jpg"));
      chib.setIcon(new ImageIcon(imga4));
      
        } catch (Exception ex) {
            System.out.println("hay error de carga");
    System.out.println(ex);
  }
    
    p.add(etiqueta);
    p.add(img);
    p.add(ingb);
    p.add(aleb); 
    p.add(rusb);
    p.add(japb);
    p.add(chib);
    ventana.add(p);
    p.setVisible(true);
    ventana.setVisible(true);
    
  
    


  }
  
  
  
}
public class ClasePrincipal  extends JFrame {
    
  public static void main(String[] args) {
     Hola_mundo metodo = new Hola_mundo();
      metodo.iniciarComponentes();
      
      
    
    }
  

  }


