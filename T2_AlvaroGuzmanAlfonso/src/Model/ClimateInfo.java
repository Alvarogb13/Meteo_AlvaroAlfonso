package Model;

import java.util.List;

public class ClimateInfo {

	 private String raintype;
	    private String raindef;
	    private String rainunit;
	    private int datab;
	    private int datae;
	    private String tempb;
	    private String tempe;
	    private String rdayb;
	    private String rdaye;
	    private String rainfallb;
	    private String rainfalle;
	    private String climatefromclino;
	    private List<ClimateMonth> climateMonth;

	    // Getters y setters
		public String getRaintype() {
			return raintype;
		}

		public void setRaintype(String raintype) {
			this.raintype = raintype;
		}

		public String getRaindef() {
			return raindef;
		}

		public void setRaindef(String raindef) {
			this.raindef = raindef;
		}

		public String getRainunit() {
			return rainunit;
		}

		public void setRainunit(String rainunit) {
			this.rainunit = rainunit;
		}

		public int getDatab() {
			return datab;
		}

		public void setDatab(int datab) {
			this.datab = datab;
		}

		public int getDatae() {
			return datae;
		}

		public void setDatae(int datae) {
			this.datae = datae;
		}

		public String getTempb() {
			return tempb;
		}

		public void setTempb(String tempb) {
			this.tempb = tempb;
		}

		public String getTempe() {
			return tempe;
		}

		public void setTempe(String tempe) {
			this.tempe = tempe;
		}

		public String getRdayb() {
			return rdayb;
		}

		public void setRdayb(String rdayb) {
			this.rdayb = rdayb;
		}

		public String getRdaye() {
			return rdaye;
		}

		public void setRdaye(String rdaye) {
			this.rdaye = rdaye;
		}

		public String getRainfallb() {
			return rainfallb;
		}

		public void setRainfallb(String rainfallb) {
			this.rainfallb = rainfallb;
		}

		public String getRainfalle() {
			return rainfalle;
		}

		public void setRainfalle(String rainfalle) {
			this.rainfalle = rainfalle;
		}

		public String getClimatefromclino() {
			return climatefromclino;
		}

		public void setClimatefromclino(String climatefromclino) {
			this.climatefromclino = climatefromclino;
		}

		public List<ClimateMonth> getClimateMonth() {
			return climateMonth;
		}

		public void setClimateMonth(List<ClimateMonth> climateMonth) {
			this.climateMonth = climateMonth;
		}
	    
	    
	    @Override
	    public String toString() {
	        return "ClimateInfo{" +
	                "raintype='" + raintype + '\'' +
	                ", raindef='" + raindef + '\'' +
	                ", rainunit='" + rainunit + '\'' +
	                ", datab=" + datab +
	                ", datae=" + datae +
	                ", tempb='" + tempb + '\'' +
	                ", tempe='" + tempe + '\'' +
	                ", rdayb='" + rdayb + '\'' +
	                ", rdaye='" + rdaye + '\'' +
	                ", rainfallb='" + rainfallb + '\'' +
	                ", rainfalle='" + rainfalle + '\'' +
	                ", climatefromclino='" + climatefromclino + '\'' +
	                ", climateMonth=" + climateMonth +
	                '}';
	    }


}
