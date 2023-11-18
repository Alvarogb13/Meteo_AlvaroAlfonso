package View;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
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

public class Vista extends JFrame{
	
	public JPanel Baleares, contentPane, andalucia, Mapa, CL, Valencia, Catalunia, Cantabria
	, Extremadura, Galicia, Madrid, Murcia, Navarra, Pais_Vasco, LaRioja, Aragon, Asturias, Canarias, panel_1, panel_3, panel_2, CM;
	public JLabel Lasturias, Llarioja, Lpais_vasco, Lnavarra, Lmurcia, Lmadrid, Lextremadura, Lvalencia, Lcl, mapa, Landalucia, Lbaleares, LCatalunia, Lgalicia, Laragon, Lcanarias, LCastillaM
	, LCantabria;
	public JComboBox comboBox, comboBox_1;
	public JButton BuscarPro, BuscarCM;
	public JLabel Lespaña, Ltmax, Ltmin, CAandalucia, CAvalencia, CAbarcelona, CAnavarra
	, CApaisv, CAasturias, CAgalicia, CAml, CAmurcia, CAbaleares, CAcanarias, CAcantabria, CAaragon, CAlarioja, Ahuelva, Asevilla, Acordoba, Ajaen, Agranada, Aalmeria, Amalaga, Acadiz, Valicante
	, Vvalencia, Vcastellon, Clerida, Ctarragona, Cbarcelona, Cgerona , Ecaceres, Ebadajoz, Glacoruña, Gpontebedra, Glugo, Gorense, Mmadrid, Mmurcia, Npamplona, PValava, PVguipuzcua, PVvizcaya, LRlogroño,
	Atreruel, Azaragoza, Ahuesca, Aoviedo, Bibiza, Bformentera, Bcabrera, Bmallorca, Bmenorca, Cpalma, Chierro, Cgomera, Ctenerife, Ccanaria, Cfuenteventura, Clanzarote, DatoTemMin, DatoTemMax
	, Ccantabria, CMtoledo, CMciudadreal, CMalbacete, CMcuenca, CMguadalajara, CLzamora, CLsalamanca, CLavila, CLsegovia, CLsoria, CLburgos, CLpalencia, CLleon, CAmadrid, CAcm, CAextremadura;
	
	//EJEMPLO PARA FUNCIONALIDAD A VER SI FUNSIONA
	public JTextArea textAreaPrueba;


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
		//Aqui tenemos que hacer un refactor y poner la ruta relativa Alvaro porque no me salen las imagenes, el refactor es con control F le pones lo que quieres cambiar (la ruta de abajo hasta antes de Imagenes con la ruta relativa que sera .//src//Imagenes//nombre.png o sin el punto al principio, de todas maneras eso lo vemos luego np
		Mapa = new JPanel();

		Mapa.setBorder(new LineBorder(new Color(0, 0, 0)));
		Mapa.setBounds(234, 0, 650, 500);
		contentPane.add(Mapa);
		Mapa.setLayout(null);
		
		CAextremadura = new JLabel("");
		CAextremadura.setIcon(new ImageIcon("Imagenes/Captura de pantalla 2023-11-16 095534.png"));
		CAextremadura.setBounds(216, 214, 50, 60);
		Mapa.add(CAextremadura);
		
		CAandalucia = new JLabel("");
		CAandalucia.setIcon(new ImageIcon("Imagenes/Captura de pantalla 2023-11-16 095534.png"));
		CAandalucia.setBounds(246, 345, 50, 60);
		Mapa.add(CAandalucia);
		
		CAcm = new JLabel("");
		CAcm.setIcon(new ImageIcon("Imagenes/Captura de pantalla 2023-11-16 095534.png"));
		CAcm.setBounds(304, 214, 50, 60);
		Mapa.add(CAcm);
		
		CAmadrid = new JLabel("");
		CAmadrid.setIcon(new ImageIcon("Imagenes/Captura de pantalla 2023-11-16 095534.png"));
		CAmadrid.setBounds(304, 154, 50, 60);
		Mapa.add(CAmadrid);
		
		CAvalencia = new JLabel("");
		CAvalencia.setIcon(new ImageIcon("Imagenes/Captura de pantalla 2023-11-16 095534.png"));
		CAvalencia.setBounds(419, 232, 50, 60);
		Mapa.add(CAvalencia);
		
