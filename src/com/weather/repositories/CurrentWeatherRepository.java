package com.weather.repositories;

import com.weather.reports.CurrentWeatherReport;
import com.weather.requests.WeatherRequest;
import org.json.JSONObject;

import java.io.IOException;

public class CurrentWeatherRepository extends Repository {
    public CurrentWeatherReport getCurrentWeather(WeatherRequest request) throws IOException {
        JSONObject data = this.readJsonFromUrl("https://api.openweathermap.org/data/2.5/find?q=" + request.getCityName() + "," + request.getCountryCode() + "&units=" + request.getUnits() + "&APPID=" + this.getApiKey());

        return new CurrentWeatherReport(data);
    }
}
