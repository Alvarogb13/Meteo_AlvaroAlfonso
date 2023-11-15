import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Font;

public class Vista extends JFrame {

	private JPanel contentPane;
	private JTextField txtEspaa;

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
		
		JPanel Mapa = new JPanel();
		Mapa.setBorder(new LineBorder(new Color(0, 0, 0)));
		Mapa.setBounds(234, 0, 650, 500);
		contentPane.add(Mapa);
		Mapa.setLayout(null);
		
		JLabel Lmapa = new JLabel("");
		Lmapa.setIcon(new ImageIcon("C:\\Users\\alvar\\git\\Meteo_AlvaroAlfonso\\T2_AlvaroGuzmanAlfonso\\Imagenes\\lamina-mapa-de-espana-con-nombres.jpg"));
		Lmapa.setBounds(0, 0, 650, 500);
		Mapa.add(Lmapa);
		
		JPanel andalucia = new JPanel();
		andalucia.setLayout(null);
		andalucia.setBorder(new LineBorder(new Color(0, 0, 0)));
		andalucia.setBounds(234, 0, 650, 500);
		contentPane.add(andalucia);
		
		JLabel Landalucia = new JLabel("");
		Landalucia.setIcon(new ImageIcon("C:\\Users\\alvar\\git\\Meteo_AlvaroAlfonso\\T2_AlvaroGuzmanAlfonso\\Imagenes\\andalu.png"));
		Landalucia.setBounds(0, 0, 650, 500);
		andalucia.add(Landalucia);
		
		JPanel Valencia = new JPanel();
		Valencia.setLayout(null);
		Valencia.setBorder(new LineBorder(new Color(0, 0, 0)));
		Valencia.setBounds(234, 0, 650, 500);
		contentPane.add(Valencia);
		
		JLabel Lvalencia = new JLabel("");
		Lvalencia.setIcon(new ImageIcon("C:\\Users\\alvar\\git\\Meteo_AlvaroAlfonso\\T2_AlvaroGuzmanAlfonso\\Imagenes\\valence.png"));
		Lvalencia.setBounds(0, 0, 650, 500);
		Valencia.add(Lvalencia);
		
		JPanel Cataluña = new JPanel();
		Cataluña.setLayout(null);
		Cataluña.setBorder(new LineBorder(new Color(0, 0, 0)));
		Cataluña.setBounds(234, 0, 650, 500);
		contentPane.add(Cataluña);
		
		JLabel Lcataluña = new JLabel("");
		Lcataluña.setIcon(new ImageIcon("C:\\Users\\alvar\\git\\Meteo_AlvaroAlfonso\\T2_AlvaroGuzmanAlfonso\\Imagenes\\catalogne.png"));
		Lcataluña.setBounds(0, 0, 650, 500);
		Cataluña.add(Lcataluña);
		
		JPanel Extremadura = new JPanel();
		Extremadura.setLayout(null);
		Extremadura.setBorder(new LineBorder(new Color(0, 0, 0)));
		Extremadura.setBounds(234, 0, 650, 500);
		contentPane.add(Extremadura);
		
		JLabel Lextremadura = new JLabel("");
		Lextremadura.setIcon(new ImageIcon("C:\\Users\\alvar\\git\\Meteo_AlvaroAlfonso\\T2_AlvaroGuzmanAlfonso\\Imagenes\\estremadure.png"));
		Lextremadura.setBounds(0, 0, 650, 500);
		Extremadura.add(Lextremadura);
		
		JPanel Galicia = new JPanel();
		Galicia.setLayout(null);
		Galicia.setBorder(new LineBorder(new Color(0, 0, 0)));
		Galicia.setBounds(234, 0, 650, 500);
		contentPane.add(Galicia);
		
		JLabel Lgalicia = new JLabel("");
		Lgalicia.setIcon(new ImageIcon("C:\\Users\\alvar\\git\\Meteo_AlvaroAlfonso\\T2_AlvaroGuzmanAlfonso\\Imagenes\\galice.png"));
		Lgalicia.setBounds(0, 0, 650, 500);
		Galicia.add(Lgalicia);
		
		JPanel Madrid = new JPanel();
		Madrid.setLayout(null);
		Madrid.setBorder(new LineBorder(new Color(0, 0, 0)));
		Madrid.setBounds(234, 0, 650, 500);
		contentPane.add(Madrid);
		
		JLabel Lmadrid = new JLabel("");
		Lmadrid.setIcon(new ImageIcon("C:\\Users\\alvar\\git\\Meteo_AlvaroAlfonso\\T2_AlvaroGuzmanAlfonso\\Imagenes\\madrid.png"));
		Lmadrid.setBounds(0, 0, 650, 500);
		Madrid.add(Lmadrid);
		
		JPanel Murcia = new JPanel();
		Murcia.setLayout(null);
		Murcia.setBorder(new LineBorder(new Color(0, 0, 0)));
		Murcia.setBounds(234, 0, 650, 500);
		contentPane.add(Murcia);
		
		JLabel Lmurcia = new JLabel("");
		Lmurcia.setIcon(new ImageIcon("C:\\Users\\alvar\\git\\Meteo_AlvaroAlfonso\\T2_AlvaroGuzmanAlfonso\\Imagenes\\murcie.png"));
		Lmurcia.setBounds(0, 0, 650, 500);
		Murcia.add(Lmurcia);
		
