public class DriverB extends Driver<Cars> {

    public DriverB(String name, boolean driversLicense, int experience, String category) {
        super(name, driversLicense, experience, category);
    }

    public void startMoving() {
        System.out.println("Водителю легкового автомобиля необходимо начать движение.");
    }


    public void stay() {
        System.out.println("Водителю легкового автомобиля необходимо остановиться.");
    }


    public void refuelTheCar() {
        System.out.println("Водителю легкового автомобиля необходимо заправить авто.");
    }

    @Override
    public void getIn(Cars cars) {
        System.out.println("Водитель " + getName() + " управляет автомобилем " + cars.getBrand() + " и будет участвовать в заезде");
    }

}
