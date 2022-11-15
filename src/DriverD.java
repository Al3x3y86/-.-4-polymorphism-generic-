public class DriverD extends Driver < Cars > {

    public DriverD(String name, boolean driversLicense, int experience) {
        super(name, driversLicense, experience);
    }

    public void getIn (Transport Buses){
        System.out.println("Водитель "+getName()+ " управляет автомобилем " +Buses.getBrand()+ " и будет участвовать в заезде");
    }

    public void startMoving() {
        System.out.println("Водителю автобуса необходимо начать движение.");
    }

    public void stay() {
        System.out.println("Водителю автобуса необходимо остановиться.");
    }

    public void refuelTheCar() {
        System.out.println("Водителю автобуса необходимо заправить авто.");
    }


}