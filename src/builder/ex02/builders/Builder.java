package builder.ex02.builders;

import builder.ex02.cars.CarType;
import builder.ex02.component.Engine;
import builder.ex02.component.GPSNavigator;
import builder.ex02.component.Transmission;
import builder.ex02.component.TripComputer;

public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