		JPanel Navarra = new JPanel();
		Navarra.setLayout(null);
		Navarra.setBorder(new LineBorder(new Color(0, 0, 0)));
		Navarra.setBounds(234, 0, 650, 500);
		contentPane.add(Navarra);
		
		JLabel Lnavarra = new JLabel("");
		Lnavarra.setIcon(new ImageIcon("C:\\Users\\alvar\\git\\Meteo_AlvaroAlfonso\\T2_AlvaroGuzmanAlfonso\\Imagenes\\navarre.png"));
		Lnavarra.setBounds(0, 0, 650, 500);
		Navarra.add(Lnavarra);
		
		JPanel Pais_Vasco = new JPanel();
		Pais_Vasco.setLayout(null);
		Pais_Vasco.setBorder(new LineBorder(new Color(0, 0, 0)));
		Pais_Vasco.setBounds(234, 0, 650, 500);
		contentPane.add(Pais_Vasco);
		
		JLabel Lpais_vasco = new JLabel("");
		Lpais_vasco.setIcon(new ImageIcon("C:\\Users\\alvar\\git\\Meteo_AlvaroAlfonso\\T2_AlvaroGuzmanAlfonso\\Imagenes\\paysbasque.png"));
		Lpais_vasco.setBounds(0, 0, 650, 500);
		Pais_Vasco.add(Lpais_vasco);
		
		JPanel LaRioja = new JPanel();
		LaRioja.setLayout(null);
		LaRioja.setBorder(new LineBorder(new Color(0, 0, 0)));
		LaRioja.setBounds(234, 0, 650, 500);
		contentPane.add(LaRioja);
		
		JLabel Llarioja = new JLabel("");
		Llarioja.setIcon(new ImageIcon("C:\\Users\\alvar\\git\\Meteo_AlvaroAlfonso\\T2_AlvaroGuzmanAlfonso\\Imagenes\\rioja.png"));
		Llarioja.setBounds(0, 0, 650, 500);
		LaRioja.add(Llarioja);
		
		JPanel Aragon = new JPanel();
		Aragon.setLayout(null);
		Aragon.setBorder(new LineBorder(new Color(0, 0, 0)));
		Aragon.setBounds(234, 0, 650, 500);
		contentPane.add(Aragon);
		
		JLabel Laragon = new JLabel("");
		Laragon.setIcon(new ImageIcon("C:\\Users\\alvar\\git\\Meteo_AlvaroAlfonso\\T2_AlvaroGuzmanAlfonso\\Imagenes\\aragon.png"));
		Laragon.setBounds(0, 0, 650, 500);
		Aragon.add(Laragon);
		
		JPanel Asturias = new JPanel();
		Asturias.setLayout(null);
		Asturias.setBorder(new LineBorder(new Color(0, 0, 0)));
		Asturias.setBounds(234, 0, 650, 500);
		contentPane.add(Asturias);
		
		JLabel Lasturias = new JLabel("");
		Lasturias.setIcon(new ImageIcon("C:\\Users\\alvar\\git\\Meteo_AlvaroAlfonso\\T2_AlvaroGuzmanAlfonso\\Imagenes\\asturies.png"));
		Lasturias.setBounds(0, 0, 650, 500);
		Asturias.add(Lasturias);
		
		JPanel Baleares = new JPanel();
		Baleares.setLayout(null);
		Baleares.setBorder(new LineBorder(new Color(0, 0, 0)));
		Baleares.setBounds(234, 0, 650, 500);
		contentPane.add(Baleares);
		
		JLabel Lbaleares = new JLabel("");
		Lbaleares.setIcon(new ImageIcon("C:\\Users\\alvar\\git\\Meteo_AlvaroAlfonso\\T2_AlvaroGuzmanAlfonso\\Imagenes\\baleares.png"));
		Lbaleares.setBounds(0, 0, 650, 500);
		Baleares.add(Lbaleares);
		
		JPanel Canarias = new JPanel();
		Canarias.setLayout(null);
		Canarias.setBorder(new LineBorder(new Color(0, 0, 0)));
		Canarias.setBounds(234, 0, 650, 500);
		contentPane.add(Canarias);
		
		JLabel Lcanarias = new JLabel("");
		Lcanarias.setIcon(new ImageIcon("C:\\Users\\alvar\\git\\Meteo_AlvaroAlfonso\\T2_AlvaroGuzmanAlfonso\\Imagenes\\canaries.png"));
		Lcanarias.setBounds(0, 0, 650, 500);
		Canarias.add(Lcanarias);
		
		JPanel CL = new JPanel();
		CL.setLayout(null);
		CL.setBorder(new LineBorder(new Color(0, 0, 0)));
		CL.setBounds(234, 0, 650, 500);
		contentPane.add(CL);
		
		JLabel cl = new JLabel("");
		cl.setIcon(new ImageIcon("C:\\Users\\alvar\\git\\Meteo_AlvaroAlfonso\\T2_AlvaroGuzmanAlfonso\\Imagenes\\castilleleon.png"));
		cl.setBounds(0, 0, 650, 500);
		CL.add(cl);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBounds(0, 500, 884, 261);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		txtEspaa = new JTextField();
		txtEspaa.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		txtEspaa.setText("ESPAÑA");
		txtEspaa.setBounds(10, 11, 188, 39);
		panel_1.add(txtEspaa);
		txtEspaa.setColumns(10);
		
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
