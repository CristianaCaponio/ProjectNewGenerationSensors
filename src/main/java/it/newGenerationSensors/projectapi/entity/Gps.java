package it.newGenerationSensors.projectapi.entity;

import org.springframework.data.mongodb.core.mapping.Field;

public class Gps {
	
	private double lat;
	@Field("long")
	private double lon;	
	
	public Gps(double lat, double lon) {
		super();
		this.lat = lat;
		this.lon = lon;
	}
	
	public double getLat() {
		return lat;
	}
	public void setLat(double lat) {
		this.lat = lat;
	}
	public double getLon() {
		return lon;
	}
	public void setLon(double lon) {
		this.lon = lon;
	}

	@Override
	public String toString() {
		return "Gps [lat=" + lat + ", lon=" + lon + "]";
	}	
}