		CAbarcelona = new JLabel("");
		CAbarcelona.setIcon(new ImageIcon("Imagenes/Captura de pantalla 2023-11-16 095534.png"));
		CAbarcelona.setBounds(527, 102, 50, 60);
		Mapa.add(CAbarcelona);
		
		CAnavarra = new JLabel("");
		CAnavarra.setIcon(new ImageIcon("Imagenes/Captura de pantalla 2023-11-16 095534.png"));
		CAnavarra.setBounds(341, 32, 50, 60);
		Mapa.add(CAnavarra);
		
		CApaisv = new JLabel("");
		CApaisv.setIcon(new ImageIcon("Imagenes/Captura de pantalla 2023-11-16 095534.png"));
		CApaisv.setBounds(391, 11, 50, 60);
		Mapa.add(CApaisv);
		
		CAasturias = new JLabel("");
		CAasturias.setIcon(new ImageIcon("Imagenes/Captura de pantalla 2023-11-16 095534.png"));
		CAasturias.setBounds(216, 0, 50, 60);
		Mapa.add(CAasturias);
		
		CAgalicia = new JLabel("");
		CAgalicia.setIcon(new ImageIcon("Imagenes/Captura de pantalla 2023-11-16 095534.png"));
		CAgalicia.setBounds(108, 11, 50, 60);
		Mapa.add(CAgalicia);
		
		CAml = new JLabel("");
		CAml.setIcon(new ImageIcon("Imagenes/Captura de pantalla 2023-11-16 095534.png"));
		CAml.setBounds(259, 115, 50, 60);
		Mapa.add(CAml);
		
		CAmurcia = new JLabel("");
		CAmurcia.setIcon(new ImageIcon("Imagenes/Captura de pantalla 2023-11-16 095534.png"));
		CAmurcia.setBounds(391, 311, 50, 60);
		Mapa.add(CAmurcia);
		
		CAbaleares = new JLabel("");
		CAbaleares.setIcon(new ImageIcon("Imagenes/Captura de pantalla 2023-11-16 095534.png"));
		CAbaleares.setBounds(562, 214, 50, 60);
		Mapa.add(CAbaleares);
		
		CAcanarias = new JLabel("");
		CAcanarias.setIcon(new ImageIcon("Imagenes/Captura de pantalla 2023-11-16 095534.png"));
		CAcanarias.setBounds(64, 429, 50, 60);
		Mapa.add(CAcanarias);
		
		CAcantabria = new JLabel("");
		CAcantabria.setIcon(new ImageIcon("Imagenes/Captura de pantalla 2023-11-16 095534.png"));
		CAcantabria.setBounds(281, 11, 50, 60);
		Mapa.add(CAcantabria);
		
		CAaragon = new JLabel("");
		CAaragon.setIcon(new ImageIcon("Imagenes/Captura de pantalla 2023-11-16 095534.png"));
		CAaragon.setBounds(406, 102, 50, 60);
		Mapa.add(CAaragon);
		
		CAlarioja = new JLabel("");
		CAlarioja.setIcon(new ImageIcon("Imagenes/Captura de pantalla 2023-11-16 095534.png"));
		CAlarioja.setBounds(351, 69, 50, 60);
		Mapa.add(CAlarioja);
		
		mapa = new JLabel("");
		mapa.setBackground(new Color(255, 255, 255));
		mapa.setIcon(new ImageIcon("Imagenes/espagne.png"));
		mapa.setBounds(0, 0, 650, 500);
		Mapa.add(mapa);
		
		Canarias = new JPanel();
		Canarias.setLayout(null);
		Canarias.setBorder(new LineBorder(new Color(0, 0, 0)));
		Canarias.setBounds(234, 0, 650, 500);
		contentPane.add(Canarias);
		Canarias.setVisible(false);
		
		Cpalma = new JLabel("");
		Cpalma.setBounds(26, 220, 50, 60);
		Canarias.add(Cpalma);
		
		Chierro = new JLabel("");
		Chierro.setBounds(0, 429, 50, 60);
		Canarias.add(Chierro);
		
		Cgomera = new JLabel("");
		Cgomera.setBounds(106, 363, 50, 60);
		Canarias.add(Cgomera);
		
