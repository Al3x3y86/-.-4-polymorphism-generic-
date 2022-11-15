public class DriverС extends Driver < Cars > {

    public DriverС(String name, boolean driversLicense, int experience) {
        super(name, driversLicense, experience);
    }

    public void getIn (Transport Trucks){
        System.out.println("Водитель "+ getName()+ " управляет автомобилем " +Trucks.getBrand()+ " и будет участвовать в заезде");
    }

    public void startMoving() {
        System.out.println("Водителю грузового автомобиля необходимо начать движение.");
    }

    public void stay() {
        System.out.println("Водителю грузового автомобиля необходимо остановиться.");
    }

    public void refuelTheCar() {
        System.out.println("Водителю грузового автомобиля необходимо заправить авто.");
    }

}
