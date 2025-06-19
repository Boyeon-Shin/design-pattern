package builder.ex02;


import builder.ex02.builders.CarBuilder;
import builder.ex02.builders.CarManualBuilder;
import builder.ex02.cars.Car;
import builder.ex02.cars.Manual;
import builder.ex02.director.Director;
import ch09.Menu;

public class Demo {
    public static void main(String[] args) {
        Director director = new Director();

        //자동차 만들기
        CarBuilder carBuilder = new CarBuilder();
        director.constructSportsCar(carBuilder);

        Car car = carBuilder.getResult();

        System.out.println("Car built: "+ car.getCartype());
        System.out.println();

        //자동차 설명서
        CarManualBuilder carManualBuilder = new CarManualBuilder();
        director.constructSportsCar(carManualBuilder);

        Manual manual = carManualBuilder.getResult();
        System.out.println(manual.print());
    }
}