		Ctenerife = new JLabel("");
		Ctenerife.setBounds(179, 285, 50, 60);
		Canarias.add(Ctenerife);
		
		Ccanaria = new JLabel("");
		Ccanaria.setBounds(326, 346, 50, 60);
		Canarias.add(Ccanaria);
		
		Cfuenteventura = new JLabel("");
		Cfuenteventura.setBounds(544, 220, 50, 60);
		Canarias.add(Cfuenteventura);
		
		Clanzarote = new JLabel("");
		Clanzarote.setBounds(579, 91, 50, 60);
		Canarias.add(Clanzarote);
		
		Lcanarias = new JLabel("");
		Lcanarias.setIcon(new ImageIcon("Imagenes/canaries.png"));
		Lcanarias.setBounds(0, 0, 650, 500);
		Canarias.add(Lcanarias);
		
		Baleares = new JPanel();
		Baleares.setLayout(null);
		Baleares.setBorder(new LineBorder(new Color(0, 0, 0)));
		Baleares.setBounds(234, 0, 650, 500);
		contentPane.add(Baleares);
		Baleares.setVisible(false);
		
		Bibiza = new JLabel("");
		Bibiza.setBounds(31, 346, 50, 60);
		Baleares.add(Bibiza);
		
		Bformentera = new JLabel("");
		Bformentera.setBounds(31, 429, 50, 60);
		Baleares.add(Bformentera);
		
		Bcabrera = new JLabel("");
		Bcabrera.setBounds(333, 276, 50, 60);
		Baleares.add(Bcabrera);
		
		Bmallorca = new JLabel("");
		Bmallorca.setBounds(333, 98, 50, 60);
		Baleares.add(Bmallorca);
		
		Bmenorca = new JLabel("");
		Bmenorca.setBounds(529, 11, 50, 60);
		Baleares.add(Bmenorca);
		
		Lbaleares = new JLabel("");
		Lbaleares.setIcon(new ImageIcon("Imagenes/baleares.png"));
		Lbaleares.setBounds(0, 0, 650, 500);
		Baleares.add(Lbaleares);
		
		Asturias = new JPanel();
		Asturias.setLayout(null);
		Asturias.setBorder(new LineBorder(new Color(0, 0, 0)));
		Asturias.setBounds(234, 0, 650, 500);
		contentPane.add(Asturias);
		Asturias.setVisible(false);
		
		Aoviedo = new JLabel("");
		Aoviedo.setBounds(186, 245, 50, 60);
		Asturias.add(Aoviedo);
		
		Lasturias = new JLabel("");
		Lasturias.setIcon(new ImageIcon("Imagenes/asturies.png"));
		Lasturias.setBounds(0, 0, 650, 500);
		Asturias.add(Lasturias);
		
		Aragon = new JPanel();
		Aragon.setLayout(null);
		Aragon.setBorder(new LineBorder(new Color(0, 0, 0)));
		Aragon.setBounds(234, 0, 650, 500);
		contentPane.add(Aragon);
		Aragon.setVisible(false);
		
		Atreruel = new JLabel("");
		Atreruel.setBounds(236, 343, 50, 60);
		Aragon.add(Atreruel);
		
		Azaragoza = new JLabel("");
		Azaragoza.setBounds(272, 199, 50, 60);
		Aragon.add(Azaragoza);
		
		Ahuesca = new JLabel("");
		Ahuesca.setBounds(375, 111, 50, 60);
		Aragon.add(Ahuesca);
		
		Laragon = new JLabel("");
		Laragon.setIcon(new ImageIcon("srcImagenes/aragon.png"));
		Laragon.setBounds(0, 0, 650, 500);
		Aragon.add(Laragon);
		
		LaRioja = new JPanel();
		LaRioja.setLayout(null);
		LaRioja.setBorder(new LineBorder(new Color(0, 0, 0)));
		LaRioja.setBounds(234, 0, 650, 500);
		contentPane.add(LaRioja);
		LaRioja.setVisible(false);
		
		LRlogroño = new JLabel("");
		LRlogroño.setBounds(197, 246, 50, 60);
		LaRioja.add(LRlogroño);
		
		Llarioja = new JLabel("");
		Llarioja.setIcon(new ImageIcon("Imagenes/rioja.png"));
		Llarioja.setBounds(0, 0, 650, 500);
		LaRioja.add(Llarioja);
		
