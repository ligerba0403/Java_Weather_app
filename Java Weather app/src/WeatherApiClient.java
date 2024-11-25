import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class WeatherApiClient {
    private static final String API_KEY = "f695a12ea4d6a7442dadb385774099c5"; 
    private static final String BASE_URL = "https://api.openweathermap.org/data/2.5/weather?lat=";
    
    public String getWeatherData(double lat,double lon) throws IOException, InterruptedException {
        
        String url = BASE_URL +lat +"&lon=" + lon + "&appid=" + API_KEY;

        // HTTP İsteği oluştur
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .GET()
                .build();

        // Yanıt al
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        // Hata durumunu kontrol et
        if (response.statusCode() != 200) {
            throw new RuntimeException("API isteği başarısız. HTTP Kod: " + response.statusCode());
        }

        // JSON yanıtını döndür
        return response.body();
    }
}
