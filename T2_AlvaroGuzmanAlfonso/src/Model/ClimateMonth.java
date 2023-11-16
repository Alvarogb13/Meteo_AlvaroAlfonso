package Model;

public class ClimateMonth {
	 private int month;
	    private String maxTemp;
	    private String minTemp;
	    private String meanTemp;
	    private String maxTempF;
	    private String minTempF;
	    private String meanTempF;
	    private String raindays;
	    private String rainfall;
	    private String climateFromMemDate;

	    // Getters y setters
		public int getMonth() {
			return month;
		}

		public void setMonth(int month) {
			this.month = month;
		}

		public String getMaxTemp() {
			return maxTemp;
		}

		public void setMaxTemp(String maxTemp) {
			this.maxTemp = maxTemp;
		}

		public String getMinTemp() {
			return minTemp;
		}

		public void setMinTemp(String minTemp) {
			this.minTemp = minTemp;
		}

		public String getMeanTemp() {
			return meanTemp;
		}

		public void setMeanTemp(String meanTemp) {
			this.meanTemp = meanTemp;
		}

		public String getMaxTempF() {
			return maxTempF;
		}

		public void setMaxTempF(String maxTempF) {
			this.maxTempF = maxTempF;
		}

		public String getMinTempF() {
			return minTempF;
		}

		public void setMinTempF(String minTempF) {
			this.minTempF = minTempF;
		}

		public String getMeanTempF() {
			return meanTempF;
		}

		public void setMeanTempF(String meanTempF) {
			this.meanTempF = meanTempF;
		}

		public String getRaindays() {
			return raindays;
		}

		public void setRaindays(String raindays) {
			this.raindays = raindays;
		}

		public String getRainfall() {
			return rainfall;
		}

		public void setRainfall(String rainfall) {
			this.rainfall = rainfall;
		}

		public String getClimateFromMemDate() {
			return climateFromMemDate;
		}

		public void setClimateFromMemDate(String climateFromMemDate) {
			this.climateFromMemDate = climateFromMemDate;
		}
	
	    
	    
	    @Override
	    public String toString() {
	        return "ClimateMonth{" +
	                "month=" + month +
	                ", maxTemp='" + maxTemp + '\'' +
	                ", minTemp='" + minTemp + '\'' +
	                ", meanTemp='" + meanTemp + '\'' +
	                ", maxTempF='" + maxTempF + '\'' +
	                ", minTempF='" + minTempF + '\'' +
	                ", meanTempF='" + meanTempF + '\'' +
	                ", raindays='" + raindays + '\'' +
	                ", rainfall='" + rainfall + '\'' +
	                ", climateFromMemDate='" + climateFromMemDate + '\'' +
	                '}';
	    }


	    
}
