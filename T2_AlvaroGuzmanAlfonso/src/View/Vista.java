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
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

import java.awt.Font;
import java.awt.Window;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;

public class Vista extends JFrame{
	
	public JPanel Baleares, contentPane, andalucia, Mapa, CL, Valencia, Catalunia, Cantabria
	, Extremadura, Galicia, Madrid, Murcia, Navarra, Pais_Vasco, LaRioja, Aragon, Asturias, Canarias, mando, CM;
	public JLabel Lasturias, Llarioja, Lpais_vasco, Lnavarra, Lmurcia, Lmadrid, Lextremadura, Lvalencia, Lcl, mapa, Landalucia, Lbaleares, LCatalunia, Lgalicia, Laragon, Lcanarias, LCastillaM
	, LCantabria;
	public JComboBox comboBox, comboBox_1;
	public JButton BuscarPro, BuscarCM;
	public JLabel CAandalucia, CAvalencia, CAbarcelona, CAnavarra
	, CApaisv, CAasturias, CAgalicia, CAml, CAmurcia, CAbaleares, CAcanarias, CAcantabria, CAaragon, CAlarioja, Ahuelva, Asevilla, Acordoba, Ajaen, Agranada, Aalmeria, Amalaga, Acadiz, Valicante
	, Vvalencia, Vcastellon, Clerida, Ctarragona, Cbarcelona, Cgerona , Ecaceres, Ebadajoz, Glacoruña, Gpontebedra, Glugo, Gorense, Mmadrid, Mmurcia, Npamplona, PValava, PVguipuzcua, PVvizcaya, LRlogroño,
	Atreruel, Azaragoza, Ahuesca, Aoviedo, Bibiza, Bformentera, Bcabrera, Bmallorca, Bmenorca, Cpalma, Chierro, Cgomera, Ctenerife, Ccanaria, Cfuenteventura, Clanzarote
	, Ccantabria, CMtoledo, CMciudadreal, CMalbacete, CMcuenca, CMguadalajara, CLzamora, CLsalamanca, CLavila, CLsegovia, CLsoria, CLburgos, CLpalencia, CLleon, CAmadrid, CAcm, CAextremadura, CLvalladolid;
	public JLabel lblNewLabel_1;
	public JLabel Tele;
	public JLabel lblNewLabel;
	public JButton Encender;
	public JPanel panel;
	public JLabel lblNewLabel_2;
	public JLabel Tiempecito;
	public JLabel lblNewLabel_4;
	public JLabel lblNewLabel_5;
	public JLabel TemMin;
	public JLabel TemMax;
	public JLabel lblNewLabel_3;
	public JButton Dia4;
	public JButton Dia3;
	public JButton Dia2;
	public JButton Dia1;
	public JLabel lblNewLabel_5_1;
	public JLabel Fecha;


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

