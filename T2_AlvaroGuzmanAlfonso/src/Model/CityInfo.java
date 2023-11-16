package Model;

public class CityInfo {

	 private String lang;
	    private String cityName;
	    private String cityLatitude;
	    private String cityLongitude;
	    private int cityId;
	    private boolean isCapital;
	    private String stationName;
	    private String timeZone;
	    private String isDST;
	    private MemberInfo member;

	    // Getters y setters

		public String getLang() {
			return lang;
		}

		public void setLang(String lang) {
			this.lang = lang;
		}

		public String getCityName() {
			return cityName;
		}

		public void setCityName(String cityName) {
			this.cityName = cityName;
		}

		public String getCityLatitude() {
			return cityLatitude;
		}

		public void setCityLatitude(String cityLatitude) {
			this.cityLatitude = cityLatitude;
		}

		public String getCityLongitude() {
			return cityLongitude;
		}

		public void setCityLongitude(String cityLongitude) {
			this.cityLongitude = cityLongitude;
		}

		public int getCityId() {
			return cityId;
		}

		public void setCityId(int cityId) {
			this.cityId = cityId;
		}

		public boolean isCapital() {
			return isCapital;
		}

		public void setCapital(boolean isCapital) {
			this.isCapital = isCapital;
		}

		public String getStationName() {
			return stationName;
		}

		public void setStationName(String stationName) {
			this.stationName = stationName;
		}

		public String getTimeZone() {
			return timeZone;
		}

		public void setTimeZone(String timeZone) {
			this.timeZone = timeZone;
		}

		public String getIsDST() {
			return isDST;
		}

		public void setIsDST(String isDST) {
			this.isDST = isDST;
		}

		public MemberInfo getMember() {
			return member;
		}

		public void setMember(MemberInfo member) {
			this.member = member;
		}
	    
	    
	    @Override
	    public String toString() {
	        return "CityInfo{" +
	                "lang='" + lang + '\'' +
	                ", cityName='" + cityName + '\'' +
	                ", cityLatitude='" + cityLatitude + '\'' +
	                ", cityLongitude='" + cityLongitude + '\'' +
	                ", cityId=" + cityId +
	                ", isCapital=" + isCapital +
	                ", stationName='" + stationName + '\'' +
	                ", timeZone='" + timeZone + '\'' +
	                ", isDST='" + isDST + '\'' +
	                ", member=" + member +
	                '}';
	    }

	
}
