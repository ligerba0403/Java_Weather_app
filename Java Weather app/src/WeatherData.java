import com.google.gson.*;


public class WeatherData {
	private String cityName ;
	private double lat;
	private double lon;
	
	private double temp;
	private float feelsTemp;
	private float minTemp;
	private float maxTemp;
	
	private float windSpeed;
	
	public WeatherData(String jsonResponse) {
        // JSON yanıtını parse et
        JsonObject json = JsonParser.parseString(jsonResponse).getAsJsonObject();

        // Değerleri ayıkla
        this.cityName = json.get("name").getAsString();
        this.temp = json.getAsJsonObject("main").get("temp").getAsDouble();
      
    }

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public double getLon() {
		return lon;
	}

	public void setLon(double lot) {
		this.lon = lot;
	}

	public double getLat() {
		return lat;
	}

	public void setLat(double lat) {
		this.lat = lat;
	}

	public double getTemp() {
		return temp;
	}

	public void setTemp(float temp) {
		this.temp = temp;
	}

	public float getFeelsTemp() {
		return feelsTemp;
	}

	public void setFeelsTemp(float feelsTemp) {
		this.feelsTemp = feelsTemp;
	}

	public float getMinTemp() {
		return minTemp;
	}

	public void setMinTemp(float minTemp) {
		this.minTemp = minTemp;
	}

	public float getMaxTemp() {
		return maxTemp;
	}

	public void setMaxTemp(float maxTemp) {
		this.maxTemp = maxTemp;
	}

	public float getWindSpeed() {
		return windSpeed;
	}

	public void setWindSpeed(float windSpeed) {
		this.windSpeed = windSpeed;
	}
	
	

}
