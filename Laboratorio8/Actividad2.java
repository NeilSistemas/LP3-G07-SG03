import javax.swing.*;
import java.awt.*;

public class Esquemas {

    public static void main(String[] args) {
        
//FlowLayout
        JFrame frameFlowLayout = new JFrame("FlowLayout - Integrantes: Cristhian, Neil, Joaquin");
        frameFlowLayout.setLayout(new FlowLayout());

        frameFlowLayout.add(new JButton("Botón 1"));
        frameFlowLayout.add(new JButton("Botón 2"));
        frameFlowLayout.add(new JButton("Botón 3"));

        frameFlowLayout.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameFlowLayout.setSize(500, 300);
        
        Dimension screenSize1 = Toolkit.getDefaultToolkit().getScreenSize();
        
        frameFlowLayout.setLocation(screenSize1.width - frameFlowLayout.getWidth(), (screenSize1.height - frameFlowLayout.getHeight()) / 2);

        frameFlowLayout.setVisible(true);

        
//BorderLayout
        JFrame frameBorderLayout = new JFrame("BorderLayout - Integrantes: Cristhian, Neil, Joaquin");
        frameBorderLayout.setLayout(new BorderLayout());

        frameBorderLayout.add(new JLabel("Norte"), BorderLayout.NORTH);
        frameBorderLayout.add(new JLabel("Sur"), BorderLayout.SOUTH);
        frameBorderLayout.add(new JLabel("Este"), BorderLayout.EAST);
        frameBorderLayout.add(new JLabel("Oeste"), BorderLayout.WEST);
        frameBorderLayout.add(new JLabel("Centro"), BorderLayout.CENTER);

        frameBorderLayout.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameBorderLayout.setSize(500, 300);

        Dimension screenSize2 = Toolkit.getDefaultToolkit().getScreenSize();

        frameBorderLayout.setLocation((screenSize2.width - frameBorderLayout.getWidth()) / 2, (screenSize2.height - frameBorderLayout.getHeight()) / 2);
        frameBorderLayout.setVisible(true);
        
        
//GridLayout
        JFrame frameGridLayout = new JFrame("GridLayout - Integrantes: Cristhian, Neil, Joaquin");
        frameGridLayout.setLayout(new GridLayout(3, 2));


        frameGridLayout.add(new JButton("Botón 1"));
        frameGridLayout.add(new JButton("Botón 2"));
        frameGridLayout.add(new JButton("Botón 3"));
        frameGridLayout.add(new JButton("Botón 4"));
        frameGridLayout.add(new JButton("Botón 5"));
        frameGridLayout.add(new JButton("Botón 6"));

        frameGridLayout.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameGridLayout.setSize(500, 300);
        
        frameGridLayout.setVisible(true);
    }
}
