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
import Model.Ciudad;
import Model.Pronostico;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;


public class Controlador implements ActionListener {
	
	
		private List<Ciudad> ciudades;
		Vista vista = new Vista();
		
		public Controlador(Vista frame) {
			vista=frame;
			this.vista.BuscarCM.addActionListener(this);
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			int numero;
			if (e.getSource() == this.vista.BuscarCM) {
				numero=vista.comboBox.getSelectedIndex();
				if (numero == 1) {
					vista.andalucia.setVisible(true);
					vista.Mapa.setVisible(false);
				} else if (numero == 2) {
					vista.Valencia.setVisible(true);
					vista.Mapa.setVisible(false);
				} else if (numero == 3) {
					vista.Cataluña.setVisible(true);
					vista.Mapa.setVisible(false);
				} else if (numero == 4) {
					vista.Extremadura.setVisible(true);
					vista.Mapa.setVisible(false);
				} else if (numero == 5) {
					vista.Galicia.setVisible(true);
					vista.Mapa.setVisible(false);
				} else if (numero == 6) {
					vista.Madrid.setVisible(true);
					vista.Mapa.setVisible(false);
				}else if (numero == 6) {
					vista.Murcia.setVisible(true);
					vista.Mapa.setVisible(false);
				}else if (numero == 6) {
					vista.Navarra.setVisible(true);
					vista.Mapa.setVisible(false);
				}else if (numero == 6) {
					vista.Pais_Vasco.setVisible(true);
					vista.Mapa.setVisible(false);
				}else if (numero == 6) {
					vista.LaRioja.setVisible(true);
					vista.Mapa.setVisible(false);
				}else if (numero == 6) {
					vista.Aragon.setVisible(true);
					vista.Mapa.setVisible(false);
				}else if (numero == 6) {
					vista.Baleares.setVisible(true);
					vista.Mapa.setVisible(false);
				} else if (numero == 6) {
					vista.Baleares.setVisible(true);
					vista.Mapa.setVisible(false);
				}else if (numero == 6) {
					vista.Canarias.setVisible(true);
					vista.Mapa.setVisible(false);
				}else if (numero == 6) {
					vista.CM.setVisible(true);
					vista.Mapa.setVisible(false);
				}else if (numero == 6) {
					vista.Mapa.setVisible(true);
					vista.Mapa.setVisible(false);
				}
			}
		}
		
		
		
		
	    public Controlador() {
	        cargarCiudadesDesdeConfig();
	    }

	    private void cargarCiudadesDesdeConfig() {
	        ciudades = new ArrayList<>();

	        Properties configuracion = new Properties();

	        try {
	            configuracion.load(new FileReader("src/resources/config.properties"));
	            Set<String> nombresCiudades = configuracion.stringPropertyNames();

	            for (String nombreCiudad : nombresCiudades) {
	                String urlJson = configuracion.getProperty(nombreCiudad);
	                Ciudad ciudad = new Ciudad(nombreCiudad, urlJson);
	                ciudades.add(ciudad);
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }

	    public List<Ciudad> getCiudades() {
	        return ciudades;
	    }
	    
	 // Método para obtener el pronóstico de una ciudad específica
	    @SuppressWarnings("deprecation")
		public List<Pronostico> obtenerPronostico(String nombreCiudad) {
	        List<Pronostico> pronosticos = new ArrayList<>();

	        for (Ciudad ciudad : ciudades) {
	            if (ciudad.getNombre().equals(nombreCiudad)) {
	                try {
	                    URL url = new URL(ciudad.getUrlJson());
	                    HttpURLConnection connection = (HttpURLConnection) url.openConnection();
	                    connection.setRequestMethod("GET");

	                    BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
	                    StringBuilder response = new StringBuilder();
	                    String line;

	                    while ((line = reader.readLine()) != null) {
	                        response.append(line);
	                    }

	                    reader.close();
	                    connection.disconnect();

	                    // Analizar la respuesta JSON
						JsonParser jsonParser = new JsonParser();
	                    JsonObject jsonResponse = jsonParser.parse(response.toString()).getAsJsonObject();

	                    // Adaptar el análisis según la estructura real de tu JSON
	                    JsonArray pronosticoArray = jsonResponse.getAsJsonArray("daily_forecast");
	                    for (int i = 0; i < pronosticoArray.size(); i++) {
	                        JsonObject pronosticoJson = pronosticoArray.get(i).getAsJsonObject();
	                        Pronostico pronostico = new Pronostico(
	                                pronosticoJson.get("date").getAsString(),
	                                nombreCiudad,
	                                pronosticoJson.getAsJsonObject("temperature").get("max").getAsDouble(),
	                                pronosticoJson.getAsJsonObject("temperature").get("min").getAsDouble(),
	                                pronosticoJson.getAsJsonObject("day").get("condition").getAsString()
	                        );
	                        pronosticos.add(pronostico);
	                    }
	                } catch (Exception e) {
	                    e.printStackTrace();
	                }
	            }
	        }

	        return pronosticos;
	    }
	
	static ArrayList<String> Andalucia = new ArrayList<>();
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
		Andalucia.add("Huelva");
		Andalucia.add("Sevilla");
		Andalucia.add("Cadiz");
		Andalucia.add("Malaga");
		Andalucia.add("Cordoba");
		Andalucia.add("Jaen");
		Andalucia.add("Granada");
		Andalucia.add("Almaeria");
		
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
