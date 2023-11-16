package Model;

import com.google.gson.JsonObject;

public class Ciudad {
    private String nombre;
    private String urlJson;

    public Ciudad(String nombre, String urlJson) {
        this.nombre = nombre;
        this.urlJson = urlJson;
    }

    // Getter y Setter

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUrlJson() {
		return urlJson;
	}

	public void setUrlJson(String urlJson) {
		this.urlJson = urlJson;
	}
    

    // Constructor que acepta un objeto JSON
    public Ciudad(JsonObject jsonCiudad) {
        this.nombre = jsonCiudad.get("nombre").getAsString();
        this.urlJson = jsonCiudad.get("urlJson").getAsString();
    }

}