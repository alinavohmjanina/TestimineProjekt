package com.weather.repositories;

import com.weather.reports.GeoWeatherReport;
import com.weather.requests.WeatherRequest;
import org.json.JSONObject;

import java.io.IOException;

public class GeoWeatherRepository extends Repository {
    public GeoWeatherReport getGeoWeather(WeatherRequest request) throws IOException {
        JSONObject data = this.readJsonFromUrl("https://api.openweathermap.org/data/2.5/weather?lat=" + request.getLatitude() + "&lon=" + request.getLongitude() + "&units=" + request.getUnits() + "&APPID=" + this.getApiKey());

        return new GeoWeatherReport(data);
    }
}
