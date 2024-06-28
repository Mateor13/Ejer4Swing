import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
      JFrame frame = new JFrame("Aplicación para calcular IVA");
      frame.setContentPane(new form1().mainPanel);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(500,300);
      frame.setPreferredSize(new Dimension(500,300));
      frame.setMinimumSize(new Dimension(500,300));
      frame.pack();
      frame.setVisible(true);
    }
}