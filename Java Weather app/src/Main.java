import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {
         
        WeatherApiClient api = new WeatherApiClient();
        WeatherData data = new WeatherData(api.getWeatherData(41.0082, 28.9784));
        
        System.out.println(data.getCityName()); 
        System.out.println(data.getTemp()); 
        System.out.println(data.getWindSpeed());
        
        // City verisini almak için CityApiClient'ı kullanıyoruz
        CityApiClient cityApiClient = new CityApiClient();
        
        // London şehri verilerini al
        String cityData = cityApiClient.getCityData("London").toString(); 
        
        // City nesnesini oluştur
        City city = new City(cityData);

        // Latitude ve Longitude bilgilerini yazdır
        System.out.println(city.getLat()); 
        System.out.println(city.getLon());
    }
}
