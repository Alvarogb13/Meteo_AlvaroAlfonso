package View;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import Controller.Controlador;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Window;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Vista extends JFrame {
	
	public JTextField txtEspaa;
	public JPanel Baleares, contentPane, andalucia, Mapa, CL, Valencia, Cataluña, Cantabria
	, Extremadura, Galicia, Madrid, Murcia, Navarra, Pais_Vasco, LaRioja, Aragon, Asturias, Canarias, panel_1, panel_3, panel_2, CM;
	public JLabel Lasturias, Llarioja, Lpais_vasco, Lnavarra, Lmurcia, Lmadrid, Lextremadura, Lvalencia, cl, Lmapa, Landalucia, Lbaleares, Lcataluña, Lgalicia, Laragon, Lcanarias, CastillaM
	, LCantabria;
	public JComboBox comboBox, comboBox_1;
	public JButton BuscarPro, BuscarCM;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Vista frame = new Vista();
					frame.setVisible(true);
					Controlador controlador = new Controlador(frame);
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
		
		Mapa = new JPanel();
		Mapa.setBorder(new LineBorder(new Color(0, 0, 0)));
		Mapa.setBounds(234, 0, 650, 500);
		contentPane.add(Mapa);
		Mapa.setLayout(null);
		
		Lmapa = new JLabel("");
		Lmapa.setIcon(new ImageIcon("C:\\Users\\alvar\\git\\Meteo_AlvaroAlfonso\\T2_AlvaroGuzmanAlfonso\\Imagenes\\espagne.png"));
		Lmapa.setBounds(0, 0, 650, 500);
		Mapa.add(Lmapa);
		
		andalucia = new JPanel();
		andalucia.setLayout(null);
		andalucia.setBorder(new LineBorder(new Color(0, 0, 0)));
		andalucia.setBounds(234, 0, 650, 500);
		contentPane.add(andalucia);
		andalucia.setVisible(false);
		
		Landalucia = new JLabel("");
		Landalucia.setIcon(new ImageIcon("C:\\Users\\alvar\\git\\Meteo_AlvaroAlfonso\\T2_AlvaroGuzmanAlfonso\\Imagenes\\andalousie.jpg"));
		Landalucia.setBounds(0, 0, 650, 500);
		andalucia.add(Landalucia);
		
		Cantabria = new JPanel();
		Cantabria.setLayout(null);
		Cantabria.setBorder(new LineBorder(new Color(0, 0, 0)));
		Cantabria.setBounds(234, 0, 650, 500);
		contentPane.add(Cantabria);
		Cantabria.setVisible(false);
		
		LCantabria = new JLabel("");
		LCantabria.setIcon(new ImageIcon("C:\\Users\\alvar\\git\\Meteo_AlvaroAlfonso\\T2_AlvaroGuzmanAlfonso\\Imagenes\\cantabrie.png"));
		LCantabria.setBounds(0, 0, 650, 500);
		Cantabria.add(LCantabria);
		
		CM = new JPanel();
		CM.setLayout(null);
		CM.setBorder(new LineBorder(new Color(0, 0, 0)));
		CM.setBounds(234, 0, 650, 500);
		contentPane.add(CM);
		
		CastillaM = new JLabel("");
		CastillaM.setIcon(new ImageIcon("C:\\Users\\alvar\\git\\Meteo_AlvaroAlfonso\\T2_AlvaroGuzmanAlfonso\\Imagenes\\castillemancha.png"));
		CastillaM.setBounds(0, 0, 650, 500);
		CM.add(CastillaM);
		
		CL = new JPanel();
		CL.setLayout(null);
		CL.setBorder(new LineBorder(new Color(0, 0, 0)));
		CL.setBounds(234, 0, 650, 500);
		contentPane.add(CL);
		CL.setVisible(false);
		
		cl = new JLabel("");
		cl.setIcon(new ImageIcon("C:\\Users\\alvar\\git\\Meteo_AlvaroAlfonso\\T2_AlvaroGuzmanAlfonso\\Imagenes\\castilleleon.png"));
		cl.setBounds(0, 0, 650, 500);
		CL.add(cl);
		
		Valencia = new JPanel();
		Valencia.setLayout(null);
		Valencia.setBorder(new LineBorder(new Color(0, 0, 0)));
		Valencia.setBounds(234, 0, 650, 500);
		contentPane.add(Valencia);
		Valencia.setVisible(false);
		
		Lvalencia = new JLabel("");
		Lvalencia.setIcon(new ImageIcon("C:\\Users\\alvar\\git\\Meteo_AlvaroAlfonso\\T2_AlvaroGuzmanAlfonso\\Imagenes\\valence.png"));
		Lvalencia.setBounds(0, 0, 650, 500);
		Valencia.add(Lvalencia);
		
		Cataluña = new JPanel();
		Cataluña.setLayout(null);
		Cataluña.setBorder(new LineBorder(new Color(0, 0, 0)));
		Cataluña.setBounds(234, 0, 650, 500);
		contentPane.add(Cataluña);
		Cataluña.setVisible(false);
		
		Lcataluña = new JLabel("");
		Lcataluña.setIcon(new ImageIcon("C:\\Users\\alvar\\git\\Meteo_AlvaroAlfonso\\T2_AlvaroGuzmanAlfonso\\Imagenes\\catalogne.png"));
		Lcataluña.setBounds(0, 0, 650, 500);
		Cataluña.add(Lcataluña);
		
		Extremadura = new JPanel();
		Extremadura.setLayout(null);
		Extremadura.setBorder(new LineBorder(new Color(0, 0, 0)));
		Extremadura.setBounds(234, 0, 650, 500);
		contentPane.add(Extremadura);
		Extremadura.setVisible(false);
		
		Lextremadura = new JLabel("");
		Lextremadura.setIcon(new ImageIcon("C:\\Users\\alvar\\git\\Meteo_AlvaroAlfonso\\T2_AlvaroGuzmanAlfonso\\Imagenes\\estremadure.png"));
		Lextremadura.setBounds(0, 0, 650, 500);
		Extremadura.add(Lextremadura);
		
		Galicia = new JPanel();
		Galicia.setLayout(null);
		Galicia.setBorder(new LineBorder(new Color(0, 0, 0)));
		Galicia.setBounds(234, 0, 650, 500);
		contentPane.add(Galicia);
		Galicia.setVisible(false);
		
		Lgalicia = new JLabel("");
		Lgalicia.setIcon(new ImageIcon("C:\\Users\\alvar\\git\\Meteo_AlvaroAlfonso\\T2_AlvaroGuzmanAlfonso\\Imagenes\\galice.png"));
		Lgalicia.setBounds(0, 0, 650, 500);
		Galicia.add(Lgalicia);
		
		Madrid = new JPanel();
		Madrid.setLayout(null);
		Madrid.setBorder(new LineBorder(new Color(0, 0, 0)));
		Madrid.setBounds(234, 0, 650, 500);
		contentPane.add(Madrid);
		Madrid.setVisible(false);
		
		Lmadrid = new JLabel("");
		Lmadrid.setIcon(new ImageIcon("C:\\Users\\alvar\\git\\Meteo_AlvaroAlfonso\\T2_AlvaroGuzmanAlfonso\\Imagenes\\madrid.png"));
		Lmadrid.setBounds(0, 0, 650, 500);
		Madrid.add(Lmadrid);
		
		Murcia = new JPanel();
		Murcia.setLayout(null);
		Murcia.setBorder(new LineBorder(new Color(0, 0, 0)));
		Murcia.setBounds(234, 0, 650, 500);
		contentPane.add(Murcia);
		Murcia.setVisible(false);
		
		Lmurcia = new JLabel("");
		Lmurcia.setIcon(new ImageIcon("C:\\Users\\alvar\\git\\Meteo_AlvaroAlfonso\\T2_AlvaroGuzmanAlfonso\\Imagenes\\murcie.png"));
		Lmurcia.setBounds(0, 0, 650, 500);
		Murcia.add(Lmurcia);
		
		Navarra = new JPanel();
		Navarra.setLayout(null);
		Navarra.setBorder(new LineBorder(new Color(0, 0, 0)));
		Navarra.setBounds(234, 0, 650, 500);
		contentPane.add(Navarra);
		Navarra.setVisible(false);
		
		Lnavarra = new JLabel("");
		Lnavarra.setIcon(new ImageIcon("C:\\Users\\alvar\\git\\Meteo_AlvaroAlfonso\\T2_AlvaroGuzmanAlfonso\\Imagenes\\navarre.png"));
		Lnavarra.setBounds(0, 0, 650, 500);
		Navarra.add(Lnavarra);
		
		Pais_Vasco = new JPanel();
		Pais_Vasco.setLayout(null);
		Pais_Vasco.setBorder(new LineBorder(new Color(0, 0, 0)));
		Pais_Vasco.setBounds(234, 0, 650, 500);
		contentPane.add(Pais_Vasco);
		Pais_Vasco.setVisible(false);
		
		Lpais_vasco = new JLabel("");
		Lpais_vasco.setIcon(new ImageIcon("C:\\Users\\alvar\\git\\Meteo_AlvaroAlfonso\\T2_AlvaroGuzmanAlfonso\\Imagenes\\paysbasque.png"));
		Lpais_vasco.setBounds(0, 0, 650, 500);
		Pais_Vasco.add(Lpais_vasco);
		
		LaRioja = new JPanel();
		LaRioja.setLayout(null);
		LaRioja.setBorder(new LineBorder(new Color(0, 0, 0)));
		LaRioja.setBounds(234, 0, 650, 500);
		contentPane.add(LaRioja);
		LaRioja.setVisible(false);
		
		Llarioja = new JLabel("");
		Llarioja.setIcon(new ImageIcon("C:\\Users\\alvar\\git\\Meteo_AlvaroAlfonso\\T2_AlvaroGuzmanAlfonso\\Imagenes\\rioja.png"));
		Llarioja.setBounds(0, 0, 650, 500);
		LaRioja.add(Llarioja);
		
		Aragon = new JPanel();
		Aragon.setLayout(null);
		Aragon.setBorder(new LineBorder(new Color(0, 0, 0)));
		Aragon.setBounds(234, 0, 650, 500);
		contentPane.add(Aragon);
		Aragon.setVisible(false);
		
		Laragon = new JLabel("");
		Laragon.setIcon(new ImageIcon("C:\\Users\\alvar\\git\\Meteo_AlvaroAlfonso\\T2_AlvaroGuzmanAlfonso\\Imagenes\\aragon.png"));
		Laragon.setBounds(0, 0, 650, 500);
		Aragon.add(Laragon);
		
		Asturias = new JPanel();
		Asturias.setLayout(null);
		Asturias.setBorder(new LineBorder(new Color(0, 0, 0)));
		Asturias.setBounds(234, 0, 650, 500);
		contentPane.add(Asturias);
		Asturias.setVisible(false);
		
		Lasturias = new JLabel("");
		Lasturias.setIcon(new ImageIcon("C:\\Users\\alvar\\git\\Meteo_AlvaroAlfonso\\T2_AlvaroGuzmanAlfonso\\Imagenes\\asturies.png"));
		Lasturias.setBounds(0, 0, 650, 500);
		Asturias.add(Lasturias);
		
		Baleares = new JPanel();
		Baleares.setLayout(null);
		Baleares.setBorder(new LineBorder(new Color(0, 0, 0)));
		Baleares.setBounds(234, 0, 650, 500);
		contentPane.add(Baleares);
		Baleares.setVisible(false);
		
		Lbaleares = new JLabel("");
		Lbaleares.setIcon(new ImageIcon("C:\\Users\\alvar\\git\\Meteo_AlvaroAlfonso\\T2_AlvaroGuzmanAlfonso\\Imagenes\\baleares.png"));
		Lbaleares.setBounds(0, 0, 650, 500);
		Baleares.add(Lbaleares);
		
		Canarias = new JPanel();
		Canarias.setLayout(null);
		Canarias.setBorder(new LineBorder(new Color(0, 0, 0)));
		Canarias.setBounds(234, 0, 650, 500);
		contentPane.add(Canarias);
		Canarias.setVisible(false);
		
		Lcanarias = new JLabel("");
		Lcanarias.setIcon(new ImageIcon("C:\\Users\\alvar\\git\\Meteo_AlvaroAlfonso\\T2_AlvaroGuzmanAlfonso\\Imagenes\\canaries.png"));
		Lcanarias.setBounds(0, 0, 650, 500);
		Canarias.add(Lcanarias);
		
		panel_1 = new JPanel();
		panel_1.setToolTipText("");
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
		
		comboBox = new JComboBox();
		comboBox.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"COMUNIDAD", "ANDALUCIA", "VALENCIA", "CATALUÑA", "EXTREMADURA", "GALICIA", "MADRID", "MURCIA", "NAVARRA", "PAIS VASCO", "LARIOJA", "ARAGON", "BALEARES", "CANARIAS", "CASTILLAL", "CASTILLAM", "CANTABRIA", "ASTURIAS", "MAPA"}));
		comboBox.setBounds(10, 61, 188, 39);
		panel_1.add(comboBox);
		
		comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"PROVINCIA"}));
		comboBox_1.setBounds(10, 111, 188, 39);
		panel_1.add(comboBox_1);
		
		BuscarPro = new JButton("");
		BuscarPro.setIcon(new ImageIcon("C:\\Users\\alvar\\git\\Meteo_AlvaroAlfonso\\T2_AlvaroGuzmanAlfonso\\Imagenes\\TIK.png"));
		BuscarPro.setBounds(208, 111, 40, 40);
		panel_1.add(BuscarPro);
		
		BuscarCM = new JButton("");
		BuscarCM.setIcon(new ImageIcon("C:\\Users\\alvar\\git\\Meteo_AlvaroAlfonso\\T2_AlvaroGuzmanAlfonso\\Imagenes\\TIK.png"));
		BuscarCM.setBounds(208, 60, 40, 40);
		panel_1.add(BuscarCM);
		
		panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBounds(0, 250, 236, 250);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_3.setBounds(0, 0, 236, 250);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
	}
}
