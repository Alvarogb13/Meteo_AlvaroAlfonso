package Model;

public class Ciudad {
    private CityInfo city;
    private ForecastInfo forecast;
    private ClimateInfo climate;

    // Getters y setters

	public CityInfo getCity() {
		return city;
	}

	public void setCity(CityInfo city) {
		this.city = city;
	}

	public ForecastInfo getForecast() {
		return forecast;
	}

	public void setForecast(ForecastInfo forecast) {
		this.forecast = forecast;
	}

	public ClimateInfo getClimate() {
		return climate;
	}

	public void setClimate(ClimateInfo climate) {
		this.climate = climate;
	}
    
    
    @Override
    public String toString() {
        return "Ciudad{" +
                "city=" + city +
                ", forecast=" + forecast +
                ", climate=" + climate +
                '}';
    }


}
