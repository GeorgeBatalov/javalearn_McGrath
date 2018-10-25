import javax.swing.*;

import java.net.*;




class Buttons extends JFrame
{

JPanel pnl = new JPanel();




ClassLoader ldr = this.getClass().getClassLoader();

java.net.URL tickURL = ldr.getResourse("tick.png");
java.net.URL crossURL = ldr.getResourse("cross.png");



ImageIcon tick = new ImageIcon(tickURL);
ImageIcon cross = new ImageIcon(crossURL);




JButton btn = new JButton ("PRESS ME SCUM");
JButton tickBtn = new JButton (tick);
JButton crossBtn = new JButton ("STOP", cross);




public Buttons()
{

super(" WINDOW SWING MF");
setSize( 800, 400);
setDefaultCloseOperation( EXIT_ON_CLOSE);
add(pnl);
setVisible(true);


pnl.add(btn);
pnl.add(tickBtn);
pnl.add(crossBtn);





}




public static void main (String [] args)
{
Buttons gui = new Buttons();



}
}