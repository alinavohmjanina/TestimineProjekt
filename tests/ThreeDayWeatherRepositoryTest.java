import com.weather.reports.ThreeDayWeatherReport;
import com.weather.repositories.ThreeDayWeatherRepository;
import com.weather.requests.WeatherRequest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ThreeDayWeatherRepositoryTest {

    @Test
    public void testIfThreeDayWRepositoryRespCityEqualsReqSity() {
        try  {
            WeatherRequest request = new WeatherRequest("Tallinn", "EE", "metric");
            ThreeDayWeatherRepository repository = new ThreeDayWeatherRepository();

        }catch(Exception e){
            fail("Failure cause: " + e.getMessage());
        }
    }

}