import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException, InterruptedException {
		 
		 WeatherApiClient api = new WeatherApiClient();
		
		 
		 WeatherData data = new WeatherData(api.getWeatherData(41.0082, 28.9784));
		 
		 System.out.println(data.getCityName()); 
		 System.out.println(data.getTemp()); 
		 
		 
	}

}
