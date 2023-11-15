package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import View.Vista;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import Model.Ciudad;

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

	    // Aquí puedes implementar lógica para recuperar y analizar información climatológica desde las URLs JSON.
	    // Puedes usar Gson u otra biblioteca para trabajar con JSON.
	    // También podrías tener métodos para obtener el pronóstico de una ciudad específica, etc.
	    // ...

	
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
