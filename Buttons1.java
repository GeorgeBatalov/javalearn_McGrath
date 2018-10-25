import javax.swing.*;

class Buttons1 extends JFrame
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





public Buttons1()
{

super(" WINDOW SWING ");
setSize( 1000, 350);
setDefaultCloseOperation( EXIT_ON_CLOSE);
add(pnl);
setVisible(true);

pnl.add(btn);
pnl.add(tickBtn);
pnl.add(crossBtn);

}

public static void main (String [] args)
{
Buttons1 gui = new Buttons1();

}
}