public class WeatherAdapter implements WeatherInterface {
    private CelciusWeatherService CelciusService;
    private HumiditySystem humidityService;

    public WeatherAdapter(CelciusWeatherService fahrenheitService, HumiditySystem humidityService) {
        this.CelciusService = fahrenheitService;
        this.humidityService = humidityService;
    }

    @Override
    public double getTemperatureInFahrenheit() {
        double Celcius = CelciusService.getTemperature();
        return (Celcius * 9.0 / 5.0) + 32;
    }

    @Override
    public double getWindSpeedInMPH() {
        double km = CelciusService.getWindSpeed();
        return km / 1.60934;
    }

    @Override
    public double getHumidityPercent() {
        double humidityPercentage = humidityService.getHumidityFraction();

        return humidityPercentage * 100.0;
    }
}