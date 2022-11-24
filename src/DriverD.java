public class DriverD extends Driver < Buses > {

    public DriverD(String name, boolean driversLicense, int experience, String category) {
        super(name, driversLicense, experience, category);
    }

    public void getIn (Buses transport){
        System.out.println("Водитель "+getName()+ " управляет автомобилем " +transport.getBrand()+ " и будет участвовать в заезде");
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
