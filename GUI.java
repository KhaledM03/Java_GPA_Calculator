import javax.swing.JFrame;
import javax.swing.JLabel;

public class GUI {

   public  GUI(){
    JLabel label = new JLabel(); 
    label.setText("GPA Calc"); 
    label.setHorizontalAlignment(JLabel.CENTER);     
    
    JFrame frame = new JFrame(); 
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    frame.add(label); 
    frame.pack(); 
    frame.setSize(400,600);
    frame.setLocationRelativeTo(null); 
    frame.setVisible(true); 
   }
   
}
