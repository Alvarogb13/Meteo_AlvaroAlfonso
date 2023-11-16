package Model;

public class ForecastDay {

	private String forecastDate;
    private String wxdesc;
    private String weather;
    private String minTemp;
    private String maxTemp;
    private String minTempF;
    private String maxTempF;
    private String weatherIcon;

    // Getters y setters
    public String getForecastDate() {
		return forecastDate;
	}

	public void setForecastDate(String forecastDate) {
		this.forecastDate = forecastDate;
	}

	public String getWxdesc() {
		return wxdesc;
	}

	public void setWxdesc(String wxdesc) {
		this.wxdesc = wxdesc;
	}

	public String getWeather() {
		return weather;
	}

	public void setWeather(String weather) {
		this.weather = weather;
	}

	public String getMinTemp() {
		return minTemp;
	}

	public void setMinTemp(String minTemp) {
		this.minTemp = minTemp;
	}

	public String getMaxTemp() {
		return maxTemp;
	}

	public void setMaxTemp(String maxTemp) {
		this.maxTemp = maxTemp;
	}

	public String getMinTempF() {
		return minTempF;
	}

	public void setMinTempF(String minTempF) {
		this.minTempF = minTempF;
	}

	public String getMaxTempF() {
		return maxTempF;
	}

	public void setMaxTempF(String maxTempF) {
		this.maxTempF = maxTempF;
	}

	public String getWeatherIcon() {
		return weatherIcon;
	}

	public void setWeatherIcon(String weatherIcon) {
		this.weatherIcon = weatherIcon;
	}
    
    
    @Override
    public String toString() {
        return "ForecastDay{" +
                "forecastDate='" + forecastDate + '\'' +
                ", wxdesc='" + wxdesc + '\'' +
                ", weather='" + weather + '\'' +
                ", minTemp='" + minTemp + '\'' +
                ", maxTemp='" + maxTemp + '\'' +
                ", minTempF='" + minTempF + '\'' +
                ", maxTempF='" + maxTempF + '\'' +
                ", weatherIcon='" + weatherIcon + '\'' +
                '}';
    }

	
}
