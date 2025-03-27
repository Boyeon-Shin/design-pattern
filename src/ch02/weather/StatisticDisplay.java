package ch02.weather;

public class StatisticDisplay implements Observer, DisplayElement {
    private float maxTemp = 0.0f;
    private float minTemp = 200;
    private float tempSum = 0.0f;
    private int numReadings;
    private WeatherData weatherData;

    public StatisticDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(final float temp, final float humidity, final float pressure) {
        tempSum += temp;
        numReadings++;

        if(temp > maxTemp) {
            maxTemp = temp;
        }

        if (temp > minTemp) {
            minTemp = temp;
        }

        display();
    }

    @Override
    public void display() {
        System.out.println("AVG/MAX/MIN temperature: " + (tempSum / numReadings) + "/" + maxTemp + "/" + minTemp);
    }
}
