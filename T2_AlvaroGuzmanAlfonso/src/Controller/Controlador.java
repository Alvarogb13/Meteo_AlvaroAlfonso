package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;

import View.Vista;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
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
import com.google.gson.stream.JsonReader;


public class Controlador implements ActionListener {
	
	
		private List<Ciudad> ciudades;
		Vista vista = new Vista();
		
		public Controlador(Vista frame) {
			vista = frame;
			this.vista.BuscarCM.addActionListener(this);
			this.vista.BuscarPro.addActionListener(this);
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			int numero, numero2;
			if (e.getSource() == this.vista.BuscarCM) {
				numero=vista.comboBox.getSelectedIndex();
				//Aqui en estos if he pensado en que si ves posible hacer un método y trabajar con el this, yo lo veo viable nao? para no tener tanta linea de codigo, de todas maneras la optimizacion la dejamos para cuando la app sea funcional si quieres, si lo ves easy de hacer guay sino np bru
				if (numero > 0) { //Si numero es mayor que 0 (siempre que entremos en un if va a ser mayor que 0 así que entra siempre jeje)
					if (numero == 1) {
						vista.andalucia.setVisible(true);
						vista.Mapa.setVisible(false); vista.CM.setVisible(false); vista.Canarias.setVisible(false);vista.Baleares.setVisible(false);vista.Aragon.setVisible(false);vista.LaRioja.setVisible(false);
						vista.Pais_Vasco.setVisible(false);vista.Navarra.setVisible(false);vista.Murcia.setVisible(false);vista.Madrid.setVisible(false);vista.Galicia.setVisible(false);vista.Extremadura.setVisible(false);
						vista.Catalunia.setVisible(false);vista.Valencia.setVisible(false);vista.Asturias.setVisible(false);vista.Cantabria.setVisible(false);vista.CL.setVisible(false);
						vista.comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"PROVINCIA", "Huelva", "Sevilla", "Cadiz", "Malaga", "Cordoba", "Jaen", "Granada", "Almeria"}));
						
					} else if (numero == 2) {
						vista.Valencia.setVisible(true);
						vista.Mapa.setVisible(false); vista.CM.setVisible(false); vista.Canarias.setVisible(false);vista.Baleares.setVisible(false);vista.Aragon.setVisible(false);vista.LaRioja.setVisible(false);
						vista.Pais_Vasco.setVisible(false);vista.Navarra.setVisible(false);vista.Murcia.setVisible(false);vista.Madrid.setVisible(false);vista.Galicia.setVisible(false);vista.Extremadura.setVisible(false);
						vista.Catalunia.setVisible(false);vista.andalucia.setVisible(false); vista.Asturias.setVisible(false);vista.Cantabria.setVisible(false);vista.CL.setVisible(false);
						vista.comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"PROVINCIA", "Valencia"}));
					} else if (numero == 3) {
						vista.Catalunia.setVisible(true);
						vista.Mapa.setVisible(false); vista.CM.setVisible(false); vista.Canarias.setVisible(false);vista.Baleares.setVisible(false);vista.Aragon.setVisible(false);vista.LaRioja.setVisible(false);
						vista.Pais_Vasco.setVisible(false);vista.Navarra.setVisible(false);vista.Murcia.setVisible(false);vista.Madrid.setVisible(false);vista.Galicia.setVisible(false);vista.Extremadura.setVisible(false);
						vista.Valencia.setVisible(false);vista.andalucia.setVisible(false); vista.Asturias.setVisible(false);vista.Cantabria.setVisible(false);vista.CL.setVisible(false);
						vista.comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"PROVINCIA", "Barcelona", "Girona", "Tarragona", "Lerida"}));
					} else if (numero == 4) {
						vista.Extremadura.setVisible(true);
						vista.Mapa.setVisible(false); vista.CM.setVisible(false); vista.Canarias.setVisible(false);vista.Baleares.setVisible(false);vista.Aragon.setVisible(false);vista.LaRioja.setVisible(false);
						vista.Pais_Vasco.setVisible(false);vista.Navarra.setVisible(false);vista.Murcia.setVisible(false);vista.Madrid.setVisible(false);vista.Galicia.setVisible(false);vista.CL.setVisible(false);
						vista.Catalunia.setVisible(false);vista.Valencia.setVisible(false);vista.andalucia.setVisible(false); vista.Asturias.setVisible(false);vista.Cantabria.setVisible(false);
						vista.comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"PROVINCIA", "Caceres", "Badajoz"}));
					} else if (numero == 5) {
						vista.Galicia.setVisible(true);
						vista.Mapa.setVisible(false); vista.CM.setVisible(false); vista.Canarias.setVisible(false);vista.Baleares.setVisible(false);vista.Aragon.setVisible(false);vista.LaRioja.setVisible(false);
						vista.Pais_Vasco.setVisible(false);vista.Navarra.setVisible(false);vista.Murcia.setVisible(false);vista.Madrid.setVisible(false);vista.Extremadura.setVisible(false);vista.CL.setVisible(false);
						vista.Catalunia.setVisible(false);vista.Valencia.setVisible(false);vista.andalucia.setVisible(false); vista.Asturias.setVisible(false);vista.Cantabria.setVisible(false);
						vista.comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"PROVINCIA", "ACorunia", "Ourense", "Lugo", "Pontevedra"}));
					} else if (numero == 6) {
						vista.Madrid.setVisible(true);
						vista.Mapa.setVisible(false); vista.CM.setVisible(false); vista.Canarias.setVisible(false);vista.Baleares.setVisible(false);vista.Aragon.setVisible(false);vista.LaRioja.setVisible(false);
						vista.Pais_Vasco.setVisible(false);vista.Navarra.setVisible(false);vista.Murcia.setVisible(false);vista.Galicia.setVisible(false);vista.Extremadura.setVisible(false);vista.CL.setVisible(false);
						vista.Catalunia.setVisible(false);vista.Valencia.setVisible(false);vista.andalucia.setVisible(false); vista.Asturias.setVisible(false);vista.Cantabria.setVisible(false);
						vista.comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"PROVINCIA", "Madrid"}));
					} else if (numero == 7) {
						vista.Murcia.setVisible(true);
						vista.Mapa.setVisible(false);vista.CM.setVisible(false); vista.Canarias.setVisible(false);vista.Baleares.setVisible(false);vista.Aragon.setVisible(false);vista.LaRioja.setVisible(false);
						vista.Pais_Vasco.setVisible(false);vista.Navarra.setVisible(false);vista.Madrid.setVisible(false);vista.Galicia.setVisible(false);vista.Extremadura.setVisible(false);vista.CL.setVisible(false);
						vista.Catalunia.setVisible(false);vista.Valencia.setVisible(false);vista.andalucia.setVisible(false); vista.Asturias.setVisible(false);vista.Cantabria.setVisible(false);
						vista.comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"PROVINCIA", "Murcia"}));
					} else if (numero == 8) {
						vista.Navarra.setVisible(true);
						vista.Mapa.setVisible(false); vista.CM.setVisible(false); vista.Canarias.setVisible(false);vista.Baleares.setVisible(false);vista.Aragon.setVisible(false);vista.LaRioja.setVisible(false);
						vista.Pais_Vasco.setVisible(false);vista.Murcia.setVisible(false);vista.Madrid.setVisible(false);vista.Galicia.setVisible(false);vista.Extremadura.setVisible(false);vista.CL.setVisible(false);
						vista.Catalunia.setVisible(false);vista.Valencia.setVisible(false);vista.andalucia.setVisible(false); vista.Asturias.setVisible(false);vista.Cantabria.setVisible(false);
						vista.comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"PROVINCIA", "Pamplona"}));
					} else if (numero == 9) {
						vista.Pais_Vasco.setVisible(true);
						vista.Mapa.setVisible(false); vista.CM.setVisible(false); vista.Canarias.setVisible(false);vista.Baleares.setVisible(false);vista.Aragon.setVisible(false);vista.LaRioja.setVisible(false);
						vista.Navarra.setVisible(false);vista.Murcia.setVisible(false);vista.Madrid.setVisible(false);vista.Galicia.setVisible(false);vista.Extremadura.setVisible(false);vista.CL.setVisible(false);
						vista.Catalunia.setVisible(false);vista.Valencia.setVisible(false);vista.andalucia.setVisible(false); vista.Asturias.setVisible(false);vista.Cantabria.setVisible(false);
						vista.comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"PROVINCIA", "Vizcaya", "Guipuzcoa", "Alava"}));
					} else if (numero == 10) {
						vista.LaRioja.setVisible(true);
						vista.Mapa.setVisible(false); vista.CM.setVisible(false); vista.Canarias.setVisible(false);vista.Baleares.setVisible(false);vista.Aragon.setVisible(false);vista.CL.setVisible(false);
						vista.Pais_Vasco.setVisible(false);vista.Navarra.setVisible(false);vista.Murcia.setVisible(false);vista.Madrid.setVisible(false);vista.Galicia.setVisible(false);vista.Extremadura.setVisible(false);
						vista.Catalunia.setVisible(false);vista.Valencia.setVisible(false);vista.andalucia.setVisible(false); vista.Asturias.setVisible(false);vista.Cantabria.setVisible(false);
						vista.comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"PROVINCIA", "Logronio"}));
					} else if (numero == 11) {
						vista.Aragon.setVisible(true);
						vista.Mapa.setVisible(false); vista.CM.setVisible(false); vista.Canarias.setVisible(false);vista.Baleares.setVisible(false);vista.LaRioja.setVisible(false);vista.CL.setVisible(false);
						vista.Pais_Vasco.setVisible(false);vista.Navarra.setVisible(false);vista.Murcia.setVisible(false);vista.Madrid.setVisible(false);vista.Galicia.setVisible(false);vista.Extremadura.setVisible(false);
						vista.Catalunia.setVisible(false);vista.Valencia.setVisible(false);vista.andalucia.setVisible(false); vista.Asturias.setVisible(false);vista.Cantabria.setVisible(false);
						vista.comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"PROVINCIA", "Huesca", "Zaragoza", "Teruel"}));
					} else if (numero == 12) {
						vista.Baleares.setVisible(true);
						vista.Mapa.setVisible(false); vista.CM.setVisible(false); vista.Canarias.setVisible(false);vista.Aragon.setVisible(false);vista.LaRioja.setVisible(false);vista.CL.setVisible(false);
						vista.Pais_Vasco.setVisible(false);vista.Navarra.setVisible(false);vista.Murcia.setVisible(false);vista.Madrid.setVisible(false);vista.Galicia.setVisible(false);vista.Extremadura.setVisible(false);
						vista.Catalunia.setVisible(false);vista.Valencia.setVisible(false);vista.andalucia.setVisible(false); vista.Asturias.setVisible(false);vista.Cantabria.setVisible(false);
						vista.comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"PROVINCIA", "Mallorca", "Menorca", "Cabrera", "Formentera", "Ibiza"}));
					} else if (numero == 13) {
						vista.Canarias.setVisible(true);
						vista.Mapa.setVisible(false); vista.CM.setVisible(false);vista.Baleares.setVisible(false);vista.Aragon.setVisible(false);vista.LaRioja.setVisible(false);vista.CL.setVisible(false);
						vista.Pais_Vasco.setVisible(false);vista.Navarra.setVisible(false);vista.Murcia.setVisible(false);vista.Madrid.setVisible(false);vista.Galicia.setVisible(false);vista.Extremadura.setVisible(false);
						vista.Catalunia.setVisible(false);vista.Valencia.setVisible(false);vista.andalucia.setVisible(false); vista.Asturias.setVisible(false);vista.Cantabria.setVisible(false);
						vista.comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"PROVINCIA", "La Palma", "Gomera", "Hierro", "Tenerife", "Gran Canaria", "Lanzarote", "Fuenteventura"}));
					} else if (numero == 14) {
						vista.CL.setVisible(true);
						vista.Mapa.setVisible(false); vista.CM.setVisible(false); vista.Canarias.setVisible(false);vista.Aragon.setVisible(false);vista.LaRioja.setVisible(false);
						vista.Pais_Vasco.setVisible(false);vista.Navarra.setVisible(false);vista.Murcia.setVisible(false);vista.Madrid.setVisible(false);vista.Galicia.setVisible(false);vista.Extremadura.setVisible(false);
						vista.Catalunia.setVisible(false);vista.Valencia.setVisible(false);vista.andalucia.setVisible(false); vista.Asturias.setVisible(false);vista.Cantabria.setVisible(false);
						vista.comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"PROVINCIA", "Leon", "Palencia", "Burgos", "Zamora", "Salamanca", "Avila", "Segovia", "Valladolid", "Soria"}));
					} else if (numero == 15) {
						vista.CM.setVisible(true);
						vista.Mapa.setVisible(false); vista.Canarias.setVisible(false);vista.Baleares.setVisible(false);vista.Aragon.setVisible(false);vista.LaRioja.setVisible(false);vista.CL.setVisible(false);
						vista.Pais_Vasco.setVisible(false);vista.Navarra.setVisible(false);vista.Murcia.setVisible(false);vista.Madrid.setVisible(false);vista.Galicia.setVisible(false);vista.Extremadura.setVisible(false);
						vista.Catalunia.setVisible(false);vista.Valencia.setVisible(false);vista.andalucia.setVisible(false); vista.Asturias.setVisible(false);vista.Cantabria.setVisible(false);
						vista.comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"PROVINCIA", "Ciudad Real", "Albacete", "Guadalajara", "Cuenca", "Toledo"}));
					} else if (numero == 16) {
						vista.Cantabria.setVisible(true);
						vista.Mapa.setVisible(false); vista.CM.setVisible(false); vista.Canarias.setVisible(false);vista.Baleares.setVisible(false);vista.Aragon.setVisible(false);vista.LaRioja.setVisible(false);
						vista.Pais_Vasco.setVisible(false);vista.Navarra.setVisible(false);vista.Murcia.setVisible(false);vista.Madrid.setVisible(false);vista.Galicia.setVisible(false);vista.Extremadura.setVisible(false);
						vista.Catalunia.setVisible(false);vista.Valencia.setVisible(false);vista.andalucia.setVisible(false); vista.Asturias.setVisible(false);vista.CL.setVisible(false);
						vista.comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"PROVINCIA", "Santander"}));
					} else if (numero == 17) {
						vista.Asturias.setVisible(true);
						vista.Mapa.setVisible(false); vista.CM.setVisible(false); vista.Canarias.setVisible(false);vista.Baleares.setVisible(false);vista.Aragon.setVisible(false);vista.LaRioja.setVisible(false);
						vista.Pais_Vasco.setVisible(false);vista.Navarra.setVisible(false);vista.Murcia.setVisible(false);vista.Madrid.setVisible(false);vista.Galicia.setVisible(false);vista.Extremadura.setVisible(false);
						vista.Catalunia.setVisible(false);vista.Valencia.setVisible(false);vista.andalucia.setVisible(false);vista.Cantabria.setVisible(false);vista.CL.setVisible(false);
						vista.comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"PROVINCIA", "Oviedo"}));
					} else if (numero == 18) {
						vista.Mapa.setVisible(true);
						vista.CM.setVisible(false); vista.Canarias.setVisible(false);vista.Baleares.setVisible(false);vista.Aragon.setVisible(false);vista.LaRioja.setVisible(false);vista.CL.setVisible(false);
						vista.Pais_Vasco.setVisible(false);vista.Navarra.setVisible(false);vista.Murcia.setVisible(false);vista.Madrid.setVisible(false);vista.Galicia.setVisible(false);vista.Extremadura.setVisible(false);
						vista.Catalunia.setVisible(false);vista.Valencia.setVisible(false);vista.andalucia.setVisible(false); vista.Asturias.setVisible(false);vista.Cantabria.setVisible(false);
						vista.comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"PROVINCIA"}));
					}
				}	
			}
			if (e.getSource() == this.vista.BuscarPro) {
				cargarCiudadesDesdeConfig();
				String nombreCiudad = vista.comboBox_1.getSelectedItem().toString();
				System.out.println(nombreCiudad);
				List <Pronostico> pronosticos = obtenerPronostico(nombreCiudad);
				mostrarPronosticosEnInterfaz(pronosticos);
			}
		}
		
		
		//TU CODIGO
	    //private void cargarCiudadesDesdeConfig() {
	    	//Convertimos el JSON de cada ciudad en un objeto Ciudad
	    	//ciudades = new ArrayList<>();

	        //Properties configuracion = new Properties();

	       // try {
	         //   configuracion.load(new FileReader("src/resources/config.properties"));
	         //   Set<String> nombresCiudades = configuracion.stringPropertyNames();

	          //  Gson gson = new Gson();

	          //  for (String nombreCiudad : nombresCiudades) {
	            //    String jsonCiudadString = configuracion.getProperty(nombreCiudad);
	            //    JsonObject jsonCiudad = JsonParser.parseString(jsonCiudadString).getAsJsonObject();

	            //    Ciudad ciudad = gson.fromJson(jsonCiudad, Ciudad.class);
	              //  ciudades.add(ciudad);
	           // }
	      //  } catch (IOException e) {
	         //   e.printStackTrace();
	       // }
	  //  }
	    
		//CODIGO DE CHATGPT
		 private void cargarCiudadesDesdeConfig() {
		        // Convertimos el JSON de cada ciudad en un objeto Ciudad
		        ciudades = new ArrayList<>();

		        Properties configuracion = new Properties();

		        try {
		            configuracion.load(new FileReader("src/resources/config.properties"));
		            Set<String> nombresCiudades = configuracion.stringPropertyNames();

		            Gson gson = new Gson();

		            for (String nombreCiudad : nombresCiudades) {
		                String jsonCiudadString = configuracion.getProperty(nombreCiudad);

		                // Configuramos JsonReader para que sea lenient
		                JsonReader reader = new JsonReader(new StringReader(jsonCiudadString));
		                reader.setLenient(true);

		                JsonObject jsonCiudad = JsonParser.parseReader(reader).getAsJsonObject();

		                Ciudad ciudad = gson.fromJson(jsonCiudad, Ciudad.class);
		                ciudades.add(ciudad);
		            }
		        } catch (IOException e) {
		            e.printStackTrace();
		        }
		    }
	    


	    public List<Pronostico> obtenerPronostico(String nombreCiudad) {
	        List<Pronostico> pronosticos = new ArrayList<>();

	        for (Ciudad ciudad : ciudades) {
	            if (ciudad.getNombre().equals(nombreCiudad)) {
	                try {
	                    URL url = new URL(ciudad.getUrlJson() + "&days=4");
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



	public void mostrarPronosticosEnInterfaz (List <Pronostico> pronosticos) {
		//No sé donde meterlo en interfaz pero te voy a hacer el ejemplo con textArea va? te lo he dejado al principio, creado e inicializado en VISTA--------------------------------
		vista.textAreaPrueba.setText("");
			
			for (Pronostico pronostico : pronosticos) {
				vista.textAreaPrueba.append("Nombre de la ciudad: " + pronostico.getNombreCiudad() + "\n");
				vista.textAreaPrueba.append("Fecha: " + pronostico.getFecha() + "\n");
				vista.textAreaPrueba.append("Temperatura minima: " + pronostico.getTemperaturaMinima() + "\n");
				vista.textAreaPrueba.append("Temperatura maxima: " + pronostico.getTemperaturaMaxima() + "\n");
				vista.textAreaPrueba.append("Estado del cielo: " + pronostico.getNombreCiudad() + "\n");
				
				vista.textAreaPrueba.append("\n-------------------------\n");
				
			}
	}
}
