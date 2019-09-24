package banderasHello;


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
import java.awt.GridLayout;
import javax.imageio.ImageIO;


//import javax.swing.JTextField;

class Hola_mundo extends JFrame{
    
     
   
    
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//se instancian botones
      JButton ingb = new JButton ();      
      JButton rusb = new JButton ();
      JButton aleb = new JButton ();
      JButton japb = new JButton ();
      JButton chib = new JButton ();

 JFrame ventana = new JFrame();
 public Hola_mundo(){
 	


 ventana.setSize(800,300);
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
      p.setLayout(new GridLayout(1, 1));
      p.setBounds(0,0,800,300); 
      p.setBackground(Color.yellow);  

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
      
       
     

      
   
        
    
    //ing.setForeground(Color.BLUE);
    //ing.setFont(new Font ("cooper black",Font.BOLD,15));
    
    try {
        
      
    	
      Image imga = ImageIO.read(getClass().getResource("1.jpg"));
        
      ingb.setIcon(new ImageIcon(imga));
      
      ingb.addActionListener( new ActionListener(){
		   public void actionPerformed(ActionEvent event) { 
			   JOptionPane.showMessageDialog(null, "Hello world ese!", "English", JOptionPane.INFORMATION_MESSAGE);
			   
		   }
			   	  });
      
      
      Image imga1 = ImageIO.read(getClass().getResource("2.jpg"));
      
      aleb.addActionListener( new ActionListener(){
		   public void actionPerformed(ActionEvent event) { 
			   JOptionPane.showMessageDialog(null, "Hallo Welt!", "deutsch", JOptionPane.INFORMATION_MESSAGE);
			   
		   }
			   	  });
     
      aleb.setIcon(new ImageIcon(imga1));
      
      Image imga2 = ImageIO.read(getClass().getResource("3.jpg"));
      
      rusb.addActionListener( new ActionListener(){
		   public void actionPerformed(ActionEvent event) { 
			   JOptionPane.showMessageDialog(null, "привет мир товарищ!", "русский", JOptionPane.INFORMATION_MESSAGE);
			   
		   }
			   	  });
      
      rusb.setIcon(new ImageIcon(imga2));
      
      Image imga3 = ImageIO.read(getClass().getResource("4.jpg"));
      
      japb.addActionListener( new ActionListener(){
		   public void actionPerformed(ActionEvent event) { 
			   JOptionPane.showMessageDialog(null, "こんにちは、先生!", "日本人", JOptionPane.INFORMATION_MESSAGE);
			   
		   }
			   	  });
     
      japb.setIcon(new ImageIcon(imga3));
      
      Image imga4 = ImageIO.read(getClass().getResource("5.jpg"));
      
      chib.addActionListener( new ActionListener(){
		   public void actionPerformed(ActionEvent event) { 
			   JOptionPane.showMessageDialog(null, "你好，世界同志!", "中国", JOptionPane.INFORMATION_MESSAGE);
			   
		   }
			   	  });
      
      chib.setIcon(new ImageIcon(imga4));
      
        } catch (Exception ex) {
            System.out.println("hay error de carga en las imagenes");
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
    
  /**
	 * 
	 */
	private static final long serialVersionUID = -1522026861187284281L;

public static void main(String[] args) {
     Hola_mundo metodo = new Hola_mundo();
      metodo.iniciarComponentes();
      
      
    
    }
  

  }

