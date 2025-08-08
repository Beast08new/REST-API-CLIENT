import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class WeatherApp {

    private static final String API_KEY = "57d8d6133040d8a8afa8142a98154c65";
    private static final String BASE_URL = " https://api.openweathermap.org/data/2.5/weather";

    public static void main(String[] args) throws IOException, InterruptedException {
        String city = "Chennai";
        String units = "metric";

        String url = String.format("https://api.openweathermap.org/data/2.5/weather?q=%s&appid=%s&units=metric", city, API_KEY);

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .GET()
                .build();

        HttpClient client = HttpClient.newHttpClient();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        if (response.statusCode() == 200) {
            JsonObject json = JsonParser.parseString(response.body()).getAsJsonObject();
            printWeatherData(json);
        } else {
            System.out.println("Error fetching weather data. Status code: " + response.statusCode());
        }
    }

    private static void printWeatherData(JsonObject json) {
        String cityName = json.get("name").getAsString();
        JsonObject main = json.getAsJsonObject("main");
        JsonObject weather = json.getAsJsonArray("weather").get(0).getAsJsonObject();
        JsonObject wind = json.getAsJsonObject("wind");

        double temperature = main.get("temp").getAsDouble();
        int humidity = main.get("humidity").getAsInt();
        String description = weather.get("description").getAsString();
        double windSpeed = wind.get("speed").getAsDouble();

        System.out.println("========== Weather Report ==========");
        System.out.println("City       : " + cityName);
        System.out.println("Condition  : " + description);
        System.out.println("Temperature: " + temperature + "°C");
        System.out.println("Humidity   : " + humidity + "%");
        System.out.println("Wind Speed : " + windSpeed + " m/s");
        System.out.println("====================================");
    }
}
