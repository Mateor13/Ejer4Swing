import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form1 extends JFrame{
    public JPanel mainPanel;
    private JPasswordField contrasenaTxt;
    private JTextField nombreTxt;
    private JButton aceptarBtn;
    private JLabel valida;
    public form1() {
        setTitle("Login");
        setContentPane(mainPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 300);
        setPreferredSize(new Dimension(500,300));
        setMinimumSize(new Dimension(500,300));
        pack();
        setVisible(true);
        aceptarBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String contrasena = new String(contrasenaTxt.getPassword());
                String nombre = nombreTxt.getText();
                String nombre1 = "Mateor", contrasena1 = "12345";
                if (contrasena.equals(contrasena1) && nombre.equals(nombre1)) {
                    valida.setText("Acceso exitoso");
                    JFrame formu = new JFrame();
                    formu.setContentPane(new form2().menu2);
                    formu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    formu.setSize(1000, 768);
                    formu.setPreferredSize(new Dimension(1000,768));
                    formu.setMinimumSize(new Dimension(1000,768));
                    formu.pack();
                    formu.setVisible(true);
                    setVisible(false);
                }else {
                    valida.setText("Acceso denegado");
                }
            }
        });
    }
}
