package it.newGenerationSensors.projectapi.entity;

import java.time.Instant;
import java.util.ArrayList;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
@Document("project_collection")
public class ProjectEntity {
	
	@Id
	private String id;
	private String identifier;	
	private Instant timestamp;
	@Field("status")
	private ArrayList<String> status;
	@Field("measurements")
	private Measurements measurements;
	@Field("device_parameter")
	private DeviceParameter device_parameter;
	@Field("obd_measurements")
	private ObdMeasurements obd_measurements;
	@Field("GRAI")
	private String grai;
	@Field("GIAI")
	private String giai;
	private String address;
	@Field("raw_address")
	private RawAddress rawAddress;	
	
	public ProjectEntity(String id, String identifier, Instant timestamp, ArrayList<String> status,
			Measurements measurements, DeviceParameter device_parameter, ObdMeasurements obd_measurements, String grai,
			String giai, String address, RawAddress rawAddress) {
		super();
		this.id = id;
		this.identifier = identifier;
		this.timestamp = timestamp;
		this.status = status;
		this.measurements = measurements;
		this.device_parameter = device_parameter;
		this.obd_measurements = obd_measurements;
		this.grai = grai;
		this.giai = giai;
		this.address = address;
		this.rawAddress = rawAddress;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getIdentifier() {
		return identifier;
	}
	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}
	public Instant getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Instant timestamp) {
		this.timestamp = timestamp;
	}
	public ArrayList<String> getStatus() {
		return status;
	}
	public void setStatus(ArrayList<String> status) {
		this.status = status;
	}
	public Measurements getMeasurements() {
		return measurements;
	}
	public void setMeasurements(Measurements measurements) {
		this.measurements = measurements;
	}
	public DeviceParameter getDevice_parameter() {
		return device_parameter;
	}
	public void setDevice_parameter(DeviceParameter device_parameter) {
		this.device_parameter = device_parameter;
	}
	public ObdMeasurements getObd_measurements() {
		return obd_measurements;
	}
	public void setObd_measurements(ObdMeasurements obd_measurements) {
		this.obd_measurements = obd_measurements;
	}
	public String getGrai() {
		return grai;
	}
	public void setGrai(String grai) {
		this.grai = grai;
	}
	public String getGiai() {
		return giai;
	}
	public void setGiai(String giai) {
		this.giai = giai;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public RawAddress getRawAddress() {
		return rawAddress;
	}
	public void setRawAddress(RawAddress rawAddress) {
		this.rawAddress = rawAddress;
	}
	@Override
	public String toString() {
		return "ProjectEntity [id=" + id + ", identifier=" + identifier + ", timestamp=" + timestamp + ", status="
				+ status + ", measurements=" + measurements + ", device_parameter=" + device_parameter
				+ ", obd_measurements=" + obd_measurements + ", grai=" + grai + ", giai=" + giai + ", address="
				+ address + ", rawAddress=" + rawAddress + "]";
	}	
}
