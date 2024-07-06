import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form2 extends JFrame {
    public JPanel menu2;
    private JButton irAlForm3Button;

    public form2() {
        setTitle("Biografía");
        setContentPane(menu2);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(1000,450));
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
        irAlForm3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new form3();
                setVisible(false);
            }
        });
    }
}
