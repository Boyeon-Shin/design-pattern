package ch02.weather;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        StatisticDisplay statisticDisplay = new StatisticDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 39.2f);
        weatherData.setMeasurements(78, 90, 29.2f);

        System.out.println();
        weatherData.removeObserver(statisticDisplay);
        weatherData.setMeasurements(81, 80, 29.2f);
    }
}
