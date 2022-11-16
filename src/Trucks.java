public class Trucks extends Transport implements Competing{

    public Trucks(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void startMoving() {
        System.out.println("Грузовик начал движение.");
    }

    @Override
    public void finishTheMove() {
        System.out.println("Грузовик закончил движение.");
    }

    @Override
    public boolean passDiagnostics() {
        return Math.random() > 0.8;
    }

    @Override
    public void pitStop() {
        System.out.println("Грузовому автомобилю " +getBrand()+ " необходимо заехать на Пит-стоп!");
    }

    @Override
    public void bestLapTime() {
        System.out.println("Лучшее время круга было у грузового автомобиля " +getBrand()+ "!");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость на этом заезде была у грузового автомобиля " +getBrand()+ "!");
    }
}
