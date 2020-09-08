package com.tush.model;

public class LocationStats {

	private String state;
	private String country;
	private int totalcases;
	private int diffprev;
	private String lat;
	private String longitute;
	
	
	public String getLongitute() {
		return longitute;
	}
	public void setLongitute(String longitute) {
		this.longitute = longitute;
	}
	public String getLat() {
		return lat;
	}
	public void setLat(String lat) {
		this.lat = lat;
	}
	public int getDiffprev() {
		return diffprev;
	}
	public void setDiffprev(int diffprev) {
		this.diffprev = diffprev;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getTotalcases() {
		return totalcases;
	}
	public void setTotalcases(int totalcases) {
		this.totalcases = totalcases;
	}
	@Override
	public String toString() {
		return "LocationStats [state=" + state + ", country=" + country + ", totalcases=" + totalcases + ", diffprev="
				+ diffprev + ", lat=" + lat + ", longitute=" + longitute + "]";
	}
	
	
	
}
