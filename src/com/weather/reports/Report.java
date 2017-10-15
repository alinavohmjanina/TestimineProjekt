package com.weather.reports;

import org.json.JSONArray;
import org.json.JSONObject;

abstract public class Report {
    protected String cityName;
    protected String countryCode;

    protected Double latitude;
    protected Double longitude;

    protected Double currentTemperature;
    protected Double minimalTemperature;
    protected Double maximumTemperature;


    public class CurrentWeatherReport(JSONObject json) {
        JSONArray list = json.getJSONArray("list");
        JSONObject data = list.getJSONObject(0);

        this.cityName = data.getString("name");
        this.countryCode = data.getJSONObject("sys").getString("country");

        this.currentTemperature = data.getJSONObject("main").getDouble("temp");
        this.minimalTemperature = data.getJSONObject("main").getDouble("temp_min");
        this.maximumTemperature = data.getJSONObject("main").getDouble("temp_max");
        }

    public class GeoWeatherReport(JSONObject json) {
        JSONObject data = json;

        this.cityName = data.getString("name");
        this.countryCode = data.getJSONObject("sys").getString("country");
        this.longitude = data.getJSONObject("coord").getDouble("lon");
        this.latitude = data.getJSONObject("coord").getDouble("lat");

        this.currentTemperature = data.getJSONObject("main").getDouble("temp");
        this.minimalTemperature = data.getJSONObject("main").getDouble("temp_min");
        this.maximumTemperature = data.getJSONObject("main").getDouble("temp_max");

    public String getCityName() {
        return cityName;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public Double getCurrentTemperature() {
        return currentTemperature;
    }

    public Double getMinimalTemperature() {
        return minimalTemperature;
    }

    public Double getMaximumTemperature() {
        return maximumTemperature;
    }

    public Double getLatitude() {
        return latitude;
    }

    public Double getLongitude() {
        return longitude;
    }
}