		Pais_Vasco = new JPanel();
		Pais_Vasco.setLayout(null);
		Pais_Vasco.setBorder(new LineBorder(new Color(0, 0, 0)));
		Pais_Vasco.setBounds(234, 0, 650, 500);
		contentPane.add(Pais_Vasco);
		Pais_Vasco.setVisible(false);
		
		PValava = new JLabel("");
		PValava.setBounds(325, 281, 50, 60);
		Pais_Vasco.add(PValava);
		
		PVguipuzcua = new JLabel("");
		PVguipuzcua.setBounds(363, 190, 50, 60);
		Pais_Vasco.add(PVguipuzcua);
		
		PVvizcaya = new JLabel("");
		PVvizcaya.setBounds(227, 153, 50, 60);
		Pais_Vasco.add(PVvizcaya);
		
		Lpais_vasco = new JLabel("");
		Lpais_vasco.setIcon(new ImageIcon("Imagenes/paysbasque.png"));
		Lpais_vasco.setBounds(0, 0, 650, 500);
		Pais_Vasco.add(Lpais_vasco);
		
		Navarra = new JPanel();
		Navarra.setLayout(null);
		Navarra.setBorder(new LineBorder(new Color(0, 0, 0)));
		Navarra.setBounds(234, 0, 650, 500);
		contentPane.add(Navarra);
		Navarra.setVisible(false);
		
		Npamplona = new JLabel("");
		Npamplona.setBounds(275, 242, 50, 60);
		Navarra.add(Npamplona);
		
		Lnavarra = new JLabel("");
		Lnavarra.setIcon(new ImageIcon("Imagenes/navarre.png"));
		Lnavarra.setBounds(0, 0, 650, 500);
		Navarra.add(Lnavarra);
		
		Murcia = new JPanel();
		Murcia.setLayout(null);
		Murcia.setBorder(new LineBorder(new Color(0, 0, 0)));
		Murcia.setBounds(234, 0, 650, 500);
		contentPane.add(Murcia);
		Murcia.setVisible(false);
		
		Mmurcia = new JLabel("");
		Mmurcia.setBounds(288, 331, 50, 60);
		Murcia.add(Mmurcia);
		
		Lmurcia = new JLabel("");
		Lmurcia.setIcon(new ImageIcon("Imagenes/murcie.png"));
		Lmurcia.setBounds(0, 0, 650, 500);
		Murcia.add(Lmurcia);
		
		Madrid = new JPanel();
		Madrid.setLayout(null);
		Madrid.setBorder(new LineBorder(new Color(0, 0, 0)));
		Madrid.setBounds(234, 0, 650, 500);
		contentPane.add(Madrid);
		Madrid.setVisible(false);
		
		Mmadrid = new JLabel("");
		Mmadrid.setBounds(319, 267, 50, 60);
		Madrid.add(Mmadrid);
		
		Lmadrid = new JLabel("");
		Lmadrid.setIcon(new ImageIcon("Imagenes/madrid.png"));
		Lmadrid.setBounds(0, 0, 650, 500);
		Madrid.add(Lmadrid);
		
		Galicia = new JPanel();
		Galicia.setLayout(null);
		Galicia.setBorder(new LineBorder(new Color(0, 0, 0)));
		Galicia.setBounds(234, 0, 650, 500);
		contentPane.add(Galicia);
		Galicia.setVisible(false);
		
		Glacoruña = new JLabel("");
		Glacoruña.setBounds(251, 158, 50, 60);
		Galicia.add(Glacoruña);
		
		Gpontebedra = new JLabel("");
		Gpontebedra.setBounds(186, 315, 50, 60);
		Galicia.add(Gpontebedra);
		
		Glugo = new JLabel("");
		Glugo.setBounds(352, 383, 50, 60);
		Galicia.add(Glugo);
		
		Gorense = new JLabel("");
		Gorense.setBounds(400, 202, 50, 60);
		Galicia.add(Gorense);
		
		Lgalicia = new JLabel("");
		Lgalicia.setIcon(new ImageIcon("Imagenes/galice.png"));
		Lgalicia.setBounds(0, 0, 650, 500);
		Galicia.add(Lgalicia);
		
