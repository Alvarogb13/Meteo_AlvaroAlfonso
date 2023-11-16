package Model;

import java.util.List;

public class ForecastInfo {
	 private String issueDate;
	    private String timeZone;
	    private List<ForecastDay> forecastDay;

	    // Getters y setters
		public String getIssueDate() {
			return issueDate;
		}

		public void setIssueDate(String issueDate) {
			this.issueDate = issueDate;
		}

		public String getTimeZone() {
			return timeZone;
		}

		public void setTimeZone(String timeZone) {
			this.timeZone = timeZone;
		}

		public List<ForecastDay> getForecastDay() {
			return forecastDay;
		}

		public void setForecastDay(List<ForecastDay> forecastDay) {
			this.forecastDay = forecastDay;
		}
	    
	    
	    
	    @Override
	    public String toString() {
	        return "ForecastInfo{" +
	                "issueDate='" + issueDate + '\'' +
	                ", timeZone='" + timeZone + '\'' +
	                ", forecastDay=" + forecastDay +
	                '}';
	    }


	    
}
