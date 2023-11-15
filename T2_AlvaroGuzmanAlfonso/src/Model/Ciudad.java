package Model;
public class Ciudad {
    private String nombre;
    private String urlJson;

    public Ciudad(String nombre, String urlJson) {
        this.nombre = nombre;
        this.urlJson = urlJson;
    }

    // Getters y setters
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

    @Override
    public String toString() {
        return "Ciudad{" +
                "nombre='" + nombre + '\'' +
                ", urlJson='" + urlJson + '\'' +
                '}';
    }
}
