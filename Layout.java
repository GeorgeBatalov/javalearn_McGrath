import javax.swing.*;
import java.awt.*;


class Layout extends JFrame //
{

JPanel pnl = new JPanel(); // создание контейнера JPanel

Container contentPane = getContentPane();

JPanel grid = new JPanel(new GridLayout(3,3));



public Layout()
{

super(" WINDOW SWING MF"); // заголовок название окна 
setSize( 500, 200);
setDefaultCloseOperation( EXIT_ON_CLOSE); // при закрытии программа выходит в cmd
add(pnl);
setVisible(true);

pnl.add(new JButton("Yes"));
pnl.add(new JButton("No"));
pnl.add(new JButton("Decline"));

pnl.add(new JButton("PALKU"));

pnl.add(new JButton("DAVAI"));
grid.add(new JButton("1"));
grid.add(new JButton("2"));
grid.add(new JButton("3"));
grid.add(new JButton("4"));
grid.add(new JButton("OBOTUR"));
grid.add(new JButton("POMOGI"));
contentPane.add("North", pnl);
contentPane.add("Center", grid);
contentPane.add("West", new JButton ("Zapad"));
contentPane.add("East", new JButton ("Vostok"));

}




public static void main (String [] args)
{
Layout gui = new Layout();

}
}