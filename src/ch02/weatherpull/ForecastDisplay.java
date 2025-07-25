package ch02.weatherpull;

// 측장치를 바탕으로 가상 예보를 화면에 표시하는 display
public class ForecastDisplay implements Observer, DisplayElement {
    private float currentPressure = 29.92f;
    private float lastPressure;
    private WeatherData weatherData;

    public ForecastDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update() {
        float pressure = weatherData.getPressure();

        lastPressure = currentPressure;
        currentPressure = pressure;

        display();
    }

    @Override
    public void display() {
        System.out.print("Forecast: ");
        if(currentPressure > lastPressure) {
            System.out.println("Improving weather on the way!");
        } else if (currentPressure == lastPressure) {
            System.out.println("More of the same");
        } else if(currentPressure < lastPressure) {
            System.out.println("Watch out for cooler, rainy weather!");
        }
    }
}
