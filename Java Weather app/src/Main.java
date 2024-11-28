import java.io.IOException;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {
         
    	System.out.println("Welcome to Application");
    	System.out.println("Created by ligerba");
    	System.out.println("*******************k**************************************");
    	Scanner scanner = new Scanner(System.in);
    	
    	while(true) {
    			System.out.println("Enter Country Name : ");
    			String cityName = scanner.next();
    		 	CityApiClient cityApiClient = new CityApiClient();
    	        String cityData = cityApiClient.getCityData(cityName).toString(); 
    	        

    	        City city = new City(cityData);

    	        DecimalFormat df = new DecimalFormat("#.##");
    	        
    	        WeatherApiClient api = new WeatherApiClient();
    	        WeatherData data = new WeatherData(api.getWeatherData(city.getLat(),city.getLon()));
    	        
    	        System.out.println(data.getCityName()); 
    	        System.out.println("Temperature : "+df.format(data.getTemp())); 
    	        System.out.println("Wind Speed : " +df.format(data.getWindSpeed()));
    	        
    	       
    	}
       
        

       
    }
}
