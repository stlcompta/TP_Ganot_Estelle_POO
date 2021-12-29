package fr.ensim.tp5;

public class City {

	private int insee;
	private int cp;
	private String name;
	private float latitude;
	private float longitude;
	private float altitude;
	
	public int getInsee() {
		return insee;
	}
	public void setInsee(int insee) {
		this.insee = insee;
	}
	public int getCp() {
		return cp;
	}
	public void setCp(int cp) {
		this.cp = cp;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getLatitude() {
		return latitude;
	}
	public void setLatitude(float latitude) {
		this.latitude = latitude;
	}
	public float getLongitude() {
		return longitude;
	}
	public void setLongitude(float longitude) {
		this.longitude = longitude;
	}
	public float getAltitude() {
		return altitude;
	}
	public void setAltitude(float altitude) {
		this.altitude = altitude;
	}
	
}
