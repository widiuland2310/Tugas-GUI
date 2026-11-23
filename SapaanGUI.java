import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SapaanGUI extends JFrame {

    private JLabel lblTeks;
    private JButton btnSapa;
    private JButton btnReset;

    public SapaanGUI() {
        setTitle("Program Ida Ayu Widi Ulandari");
        setSize(600, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new BorderLayout());

        JPanel panelTeks = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 40));
        lblTeks = new JLabel("Halo! Selamat Datang. Silahkan Klik Tombol di Bawah Ini.");
        lblTeks.setFont(new Font("Arial", Font.BOLD, 16));
        panelTeks.add(lblTeks);

        JPanel panelTombol = new JPanel(new FlowLayout(FlowLayout.CENTER, 15, 15));
        btnSapa = new JButton("Tampilkan Kata");
        btnReset = new JButton("Reset");
        panelTombol.add(btnSapa);
        panelTombol.add(btnReset);

        add(panelTeks, BorderLayout.CENTER);
        add(panelTombol, BorderLayout.SOUTH);

        btnSapa.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblTeks.setText("Semangat Ya Untuk Menjalani Hari Ini!");
                lblTeks.setForeground(Color.BLUE);
            }
        });

        btnReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblTeks.setText("Halo! Selamat Datang. Silahkan Klik Tombol di Bawah Ini.");
                lblTeks.setForeground(Color.BLACK);
            }
        });

        btnSapa.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                btnSapa.setBackground(Color.LIGHT_GRAY);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                btnSapa.setBackground(null);
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new SapaanGUI().setVisible(true);
        });
    }
}
