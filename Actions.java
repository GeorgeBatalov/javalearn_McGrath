import javax.swing.*;
import java.awt.event.*;

class Actions extends JFrame implements ActionListener//
{

JPanel pnl = new JPanel(); // создание контейнера JPanel

JButton btn1 = new JButton ("OBOTUR POMOGI"); 
JButton btn2 = new JButton ("FACES JARAXXUS"); 

JTextArea txtArea = new JTextArea(5,38);

public Actions()

{

super(" you need help? grumpy boy"); // заголовок название окна 
setSize( 500, 200);
setDefaultCloseOperation( EXIT_ON_CLOSE); // при закрытии программа выходит в cmd
add(pnl);
setVisible(true);

pnl.add(btn1);
pnl.add(btn2);
pnl.add(txtArea);

btn2.setEnabled(true);
txtArea.setText("OBOTUR V PUTI");

btn1.addActionListener(this);
btn2.addActionListener(this);


}

public void actionPerformed(ActionEvent event)
{
	
	txtArea.setText(event.getActionCommand()+ " Pressed and deactivated");
	
	if (event.getSource()== btn1)
	{
		btn2.setEnabled(true);
		btn2.setEnabled(false);
	}
	if (event.getSource()== btn2)
	{
		btn1.setEnabled(true);
		btn1.setEnabled(false);
	
	}
}



public static void main (String [] args)
{
Actions gui = new Actions();

}
}