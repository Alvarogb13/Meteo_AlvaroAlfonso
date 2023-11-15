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
		
		JPanel andalucia = new JPanel();
		andalucia.setLayout(null);
		andalucia.setBorder(new LineBorder(new Color(0, 0, 0)));
		andalucia.setBounds(234, 0, 650, 500);
		contentPane.add(andalucia);
		
		JLabel Landalucia = new JLabel("");
		Landalucia.setIcon(new ImageIcon("C:\\Users\\alvar\\git\\Meteo_AlvaroAlfonso\\T2_AlvaroGuzmanAlfonso\\Imagenes\\andalu.png"));
		Landalucia.setBounds(0, 0, 650, 500);
		andalucia.add(Landalucia);
		
		JPanel andalucia_8_1 = new JPanel();
		andalucia_8_1.setLayout(null);
		andalucia_8_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		andalucia_8_1.setBounds(234, 0, 650, 500);
		contentPane.add(andalucia_8_1);
		
		JLabel valencia = new JLabel("");
		valencia.setIcon(new ImageIcon("C:\\Users\\alvar\\git\\Meteo_AlvaroAlfonso\\T2_AlvaroGuzmanAlfonso\\Imagenes\\valence.png"));
		valencia.setBounds(0, 0, 650, 500);
		andalucia_8_1.add(valencia);
		
		JPanel andalucia_1 = new JPanel();
		andalucia_1.setLayout(null);
		andalucia_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		andalucia_1.setBounds(234, 0, 650, 500);
		contentPane.add(andalucia_1);
		
		JLabel cataluña = new JLabel("");
		cataluña.setIcon(new ImageIcon("C:\\Users\\alvar\\git\\Meteo_AlvaroAlfonso\\T2_AlvaroGuzmanAlfonso\\Imagenes\\catalogne.png"));
		cataluña.setBounds(0, 0, 650, 500);
		andalucia_1.add(cataluña);
		
		JPanel andalucia_2 = new JPanel();
		andalucia_2.setLayout(null);
		andalucia_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		andalucia_2.setBounds(234, 0, 650, 500);
		contentPane.add(andalucia_2);
		
		JLabel extremadura = new JLabel("");
		extremadura.setIcon(new ImageIcon("C:\\Users\\alvar\\git\\Meteo_AlvaroAlfonso\\T2_AlvaroGuzmanAlfonso\\Imagenes\\estremadure.png"));
		extremadura.setBounds(0, 0, 650, 500);
		andalucia_2.add(extremadura);
		
		JPanel andalucia_3 = new JPanel();
		andalucia_3.setLayout(null);
		andalucia_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		andalucia_3.setBounds(234, 0, 650, 500);
		contentPane.add(andalucia_3);
		
		JLabel galicia = new JLabel("");
		galicia.setIcon(new ImageIcon("C:\\Users\\alvar\\git\\Meteo_AlvaroAlfonso\\T2_AlvaroGuzmanAlfonso\\Imagenes\\galice.png"));
		galicia.setBounds(0, 0, 650, 500);
		andalucia_3.add(galicia);
		
		JPanel andalucia_4 = new JPanel();
		andalucia_4.setLayout(null);
		andalucia_4.setBorder(new LineBorder(new Color(0, 0, 0)));
		andalucia_4.setBounds(234, 0, 650, 500);
		contentPane.add(andalucia_4);
		
		JLabel madrid = new JLabel("");
		madrid.setIcon(new ImageIcon("C:\\Users\\alvar\\git\\Meteo_AlvaroAlfonso\\T2_AlvaroGuzmanAlfonso\\Imagenes\\madrid.png"));
		madrid.setBounds(0, 0, 650, 500);
		andalucia_4.add(madrid);
		
		JPanel andalucia_5 = new JPanel();
		andalucia_5.setLayout(null);
		andalucia_5.setBorder(new LineBorder(new Color(0, 0, 0)));
		andalucia_5.setBounds(234, 0, 650, 500);
		contentPane.add(andalucia_5);
		
		JLabel murcia = new JLabel("");
		murcia.setIcon(new ImageIcon("C:\\Users\\alvar\\git\\Meteo_AlvaroAlfonso\\T2_AlvaroGuzmanAlfonso\\Imagenes\\murcie.png"));
		murcia.setBounds(0, 0, 650, 500);
		andalucia_5.add(murcia);
		
		JPanel andalucia_6 = new JPanel();
		andalucia_6.setLayout(null);
		andalucia_6.setBorder(new LineBorder(new Color(0, 0, 0)));
		andalucia_6.setBounds(234, 0, 650, 500);
		contentPane.add(andalucia_6);
		
		JLabel navarra = new JLabel("");
		navarra.setIcon(new ImageIcon("C:\\Users\\alvar\\git\\Meteo_AlvaroAlfonso\\T2_AlvaroGuzmanAlfonso\\Imagenes\\navarre.png"));
		navarra.setBounds(0, 0, 650, 500);
		andalucia_6.add(navarra);
		
		JPanel andalucia_7 = new JPanel();
		andalucia_7.setLayout(null);
		andalucia_7.setBorder(new LineBorder(new Color(0, 0, 0)));
		andalucia_7.setBounds(234, 0, 650, 500);
		contentPane.add(andalucia_7);
		
		JLabel pais_vasco = new JLabel("");
		pais_vasco.setIcon(new ImageIcon("C:\\Users\\alvar\\git\\Meteo_AlvaroAlfonso\\T2_AlvaroGuzmanAlfonso\\Imagenes\\paysbasque.png"));
		pais_vasco.setBounds(0, 0, 650, 500);
		andalucia_7.add(pais_vasco);
		
		JPanel andalucia_8 = new JPanel();
		andalucia_8.setLayout(null);
		andalucia_8.setBorder(new LineBorder(new Color(0, 0, 0)));
		andalucia_8.setBounds(234, 0, 650, 500);
		contentPane.add(andalucia_8);
		
		JLabel larioja = new JLabel("");
		larioja.setIcon(new ImageIcon("C:\\Users\\alvar\\git\\Meteo_AlvaroAlfonso\\T2_AlvaroGuzmanAlfonso\\Imagenes\\rioja.png"));
		larioja.setBounds(0, 0, 650, 500);
		andalucia_8.add(larioja);
		
		JPanel mapa = new JPanel();
		mapa.setBorder(new LineBorder(new Color(0, 0, 0)));
		mapa.setBounds(234, 0, 650, 500);
		contentPane.add(mapa);
		mapa.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\alvar\\git\\Meteo_AlvaroAlfonso\\T2_AlvaroGuzmanAlfonso\\Imagenes\\lamina-mapa-de-espana-con-nombres.jpg"));
		lblNewLabel.setBounds(0, 0, 650, 500);
		mapa.add(lblNewLabel);
		
		JPanel mapa_2 = new JPanel();
		mapa_2.setLayout(null);
		mapa_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		mapa_2.setBounds(234, 0, 650, 500);
		contentPane.add(mapa_2);
		
		JLabel aragon = new JLabel("");
		aragon.setIcon(new ImageIcon("C:\\Users\\alvar\\git\\Meteo_AlvaroAlfonso\\T2_AlvaroGuzmanAlfonso\\Imagenes\\aragon.png"));
		aragon.setBounds(0, 0, 650, 500);
		mapa_2.add(aragon);
		
		JPanel mapa_3 = new JPanel();
		mapa_3.setLayout(null);
		mapa_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		mapa_3.setBounds(234, 0, 650, 500);
		contentPane.add(mapa_3);
		
		JLabel asturias = new JLabel("");
		asturias.setIcon(new ImageIcon("C:\\Users\\alvar\\git\\Meteo_AlvaroAlfonso\\T2_AlvaroGuzmanAlfonso\\Imagenes\\asturies.png"));
		asturias.setBounds(0, 0, 650, 500);
		mapa_3.add(asturias);
		
		JPanel mapa_4 = new JPanel();
		mapa_4.setLayout(null);
		mapa_4.setBorder(new LineBorder(new Color(0, 0, 0)));
		mapa_4.setBounds(234, 0, 650, 500);
		contentPane.add(mapa_4);
		
		JLabel baleares = new JLabel("");
		baleares.setIcon(new ImageIcon("C:\\Users\\alvar\\git\\Meteo_AlvaroAlfonso\\T2_AlvaroGuzmanAlfonso\\Imagenes\\baleares.png"));
		baleares.setBounds(0, 0, 650, 500);
		mapa_4.add(baleares);
		
		JPanel mapa_5 = new JPanel();
		mapa_5.setLayout(null);
		mapa_5.setBorder(new LineBorder(new Color(0, 0, 0)));
		mapa_5.setBounds(234, 0, 650, 500);
		contentPane.add(mapa_5);
		
		JLabel canarias = new JLabel("");
		canarias.setIcon(new ImageIcon("C:\\Users\\alvar\\git\\Meteo_AlvaroAlfonso\\T2_AlvaroGuzmanAlfonso\\Imagenes\\canaries.png"));
		canarias.setBounds(0, 0, 650, 500);
		mapa_5.add(canarias);
		
		JPanel mapa_6 = new JPanel();
		mapa_6.setLayout(null);
		mapa_6.setBorder(new LineBorder(new Color(0, 0, 0)));
		mapa_6.setBounds(234, 0, 650, 500);
		contentPane.add(mapa_6);
		
		JLabel CL = new JLabel("");
		CL.setIcon(new ImageIcon("C:\\Users\\alvar\\git\\Meteo_AlvaroAlfonso\\T2_AlvaroGuzmanAlfonso\\Imagenes\\castilleleon.png"));
		CL.setBounds(0, 0, 650, 500);
		mapa_6.add(CL);
		
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
