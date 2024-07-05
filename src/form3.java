import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form3 extends JFrame {
    public JPanel menu3;
    private JLabel img;
    private JButton reg;

    public form3() {
        setTitle("Hobbie");
        setContentPane(menu3);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000, 768);
        setPreferredSize(new Dimension(1000,768));
        setMinimumSize(new Dimension(1000,768));
        pack();
        setVisible(true);
        reg.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new form2();
                setVisible(false);
            }
        });
    }
}
