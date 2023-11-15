package Model;
public class Pronostico {
    private String fecha;
    private String lugar;
    private double temperaturaMaxima;
    private double temperaturaMinima;
    private String estadoCielo;

    public Pronostico(String fecha, String lugar, double temperaturaMaxima, double temperaturaMinima, String estadoCielo) {
        this.fecha = fecha;
        this.lugar = lugar;
        this.temperaturaMaxima = temperaturaMaxima;
        this.temperaturaMinima = temperaturaMinima;
        this.estadoCielo = estadoCielo;
    }

    // Getters y setters
    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public double getTemperaturaMaxima() {
        return temperaturaMaxima;
    }

    public void setTemperaturaMaxima(double temperaturaMaxima) {
        this.temperaturaMaxima = temperaturaMaxima;
    }

    public double getTemperaturaMinima() {
        return temperaturaMinima;
    }

    public void setTemperaturaMinima(double temperaturaMinima) {
        this.temperaturaMinima = temperaturaMinima;
    }

    public String getEstadoCielo() {
        return estadoCielo;
    }

    public void setEstadoCielo(String estadoCielo) {
        this.estadoCielo = estadoCielo;
    }

    @Override
    public String toString() {
        return "Pronostico{" +
                "fecha='" + fecha + '\'' +
                ", lugar='" + lugar + '\'' +
                ", temperaturaMaxima=" + temperaturaMaxima +
                ", temperaturaMinima=" + temperaturaMinima +
                ", estadoCielo='" + estadoCielo + '\'' +
                '}';
    }
}
