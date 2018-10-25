import javax.swing.*;
import java.awt.*;
class Custom extends JFrame //
{

JPanel pnl = new JPanel(); 

JLabel lbl1 = new JLabel ("PErsonal background"); 	
JLabel lbl2 = new JLabel ("PErsonal frontground2121212");
JLabel lbl3 = new JLabel ("\tPErsonal shrift1111111111");

Color customColor = new Color (0, 0 , 0); 

Font customFont = new Font ("Moonspacedasd", Font.ITALIC, 100); 





 
public Custom()
{

super(" WINDOW SWING MF"); 
setSize( 1000, 400);
setDefaultCloseOperation( EXIT_ON_CLOSE); 
add(pnl);
setVisible(true);

lbl1.setOpaque(true);
lbl1.setBackground(Color.RED); 
lbl1.setForeground (Color.BLACK);
lbl2.setForeground(Color.WHITE); 

lbl3.setForeground(Color.RED); 

pnl.add(lbl1);
pnl.add(lbl2);
pnl.add(lbl3);
}




public static void main (String [] args)
{
Custom gui = new Custom();

}
}