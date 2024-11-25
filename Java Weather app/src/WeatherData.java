import com.google.gson.*;


public class WeatherData {
	private String cityName ;

	
	private double temp;
	private double  feelsTemp;
	private double minTemp;
	private double maxTemp;
	
	private double windSpeed;
	
	public WeatherData(String jsonResponse) {
    
        JsonObject json = JsonParser.parseString(jsonResponse).getAsJsonObject();

        
        this.cityName = json.get("name").getAsString();
        this.temp = json.getAsJsonObject("main").get("temp").getAsDouble() -273.15;
        this.windSpeed = json.getAsJsonObject("wind").get("speed").getAsDouble();
        
        
    }

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public double getTemp() {
		return temp;
	}

	public void setTemp(double temp) {
		this.temp = temp;
	}

	public double getFeelsTemp() {
		return feelsTemp;
	}

	public void setFeelsTemp(double feelsTemp) {
		this.feelsTemp = feelsTemp;
	}

	public double getMinTemp() {
		return minTemp;
	}

	public void setMinTemp(double minTemp) {
		this.minTemp = minTemp;
	}

	public double getMaxTemp() {
		return maxTemp;
	}

	public void setMaxTemp(double maxTemp) {
		this.maxTemp = maxTemp;
	}

	public double getWindSpeed() {
		return windSpeed;
	}

	public void setWindSpeed(double windSpeed) {
		this.windSpeed = windSpeed;
	}


	

}
