public class DriverB extends Driver < Cars > {


    public DriverB(String name, boolean driversLicense, int experience) {
        super(name, driversLicense, experience);
    }

    public void getIn (Transport Cars){
        System.out.println("Водитель "+getName()+ " управляет автомобилем " +Cars.getBrand()+ " и будет участвовать в заезде");
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


}