		Extremadura = new JPanel();
		Extremadura.setLayout(null);
		Extremadura.setBorder(new LineBorder(new Color(0, 0, 0)));
		Extremadura.setBounds(234, 0, 650, 500);
		contentPane.add(Extremadura);
		Extremadura.setVisible(false);
		
		Ecaceres = new JLabel("");
		Ecaceres.setBounds(308, 185, 50, 60);
		Extremadura.add(Ecaceres);
		
		Ebadajoz = new JLabel("");
		Ebadajoz.setBounds(355, 335, 50, 60);
		Extremadura.add(Ebadajoz);
		
		Lextremadura = new JLabel("");
		Lextremadura.setIcon(new ImageIcon("Imagenes/estremadure.png"));
		Lextremadura.setBounds(0, 0, 650, 500);
		Extremadura.add(Lextremadura);
		
		Catalunia = new JPanel();
		Catalunia.setLayout(null);
		Catalunia.setBorder(new LineBorder(new Color(0, 0, 0)));
		Catalunia.setBounds(234, 0, 650, 500);
		contentPane.add(Catalunia);
		Catalunia.setVisible(false);
		
		Clerida = new JLabel("");
		Clerida.setBounds(149, 191, 50, 60);
		Catalunia.add(Clerida);
		
		Ctarragona = new JLabel("");
		Ctarragona.setBounds(184, 316, 50, 60);
		Catalunia.add(Ctarragona);
		
		Cbarcelona = new JLabel("");
		Cbarcelona.setBounds(323, 270, 50, 60);
		Catalunia.add(Cbarcelona);
		
		Cgerona = new JLabel("");
		Cgerona.setBounds(510, 175, 50, 60);
		Catalunia.add(Cgerona);
		
		LCatalunia = new JLabel("");
		LCatalunia.setIcon(new ImageIcon("Imagenes/catalogne.png"));
		LCatalunia.setBounds(0, 0, 650, 500);
		Catalunia.add(LCatalunia);
		
		Valencia = new JPanel();
		Valencia.setLayout(null);
		Valencia.setBorder(new LineBorder(new Color(0, 0, 0)));
		Valencia.setBounds(234, 0, 650, 500);
		contentPane.add(Valencia);
		Valencia.setVisible(false);
		
		Valicante = new JLabel("");
		Valicante.setBounds(162, 259, 50, 60);
		Valencia.add(Valicante);
		
		Vvalencia = new JLabel("");
		Vvalencia.setBounds(252, 226, 50, 60);
		Valencia.add(Vvalencia);
		
		Vcastellon = new JLabel("");
		Vcastellon.setBounds(453, 259, 50, 60);
		Valencia.add(Vcastellon);
		
		Lvalencia = new JLabel("");
		Lvalencia.setIcon(new ImageIcon("Imagenes/valence.png"));
		Lvalencia.setBounds(0, 0, 650, 500);
		Valencia.add(Lvalencia);
		
		CL = new JPanel();
		CL.setLayout(null);
		CL.setBorder(new LineBorder(new Color(0, 0, 0)));
		CL.setBounds(234, 0, 650, 500);
		contentPane.add(CL);
		CL.setVisible(false);
		
		CLleon = new JLabel("");
		CLleon.setBounds(199, 68, 50, 60);
		CL.add(CLleon);
		
		CLpalencia = new JLabel("");
		CLpalencia.setBounds(280, 84, 50, 60);
		CL.add(CLpalencia);
		
		CLburgos = new JLabel("");
		CLburgos.setBounds(402, 167, 50, 60);
		CL.add(CLburgos);
		
		CLsoria = new JLabel("");
		CLsoria.setBounds(463, 229, 50, 60);
		CL.add(CLsoria);
		
		CLsegovia = new JLabel("");
		CLsegovia.setBounds(325, 321, 50, 60);
		CL.add(CLsegovia);
		
		CLavila = new JLabel("");
		CLavila.setBounds(247, 347, 50, 60);
		CL.add(CLavila);
		
		CLsalamanca = new JLabel("");
		CLsalamanca.setBounds(57, 374, 50, 60);
		CL.add(CLsalamanca);
		
		CLzamora = new JLabel("");
		CLzamora.setBounds(135, 244, 50, 60);
		CL.add(CLzamora);
		
