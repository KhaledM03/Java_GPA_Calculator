import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUI {
   private JLabel label ; 
   private JFrame frame ; 
   private JPanel panel ; 
   private JButton button; 


   public  GUI(){
   frame = new JFrame() ; 
   button = new JButton() ;
   label = new JLabel("GPA Calc"); 
   
   label.setHorizontalAlignment(JLabel.CENTER);     
    
   panel = new JPanel() ; 
   panel.add(label) ; 
   panel.add(button); 
   button = new JButton("Submit") ;

   frame.add(panel); 
   
   frame.setSize(400,600);
   frame.setLocationRelativeTo(null); 
   frame.setVisible(true); 
   } 
}
