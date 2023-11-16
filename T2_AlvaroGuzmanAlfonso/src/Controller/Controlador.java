package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import View.Vista;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import javax.swing.DefaultComboBoxModel;

import Model.Ciudad;
import Model.Pronostico;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;


public class Controlador implements ActionListener {
	
	
		private List<Ciudad> ciudades;
		Vista vista = new Vista();
		
		public Controlador(Vista frame) {
			vista = frame;
			this.vista.BuscarCM.addActionListener(this);
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			int numero;
			if (e.getSource() == this.vista.BuscarCM) {
				numero=vista.comboBox.getSelectedIndex();
				if (numero == 1) {
					vista.andalucia.setVisible(true);
					vista.Mapa.setVisible(false); vista.CM.setVisible(false); vista.Canarias.setVisible(false);vista.Baleares.setVisible(false);vista.Aragon.setVisible(false);vista.LaRioja.setVisible(false);
					vista.Pais_Vasco.setVisible(false);vista.Navarra.setVisible(false);vista.Murcia.setVisible(false);vista.Madrid.setVisible(false);vista.Galicia.setVisible(false);vista.Extremadura.setVisible(false);
					vista.Cataluña.setVisible(false);vista.Valencia.setVisible(false);vista.Asturias.setVisible(false);vista.Cantabria.setVisible(false);vista.CL.setVisible(false);
					vista.comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"PROVINCIA", "HUELVA", "SEVILLA", "CADIZ", "MALAGA", "CORDOBA", "JAEN", "GRANADA", "ALMAERIA"}));
					
				} else if (numero == 2) {
					vista.Valencia.setVisible(true);
					vista.Mapa.setVisible(false); vista.CM.setVisible(false); vista.Canarias.setVisible(false);vista.Baleares.setVisible(false);vista.Aragon.setVisible(false);vista.LaRioja.setVisible(false);
					vista.Pais_Vasco.setVisible(false);vista.Navarra.setVisible(false);vista.Murcia.setVisible(false);vista.Madrid.setVisible(false);vista.Galicia.setVisible(false);vista.Extremadura.setVisible(false);
					vista.Cataluña.setVisible(false);vista.andalucia.setVisible(false); vista.Asturias.setVisible(false);vista.Cantabria.setVisible(false);vista.CL.setVisible(false);
					vista.comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"PROVINCIA", "VALENCIA"}));
				} else if (numero == 3) {
					vista.Cataluña.setVisible(true);
					vista.Mapa.setVisible(false); vista.CM.setVisible(false); vista.Canarias.setVisible(false);vista.Baleares.setVisible(false);vista.Aragon.setVisible(false);vista.LaRioja.setVisible(false);
					vista.Pais_Vasco.setVisible(false);vista.Navarra.setVisible(false);vista.Murcia.setVisible(false);vista.Madrid.setVisible(false);vista.Galicia.setVisible(false);vista.Extremadura.setVisible(false);
					vista.Valencia.setVisible(false);vista.andalucia.setVisible(false); vista.Asturias.setVisible(false);vista.Cantabria.setVisible(false);vista.CL.setVisible(false);
					vista.comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"PROVINCIA", "BARCELONA", "GIRONA", "TARRAGONA", "LERIDA"}));
				} else if (numero == 4) {
					vista.Extremadura.setVisible(true);
					vista.Mapa.setVisible(false); vista.CM.setVisible(false); vista.Canarias.setVisible(false);vista.Baleares.setVisible(false);vista.Aragon.setVisible(false);vista.LaRioja.setVisible(false);
					vista.Pais_Vasco.setVisible(false);vista.Navarra.setVisible(false);vista.Murcia.setVisible(false);vista.Madrid.setVisible(false);vista.Galicia.setVisible(false);vista.CL.setVisible(false);
					vista.Cataluña.setVisible(false);vista.Valencia.setVisible(false);vista.andalucia.setVisible(false); vista.Asturias.setVisible(false);vista.Cantabria.setVisible(false);
					vista.comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"PROVINCIA", "CACERES", "BADAJOZ"}));
				} else if (numero == 5) {
					vista.Galicia.setVisible(true);
					vista.Mapa.setVisible(false); vista.CM.setVisible(false); vista.Canarias.setVisible(false);vista.Baleares.setVisible(false);vista.Aragon.setVisible(false);vista.LaRioja.setVisible(false);
					vista.Pais_Vasco.setVisible(false);vista.Navarra.setVisible(false);vista.Murcia.setVisible(false);vista.Madrid.setVisible(false);vista.Extremadura.setVisible(false);vista.CL.setVisible(false);
					vista.Cataluña.setVisible(false);vista.Valencia.setVisible(false);vista.andalucia.setVisible(false); vista.Asturias.setVisible(false);vista.Cantabria.setVisible(false);
					vista.comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"PROVINCIA", "LA CORUÑA", "ORENSE", "LUGO", "PONTEVEDRA"}));
				} else if (numero == 6) {
					vista.Madrid.setVisible(true);
					vista.Mapa.setVisible(false); vista.CM.setVisible(false); vista.Canarias.setVisible(false);vista.Baleares.setVisible(false);vista.Aragon.setVisible(false);vista.LaRioja.setVisible(false);
					vista.Pais_Vasco.setVisible(false);vista.Navarra.setVisible(false);vista.Murcia.setVisible(false);vista.Galicia.setVisible(false);vista.Extremadura.setVisible(false);vista.CL.setVisible(false);
					vista.Cataluña.setVisible(false);vista.Valencia.setVisible(false);vista.andalucia.setVisible(false); vista.Asturias.setVisible(false);vista.Cantabria.setVisible(false);
					vista.comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"PROVINCIA", "MADRID"}));
				} else if (numero == 7) {
					vista.Murcia.setVisible(true);
					vista.Mapa.setVisible(false);vista.CM.setVisible(false); vista.Canarias.setVisible(false);vista.Baleares.setVisible(false);vista.Aragon.setVisible(false);vista.LaRioja.setVisible(false);
					vista.Pais_Vasco.setVisible(false);vista.Navarra.setVisible(false);vista.Madrid.setVisible(false);vista.Galicia.setVisible(false);vista.Extremadura.setVisible(false);vista.CL.setVisible(false);
					vista.Cataluña.setVisible(false);vista.Valencia.setVisible(false);vista.andalucia.setVisible(false); vista.Asturias.setVisible(false);vista.Cantabria.setVisible(false);
					vista.comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"PROVINCIA", "MURCIA"}));
				} else if (numero == 8) {
					vista.Navarra.setVisible(true);
					vista.Mapa.setVisible(false); vista.CM.setVisible(false); vista.Canarias.setVisible(false);vista.Baleares.setVisible(false);vista.Aragon.setVisible(false);vista.LaRioja.setVisible(false);
					vista.Pais_Vasco.setVisible(false);vista.Murcia.setVisible(false);vista.Madrid.setVisible(false);vista.Galicia.setVisible(false);vista.Extremadura.setVisible(false);vista.CL.setVisible(false);
					vista.Cataluña.setVisible(false);vista.Valencia.setVisible(false);vista.andalucia.setVisible(false); vista.Asturias.setVisible(false);vista.Cantabria.setVisible(false);
					vista.comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"PROVINCIA", "PAMPLONA"}));
				} else if (numero == 9) {
					vista.Pais_Vasco.setVisible(true);
					vista.Mapa.setVisible(false); vista.CM.setVisible(false); vista.Canarias.setVisible(false);vista.Baleares.setVisible(false);vista.Aragon.setVisible(false);vista.LaRioja.setVisible(false);
					vista.Navarra.setVisible(false);vista.Murcia.setVisible(false);vista.Madrid.setVisible(false);vista.Galicia.setVisible(false);vista.Extremadura.setVisible(false);vista.CL.setVisible(false);
					vista.Cataluña.setVisible(false);vista.Valencia.setVisible(false);vista.andalucia.setVisible(false); vista.Asturias.setVisible(false);vista.Cantabria.setVisible(false);
					vista.comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"PROVINCIA", "VIZCAYA", "GUIPUZCUA", "ALAVA"}));
				} else if (numero == 10) {
					vista.LaRioja.setVisible(true);
					vista.Mapa.setVisible(false); vista.CM.setVisible(false); vista.Canarias.setVisible(false);vista.Baleares.setVisible(false);vista.Aragon.setVisible(false);vista.CL.setVisible(false);
					vista.Pais_Vasco.setVisible(false);vista.Navarra.setVisible(false);vista.Murcia.setVisible(false);vista.Madrid.setVisible(false);vista.Galicia.setVisible(false);vista.Extremadura.setVisible(false);
					vista.Cataluña.setVisible(false);vista.Valencia.setVisible(false);vista.andalucia.setVisible(false); vista.Asturias.setVisible(false);vista.Cantabria.setVisible(false);
					vista.comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"PROVINCIA", "LOGROÑO"}));
				} else if (numero == 11) {
					vista.Aragon.setVisible(true);
					vista.Mapa.setVisible(false); vista.CM.setVisible(false); vista.Canarias.setVisible(false);vista.Baleares.setVisible(false);vista.LaRioja.setVisible(false);vista.CL.setVisible(false);
					vista.Pais_Vasco.setVisible(false);vista.Navarra.setVisible(false);vista.Murcia.setVisible(false);vista.Madrid.setVisible(false);vista.Galicia.setVisible(false);vista.Extremadura.setVisible(false);
					vista.Cataluña.setVisible(false);vista.Valencia.setVisible(false);vista.andalucia.setVisible(false); vista.Asturias.setVisible(false);vista.Cantabria.setVisible(false);
					vista.comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"PROVINCIA", "HUESCA", "ZARAGOZA", "TERUEL"}));
				} else if (numero == 12) {
					vista.Baleares.setVisible(true);
					vista.Mapa.setVisible(false); vista.CM.setVisible(false); vista.Canarias.setVisible(false);vista.Aragon.setVisible(false);vista.LaRioja.setVisible(false);vista.CL.setVisible(false);
					vista.Pais_Vasco.setVisible(false);vista.Navarra.setVisible(false);vista.Murcia.setVisible(false);vista.Madrid.setVisible(false);vista.Galicia.setVisible(false);vista.Extremadura.setVisible(false);
					vista.Cataluña.setVisible(false);vista.Valencia.setVisible(false);vista.andalucia.setVisible(false); vista.Asturias.setVisible(false);vista.Cantabria.setVisible(false);
					vista.comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"PROVINCIA", "MALLORCA", "MENORCA", "CABRERA", "FORMENTERA", "IBIZA"}));
				} else if (numero == 13) {
					vista.Canarias.setVisible(true);
					vista.Mapa.setVisible(false); vista.CM.setVisible(false);vista.Baleares.setVisible(false);vista.Aragon.setVisible(false);vista.LaRioja.setVisible(false);vista.CL.setVisible(false);
					vista.Pais_Vasco.setVisible(false);vista.Navarra.setVisible(false);vista.Murcia.setVisible(false);vista.Madrid.setVisible(false);vista.Galicia.setVisible(false);vista.Extremadura.setVisible(false);
					vista.Cataluña.setVisible(false);vista.Valencia.setVisible(false);vista.andalucia.setVisible(false); vista.Asturias.setVisible(false);vista.Cantabria.setVisible(false);
					vista.comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"PROVINCIA", "LA PALMA", "GOMERA", "HIERRO", "TENERIFE", "GRAN CANARIA", "LANZAROTE", "FUENTEVENTURA"}));
				} else if (numero == 14) {
					vista.CL.setVisible(true);
					vista.Mapa.setVisible(false); vista.CM.setVisible(false); vista.Canarias.setVisible(false);vista.Aragon.setVisible(false);vista.LaRioja.setVisible(false);
					vista.Pais_Vasco.setVisible(false);vista.Navarra.setVisible(false);vista.Murcia.setVisible(false);vista.Madrid.setVisible(false);vista.Galicia.setVisible(false);vista.Extremadura.setVisible(false);
					vista.Cataluña.setVisible(false);vista.Valencia.setVisible(false);vista.andalucia.setVisible(false); vista.Asturias.setVisible(false);vista.Cantabria.setVisible(false);
					vista.comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"PROVINCIA", "LEON", "PALENCIA", "BURGOS", "ZAMORA", "SALAMANCA", "AVILA", "SEGOVIA", "VALLADOLID", "SORIA"}));
				} else if (numero == 15) {
					vista.CM.setVisible(true);
					vista.Mapa.setVisible(false); vista.Canarias.setVisible(false);vista.Baleares.setVisible(false);vista.Aragon.setVisible(false);vista.LaRioja.setVisible(false);vista.CL.setVisible(false);
					vista.Pais_Vasco.setVisible(false);vista.Navarra.setVisible(false);vista.Murcia.setVisible(false);vista.Madrid.setVisible(false);vista.Galicia.setVisible(false);vista.Extremadura.setVisible(false);
					vista.Cataluña.setVisible(false);vista.Valencia.setVisible(false);vista.andalucia.setVisible(false); vista.Asturias.setVisible(false);vista.Cantabria.setVisible(false);
					vista.comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"PROVINCIA", "CIUDAD REAL", "ALBACETE", "GUADALAJARA", "CUENCA", "TOLEDO"}));
				} else if (numero == 16) {
					vista.Cantabria.setVisible(true);
					vista.Mapa.setVisible(false); vista.CM.setVisible(false); vista.Canarias.setVisible(false);vista.Baleares.setVisible(false);vista.Aragon.setVisible(false);vista.LaRioja.setVisible(false);
					vista.Pais_Vasco.setVisible(false);vista.Navarra.setVisible(false);vista.Murcia.setVisible(false);vista.Madrid.setVisible(false);vista.Galicia.setVisible(false);vista.Extremadura.setVisible(false);
					vista.Cataluña.setVisible(false);vista.Valencia.setVisible(false);vista.andalucia.setVisible(false); vista.Asturias.setVisible(false);vista.CL.setVisible(false);
					vista.comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"PROVINCIA", "CANTABRIA"}));
				} else if (numero == 17) {
					vista.Asturias.setVisible(true);
					vista.Mapa.setVisible(false); vista.CM.setVisible(false); vista.Canarias.setVisible(false);vista.Baleares.setVisible(false);vista.Aragon.setVisible(false);vista.LaRioja.setVisible(false);
					vista.Pais_Vasco.setVisible(false);vista.Navarra.setVisible(false);vista.Murcia.setVisible(false);vista.Madrid.setVisible(false);vista.Galicia.setVisible(false);vista.Extremadura.setVisible(false);
					vista.Cataluña.setVisible(false);vista.Valencia.setVisible(false);vista.andalucia.setVisible(false);vista.Cantabria.setVisible(false);vista.CL.setVisible(false);
					vista.comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"PROVINCIA", "OVIEDO"}));
				} else if (numero == 18) {
					vista.Mapa.setVisible(true);
					vista.CM.setVisible(false); vista.Canarias.setVisible(false);vista.Baleares.setVisible(false);vista.Aragon.setVisible(false);vista.LaRioja.setVisible(false);vista.CL.setVisible(false);
					vista.Pais_Vasco.setVisible(false);vista.Navarra.setVisible(false);vista.Murcia.setVisible(false);vista.Madrid.setVisible(false);vista.Galicia.setVisible(false);vista.Extremadura.setVisible(false);
					vista.Cataluña.setVisible(false);vista.Valencia.setVisible(false);vista.andalucia.setVisible(false); vista.Asturias.setVisible(false);vista.Cantabria.setVisible(false);
					vista.comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"PROVINCIA"}));
				}
			}
		}
	    public Controlador() {
	        cargarCiudadesDesdeConfig();
	    }

	    private void cargarCiudadesDesdeConfig() {
	    	//Convertimos el JSON de cada ciudad en un objeto Ciudad
	    	ciudades = new ArrayList<>();

	        Properties configuracion = new Properties();

	        try {
	            configuracion.load(new FileReader("src/resources/config.properties"));
	            Set<String> nombresCiudades = configuracion.stringPropertyNames();

	            Gson gson = new Gson();

	            for (String nombreCiudad : nombresCiudades) {
	                String jsonCiudadString = configuracion.getProperty(nombreCiudad);
	                JsonObject jsonCiudad = JsonParser.parseString(jsonCiudadString).getAsJsonObject();

	                Ciudad ciudad = gson.fromJson(jsonCiudad, Ciudad.class);
	                ciudades.add(ciudad);
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }

	    public List<Ciudad> getCiudades() {
	        return ciudades;
	    }
	    
	    public List<Pronostico> obtenerPronostico(String nombreCiudad) {
	        List<Pronostico> pronosticos = new ArrayList<>();

	        for (Ciudad ciudad : ciudades) {
	            if (ciudad.getNombre().equals(nombreCiudad)) {
	                try {
	                    URL url = new URL(ciudad.getUrlJson());
	                    HttpURLConnection connection = (HttpURLConnection) url.openConnection();
	                    connection.setRequestMethod("GET");

	                    try (BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
	                        StringBuilder response = new StringBuilder();
	                        String line;

	                        while ((line = reader.readLine()) != null) {
	                            response.append(line);
	                        }

	                        // Deserializar el JSON
	                        Gson gson = new Gson();
	                        JsonObject jsonResponse = gson.fromJson(response.toString(), JsonObject.class);

	                        // Obtener el pronóstico diario
	                        JsonArray pronosticoArray = jsonResponse.getAsJsonArray("daily_forecast");
	                        for (int i = 0; i < pronosticoArray.size(); i++) {
	                            JsonObject pronosticoJson = pronosticoArray.get(i).getAsJsonObject();
	                            Pronostico pronostico = gson.fromJson(pronosticoJson, Pronostico.class);
	                            pronosticos.add(pronostico);
	                        }
	                    }
	                } catch (IOException e) {
	                    e.printStackTrace();
	                }
	            }
	        }

	        return pronosticos;
	    }


	

	static ArrayList<String> Baleares = new ArrayList<>();
	static ArrayList<String> Canarias = new ArrayList<>();
	static ArrayList<String> CastillaLeon = new ArrayList<>();
	static ArrayList<String> CastillaMancha = new ArrayList<>();
	static ArrayList<String> Cataluña = new ArrayList<>();
	static ArrayList<String> Estremadura = new ArrayList<>();
	static ArrayList<String> Galicia = new ArrayList<>();
	static ArrayList<String> Navarra = new ArrayList<>();
	static ArrayList<String> PaisVasco = new ArrayList<>();
	static ArrayList<String> Aragon = new ArrayList<>();
	
	public static void main(String[] args) {

		
		Baleares.add("Ibiza");
		Baleares.add("Formentera");
		Baleares.add("Cabrera");
		Baleares.add("Mallorca");
		Baleares.add("Menorca");
		
		Canarias.add("La Palma");
		Canarias.add("Gomera");
		Canarias.add("Hierro");
		Canarias.add("Tenerife");
		Canarias.add("Gran Canaria");
		Canarias.add("Lanzarote");
		Canarias.add("Fuenteventura");
		
		CastillaLeon.add("Leon");
		CastillaLeon.add("Palencia");
		CastillaLeon.add("Burgos");
		CastillaLeon.add("Zamora");
		CastillaLeon.add("Salamanca");
		CastillaLeon.add("Avila");
		CastillaLeon.add("Segovia");
		CastillaLeon.add("Valladolid");
		CastillaLeon.add("Soria");
		
		CastillaMancha.add("Toledo");
		CastillaMancha.add("Cuenca");
		CastillaMancha.add("Ciudad Real");
		CastillaMancha.add("Albacete");
		CastillaMancha.add("Guadalajara");
		
		Cataluña.add("Lerida");
		Cataluña.add("Tarragona");
		Cataluña.add("Barcelona");
		Cataluña.add("Gerona");
		
		Estremadura.add("Caceres");
		Estremadura.add("Badajoz");
		
		Galicia.add("La Coruña");
		Galicia.add("Lugo");
		Galicia.add("Pontevedra");
		Galicia.add("Orense");
		
		PaisVasco.add("Vizcaya");
		PaisVasco.add("Guipuzcua");
		PaisVasco.add("Alava");
		
		Aragon.add("Huesca");
		Aragon.add("Zaragoza");
		Aragon.add("Teruel");
		
		
		
	}
	
	
}
