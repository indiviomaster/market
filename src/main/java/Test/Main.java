package Test;
import java.awt.GridLayout;
/*from   w ww  . j ava 2 s. c  o m*/
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main extends JPanel {

    public Main(){
        JButton button = new JButton("w w w.j a v a 2 s . c o m");
        add(button);
        add(new JButton("w w w.j a v a 2 s . com" ));
        add(new JButton("w w w.java2s.com" ));
        add(new JButton("www.j ava 2 s . c o m" ));

        GridLayout gridLayout = new GridLayout();

        setLayout(gridLayout);

        gridLayout.layoutContainer(this);

    }
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.getContentPane().add(new Main());

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200,200);
        frame.setVisible(true);
    }
}