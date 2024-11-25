import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonArray;
import com.google.gson.JsonParser;

public class City {
    
    private double lat;
    private double lon;

    public City(String jsonResponse) {
        // JSON yanıtını JSON Array olarak parse et
        JsonArray jsonArray = JsonParser.parseString(jsonResponse).getAsJsonArray();
        
        // 0. öğeyi (ilk şehir verisini) al
        JsonObject cityJson = jsonArray.get(0).getAsJsonObject();

        // Şehir verilerini al ve sınıf değişkenlerine ata
        this.lat = cityJson.get("lat").getAsDouble();
        this.lon = cityJson.get("lon").getAsDouble();
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }
}