		setTitle("NombreProvisional");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1550, 808);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		andalucia = new JPanel();
		andalucia.setLayout(null);
		andalucia.setBorder(new LineBorder(new Color(0, 0, 0)));
		andalucia.setBounds(95, 115, 674, 554);
		contentPane.add(andalucia);
		andalucia.setVisible(false);
		
		Ahuelva = new JLabel("");
		Ahuelva.setBounds(84, 253, 50, 60);
		andalucia.add(Ahuelva);
		
		Asevilla = new JLabel("");
		Asevilla.setBounds(177, 273, 50, 60);
		andalucia.add(Asevilla);
		
		Acordoba = new JLabel("");
		Acordoba.setBounds(308, 155, 50, 60);
		andalucia.add(Acordoba);
		
		Ajaen = new JLabel("");
		Ajaen.setBounds(399, 155, 50, 60);
		andalucia.add(Ajaen);
		
		Agranada = new JLabel("");
		Agranada.setBounds(462, 241, 50, 60);
		andalucia.add(Agranada);
		
		Aalmeria = new JLabel("");
		Aalmeria.setBounds(577, 241, 50, 60);
		andalucia.add(Aalmeria);
		
		Amalaga = new JLabel("");
		Amalaga.setBounds(277, 369, 50, 60);
		andalucia.add(Amalaga);
		
		Acadiz = new JLabel("");
		Acadiz.setBounds(177, 421, 50, 60);
		andalucia.add(Acadiz);
		
		Landalucia = new JLabel("");
		Landalucia.setIcon(new ImageIcon("Imagenes/andalousie.jpg"));
		Landalucia.setBounds(0, 0, 674, 554);
		andalucia.add(Landalucia);
		
		Cantabria = new JPanel();
		Cantabria.setLayout(null);
		Cantabria.setBorder(new LineBorder(new Color(0, 0, 0)));
		Cantabria.setBounds(95, 115, 674, 554);
		contentPane.add(Cantabria);
		Cantabria.setVisible(false);
		
		Ccantabria = new JLabel("");
		Ccantabria.setBounds(324, 225, 50, 60);
		Cantabria.add(Ccantabria);
		
		LCantabria = new JLabel("");
		LCantabria.setIcon(new ImageIcon("Imagenes/cantabrie.png"));
		LCantabria.setBounds(0, 0, 674, 554);
		Cantabria.add(LCantabria);
		
		CM = new JPanel();
		CM.setLayout(null);
		CM.setBorder(new LineBorder(new Color(0, 0, 0)));
		CM.setBounds(95, 115, 674, 554);
		contentPane.add(CM);
		CM.setVisible(false);
		
		CMguadalajara = new JLabel("");
		CMguadalajara.setBounds(323, 80, 50, 60);
		CM.add(CMguadalajara);
		
		CMcuenca = new JLabel("");
		CMcuenca.setBounds(386, 253, 50, 60);
		CM.add(CMcuenca);
		
		CMalbacete = new JLabel("");
		CMalbacete.setBounds(436, 421, 50, 60);
		CM.add(CMalbacete);
		
		CMciudadreal = new JLabel("");
		CMciudadreal.setBounds(288, 372, 50, 60);
		CM.add(CMciudadreal);
		
		CMtoledo = new JLabel("");
		CMtoledo.setBounds(259, 253, 50, 60);
		CM.add(CMtoledo);
		
		LCastillaM = new JLabel("");
		LCastillaM.setIcon(new ImageIcon("Imagenes/castillemancha.png"));
		LCastillaM.setBounds(0, 0, 674, 554);
		CM.add(LCastillaM);
		
		Valencia = new JPanel();
		Valencia.setLayout(null);
		Valencia.setBorder(new LineBorder(new Color(0, 0, 0)));
		Valencia.setBounds(95, 115, 674, 554);
		contentPane.add(Valencia);
		Valencia.setVisible(false);
		
		Valicante = new JLabel("");
		Valicante.setBounds(130, 169, 50, 60);
		Valencia.add(Valicante);
		
		Vvalencia = new JLabel("");
		Vvalencia.setBounds(313, 158, 50, 60);
		Valencia.add(Vvalencia);
		
		Vcastellon = new JLabel("");
		Vcastellon.setBounds(474, 288, 50, 60);
		Valencia.add(Vcastellon);
		
		Lvalencia = new JLabel("");
		Lvalencia.setIcon(new ImageIcon("Imagenes/valence.png"));
		Lvalencia.setBounds(0, 0, 674, 554);
		Valencia.add(Lvalencia);
		
		Catalunia = new JPanel();
		Catalunia.setLayout(null);
		Catalunia.setBorder(new LineBorder(new Color(0, 0, 0)));
		Catalunia.setBounds(95, 115, 674, 554);
		contentPane.add(Catalunia);
		Catalunia.setVisible(false);
		
		Clerida = new JLabel("");
		Clerida.setBounds(184, 211, 50, 60);
		Catalunia.add(Clerida);
		
		Ctarragona = new JLabel("");
		Ctarragona.setBounds(201, 341, 50, 60);
		Catalunia.add(Ctarragona);
		
		Cbarcelona = new JLabel("");
		Cbarcelona.setBounds(340, 304, 50, 60);
		Catalunia.add(Cbarcelona);
		
		Cgerona = new JLabel("");
		Cgerona.setBounds(525, 197, 50, 60);
		Catalunia.add(Cgerona);
		
		LCatalunia = new JLabel("");
		LCatalunia.setIcon(new ImageIcon("Imagenes/catalogne.png"));
		LCatalunia.setBounds(0, 0, 674, 554);
		Catalunia.add(LCatalunia);
		
		Extremadura = new JPanel();
		Extremadura.setLayout(null);
		Extremadura.setBorder(new LineBorder(new Color(0, 0, 0)));
		Extremadura.setBounds(95, 115, 674, 554);
		contentPane.add(Extremadura);
		Extremadura.setVisible(false);
		
		Ecaceres = new JLabel("");
		Ecaceres.setBounds(335, 156, 50, 60);
		Extremadura.add(Ecaceres);
		
		Ebadajoz = new JLabel("");
		Ebadajoz.setBounds(348, 359, 50, 60);
		Extremadura.add(Ebadajoz);
		
		Lextremadura = new JLabel("");
		Lextremadura.setIcon(new ImageIcon("Imagenes/estremadure.png"));
		Lextremadura.setBounds(0, 0, 674, 554);
		Extremadura.add(Lextremadura);
		
		Galicia = new JPanel();
		Galicia.setLayout(null);
		Galicia.setBorder(new LineBorder(new Color(0, 0, 0)));
		Galicia.setBounds(95, 115, 674, 554);
		contentPane.add(Galicia);
		Galicia.setVisible(false);
		
		Glacoruña = new JLabel("");
		Glacoruña.setBounds(269, 180, 50, 60);
		Galicia.add(Glacoruña);
		
		Gpontebedra = new JLabel("");
		Gpontebedra.setBounds(196, 370, 50, 60);
		Galicia.add(Gpontebedra);
		
		Glugo = new JLabel("");
		Glugo.setBounds(422, 260, 50, 60);
		Galicia.add(Glugo);
		
		Gorense = new JLabel("");
		Gorense.setBounds(362, 416, 50, 60);
		Galicia.add(Gorense);
		
		Lgalicia = new JLabel("");
		Lgalicia.setIcon(new ImageIcon("Imagenes/galice.png"));
		Lgalicia.setBounds(0, 0, 674, 554);
		Galicia.add(Lgalicia);
		
		Madrid = new JPanel();
		Madrid.setLayout(null);
		Madrid.setBorder(new LineBorder(new Color(0, 0, 0)));
		Madrid.setBounds(95, 115, 674, 554);
		contentPane.add(Madrid);
		Madrid.setVisible(false);
		
		Mmadrid = new JLabel("");
		Mmadrid.setBounds(387, 300, 50, 60);
		Madrid.add(Mmadrid);
		
		Lmadrid = new JLabel("");
		Lmadrid.setIcon(new ImageIcon("Imagenes/madrid.png"));
		Lmadrid.setBounds(0, 0, 674, 554);
		Madrid.add(Lmadrid);
		
		Murcia = new JPanel();
		Murcia.setLayout(null);
		Murcia.setBorder(new LineBorder(new Color(0, 0, 0)));
		Murcia.setBounds(95, 115, 674, 554);
		contentPane.add(Murcia);
		Murcia.setVisible(false);
		
		Mmurcia = new JLabel("");
		Mmurcia.setBounds(387, 316, 50, 60);
		Murcia.add(Mmurcia);
		
		Lmurcia = new JLabel("");
		Lmurcia.setIcon(new ImageIcon("Imagenes/murcie.png"));
		Lmurcia.setBounds(0, 0, 674, 554);
		Murcia.add(Lmurcia);
		
		Navarra = new JPanel();
		Navarra.setLayout(null);
		Navarra.setBorder(new LineBorder(new Color(0, 0, 0)));
		Navarra.setBounds(95, 115, 674, 554);
		contentPane.add(Navarra);
		Navarra.setVisible(false);
		
		Npamplona = new JLabel("");
		Npamplona.setBounds(294, 273, 50, 60);
		Navarra.add(Npamplona);
		
		Lnavarra = new JLabel("");
		Lnavarra.setIcon(new ImageIcon("Imagenes/navarre.png"));
		Lnavarra.setBounds(0, 0, 674, 554);
		Navarra.add(Lnavarra);
		
		Pais_Vasco =new JPanel();
		Pais_Vasco.setLayout(null);
		Pais_Vasco.setBorder(new LineBorder(new Color(0, 0, 0)));
		Pais_Vasco.setBounds(95, 115, 674, 554);
		contentPane.add(Pais_Vasco);
		Pais_Vasco.setVisible(false);
		
		PValava = new JLabel("");
		PValava.setBounds(344, 317, 50, 60);
		Pais_Vasco.add(PValava);
		
		PVguipuzcua = new JLabel("");
		PVguipuzcua.setBounds(417, 228, 50, 60);
		Pais_Vasco.add(PVguipuzcua);
		
		PVvizcaya = new JLabel("");
		PVvizcaya.setBounds(236, 172, 50, 60);
		Pais_Vasco.add(PVvizcaya);
		
		Lpais_vasco = new JLabel("");
		Lpais_vasco.setIcon(new ImageIcon("Imagenes/paysbasque.png"));
		Lpais_vasco.setBounds(0, 0, 674, 554);
		Pais_Vasco.add(Lpais_vasco);
		
		LaRioja = new JPanel();
		LaRioja.setLayout(null);
		LaRioja.setBorder(new LineBorder(new Color(0, 0, 0)));
		LaRioja.setBounds(95, 115, 674, 554);
		contentPane.add(LaRioja);
		LaRioja.setVisible(false);
		
		LRlogroño = new JLabel("");
		LRlogroño.setBounds(197, 246, 50, 60);
		LaRioja.add(LRlogroño);
		
		Llarioja = new JLabel("");
		Llarioja.setIcon(new ImageIcon("Imagenes/rioja.png"));
		Llarioja.setBounds(0, 0, 674, 554);
		LaRioja.add(Llarioja);
		
		Aragon = new JPanel();
		Aragon.setLayout(null);
		Aragon.setBorder(new LineBorder(new Color(0, 0, 0)));
		Aragon.setBounds(95, 115, 674, 554);
		contentPane.add(Aragon);
		Aragon.setVisible(false);
		
		Atreruel = new JLabel("");
		Atreruel.setBounds(240, 384, 50, 60);
		Aragon.add(Atreruel);
		
		Azaragoza = new JLabel("");
		Azaragoza.setBounds(292, 215, 50, 60);
		Aragon.add(Azaragoza);
		
		Ahuesca = new JLabel("");
		Ahuesca.setBounds(375, 111, 50, 60);
		Aragon.add(Ahuesca);
		
		Laragon = new JLabel("");
		Laragon.setIcon(new ImageIcon("Imagenes/aragon.png"));
		Laragon.setBounds(0, 0, 674, 554);
		Aragon.add(Laragon);
		
		Asturias = new JPanel();
		Asturias.setLayout(null);
		Asturias.setBorder(new LineBorder(new Color(0, 0, 0)));
		Asturias.setBounds(95, 115, 674, 554);
		contentPane.add(Asturias);
		Asturias.setVisible(false);
		
		Aoviedo = new JLabel("");
		Aoviedo.setBounds(366, 233, 50, 60);
		Asturias.add(Aoviedo);
		
		Lasturias = new JLabel("");
		Lasturias.setIcon(new ImageIcon("Imagenes/asturies.png"));
		Lasturias.setBounds(0, 0, 674, 554);
		Asturias.add(Lasturias);
		
		Baleares = new JPanel();
		Baleares.setLayout(null);
		Baleares.setBorder(new LineBorder(new Color(0, 0, 0)));
		Baleares.setBounds(95, 115, 674, 554);
		contentPane.add(Baleares);
		Baleares.setVisible(false);
		
		Bibiza = new JLabel("");
		Bibiza.setBounds(31, 370, 50, 60);
		Baleares.add(Bibiza);
		
		Bformentera = new JLabel("");
		Bformentera.setBounds(31, 483, 50, 60);
		Baleares.add(Bformentera);
		
		Bcabrera = new JLabel("");
		Bcabrera.setBounds(351, 330, 50, 60);
		Baleares.add(Bcabrera);
		
		Bmallorca = new JLabel("");
		Bmallorca.setBounds(368, 211, 50, 60);
		Baleares.add(Bmallorca);
		
		Bmenorca = new JLabel("");
		Bmenorca.setBounds(541, 23, 50, 60);
		Baleares.add(Bmenorca);
		
		Lbaleares = new JLabel("");
		Lbaleares.setIcon(new ImageIcon("Imagenes/baleares.png"));
		Lbaleares.setBounds(0, 0, 674, 554);
		Baleares.add(Lbaleares);
		
		Canarias = new JPanel();
		Canarias.setLayout(null);
		Canarias.setBorder(new LineBorder(new Color(0, 0, 0)));
		Canarias.setBounds(95, 115, 674, 554);
		contentPane.add(Canarias);
		Canarias.setVisible(false);
		
		Cpalma = new JLabel("");
		Cpalma.setBounds(26, 220, 50, 60);
		Canarias.add(Cpalma);
		
		Chierro = new JLabel("");
		Chierro.setBounds(10, 483, 50, 60);
		Canarias.add(Chierro);
		
		Cgomera = new JLabel("");
		Cgomera.setBounds(106, 363, 50, 60);
		Canarias.add(Cgomera);
		
		Ctenerife = new JLabel("");
		Ctenerife.setBounds(196, 346, 50, 60);
		Canarias.add(Ctenerife);
		
		Ccanaria = new JLabel("");
		Ccanaria.setBounds(339, 388, 50, 60);
		Canarias.add(Ccanaria);
		
		Cfuenteventura = new JLabel("");
		Cfuenteventura.setBounds(557, 263, 50, 60);
		Canarias.add(Cfuenteventura);
		
		Clanzarote = new JLabel("");
		Clanzarote.setBounds(614, 100, 50, 60);
		Canarias.add(Clanzarote);
		
		Lcanarias = new JLabel("");
		Lcanarias.setIcon(new ImageIcon("Imagenes/canaries.png"));
		Lcanarias.setBounds(0, 0, 674, 554);
		Canarias.add(Lcanarias);
		
		CL = new JPanel();
		CL.setLayout(null);
		CL.setBorder(new LineBorder(new Color(0, 0, 0)));
		CL.setBounds(95, 115, 674, 554);
		contentPane.add(CL);
		CL.setVisible(false);
		
		CLvalladolid = new JLabel("");
		CLvalladolid.setBounds(247, 263, 50, 60);
		CL.add(CLvalladolid);
		
		CLleon = new JLabel("");
		CLleon.setBounds(88, 84, 50, 60);
		CL.add(CLleon);
		
		CLpalencia = new JLabel("");
		CLpalencia.setBounds(290, 104, 50, 60);
		CL.add(CLpalencia);
		
		CLburgos = new JLabel("");
		CLburgos.setBounds(402, 167, 50, 60);
		CL.add(CLburgos);
		
		CLsoria = new JLabel("");
		CLsoria.setBounds(551, 230, 50, 60);
		CL.add(CLsoria);
		
		CLsegovia = new JLabel("");
		CLsegovia.setBounds(334, 359, 50, 60);
		CL.add(CLsegovia);
		
		CLavila = new JLabel("");
		CLavila.setBounds(262, 393, 50, 60);
		CL.add(CLavila);
		
		CLsalamanca = new JLabel("");
		CLsalamanca.setBounds(135, 423, 50, 60);
		CL.add(CLsalamanca);
		
		CLzamora = new JLabel("");
		CLzamora.setBounds(149, 274, 50, 60);
		CL.add(CLzamora);
		
		Lcl = new JLabel("");
		Lcl.setIcon(new ImageIcon("Imagenes/castilleleon.png"));
		Lcl.setBounds(0, 0, 674, 554);
		CL.add(Lcl);
		//Aqui tenemos que hacer un refactor y poner la ruta relativa Alvaro porque no me salen las imagenes, el refactor es con control F le pones lo que quieres cambiar (la ruta de abajo hasta antes de Imagenes con la ruta relativa que sera .//src//Imagenes//nombre.png o sin el punto al principio, de todas maneras eso lo vemos luego np
		Mapa = new JPanel();
		
				Mapa.setBorder(new LineBorder(new Color(0, 0, 0)));
				Mapa.setBounds(95, 115, 674, 554);
				contentPane.add(Mapa);
				Mapa.setLayout(null);
				Mapa.setVisible(false);
				
				CAextremadura = new JLabel("");
				CAextremadura.setIcon(new ImageIcon("Imagenes/Captura de pantalla 2023-11-16 095534.png"));
				CAextremadura.setBounds(216, 232, 50, 60);
				Mapa.add(CAextremadura);
				
				CAandalucia = new JLabel("");
				CAandalucia.setIcon(new ImageIcon("Imagenes/Captura de pantalla 2023-11-16 095534.png"));
				CAandalucia.setBounds(232, 380, 50, 60);
				Mapa.add(CAandalucia);
				
				CAcm = new JLabel("");
				CAcm.setIcon(new ImageIcon("Imagenes/Captura de pantalla 2023-11-16 095534.png"));
				CAcm.setBounds(304, 232, 50, 60);
				Mapa.add(CAcm);
				
				CAmadrid = new JLabel("");
				CAmadrid.setIcon(new ImageIcon("Imagenes/Captura de pantalla 2023-11-16 095534.png"));
				CAmadrid.setBounds(304, 190, 50, 60);
				Mapa.add(CAmadrid);
				
				CAvalencia = new JLabel("");
				CAvalencia.setIcon(new ImageIcon("Imagenes/Captura de pantalla 2023-11-16 095534.png"));
				CAvalencia.setBounds(430, 264, 50, 60);
				Mapa.add(CAvalencia);
				
				CAbarcelona = new JLabel("");
				CAbarcelona.setIcon(new ImageIcon("Imagenes/Captura de pantalla 2023-11-16 095534.png"));
				CAbarcelona.setBounds(546, 115, 50, 60);
				Mapa.add(CAbarcelona);
				
				CAnavarra = new JLabel("");
				CAnavarra.setIcon(new ImageIcon("Imagenes/Captura de pantalla 2023-11-16 095534.png"));
				CAnavarra.setBounds(391, 47, 50, 60);
				Mapa.add(CAnavarra);
				
				CApaisv = new JLabel("");
				CApaisv.setIcon(new ImageIcon("Imagenes/Captura de pantalla 2023-11-16 095534.png"));
				CApaisv.setBounds(362, 22, 50, 60);
				Mapa.add(CApaisv);
				
				CAasturias = new JLabel("");
				CAasturias.setIcon(new ImageIcon("Imagenes/Captura de pantalla 2023-11-16 095534.png"));
				CAasturias.setBounds(216, 0, 50, 60);
				Mapa.add(CAasturias);
				
				CAgalicia = new JLabel("");
				CAgalicia.setIcon(new ImageIcon("Imagenes/Captura de pantalla 2023-11-16 095534.png"));
				CAgalicia.setBounds(117, 22, 50, 60);
				Mapa.add(CAgalicia);
				
				CAml = new JLabel("");
				CAml.setIcon(new ImageIcon("Imagenes/Captura de pantalla 2023-11-16 095534.png"));
				CAml.setBounds(259, 115, 50, 60);
				Mapa.add(CAml);
				
				CAmurcia = new JLabel("");
				CAmurcia.setIcon(new ImageIcon("Imagenes/Captura de pantalla 2023-11-16 095534.png"));
				CAmurcia.setBounds(406, 350, 50, 60);
				Mapa.add(CAmurcia);
				
				CAbaleares = new JLabel("");
				CAbaleares.setIcon(new ImageIcon("Imagenes/Captura de pantalla 2023-11-16 095534.png"));
				CAbaleares.setBounds(588, 251, 50, 60);
				Mapa.add(CAbaleares);
				
				CAcanarias = new JLabel("");
				CAcanarias.setIcon(new ImageIcon("Imagenes/Captura de pantalla 2023-11-16 095534.png"));
				CAcanarias.setBounds(56, 483, 50, 60);
				Mapa.add(CAcanarias);
				
				CAcantabria = new JLabel("");
				CAcantabria.setIcon(new ImageIcon("Imagenes/Captura de pantalla 2023-11-16 095534.png"));
				CAcantabria.setBounds(304, 11, 50, 60);
				Mapa.add(CAcantabria);
				
				CAaragon = new JLabel("");
				CAaragon.setIcon(new ImageIcon("Imagenes/Captura de pantalla 2023-11-16 095534.png"));
				CAaragon.setBounds(411, 115, 50, 60);
				Mapa.add(CAaragon);
				
				CAlarioja = new JLabel("");
				CAlarioja.setIcon(new ImageIcon("Imagenes/Captura de pantalla 2023-11-16 095534.png"));
				CAlarioja.setBounds(362, 82, 50, 60);
				Mapa.add(CAlarioja);
				
				mapa = new JLabel("");
				mapa.setBackground(new Color(255, 255, 255));
				mapa.setIcon(new ImageIcon("Imagenes/espagne.png"));
				mapa.setBounds(0, 0, 674, 554);
				Mapa.add(mapa);
		
		mando = new JPanel();
		mando.setToolTipText("");
		mando.setBorder(new LineBorder(new Color(0, 0, 0)));
		mando.setBounds(1119, 0, 265, 769);
		contentPane.add(mando);
		mando.setLayout(null);
		
		Dia4 = new JButton("4");
		Dia4.setFont(new Font("Segoe Script", Font.PLAIN, 17));
		Dia4.setBounds(27, 228, 68, 39);
		mando.add(Dia4);
		
		Dia3 = new JButton("3");
		Dia3.setFont(new Font("Segoe Script", Font.PLAIN, 17));
		Dia3.setBounds(27, 178, 68, 39);
		mando.add(Dia3);
		
		Dia2 = new JButton("2");
		Dia2.setFont(new Font("Segoe Script", Font.PLAIN, 17));
		Dia2.setBounds(27, 128, 68, 39);
		mando.add(Dia2);
		
		Dia1 = new JButton("1");
		Dia1.setFont(new Font("Segoe Script", Font.PLAIN, 17));
		Dia1.setBounds(27, 81, 68, 39);
		mando.add(Dia1);
		
		Encender = new JButton("");
		Encender.setIcon(new ImageIcon("Imagenes/boton.png"));
		Encender.setBounds(35, 11, 50, 50);
		mando.add(Encender);
		
		comboBox = new JComboBox();
		comboBox.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"COMUNIDAD", "ANDALUCIA", "VALENCIA", "CATALUNIA", "EXTREMADURA", "GALICIA", "MADRID", "MURCIA", "NAVARRA", "PAIS VASCO", "LARIOJA", "ARAGON", "BALEARES", "CANARIAS", "CASTILLAL", "CASTILLAM", "CANTABRIA", "ASTURIAS", "MAPA"}));
		comboBox.setBounds(10, 602, 188, 39);
		mando.add(comboBox);
		
		comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"PROVINCIA"}));
		comboBox_1.setBounds(10, 652, 188, 39);
		mando.add(comboBox_1);
		
		BuscarPro = new JButton("");
		BuscarPro.setIcon(new ImageIcon("Imagenes/TIK.png"));
		BuscarPro.setBounds(208, 652, 40, 40);
		mando.add(BuscarPro);
		
		BuscarCM = new JButton("");
		BuscarCM.setBackground(new Color(255, 255, 255));
		BuscarCM.setIcon(new ImageIcon("Imagenes/TIK.png"));
		BuscarCM.setBounds(208, 602, 40, 40);
		mando.add(BuscarCM);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("Imagenes/mando.png"));
		lblNewLabel.setBounds(0, 0, 265, 769);
		mando.add(lblNewLabel);
		
		Tele = new JLabel("");
		Tele.setIcon(new ImageIcon("Imagenes/television.png"));
		Tele.setBounds(0, 0, 1120, 769);
		contentPane.add(Tele);
		
		panel = new JPanel();
		panel.setBounds(1383, 0, 151, 769);
		contentPane.add(panel);
		panel.setLayout(null);
		
		Fecha = new JLabel("");
		Fecha.setFont(new Font("Segoe Script", Font.PLAIN, 18));
		Fecha.setBounds(10, 666, 131, 50);
		panel.add(Fecha);
		
		lblNewLabel_5_1 = new JLabel("Fecha");
		lblNewLabel_5_1.setFont(new Font("Segoe Script", Font.PLAIN, 18));
		lblNewLabel_5_1.setBounds(42, 604, 109, 79);
		panel.add(lblNewLabel_5_1);
		
		TemMax = new JLabel("");
		TemMax.setFont(new Font("Segoe Script", Font.PLAIN, 55));
		TemMax.setBounds(20, 319, 115, 69);
		panel.add(TemMax);
		
		TemMin = new JLabel("");
		TemMin.setFont(new Font("Segoe Script", Font.PLAIN, 55));
		TemMin.setBounds(20, 524, 115, 69);
		panel.add(TemMin);
		
		lblNewLabel_5 = new JLabel("TemperaturaMin");
		lblNewLabel_5.setFont(new Font("Segoe Script", Font.PLAIN, 14));
		lblNewLabel_5.setBounds(10, 455, 141, 79);
		panel.add(lblNewLabel_5);
		
		lblNewLabel_4 = new JLabel("TemperaturaMax");
		lblNewLabel_4.setFont(new Font("Segoe Script", Font.PLAIN, 14));
		lblNewLabel_4.setBounds(10, 255, 141, 79);
		panel.add(lblNewLabel_4);
		
		Tiempecito = new JLabel("");
		Tiempecito.setBounds(42, 115, 50, 60);
		panel.add(Tiempecito);
		
		lblNewLabel_3 = new JLabel("Tiempo");
		lblNewLabel_3.setFont(new Font("Segoe Script", Font.PLAIN, 18));
		lblNewLabel_3.setBounds(32, 70, 91, 50);
		panel.add(lblNewLabel_3);
		
		lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_2.setIcon(new ImageIcon("Imagenes/fondo.png"));
		lblNewLabel_2.setBounds(0, 0, 151, 769);
		panel.add(lblNewLabel_2);
	}
	
   
}