		Lcl = new JLabel("");
		Lcl.setIcon(new ImageIcon("Imagenes/castilleleon.png"));
		Lcl.setBounds(0, 0, 650, 500);
		CL.add(Lcl);
		
		CM = new JPanel();
		CM.setLayout(null);
		CM.setBorder(new LineBorder(new Color(0, 0, 0)));
		CM.setBounds(234, 0, 650, 500);
		contentPane.add(CM);
		
		CMguadalajara = new JLabel("");
		CMguadalajara.setBounds(323, 97, 50, 60);
		CM.add(CMguadalajara);
		
		CMcuenca = new JLabel("");
		CMcuenca.setBounds(367, 217, 50, 60);
		CM.add(CMcuenca);
		
		CMalbacete = new JLabel("");
		CMalbacete.setBounds(415, 379, 50, 60);
		CM.add(CMalbacete);
		
		CMciudadreal = new JLabel("");
		CMciudadreal.setBounds(276, 336, 50, 60);
		CM.add(CMciudadreal);
		
		CMtoledo = new JLabel("");
		CMtoledo.setBounds(115, 200, 50, 60);
		CM.add(CMtoledo);
		
		LCastillaM = new JLabel("");
		LCastillaM.setIcon(new ImageIcon("Imagenes/castillemancha.png"));
		LCastillaM.setBounds(0, 0, 650, 500);
		CM.add(LCastillaM);
		
		Cantabria = new JPanel();
		Cantabria.setLayout(null);
		Cantabria.setBorder(new LineBorder(new Color(0, 0, 0)));
		Cantabria.setBounds(234, 0, 650, 500);
		contentPane.add(Cantabria);
		Cantabria.setVisible(false);
		
		Ccantabria = new JLabel("");
		Ccantabria.setBounds(287, 151, 50, 60);
		Cantabria.add(Ccantabria);
		
		LCantabria = new JLabel("");
		LCantabria.setIcon(new ImageIcon("Imagenes/cantabrie.png"));
		LCantabria.setBounds(0, 0, 650, 500);
		Cantabria.add(LCantabria);
		
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
		Landalucia.setIcon(new ImageIcon("Imagenes/andalousie.jpg"));
		Landalucia.setBounds(0, 0, 650, 500);
		andalucia.add(Landalucia);
		
		panel_1 = new JPanel();
		panel_1.setToolTipText("");
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBounds(0, 500, 884, 261);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		DatoTemMax = new JLabel("");
		DatoTemMax.setBackground(new Color(243, 182, 90));
		DatoTemMax.setForeground(new Color(0, 0, 0));
		DatoTemMax.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		DatoTemMax.setBounds(308, 61, 162, 39);
		panel_1.add(DatoTemMax);
		
		comboBox = new JComboBox();
		comboBox.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"COMUNIDAD", "ANDALUCIA", "VALENCIA", "CATALUNIA", "EXTREMADURA", "GALICIA", "MADRID", "MURCIA", "NAVARRA", "PAIS VASCO", "LARIOJA", "ARAGON", "BALEARES", "CANARIAS", "CASTILLAL", "CASTILLAM", "CANTABRIA", "ASTURIAS", "MAPA"}));
		comboBox.setBounds(10, 61, 188, 39);
		panel_1.add(comboBox);
		
		comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"PROVINCIA"}));
		comboBox_1.setBounds(10, 111, 188, 39);
		panel_1.add(comboBox_1);
		
		BuscarPro = new JButton("");
		BuscarPro.setIcon(new ImageIcon("Imagenes/TIK.png"));
		BuscarPro.setBounds(208, 111, 40, 40);
		panel_1.add(BuscarPro);
		
		BuscarCM = new JButton("");
		BuscarCM.setIcon(new ImageIcon("Imagenes/TIK.png"));
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
		
		DatoTemMin = new JLabel("");
		DatoTemMin.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		DatoTemMin.setBounds(550, 61, 162, 39);
		panel_1.add(DatoTemMin);
		
		//PRUEBA HUMILDE DEL METODO DE OBTENER PRONOSTICO EN LA INTERFAS CON ESTE TEXTAREA
		textAreaPrueba = new JTextArea();
		textAreaPrueba.setBounds(318, 111, 349, 106);
		panel_1.add(textAreaPrueba);
		
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
