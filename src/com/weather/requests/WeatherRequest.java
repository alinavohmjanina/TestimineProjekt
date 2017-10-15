package com.weather.requests;

public class WeatherRequest {
    protected String cityName;
    protected String countryCode;
    protected String units;

    protected Double latitude;
    protected Double longitude;

    public WeatherRequest(String cityName, String countryCode, String units) {
        this.cityName = cityName;
        this.countryCode = countryCode;
        this.units = units;
    }

    public WeatherRequest(Double latitude, Double longitude, String units) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.units = units;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getUnits() {
        return units;
    }

    public void setUnits(String units) {
        this.units = units;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }
}
