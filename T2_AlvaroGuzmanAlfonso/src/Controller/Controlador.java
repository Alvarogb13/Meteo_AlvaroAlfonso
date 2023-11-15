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
	
	ArrayList<String> Andalucia = new ArrayList<>();
	ArrayList<String> Baleares = new ArrayList<>();
	ArrayList<String> Canarias = new ArrayList<>();
	ArrayList<String> CastillaLeon = new ArrayList<>();
	ArrayList<String> CastillaMancha = new ArrayList<>();
	ArrayList<String> Cataluña = new ArrayList<>();
	ArrayList<String> Estremadura = new ArrayList<>();
	ArrayList<String> Galicia = new ArrayList<>();
	ArrayList<String> Madrid = new ArrayList<>();
	ArrayList<String> Murcia = new ArrayList<>();
	ArrayList<String> Navarra = new ArrayList<>();
	ArrayList<String> PaisVasco = new ArrayList<>();
	ArrayList<String> LaRioja = new ArrayList<>();
	ArrayList<String> Valencia = new ArrayList<>();
	ArrayList<String> Aragon = new ArrayList<>();
	ArrayList<String> Asturias = new ArrayList<>();
	ArrayList<String> cantabria = new ArrayList<>();
	

	Vista vista = new Vista();
	public Controlador(Vista frame) {
		vista=frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
	}
}
