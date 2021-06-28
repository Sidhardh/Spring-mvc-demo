package com.mvc.spring;

import java.util.LinkedHashMap;

public class Student {

	private String firstName;
	private String lastName;
	private String place;
	private String favoriteLanguage;
	
	private String[] operatingSystems;
	public String[] getOperatingSystems() {
		return operatingSystems;
	}

	public void setOperatingSystems(String[] operatingSystems) {
		this.operatingSystems = operatingSystems;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}
	private LinkedHashMap<String,String> favoriteLangOptions;
	
	public Student()
	{
		
		favoriteLangOptions = new LinkedHashMap<String,String>();
		favoriteLangOptions.put("Java", "V_Java"); 
		favoriteLangOptions.put("JavaScript", "V_JavaScript");
		favoriteLangOptions.put("Python", "V_Python");
	}
	
	/* private LinkedHashMap<String, String> countryOptions; */
	/*
	 * public Student() { countryOptions = new LinkedHashMap<String,String>();
	 * countryOptions.put("IN", "India"); countryOptions.put("KL", "KERALA");
	 * countryOptions.put("KA", "KARNATAKA"); countryOptions.put("TN", "TAMILNADU");
	 * countryOptions.put("AP", "ANDRA"); }
	 */

	/*
	 * public LinkedHashMap<String, String> getCountryOptions() { return
	 * countryOptions; }
	 */

	/*
	 * public void setCountryOptions(LinkedHashMap<String, String> countryOptions) {
	 * this.countryOptions = countryOptions; }
	 */

	
	  public void setFavoriteLangOptions(LinkedHashMap<String, String> favoriteLangOptions) {
		this.favoriteLangOptions = favoriteLangOptions;
	}

	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}
	
	
	public LinkedHashMap<String, String> getFavoriteLangOptions() {
		return favoriteLangOptions;
	}

	public String getPlace() { return place; } 
	  public void setPlace(String place){ this.place = place; }
	 
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	
}
