public class Main {
    public static void main(String[] args) {
        CelciusWeatherService Celcius = new CelciusWeatherService();
        Celcius.setTemperature(13.0);
        Celcius.setWindSpeed(15.0);
        HumiditySystem humidityService = new HumiditySystem();
        humidityService.setHumidityFraction(0.65);
        WeatherAdapter adapter = new WeatherAdapter(Celcius, humidityService);

        System.out.println("Temperature in fahrenheit: " + adapter.getTemperatureInFahrenheit());
        System.out.println("Wind speed in miles per hour: " + adapter.getWindSpeedInMPH());
        System.out.println("Humidity percent: " + adapter.getHumidityPercent())    ;
    }
}