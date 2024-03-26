package it.newGenerationSensors.projectapi.entity;

import org.springframework.data.mongodb.core.mapping.Field;

public class Measurements {
	
	@Field("accelerometer")
	private Accelerometer accelerometer;
	@Field("gps")
	private Gps gps;
	private int battery;
	private int speedometer;
	private int altitude;
	private int angle;
	private int satellites;
	private int bt_status;	
	
	public Measurements(Accelerometer accelerometer, Gps gps, int battery, int speedometer, int altitude, int angle,
			int satellites, int bt_status) {
		super();
		this.accelerometer = accelerometer;
		this.gps = gps;
		this.battery = battery;
		this.speedometer = speedometer;
		this.altitude = altitude;
		this.angle = angle;
		this.satellites = satellites;
		this.bt_status = bt_status;
	}
	
	public Accelerometer getAccelerometer() {
		return accelerometer;
	}
	public void setAccelerometer(Accelerometer accelerometer) {
		this.accelerometer = accelerometer;
	}
	public Gps getGps() {
		return gps;
	}
	public void setGps(Gps gps) {
		this.gps = gps;
	}
	
	public int getBattery() {
		return battery;
	}
	public void setBattery(int battery) {
		this.battery = battery;
	}
	public int getSpeedometer() {
		return speedometer;
	}
	public void setSpeedometer(int speedometer) {
		this.speedometer = speedometer;
	}
	public int getAltitude() {
		return altitude;
	}
	public void setAltitude(int altitude) {
		this.altitude = altitude;
	}
	public int getAngle() {
		return angle;
	}
	public void setAngle(int angle) {
		this.angle = angle;
	}
	public int getSatellites() {
		return satellites;
	}
	public void setSatellites(int satellites) {
		this.satellites = satellites;
	}
	public int getBt_status() {
		return bt_status;
	}
	public void setBt_status(int bt_status) {
		this.bt_status = bt_status;
	}

	@Override
	public String toString() {
		return "Measurements [accelerometer=" + accelerometer + ", gps=" + gps + ", battery=" + battery
				+ ", speedometer=" + speedometer + ", altitude=" + altitude + ", angle=" + angle + ", satellites="
				+ satellites + ", bt_status=" + bt_status + "]";
	}		
}
