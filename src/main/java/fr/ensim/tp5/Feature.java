package fr.ensim.tp5;


public class Feature {

	private String type;
	private Geometry geometry;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Geometry getGeometry() {
		return geometry;
	}
	public void setGeometry(Geometry geometry) {
		this.geometry = geometry;
	}
	public Properties getProperty() {
		return property;
	}
	public void setProperty(Properties property) {
		this.property = property;
	}
	private Properties property;
	
	
	@Override
	public String toString() {
		
		return("\n " + this.geometry.getCoordinates()) + "\n";
		
		
	}
}
