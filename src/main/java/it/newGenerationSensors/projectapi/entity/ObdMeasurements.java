package it.newGenerationSensors.projectapi.entity;

public class ObdMeasurements {
	
	private int obd_speedometer;
	private int obd_battery;
	private int runtime;
	private int dtc;
	private int rpm;
	private int fuel_level;
	private int coolant_temperature;	
	
	public ObdMeasurements(int obd_speedometer, int obd_battery, int runtime, int dtc, int rpm, int fuel_level,
			int coolant_temperature) {
		super();
		this.obd_speedometer = obd_speedometer;
		this.obd_battery = obd_battery;
		this.runtime = runtime;
		this.dtc = dtc;
		this.rpm = rpm;
		this.fuel_level = fuel_level;
		this.coolant_temperature = coolant_temperature;
	}
	
	public int getObd_speedometer() {
		return obd_speedometer;
	}
	public void setObd_speedometer(int obd_speedometer) {
		this.obd_speedometer = obd_speedometer;
	}
	public int getObd_battery() {
		return obd_battery;
	}
	public void setObd_battery(int obd_battery) {
		this.obd_battery = obd_battery;
	}
	public int getRuntime() {
		return runtime;
	}
	public void setRuntime(int runtime) {
		this.runtime = runtime;
	}
	public int getDtc() {
		return dtc;
	}
	public void setDtc(int dtc) {
		this.dtc = dtc;
	}
	public int getRpm() {
		return rpm;
	}
	public void setRpm(int rpm) {
		this.rpm = rpm;
	}
	public int getFuel_level() {
		return fuel_level;
	}
	public void setFuel_level(int fuel_level) {
		this.fuel_level = fuel_level;
	}
	public int getCoolant_temperature() {
		return coolant_temperature;
	}
	public void setCoolant_temperature(int coolant_temperature) {
		this.coolant_temperature = coolant_temperature;
	}

	@Override
	public String toString() {
		return "ObdMeasurements [obd_speedometer=" + obd_speedometer + ", obd_battery=" + obd_battery + ", runtime="
				+ runtime + ", dtc=" + dtc + ", rpm=" + rpm + ", fuel_level=" + fuel_level + ", coolant_temperature="
				+ coolant_temperature + "]";
	}		
}
