package Model;

import com.google.gson.annotations.SerializedName;

public class Pronostico {
    // Atributos con anotaciones SerializedName para mapear correctamente con JSON
    @SerializedName("date")
    private String fecha;

    @SerializedName("cityName")
    private String nombreCiudad;

    @SerializedName("temperature")
    private Temperatura temperatura;

    @SerializedName("day")
    private EstadoCielo estadoCielo;

    // Constructor
    public Pronostico(String fecha, String nombreCiudad, double temperaturaMaxima, double temperaturaMinima, String estadoCielo) {
        this.fecha = fecha;
        this.nombreCiudad = nombreCiudad;
        // Creamos los objetos y lles asignamos sus valores
        this.temperatura = new Temperatura(temperaturaMaxima, temperaturaMinima);
        this.estadoCielo = new EstadoCielo(estadoCielo);
    }

    // Getters y setters
    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getNombreCiudad() {
        return nombreCiudad;
    }

    public void setNombreCiudad(String nombreCiudad) {
        this.nombreCiudad = nombreCiudad;
    }

    public double getTemperaturaMaxima() {
        return temperatura.getMaxima();
    }

    public void setTemperaturaMaxima(double temperaturaMaxima) {
        this.temperatura.setMaxima(temperaturaMaxima);
    }

    public double getTemperaturaMinima() {
        return temperatura.getMinima();
    }

    public void setTemperaturaMinima(double temperaturaMinima) {
        this.temperatura.setMinima(temperaturaMinima);
    }

    public String getEstadoCielo() {
        return estadoCielo.getCondicion();
    }

    public void setEstadoCielo(String estadoCielo) {
        this.estadoCielo.setCondicion(estadoCielo);
    }

    // Clase interna para representar la temperatura
    public static class Temperatura {
        @SerializedName("max")
        private double maxima;

        @SerializedName("min")
        private double minima;

        // Constructor
        public Temperatura(double maxima, double minima) {
            this.maxima = maxima;
            this.minima = minima;
        }

        // Getters y setters
        public double getMaxima() {
            return maxima;
        }

        public void setMaxima(double maxima) {
            this.maxima = maxima;
        }

        public double getMinima() {
            return minima;
        }

        public void setMinima(double minima) {
            this.minima = minima;
        }
    }

    // Clase interna para representar el estado del cielo
    public static class EstadoCielo {
        @SerializedName("condition")
        private String condicion;

        // Constructor
        public EstadoCielo(String condicion) {
            this.condicion = condicion;
        }

        // Getters y setters 
        public String getCondicion() {
            return condicion;
        }

        public void setCondicion(String condicion) {
            this.condicion = condicion;
        }
    }
}
