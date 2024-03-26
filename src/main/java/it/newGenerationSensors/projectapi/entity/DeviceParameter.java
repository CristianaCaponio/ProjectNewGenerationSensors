package it.newGenerationSensors.projectapi.entity;


public class DeviceParameter {

	private String content;	

	public DeviceParameter(String content) {
		super();
		this.content = content;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "DeviceParameter [content=" + content + "]";
	}	
}
