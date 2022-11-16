public class DriverС extends Driver < Trucks > {

    public DriverС(String name, boolean driversLicense, int experience, String category) {
        super(name, driversLicense, experience, category);
    }
    @Override
        public void getIn (Trucks transport){
        System.out.println("Водитель "+ getName()+ " управляет автомобилем " +transport.getBrand()+ " и будет участвовать в заезде");
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