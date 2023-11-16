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
	public JPanel Baleares, contentPane, andalucia, Mapa, CL, Valencia, Cataluña, Cantabria
	, Extremadura, Galicia, Madrid, Murcia, Navarra, Pais_Vasco, LaRioja, Aragon, Asturias, Canarias, panel_1, panel_3, panel_2, CM;
	public JLabel Lasturias, Llarioja, Lpais_vasco, Lnavarra, Lmurcia, Lmadrid, Lextremadura, Lvalencia, cl, mapa, Landalucia, Lbaleares, Lcataluña, Lgalicia, Laragon, Lcanarias, CastillaM
	, LCantabria;
	public JComboBox comboBox, comboBox_1;
	public JButton BuscarPro, BuscarCM;
	private JLabel Lespaña;
	private JLabel Ltmax;
	private JLabel Ltmin;
	private JLabel Candalucia;
	private JLabel Cvalencia;
	private JLabel Cbarcelona;
	private JLabel Cnavarra;
	private JLabel Cpaisv;
	private JLabel Casturias;
	private JLabel Cgalicia;
	private JLabel Cml;
	private JLabel Cmurcia;
	private JLabel Cbaleares;
	private JLabel Ccanarias;
	private JLabel Ccantabria;
	private JLabel Caragon;
	private JLabel Clarioja;
	private JLabel Ahuelva;
	private JLabel Asevilla;
	private JLabel Acordoba;
	private JLabel Ajaen;
	private JLabel Agranada;
	private JLabel Aalmeria;
	private JLabel Amalaga;
	private JLabel Acadiz;


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
		
		andalucia = new JPanel();
		andalucia.setLayout(null);
		andalucia.setBorder(new LineBorder(new Color(0, 0, 0)));
		andalucia.setBounds(234, 0, 650, 500);
		contentPane.add(andalucia);
		andalucia.setVisible(false);
		
		Ahuelva = new JLabel("");
		Ahuelva.setBounds(67, 139, 50, 60);
		andalucia.add(Ahuelva);
		
		Asevilla = new JLabel("");
		Asevilla.setBounds(159, 253, 50, 60);
		andalucia.add(Asevilla);
		
		Acordoba = new JLabel("");
		Acordoba.setBounds(299, 155, 50, 60);
		andalucia.add(Acordoba);
		
		Ajaen = new JLabel("");
		Ajaen.setBounds(387, 155, 50, 60);
		andalucia.add(Ajaen);
		
		Agranada = new JLabel("");
		Agranada.setBounds(482, 185, 50, 60);
		andalucia.add(Agranada);
		
		Aalmeria = new JLabel("");
		Aalmeria.setBounds(558, 200, 50, 60);
		andalucia.add(Aalmeria);
		
		Amalaga = new JLabel("");
		Amalaga.setBounds(265, 333, 50, 60);
		andalucia.add(Amalaga);
		
		Acadiz = new JLabel("");
		Acadiz.setBounds(177, 383, 50, 60);
		andalucia.add(Acadiz);
		
		Landalucia = new JLabel("");
		Landalucia.setIcon(new ImageIcon("C:\\Users\\alvar\\git\\Meteo_AlvaroAlfonso\\T2_AlvaroGuzmanAlfonso\\Imagenes\\andalousie.jpg"));
		Landalucia.setBounds(0, 0, 650, 500);
		andalucia.add(Landalucia);
		
		Mapa = new JPanel();
		Mapa.setBorder(new LineBorder(new Color(0, 0, 0)));
		Mapa.setBounds(234, 0, 650, 500);
		contentPane.add(Mapa);
		Mapa.setLayout(null);
		
		JLabel Cextremadura = new JLabel("");
		Cextremadura.setIcon(new ImageIcon("C:\\Users\\alvar\\git\\Meteo_AlvaroAlfonso\\T2_AlvaroGuzmanAlfonso\\Imagenes\\Captura de pantalla 2023-11-16 095534.png"));
		Cextremadura.setBounds(216, 214, 50, 60);
		Mapa.add(Cextremadura);
		
		Candalucia = new JLabel("");
		Candalucia.setIcon(new ImageIcon("C:\\Users\\alvar\\git\\Meteo_AlvaroAlfonso\\T2_AlvaroGuzmanAlfonso\\Imagenes\\Captura de pantalla 2023-11-16 095534.png"));
		Candalucia.setBounds(246, 345, 50, 60);
		Mapa.add(Candalucia);
		
		JLabel Ccm = new JLabel("");
		Ccm.setIcon(new ImageIcon("C:\\Users\\alvar\\git\\Meteo_AlvaroAlfonso\\T2_AlvaroGuzmanAlfonso\\Imagenes\\Captura de pantalla 2023-11-16 095534.png"));
		Ccm.setBounds(304, 214, 50, 60);
		Mapa.add(Ccm);
		
		JLabel Cmadrid = new JLabel("");
		Cmadrid.setIcon(new ImageIcon("C:\\Users\\alvar\\git\\Meteo_AlvaroAlfonso\\T2_AlvaroGuzmanAlfonso\\Imagenes\\Captura de pantalla 2023-11-16 095534.png"));
		Cmadrid.setBounds(304, 154, 50, 60);
		Mapa.add(Cmadrid);
		
		Cvalencia = new JLabel("");
		Cvalencia.setIcon(new ImageIcon("C:\\Users\\alvar\\git\\Meteo_AlvaroAlfonso\\T2_AlvaroGuzmanAlfonso\\Imagenes\\Captura de pantalla 2023-11-16 095534.png"));
		Cvalencia.setBounds(419, 232, 50, 60);
		Mapa.add(Cvalencia);
		
		Cbarcelona = new JLabel("");
		Cbarcelona.setIcon(new ImageIcon("C:\\Users\\alvar\\git\\Meteo_AlvaroAlfonso\\T2_AlvaroGuzmanAlfonso\\Imagenes\\Captura de pantalla 2023-11-16 095534.png"));
		Cbarcelona.setBounds(527, 102, 50, 60);
		Mapa.add(Cbarcelona);
		
		Cnavarra = new JLabel("");
		Cnavarra.setIcon(new ImageIcon("C:\\Users\\alvar\\git\\Meteo_AlvaroAlfonso\\T2_AlvaroGuzmanAlfonso\\Imagenes\\Captura de pantalla 2023-11-16 095534.png"));
		Cnavarra.setBounds(341, 32, 50, 60);
		Mapa.add(Cnavarra);
		
		Cpaisv = new JLabel("");
		Cpaisv.setIcon(new ImageIcon("C:\\Users\\alvar\\git\\Meteo_AlvaroAlfonso\\T2_AlvaroGuzmanAlfonso\\Imagenes\\Captura de pantalla 2023-11-16 095534.png"));
		Cpaisv.setBounds(391, 11, 50, 60);
		Mapa.add(Cpaisv);
		
		Casturias = new JLabel("");
		Casturias.setIcon(new ImageIcon("C:\\Users\\alvar\\git\\Meteo_AlvaroAlfonso\\T2_AlvaroGuzmanAlfonso\\Imagenes\\Captura de pantalla 2023-11-16 095534.png"));
		Casturias.setBounds(216, 0, 50, 60);
		Mapa.add(Casturias);
		
		Cgalicia = new JLabel("");
		Cgalicia.setIcon(new ImageIcon("C:\\Users\\alvar\\git\\Meteo_AlvaroAlfonso\\T2_AlvaroGuzmanAlfonso\\Imagenes\\Captura de pantalla 2023-11-16 095534.png"));
		Cgalicia.setBounds(108, 11, 50, 60);
		Mapa.add(Cgalicia);
		
		Cml = new JLabel("");
		Cml.setIcon(new ImageIcon("C:\\Users\\alvar\\git\\Meteo_AlvaroAlfonso\\T2_AlvaroGuzmanAlfonso\\Imagenes\\Captura de pantalla 2023-11-16 095534.png"));
		Cml.setBounds(259, 115, 50, 60);
		Mapa.add(Cml);
		
		Cmurcia = new JLabel("");
		Cmurcia.setIcon(new ImageIcon("C:\\Users\\alvar\\git\\Meteo_AlvaroAlfonso\\T2_AlvaroGuzmanAlfonso\\Imagenes\\Captura de pantalla 2023-11-16 095534.png"));
		Cmurcia.setBounds(391, 311, 50, 60);
		Mapa.add(Cmurcia);
		
		Cbaleares = new JLabel("");
		Cbaleares.setIcon(new ImageIcon("C:\\Users\\alvar\\git\\Meteo_AlvaroAlfonso\\T2_AlvaroGuzmanAlfonso\\Imagenes\\Captura de pantalla 2023-11-16 095534.png"));
		Cbaleares.setBounds(562, 214, 50, 60);
		Mapa.add(Cbaleares);
		
		Ccanarias = new JLabel("");
		Ccanarias.setIcon(new ImageIcon("C:\\Users\\alvar\\git\\Meteo_AlvaroAlfonso\\T2_AlvaroGuzmanAlfonso\\Imagenes\\Captura de pantalla 2023-11-16 095534.png"));
		Ccanarias.setBounds(64, 429, 50, 60);
		Mapa.add(Ccanarias);
		
		Ccantabria = new JLabel("");
		Ccantabria.setIcon(new ImageIcon("C:\\Users\\alvar\\git\\Meteo_AlvaroAlfonso\\T2_AlvaroGuzmanAlfonso\\Imagenes\\Captura de pantalla 2023-11-16 095534.png"));
		Ccantabria.setBounds(281, 11, 50, 60);
		Mapa.add(Ccantabria);
		
		Caragon = new JLabel("");
		Caragon.setIcon(new ImageIcon("C:\\Users\\alvar\\git\\Meteo_AlvaroAlfonso\\T2_AlvaroGuzmanAlfonso\\Imagenes\\Captura de pantalla 2023-11-16 095534.png"));
		Caragon.setBounds(406, 102, 50, 60);
		Mapa.add(Caragon);
		
		Clarioja = new JLabel("");
		Clarioja.setIcon(new ImageIcon("C:\\Users\\alvar\\git\\Meteo_AlvaroAlfonso\\T2_AlvaroGuzmanAlfonso\\Imagenes\\Captura de pantalla 2023-11-16 095534.png"));
		Clarioja.setBounds(351, 69, 50, 60);
		Mapa.add(Clarioja);
		
		mapa = new JLabel("");
		mapa.setBackground(new Color(255, 255, 255));
		mapa.setIcon(new ImageIcon("C:\\Users\\alvar\\git\\Meteo_AlvaroAlfonso\\T2_AlvaroGuzmanAlfonso\\Imagenes\\espagne.png"));
		mapa.setBounds(0, 0, 650, 500);
		Mapa.add(mapa);
		
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
		
		JLabel DatoTemMax = new JLabel("");
		DatoTemMax.setBackground(new Color(243, 182, 90));
		DatoTemMax.setForeground(new Color(0, 0, 0));
		DatoTemMax.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		DatoTemMax.setBounds(308, 61, 162, 39);
		panel_1.add(DatoTemMax);
		
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
		
		Lespaña = new JLabel("ESPAÑA\r\n");
		Lespaña.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		Lespaña.setBounds(10, 11, 188, 39);
		panel_1.add(Lespaña);
		
		Ltmax = new JLabel("TEM.MAXIMA");
		Ltmax.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		Ltmax.setBounds(308, 11, 188, 39);
		panel_1.add(Ltmax);
		
		Ltmin = new JLabel("TEM.MINIMA");
		Ltmin.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		Ltmin.setBounds(550, 11, 188, 39);
		panel_1.add(Ltmin);
		
		JLabel DatoTemMin = new JLabel("");
		DatoTemMin.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		DatoTemMin.setBounds(550, 61, 162, 39);
		panel_1.add(DatoTemMin);
		
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
