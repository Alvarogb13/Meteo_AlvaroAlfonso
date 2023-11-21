package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

import View.Vista;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.LocalDate;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.SwingUtilities;

import Model.Ciudad;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.stream.JsonReader;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Controlador implements ActionListener {

	private List<Ciudad> ciudades;
	Vista vista = new Vista();

	int encender = 0;

	public Controlador(Vista frame) throws InterruptedException {
		vista = frame;
		this.vista.BuscarCM.addActionListener(this);
		this.vista.BuscarPro.addActionListener(this);
		this.vista.Encender.addActionListener(this);
		this.vista.Dia1.addActionListener(this);
		this.vista.Dia2.addActionListener(this);
		this.vista.Dia3.addActionListener(this);
		this.vista.Dia4.addActionListener(this);
		vista.CAandalucia.setIcon(new ImageIcon(fotitos(prueba2("Sevilla"))));
		vista.CAbarcelona.setIcon(new ImageIcon(fotitos(prueba2("Barcelona"))));
		vista.CAnavarra.setIcon(new ImageIcon(fotitos(prueba2("Pamplona"))));
		vista.CAvalencia.setIcon(new ImageIcon(fotitos(prueba2("Valencia"))));
		vista.CApaisv.setIcon(new ImageIcon(fotitos(prueba2("Alava"))));
		vista.CAasturias.setIcon(new ImageIcon(fotitos(prueba2("Oviedo"))));
		vista.CAgalicia.setIcon(new ImageIcon(fotitos(prueba2("ACorunia"))));
		vista.CAml.setIcon(new ImageIcon(fotitos(prueba2("Valladolid"))));
		vista.CAmurcia.setIcon(new ImageIcon(fotitos(prueba2("Murcia"))));
		vista.CAbaleares.setIcon(new ImageIcon(fotitos(prueba2("Mallorca"))));
		vista.CAcanarias.setIcon(new ImageIcon(fotitos(prueba2("Tenerife"))));
		vista.CAcantabria.setIcon(new ImageIcon(fotitos(prueba2("Santander"))));
		vista.CAaragon.setIcon(new ImageIcon(fotitos(prueba2("Zaragoza"))));
		vista.CAlarioja.setIcon(new ImageIcon(fotitos(prueba2("Logronio"))));
		vista.CAmadrid.setIcon(new ImageIcon(fotitos(prueba2("Madrid"))));
		vista.CAcm.setIcon(new ImageIcon(fotitos(prueba2("Toledo"))));
		vista.CAextremadura.setIcon(new ImageIcon(fotitos(prueba2("Caceres"))));
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int numero;
		try {
			if (e.getSource() == this.vista.Encender) {
				if (encender == 0) {
					vista.Mapa.setVisible(true);
					makeSound("src/sounds/encender.wav");
					encender = 1;
				} else if (encender == 1) {
					vista.andalucia.setVisible(false);
					vista.Mapa.setVisible(false);
					vista.CM.setVisible(false);
					vista.Canarias.setVisible(false);
					vista.Baleares.setVisible(false);
					vista.Aragon.setVisible(false);
					vista.LaRioja.setVisible(false);
					vista.Pais_Vasco.setVisible(false);
					vista.Navarra.setVisible(false);
					vista.Murcia.setVisible(false);
					vista.Madrid.setVisible(false);
					vista.Galicia.setVisible(false);
					vista.Extremadura.setVisible(false);
					vista.Catalunia.setVisible(false);
					vista.Valencia.setVisible(false);
					vista.Asturias.setVisible(false);
					vista.Cantabria.setVisible(false);
					vista.CL.setVisible(false);
					makeSound("src/sounds/apagarTele.wav");
					vista.Tiempecito.setIcon(new ImageIcon());
					vista.TemMax.setText("");
					vista.TemMin.setText("");
					vista.Fecha.setText("");
					
					encender = 0;
				}
			}
			if (e.getSource() == this.vista.BuscarCM) {
				numero = vista.comboBox.getSelectedIndex();
				if (numero > 0) { // Si numero es mayor que 0 (siempre que entremos en un if va a ser mayor que 0
					if (numero == 1) {
						vista.andalucia.setVisible(true);
						vista.Mapa.setVisible(false);
						vista.CM.setVisible(false);
						vista.Canarias.setVisible(false);
						vista.Baleares.setVisible(false);
						vista.Aragon.setVisible(false);
						vista.LaRioja.setVisible(false);
						vista.Pais_Vasco.setVisible(false);
						vista.Navarra.setVisible(false);
						vista.Murcia.setVisible(false);
						vista.Madrid.setVisible(false);
						vista.Galicia.setVisible(false);
						vista.Extremadura.setVisible(false);
						vista.Catalunia.setVisible(false);
						vista.Valencia.setVisible(false);
						vista.Asturias.setVisible(false);
						vista.Cantabria.setVisible(false);
						vista.CL.setVisible(false);
						vista.comboBox_1.setModel(new DefaultComboBoxModel(new String[] { "PROVINCIA", "Huelva","Sevilla", "Cadiz", "Malaga", "Cordoba", "Jaen", "Granada", "Almeria" }));
						vista.Ahuelva.setIcon(new ImageIcon(fotitos(prueba2("Huelva"))));
						vista.Asevilla.setIcon(new ImageIcon(fotitos(prueba2("Sevilla"))));
						vista.Acadiz.setIcon(new ImageIcon(fotitos(prueba2("Cadiz"))));
						vista.Amalaga.setIcon(new ImageIcon(fotitos(prueba2("Malaga"))));
						vista.Acordoba.setIcon(new ImageIcon(fotitos(prueba2("Cordoba"))));
						vista.Ajaen.setIcon(new ImageIcon(fotitos(prueba2("Jaen"))));
						vista.Agranada.setIcon(new ImageIcon(fotitos(prueba2("Granada"))));
						vista.Aalmeria.setIcon(new ImageIcon(fotitos(prueba2("Almeria"))));
					} else if (numero == 2) {
						vista.Valencia.setVisible(true);
						vista.Mapa.setVisible(false);
						vista.CM.setVisible(false);
						vista.Canarias.setVisible(false);
						vista.Baleares.setVisible(false);
						vista.Aragon.setVisible(false);
						vista.LaRioja.setVisible(false);
						vista.Pais_Vasco.setVisible(false);
						vista.Navarra.setVisible(false);
						vista.Murcia.setVisible(false);
						vista.Madrid.setVisible(false);
						vista.Galicia.setVisible(false);
						vista.Extremadura.setVisible(false);
						vista.Catalunia.setVisible(false);
						vista.andalucia.setVisible(false);
						vista.Asturias.setVisible(false);
						vista.Cantabria.setVisible(false);
						vista.CL.setVisible(false);
						vista.comboBox_1.setModel(new DefaultComboBoxModel(new String[] { "PROVINCIA", "Valencia", "Castellon", "Alicante" }));
						vista.Vvalencia.setIcon(new ImageIcon(fotitos(prueba2("Valencia"))));
						vista.Vcastellon.setIcon(new ImageIcon(fotitos(prueba2("Castellon"))));
						vista.Valicante.setIcon(new ImageIcon(fotitos(prueba2("Alicante"))));
					} else if (numero == 3) {
						vista.Catalunia.setVisible(true);
						vista.Mapa.setVisible(false);
						vista.CM.setVisible(false);
						vista.Canarias.setVisible(false);
						vista.Baleares.setVisible(false);
						vista.Aragon.setVisible(false);
						vista.LaRioja.setVisible(false);
						vista.Pais_Vasco.setVisible(false);
						vista.Navarra.setVisible(false);
						vista.Murcia.setVisible(false);
						vista.Madrid.setVisible(false);
						vista.Galicia.setVisible(false);
						vista.Extremadura.setVisible(false);
						vista.Valencia.setVisible(false);
						vista.andalucia.setVisible(false);
						vista.Asturias.setVisible(false);
						vista.Cantabria.setVisible(false);
						vista.CL.setVisible(false);
						vista.comboBox_1.setModel(new DefaultComboBoxModel(new String[] { "PROVINCIA", "Barcelona", "Girona", "Tarragona", "Lerida" }));
						vista.Cbarcelona.setIcon(new ImageIcon(fotitos(prueba2("Barcelona"))));
						vista.Cgerona.setIcon(new ImageIcon(fotitos(prueba2("Girona"))));
						vista.Ctarragona.setIcon(new ImageIcon(fotitos(prueba2("Tarragona"))));
						vista.Clerida.setIcon(new ImageIcon(fotitos(prueba2("Lerida"))));
					} else if (numero == 4) {
						vista.Extremadura.setVisible(true);
						vista.Mapa.setVisible(false);
						vista.CM.setVisible(false);
						vista.Canarias.setVisible(false);
						vista.Baleares.setVisible(false);
						vista.Aragon.setVisible(false);
						vista.LaRioja.setVisible(false);
						vista.Pais_Vasco.setVisible(false);
						vista.Navarra.setVisible(false);
						vista.Murcia.setVisible(false);
						vista.Madrid.setVisible(false);
						vista.Galicia.setVisible(false);
						vista.CL.setVisible(false);
						vista.Catalunia.setVisible(false);
						vista.Valencia.setVisible(false);
						vista.andalucia.setVisible(false);
						vista.Asturias.setVisible(false);
						vista.Cantabria.setVisible(false);
						vista.comboBox_1.setModel(new DefaultComboBoxModel(new String[] { "PROVINCIA", "Caceres", "Badajoz" }));
						vista.Ebadajoz.setIcon(new ImageIcon(fotitos(prueba2("Caceres"))));
						vista.Ecaceres.setIcon(new ImageIcon(fotitos(prueba2("Badajoz"))));
					} else if (numero == 5) {
						vista.Galicia.setVisible(true);
						vista.Mapa.setVisible(false);
						vista.CM.setVisible(false);
						vista.Canarias.setVisible(false);
						vista.Baleares.setVisible(false);
						vista.Aragon.setVisible(false);
						vista.LaRioja.setVisible(false);
						vista.Pais_Vasco.setVisible(false);
						vista.Navarra.setVisible(false);
						vista.Murcia.setVisible(false);
						vista.Madrid.setVisible(false);
						vista.Extremadura.setVisible(false);
						vista.CL.setVisible(false);
						vista.Catalunia.setVisible(false);
						vista.Valencia.setVisible(false);
						vista.andalucia.setVisible(false);
						vista.Asturias.setVisible(false);
						vista.Cantabria.setVisible(false);
						vista.comboBox_1.setModel(new DefaultComboBoxModel(new String[] { "PROVINCIA", "ACorunia", "Ourense", "Lugo", "Pontevedra" }));
						vista.Glacoruña.setIcon(new ImageIcon(fotitos(prueba2("ACorunia"))));
						vista.Gorense.setIcon(new ImageIcon(fotitos(prueba2("Ourense"))));
						vista.Glugo.setIcon(new ImageIcon(fotitos(prueba2("Lugo"))));
						vista.Gpontebedra.setIcon(new ImageIcon(fotitos(prueba2("Pontevedra"))));
					} else if (numero == 6) {
						vista.Madrid.setVisible(true);
						vista.Mapa.setVisible(false);
						vista.CM.setVisible(false);
						vista.Canarias.setVisible(false);
						vista.Baleares.setVisible(false);
						vista.Aragon.setVisible(false);
						vista.LaRioja.setVisible(false);
						vista.Pais_Vasco.setVisible(false);
						vista.Navarra.setVisible(false);
						vista.Murcia.setVisible(false);
						vista.Galicia.setVisible(false);
						vista.Extremadura.setVisible(false);
						vista.CL.setVisible(false);
						vista.Catalunia.setVisible(false);
						vista.Valencia.setVisible(false);
						vista.andalucia.setVisible(false);
						vista.Asturias.setVisible(false);
						vista.Cantabria.setVisible(false);
						vista.comboBox_1.setModel(new DefaultComboBoxModel(new String[] { "PROVINCIA", "Madrid" }));
						vista.Mmadrid.setIcon(new ImageIcon(fotitos(prueba2("Madrid"))));
					} else if (numero == 7) {
						vista.Murcia.setVisible(true);
						vista.Mapa.setVisible(false);
						vista.CM.setVisible(false);
						vista.Canarias.setVisible(false);
						vista.Baleares.setVisible(false);
						vista.Aragon.setVisible(false);
						vista.LaRioja.setVisible(false);
						vista.Pais_Vasco.setVisible(false);
						vista.Navarra.setVisible(false);
						vista.Madrid.setVisible(false);
						vista.Galicia.setVisible(false);
						vista.Extremadura.setVisible(false);
						vista.CL.setVisible(false);
						vista.Catalunia.setVisible(false);
						vista.Valencia.setVisible(false);
						vista.andalucia.setVisible(false);
						vista.Asturias.setVisible(false);
						vista.Cantabria.setVisible(false);
						vista.comboBox_1.setModel(new DefaultComboBoxModel(new String[] { "PROVINCIA", "Murcia" }));
						vista.Mmurcia.setIcon(new ImageIcon(fotitos(prueba2("Murcia"))));
					} else if (numero == 8) {
						vista.Navarra.setVisible(true);
						vista.Mapa.setVisible(false);
						vista.CM.setVisible(false);
						vista.Canarias.setVisible(false);
						vista.Baleares.setVisible(false);
						vista.Aragon.setVisible(false);
						vista.LaRioja.setVisible(false);
						vista.Pais_Vasco.setVisible(false);
						vista.Murcia.setVisible(false);
						vista.Madrid.setVisible(false);
						vista.Galicia.setVisible(false);
						vista.Extremadura.setVisible(false);
						vista.CL.setVisible(false);
						vista.Catalunia.setVisible(false);
						vista.Valencia.setVisible(false);
						vista.andalucia.setVisible(false);
						vista.Asturias.setVisible(false);
						vista.Cantabria.setVisible(false);
						vista.comboBox_1.setModel(new DefaultComboBoxModel(new String[] { "PROVINCIA", "Pamplona" }));
						vista.Npamplona.setIcon(new ImageIcon(fotitos(prueba2("Pamplona"))));
					} else if (numero == 9) {
						vista.Pais_Vasco.setVisible(true);
						vista.Mapa.setVisible(false);
						vista.CM.setVisible(false);
						vista.Canarias.setVisible(false);
						vista.Baleares.setVisible(false);
						vista.Aragon.setVisible(false);
						vista.LaRioja.setVisible(false);
						vista.Navarra.setVisible(false);
						vista.Murcia.setVisible(false);
						vista.Madrid.setVisible(false);
						vista.Galicia.setVisible(false);
						vista.Extremadura.setVisible(false);
						vista.CL.setVisible(false);
						vista.Catalunia.setVisible(false);
						vista.Valencia.setVisible(false);
						vista.andalucia.setVisible(false);
						vista.Asturias.setVisible(false);
						vista.Cantabria.setVisible(false);
						vista.comboBox_1.setModel(new DefaultComboBoxModel(new String[] { "PROVINCIA", "Vizcaya", "Guipuzcoa", "Alava" }));
						vista.PVvizcaya.setIcon(new ImageIcon(fotitos(prueba2("Vizcaya"))));
						vista.PVguipuzcua.setIcon(new ImageIcon(fotitos(prueba2("Guipuzcoa"))));
						vista.PValava.setIcon(new ImageIcon(fotitos(prueba2("Alava"))));
					} else if (numero == 10) {
						vista.LaRioja.setVisible(true);
						vista.Mapa.setVisible(false);
						vista.CM.setVisible(false);
						vista.Canarias.setVisible(false);
						vista.Baleares.setVisible(false);
						vista.Aragon.setVisible(false);
						vista.CL.setVisible(false);
						vista.Pais_Vasco.setVisible(false);
						vista.Navarra.setVisible(false);
						vista.Murcia.setVisible(false);
						vista.Madrid.setVisible(false);
						vista.Galicia.setVisible(false);
						vista.Extremadura.setVisible(false);
						vista.Catalunia.setVisible(false);
						vista.Valencia.setVisible(false);
						vista.andalucia.setVisible(false);
						vista.Asturias.setVisible(false);
						vista.Cantabria.setVisible(false);
						vista.comboBox_1.setModel(new DefaultComboBoxModel(new String[] { "PROVINCIA", "Logronio" }));
						vista.LRlogroño.setIcon(new ImageIcon(fotitos(prueba2("Logronio"))));
					} else if (numero == 11) {
						vista.Aragon.setVisible(true);
						vista.Mapa.setVisible(false);
						vista.CM.setVisible(false);
						vista.Canarias.setVisible(false);
						vista.Baleares.setVisible(false);
						vista.LaRioja.setVisible(false);
						vista.CL.setVisible(false);
						vista.Pais_Vasco.setVisible(false);
						vista.Navarra.setVisible(false);
						vista.Murcia.setVisible(false);
						vista.Madrid.setVisible(false);
						vista.Galicia.setVisible(false);
						vista.Extremadura.setVisible(false);
						vista.Catalunia.setVisible(false);
						vista.Valencia.setVisible(false);
						vista.andalucia.setVisible(false);
						vista.Asturias.setVisible(false);
						vista.Cantabria.setVisible(false);
						vista.comboBox_1.setModel(new DefaultComboBoxModel(new String[] { "PROVINCIA", "Huesca", "Zaragoza", "Teruel" }));
						vista.Ahuesca.setIcon(new ImageIcon(fotitos(prueba2("Huesca"))));
						vista.Azaragoza.setIcon(new ImageIcon(fotitos(prueba2("Zaragoza"))));
						vista.Atreruel.setIcon(new ImageIcon(fotitos(prueba2("Teruel"))));
					} else if (numero == 12) {
						vista.Baleares.setVisible(true);
						vista.Mapa.setVisible(false);
						vista.CM.setVisible(false);
						vista.Canarias.setVisible(false);
						vista.Aragon.setVisible(false);
						vista.LaRioja.setVisible(false);
						vista.CL.setVisible(false);
						vista.Pais_Vasco.setVisible(false);
						vista.Navarra.setVisible(false);
						vista.Murcia.setVisible(false);
						vista.Madrid.setVisible(false);
						vista.Galicia.setVisible(false);
						vista.Extremadura.setVisible(false);
						vista.Catalunia.setVisible(false);
						vista.Valencia.setVisible(false);
						vista.andalucia.setVisible(false);
						vista.Asturias.setVisible(false);
						vista.Cantabria.setVisible(false);
						vista.comboBox_1.setModel(new DefaultComboBoxModel(new String[] { "PROVINCIA", "Mallorca" }));
						vista.Bmallorca.setIcon(new ImageIcon(fotitos(prueba2("Mallorca"))));
					} else if (numero == 13) {
						vista.Canarias.setVisible(true);
						vista.Mapa.setVisible(false);
						vista.CM.setVisible(false);
						vista.Baleares.setVisible(false);
						vista.Aragon.setVisible(false);
						vista.LaRioja.setVisible(false);
						vista.CL.setVisible(false);
						vista.Pais_Vasco.setVisible(false);
						vista.Navarra.setVisible(false);
						vista.Murcia.setVisible(false);
						vista.Madrid.setVisible(false);
						vista.Galicia.setVisible(false);
						vista.Extremadura.setVisible(false);
						vista.Catalunia.setVisible(false);
						vista.Valencia.setVisible(false);
						vista.andalucia.setVisible(false);
						vista.Asturias.setVisible(false);
						vista.Cantabria.setVisible(false);
						vista.comboBox_1.setModel(new DefaultComboBoxModel(new String[] { "PROVINCIA", "Tenerife" }));
						vista.Ctenerife.setIcon(new ImageIcon(fotitos(prueba2("Tenerife"))));
					} else if (numero == 14) {
						vista.CL.setVisible(true);
						vista.Mapa.setVisible(false);
						vista.CM.setVisible(false);
						vista.Canarias.setVisible(false);
						vista.Aragon.setVisible(false);
						vista.LaRioja.setVisible(false);
						vista.Pais_Vasco.setVisible(false);
						vista.Navarra.setVisible(false);
						vista.Murcia.setVisible(false);
						vista.Madrid.setVisible(false);
						vista.Galicia.setVisible(false);
						vista.Extremadura.setVisible(false);
						vista.Catalunia.setVisible(false);
						vista.Valencia.setVisible(false);
						vista.andalucia.setVisible(false);
						vista.Asturias.setVisible(false);
						vista.Cantabria.setVisible(false);
						vista.comboBox_1.setModel(new DefaultComboBoxModel(new String[] { "PROVINCIA", "Leon", "Palencia","Burgos", "Zamora", "Salamanca", "Avila", "Segovia", "Valladolid", "Soria" }));
						vista.CLleon.setIcon(new ImageIcon(fotitos(prueba2("Leon"))));
						vista.CLpalencia.setIcon(new ImageIcon(fotitos(prueba2("Palencia"))));
						vista.CLburgos.setIcon(new ImageIcon(fotitos(prueba2("Burgos"))));
						vista.CLzamora.setIcon(new ImageIcon(fotitos(prueba2("Zamora"))));
						vista.CLsalamanca.setIcon(new ImageIcon(fotitos(prueba2("Salamanca"))));
						vista.CLavila.setIcon(new ImageIcon(fotitos(prueba2("Avila"))));
						vista.CLvalladolid.setIcon(new ImageIcon(fotitos(prueba2("Valladolid"))));
						vista.CLsoria.setIcon(new ImageIcon(fotitos(prueba2("Soria"))));
						vista.CLsegovia.setIcon(new ImageIcon(fotitos(prueba2("Segovia"))));
					} else if (numero == 15) {
						vista.CM.setVisible(true);
						vista.Mapa.setVisible(false);
						vista.Canarias.setVisible(false);
						vista.Baleares.setVisible(false);
						vista.Aragon.setVisible(false);
						vista.LaRioja.setVisible(false);
						vista.CL.setVisible(false);
						vista.Pais_Vasco.setVisible(false);
						vista.Navarra.setVisible(false);
						vista.Murcia.setVisible(false);
						vista.Madrid.setVisible(false);
						vista.Galicia.setVisible(false);
						vista.Extremadura.setVisible(false);
						vista.Catalunia.setVisible(false);
						vista.Valencia.setVisible(false);
						vista.andalucia.setVisible(false);
						vista.Asturias.setVisible(false);
						vista.Cantabria.setVisible(false);
						vista.comboBox_1.setModel(new DefaultComboBoxModel(new String[] { "PROVINCIA", "CiudadReal","Albacete", "Guadalajara", "Cuenca", "Toledo" }));
						vista.CMciudadreal.setIcon(new ImageIcon(fotitos(prueba2("CiudadReal"))));
						vista.CMalbacete.setIcon(new ImageIcon(fotitos(prueba2("Albacete"))));
						vista.CMguadalajara.setIcon(new ImageIcon(fotitos(prueba2("Guadalajara"))));
						vista.CMcuenca.setIcon(new ImageIcon(fotitos(prueba2("Cuenca"))));
						vista.CMtoledo.setIcon(new ImageIcon(fotitos(prueba2("Toledo"))));
					} else if (numero == 16) {
						vista.Cantabria.setVisible(true);
						vista.Mapa.setVisible(false);
						vista.CM.setVisible(false);
						vista.Canarias.setVisible(false);
						vista.Baleares.setVisible(false);
						vista.Aragon.setVisible(false);
						vista.LaRioja.setVisible(false);
						vista.Pais_Vasco.setVisible(false);
						vista.Navarra.setVisible(false);
						vista.Murcia.setVisible(false);
						vista.Madrid.setVisible(false);
						vista.Galicia.setVisible(false);
						vista.Extremadura.setVisible(false);
						vista.Catalunia.setVisible(false);
						vista.Valencia.setVisible(false);
						vista.andalucia.setVisible(false);
						vista.Asturias.setVisible(false);
						vista.CL.setVisible(false);
						vista.comboBox_1.setModel(new DefaultComboBoxModel(new String[] { "PROVINCIA", "Santander" }));
						vista.Ccantabria.setIcon(new ImageIcon(fotitos(prueba2("Santander"))));
					} else if (numero == 17) {
						vista.Asturias.setVisible(true);
						vista.Mapa.setVisible(false);
						vista.CM.setVisible(false);
						vista.Canarias.setVisible(false);
						vista.Baleares.setVisible(false);
						vista.Aragon.setVisible(false);
						vista.LaRioja.setVisible(false);
						vista.Pais_Vasco.setVisible(false);
						vista.Navarra.setVisible(false);
						vista.Murcia.setVisible(false);
						vista.Madrid.setVisible(false);
						vista.Galicia.setVisible(false);
						vista.Extremadura.setVisible(false);
						vista.Catalunia.setVisible(false);
						vista.Valencia.setVisible(false);
						vista.andalucia.setVisible(false);
						vista.Cantabria.setVisible(false);
						vista.CL.setVisible(false);
						vista.comboBox_1.setModel(new DefaultComboBoxModel(new String[] { "PROVINCIA", "Oviedo" }));
						vista.Aoviedo.setIcon(new ImageIcon(fotitos(prueba2("Oviedo"))));
					} else if (numero == 18) {
						vista.Mapa.setVisible(true);
						vista.CM.setVisible(false);
						vista.Canarias.setVisible(false);
						vista.Baleares.setVisible(false);
						vista.Aragon.setVisible(false);
						vista.LaRioja.setVisible(false);
						vista.CL.setVisible(false);
						vista.Pais_Vasco.setVisible(false);
						vista.Navarra.setVisible(false);
						vista.Murcia.setVisible(false);
						vista.Madrid.setVisible(false);
						vista.Galicia.setVisible(false);
						vista.Extremadura.setVisible(false);
						vista.Catalunia.setVisible(false);
						vista.Valencia.setVisible(false);
						vista.andalucia.setVisible(false);
						vista.Asturias.setVisible(false);
						vista.Cantabria.setVisible(false);
						vista.comboBox_1.setModel(new DefaultComboBoxModel(new String[] { "PROVINCIA" }));
					}
				} else {
					System.out.println("Error al seleccionar comunidad autonoma");
				}
			}
		} catch (InterruptedException e1) {
		}
		if (e.getSource() == this.vista.BuscarPro) {
			LocalDate fecha = LocalDate.now();
			String nombreCiudad = vista.comboBox_1.getSelectedItem().toString();
			try {
				vista.Tiempecito.setIcon(new ImageIcon(fotitos(prueba2(nombreCiudad))));
				vista.TemMax.setText(max(prueba(nombreCiudad), nombreCiudad, 0) + "º");
				vista.TemMin.setText(min(prueba(nombreCiudad), nombreCiudad, 0) + "º");
				vista.Fecha.setText(String.valueOf(fecha));
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
		}
		if (e.getSource() == this.vista.Dia1) {
			int Dia = 0;
			LocalDate fecha = LocalDate.now();
			dias(Dia, fecha);
		}
		if (e.getSource() == this.vista.Dia2) {
			int Dia = 1;
			LocalDate fecha = LocalDate.now().plusDays(1);
			dias(Dia, fecha);
		}
		if (e.getSource() == this.vista.Dia3) {
			int Dia = 2;
			LocalDate fecha = LocalDate.now().plusDays(2);
			dias(Dia, fecha);
		}
		if (e.getSource() == this.vista.Dia4) {
			int Dia = 3;
			LocalDate fecha = LocalDate.now().plusDays(3);
			dias(Dia, fecha);
		}
	}

	public void dias(int Dia, LocalDate fecha) {
		String nombreCiudad = vista.comboBox_1.getSelectedItem().toString();
		try {
			vista.Tiempecito.setIcon(new ImageIcon(fotitos(prueba3(nombreCiudad, Dia))));
			vista.TemMax.setText(max(prueba(nombreCiudad), nombreCiudad, Dia) + "º");
			vista.TemMin.setText(min(prueba(nombreCiudad), nombreCiudad, Dia) + "º");
			vista.Fecha.setText(String.valueOf(fecha));
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
	}

	public static String prueba(String ciudad) throws InterruptedException {
		Properties configuracion = new Properties();
		ArrayList<String> ciudades = new ArrayList<>();
		String json = null;
		try {
			configuracion.load(new FileReader("src/resources/config.properties"));
			Set<String> nombresCiudades = configuracion.stringPropertyNames();
			String url = configuracion.getProperty(ciudad);
			json = fetchDataFromURL(url);

		} catch (IOException e) {
			e.printStackTrace();
		}
		return json;
	}

	public static String prueba2(String ciudad) throws InterruptedException {
		Properties configuracion = new Properties();
		ArrayList<String> ciudades = new ArrayList<>();
		String tiempo = null;
		try {
			configuracion.load(new FileReader("src/resources/config.properties"));
			Set<String> nombresCiudades = configuracion.stringPropertyNames();
			String url = configuracion.getProperty(ciudad);
			String json = fetchDataFromURL(url);
			tiempo = tirmpo(json, ciudad);

		} catch (IOException e) {
			e.printStackTrace();
		}
		return tiempo;
	}

	public static String prueba3(String ciudad, int numero) throws InterruptedException {
		Properties configuracion = new Properties();
		ArrayList<String> ciudades = new ArrayList<>();
		String tiempo = null;
		try {
			configuracion.load(new FileReader("src/resources/config.properties"));
			Set<String> nombresCiudades = configuracion.stringPropertyNames();
			String url = configuracion.getProperty(ciudad);
			String json = fetchDataFromURL(url);
			tiempo = tirmpo1(json, ciudad, numero);

		} catch (IOException e) {
			e.printStackTrace();
		}
		return tiempo;
	}

	public static String tirmpo(String info, String nombre) {

		Gson ciudad = new Gson();
		JsonObject jsonO = ciudad.fromJson(info, JsonObject.class);
		String tiempo = jsonO.getAsJsonObject("city").getAsJsonObject("forecast").getAsJsonArray("forecastDay").get(0)
				.getAsJsonObject().get("weather").getAsString();
		return tiempo;
	}

	public static String tirmpo1(String info, String nombre, int numero) {

		Gson ciudad = new Gson();
		JsonObject jsonO = ciudad.fromJson(info, JsonObject.class);
		String tiempo = jsonO.getAsJsonObject("city").getAsJsonObject("forecast").getAsJsonArray("forecastDay")
				.get(numero).getAsJsonObject().get("weather").getAsString();
		return tiempo;
	}

	public static String max(String info, String nombre, int numero) {

		Gson ciudad = new Gson();
		JsonObject jsonO = ciudad.fromJson(info, JsonObject.class);
		String max = jsonO.getAsJsonObject("city").getAsJsonObject("forecast").getAsJsonArray("forecastDay").get(numero)
				.getAsJsonObject().get("maxTemp").getAsString();
		return max;
	}

	public static String min(String info, String nombre, int numero) {

		Gson ciudad = new Gson();
		JsonObject jsonO = ciudad.fromJson(info, JsonObject.class);
		String min = jsonO.getAsJsonObject("city").getAsJsonObject("forecast").getAsJsonArray("forecastDay").get(numero)
				.getAsJsonObject().get("minTemp").getAsString();
		return min;
	}

	private static String fetchDataFromURL(String url) throws IOException {
		URL weatherURL = new URL(url);
		HttpURLConnection connection = (HttpURLConnection) weatherURL.openConnection();
		connection.setRequestMethod("GET");
		connection.connect();

		StringBuilder result = new StringBuilder();
		BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
		String line;
		while ((line = reader.readLine()) != null) {
			result.append(line);
		}
		reader.close();

		return result.toString();
	}

	public static void main(String[] args) throws InterruptedException {
		Vista vista = new Vista();
		vista.CAandalucia.setIcon(new ImageIcon(fotitos(prueba2("Sevilla"))));
		vista.CAbarcelona.setIcon(new ImageIcon(fotitos(prueba2("Barcelona"))));
		vista.CAnavarra.setIcon(new ImageIcon(fotitos(prueba2("Pamplona"))));
		vista.CAvalencia.setIcon(new ImageIcon(fotitos(prueba2("Valencia"))));
		vista.CApaisv.setIcon(new ImageIcon(fotitos(prueba2("Alava"))));
		vista.CAasturias.setIcon(new ImageIcon(fotitos(prueba2("Oviedo"))));
		vista.CAgalicia.setIcon(new ImageIcon(fotitos(prueba2("ACorunia"))));
		vista.CAml.setIcon(new ImageIcon(fotitos(prueba2("Valladolid"))));
		vista.CAmurcia.setIcon(new ImageIcon(fotitos(prueba2("Murcia"))));
		vista.CAbaleares.setIcon(new ImageIcon(fotitos(prueba2("Mallorca"))));
		vista.CAcanarias.setIcon(new ImageIcon(fotitos(prueba2("Tenerife"))));
		vista.CAcantabria.setIcon(new ImageIcon(fotitos(prueba2("Santander"))));
		vista.CAaragon.setIcon(new ImageIcon(fotitos(prueba2("Zaragoza"))));
		vista.CAlarioja.setIcon(new ImageIcon(fotitos(prueba2("Logronio"))));
		vista.CAmadrid.setIcon(new ImageIcon(fotitos(prueba2("Madrid"))));
		vista.CAcm.setIcon(new ImageIcon(fotitos(prueba2("Toledo"))));
		vista.CAextremadura.setIcon(new ImageIcon(fotitos(prueba2("Caceres"))));
	}

	public static String fotitos(String timepo) {
		String imagen = null;
		if (timepo.equalsIgnoreCase("Aguanieve")) {
			imagen = "Imagenes/Aguanieve.png";
		} else if (timepo.equalsIgnoreCase("Bruma")) {
			imagen = "Imagenes/Bruma.png";
		} else if (timepo.equalsIgnoreCase("Chubascos aislados")) {
			imagen = "Imagenes/Chubascos aislados.png";
		} else if (timepo.equalsIgnoreCase("Chubascos de nieve")) {
			imagen = "Imagenes/Chubascos de nieve.png";
		} else if (timepo.equalsIgnoreCase("Chubascos débiles")) {
			imagen = "Imagenes/Chubascos débiles.png";
		} else if (timepo.equalsIgnoreCase("Chubascos")) {
			imagen = "Imagenes/Chubascos.png";
		} else if (timepo.equalsIgnoreCase("Cubierto")) {
			imagen = "Imagenes/Cubierto.png";
		} else if (timepo.equalsIgnoreCase("Granizo")) {
			imagen = "Imagenes/Granizo.png";
		} else if (timepo.equalsIgnoreCase("Intervalos de sol")) {
			imagen = "Imagenes/Intervalos de sol.png";
		} else if (timepo.equalsIgnoreCase("Lluvia")) {
			imagen = "Imagenes/Lluvia.png";
		} else if (timepo.equalsIgnoreCase("Nevada dévil")) {
			imagen = "Imagenes/Nevada dévil.png";
		} else if (timepo.equalsIgnoreCase("Niebla")) {
			imagen = "Imagenes/Niebla.png";
		} else if (timepo.equalsIgnoreCase("Nieve")) {
			imagen = "Imagenes/Nieve.png";
		} else if (timepo.equalsIgnoreCase("Muy nuboso")) {
			imagen = "Imagenes/Nuboso.png";
		} else if (timepo.equalsIgnoreCase("Parcialmente nuboso")) {
			imagen = "Imagenes/Periodos de sol.png";
		} else if (timepo.equalsIgnoreCase("Soleado")) {
			imagen = "Imagenes/Soleado.png";
		} else if (timepo.equalsIgnoreCase("Tormentas")) {
			imagen = "Imagenes/Tormentas.png";
		} else if (timepo.equalsIgnoreCase("Lluvia débil")) {
			imagen = "Imagenes/Lluvia débil.png";
		} else if (timepo.equalsIgnoreCase("Chubascos dispersos")) {
			imagen = "Imagenes/Chubascos dispersos.png";
		}
		return imagen;
	}

	// Método para reproducir sonido (lo mismo que proporcionaste anteriormente)
	public void makeSound(String ruta) throws InterruptedException {
		try {
			AudioInputStream audio = AudioSystem.getAudioInputStream(new File(ruta).getAbsoluteFile());
			Clip sonido = AudioSystem.getClip();
			sonido.open(audio);
			sonido.start();
			
		} catch (UnsupportedAudioFileException | IOException | LineUnavailableException ex) {
			System.out.println("Error");
		}
	}
}
