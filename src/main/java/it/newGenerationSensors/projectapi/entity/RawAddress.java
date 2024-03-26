package it.newGenerationSensors.projectapi.entity;

import org.springframework.data.mongodb.core.mapping.Field;

public class RawAddress {
	
	private String road;
	private String hamlet;
	private String municipality;
	private String isolated_dwelling;
	private String village;
	private String town;
	private String county;
	@Field("ISO3166-2-lvl6")
	private String iso3166_2_lvl6;
	private String state;
	@Field("ISO3166-2-lvl4")
	private String iso3166_2_lvl4;
	private String postcode;
	private String country;
	private String country_code;	
	
	public RawAddress(String road, String hamlet, String municipality, String isolated_dwelling, String village,
			String town, String county, String iso3166_2_lvl6, String state, String iso3166_2_lvl4, String postcode,
			String country, String country_code) {
		super();
		this.road = road;
		this.hamlet = hamlet;
		this.municipality = municipality;
		this.isolated_dwelling = isolated_dwelling;
		this.village = village;
		this.town = town;
		this.county = county;
		this.iso3166_2_lvl6 = iso3166_2_lvl6;
		this.state = state;
		this.iso3166_2_lvl4 = iso3166_2_lvl4;
		this.postcode = postcode;
		this.country = country;
		this.country_code = country_code;
	}
	
	public String getRoad() {
		return road;
	}
	public void setRoad(String road) {
		this.road = road;
	}
	public String getHamlet() {
		return hamlet;
	}
	public void setHamlet(String hamlet) {
		this.hamlet = hamlet;
	}	
	public String getIsolated_dwelling() {
		return isolated_dwelling;
	}
	public void setIsolated_dwelling(String isolated_dwelling) {
		this.isolated_dwelling = isolated_dwelling;
	}
	public String getVillage() {
		return village;
	}
	public void setVillage(String village) {
		this.village = village;
	}
	public String getTown() {
		return town;
	}
	public void setTown(String town) {
		this.town = town;
	}
	public String getMunicipality() {
		return municipality;
	}
	public void setMunicipality(String municipality) {
		this.municipality = municipality;
	}
	public String getCounty() {
		return county;
	}
	public void setCounty(String county) {
		this.county = county;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPostcode() {
		return postcode;
	}
	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCountry_code() {
		return country_code;
	}
	public void setCountry_code(String country_code) {
		this.country_code = country_code;
	}
	public String getIso3166_2_lvl6() {
		return iso3166_2_lvl6;
	}
	public void setIso3166_2_lvl6(String iso3166_2_lvl6) {
		this.iso3166_2_lvl6 = iso3166_2_lvl6;
	}
	public String getIso3166_2_lvl4() {
		return iso3166_2_lvl4;
	}
	public void setIso3166_2_lvl4(String iso3166_2_lvl4) {
		this.iso3166_2_lvl4 = iso3166_2_lvl4;
	}

	@Override
	public String toString() {
		return "RawAddress [road=" + road + ", hamlet=" + hamlet + ", municipality=" + municipality
				+ ", isolated_dwelling=" + isolated_dwelling + ", village=" + village + ", town=" + town + ", county="
				+ county + ", iso3166_2_lvl6=" + iso3166_2_lvl6 + ", state=" + state + ", iso3166_2_lvl4="
				+ iso3166_2_lvl4 + ", postcode=" + postcode + ", country=" + country + ", country_code=" + country_code
				+ "]";
	}	
}
