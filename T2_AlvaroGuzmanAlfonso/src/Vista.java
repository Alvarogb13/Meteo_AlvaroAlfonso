import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class Vista extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Vista frame = new Vista();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Vista() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel mapa_1 = new JPanel();
		mapa_1.setLayout(null);
		mapa_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		mapa_1.setBounds(234, 0, 650, 500);
		contentPane.add(mapa_1);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\alvar\\OneDrive\\Documentos\\EFA2\\Desarrollo de Interfaces\\Interaces2\\.metadata\\.plugins\\org.eclipse.core.resources\\.projects\\T2_AlvaroGuzmanAlfonso\\CM.png"));
		lblNewLabel_1.setBounds(0, 0, 650, 500);
		mapa_1.add(lblNewLabel_1);
		
		JPanel mapa = new JPanel();
		mapa.setBorder(new LineBorder(new Color(0, 0, 0)));
		mapa.setBounds(234, 0, 650, 500);
		contentPane.add(mapa);
		mapa.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\alvar\\OneDrive\\Documentos\\EFA2\\Desarrollo de Interfaces\\Interaces2\\.metadata\\.plugins\\org.eclipse.core.resources\\.projects\\T2_AlvaroGuzmanAlfonso\\lamina-mapa-de-espana-con-nombres.jpg"));
		lblNewLabel.setBounds(0, 0, 650, 500);
		mapa.add(lblNewLabel);
		
		JPanel mapa_2 = new JPanel();
		mapa_2.setLayout(null);
		mapa_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		mapa_2.setBounds(234, 0, 650, 500);
		contentPane.add(mapa_2);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(0, 0, 650, 500);
		mapa_2.add(lblNewLabel_2);
		
		JPanel mapa_3 = new JPanel();
		mapa_3.setLayout(null);
		mapa_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		mapa_3.setBounds(234, 0, 650, 500);
		contentPane.add(mapa_3);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(0, 0, 650, 500);
		mapa_3.add(lblNewLabel_3);
		
		JPanel mapa_4 = new JPanel();
		mapa_4.setLayout(null);
		mapa_4.setBorder(new LineBorder(new Color(0, 0, 0)));
		mapa_4.setBounds(234, 0, 650, 500);
		contentPane.add(mapa_4);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setBounds(0, 0, 650, 500);
		mapa_4.add(lblNewLabel_4);
		
		JPanel mapa_5 = new JPanel();
		mapa_5.setLayout(null);
		mapa_5.setBorder(new LineBorder(new Color(0, 0, 0)));
		mapa_5.setBounds(234, 0, 650, 500);
		contentPane.add(mapa_5);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setBounds(0, 0, 650, 500);
		mapa_5.add(lblNewLabel_5);
		
		JPanel mapa_6 = new JPanel();
		mapa_6.setLayout(null);
		mapa_6.setBorder(new LineBorder(new Color(0, 0, 0)));
		mapa_6.setBounds(234, 0, 650, 500);
		contentPane.add(mapa_6);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setBounds(0, 0, 650, 500);
		mapa_6.add(lblNewLabel_6);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBounds(0, 500, 884, 261);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBounds(0, 250, 236, 250);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_3.setBounds(0, 0, 236, 250);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
	}
}
