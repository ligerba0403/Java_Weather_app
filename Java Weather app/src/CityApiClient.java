import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import com.google.gson.JsonArray;
import com.google.gson.JsonParser;

public class CityApiClient {
    private static final String API_KEY = "f695a12ea4d6a7442dadb385774099c5"; 
    private static final String BASE_URL = "https://api.openweathermap.org/geo/1.0/direct?q=";
    
    public JsonArray getCityData(String cityName) throws IOException, InterruptedException {
        String url = BASE_URL + cityName + "&limit=5&appid=" + API_KEY;

        // HTTP İsteği oluştur
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .GET()
                .build();

        // Yanıt al
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        // HTTP status kodunu kontrol et
        if (response.statusCode() != 200) {
            throw new RuntimeException("API isteği başarısız. HTTP Kod: " + response.statusCode());
        }

        // JSON yanıtını çözümle
        JsonArray jsonResponse = JsonParser.parseString(response.body()).getAsJsonArray();
        
        // JSON verisini döndür
        return jsonResponse;
    }
}
