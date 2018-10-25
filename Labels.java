import javax.swing.*;

class Labels extends JFrame
{

JPanel pnl = new JPanel();

ClassLoader ldr = this.getClass().getClassLoader();
java.net.URL tickURL = ldr.getResource("tick.png");
java.net.URL crossURL = ldr.getResource("cross.png");


ImageIcon tick = new ImageIcon(tickURL);
ImageIcon cross = new ImageIcon(crossURL);

JButton btn = new JButton ("PRESS ME ");
JButton tickBtn = new JButton (tick);
JButton crossBtn = new JButton ("STOP", cross);


ImageIcon duke = new ImageIcon("duke.png");
JLabel lbl1 = new JLabel(duke);
JLabel lbl2 = new JLabel("duke isthe talisman of java tech");
JLabel lbl3 = new JLabel("duke", duke, JLabel.CENTER);


public Labels()
{

super(" WINDOW SWING ");
setSize( 2000, 350);
setDefaultCloseOperation( EXIT_ON_CLOSE);
add(pnl);
setVisible(true);

pnl.add(btn);
pnl.add(tickBtn);
pnl.add(crossBtn);

lbl1.setToolTipText("Duke = talisman of Java");
 lbl3.setHorizontalTextPosition( JLabel.CENTER ) ; 
 lbl3.setVerticalTextPosition( JLabel.BOTTOM ) ;
 
 pnl.add( lbl1 ) ; 
 pnl.add( lbl2 ) ; 
 pnl.add( lbl3 ) ;

}

public static void main (String [] args)
{
Labels gui = new Labels();

}
}