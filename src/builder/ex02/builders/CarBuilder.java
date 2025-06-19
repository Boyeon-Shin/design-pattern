package builder.ex02.builders;

import builder.ex02.cars.Car;
import builder.ex02.cars.CarType;
import builder.ex02.component.Engine;
import builder.ex02.component.GPSNavigator;
import builder.ex02.component.Transmission;
import builder.ex02.component.TripComputer;

public class CarBuilder implements Builder {
    private CarType type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;

    @Override
    public void setCarType(final CarType type) {
        this.type = type;
    }

    @Override
    public void setSeats(final int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(final Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmission(final Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setTripComputer(final TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    @Override
    public void setGPSNavigator(final GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }

    public Car getResult() {
        return new Car(type, seats, engine, transmission, tripComputer, gpsNavigator);
    }
}
