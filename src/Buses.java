public class Buses extends Transport implements Competing{


    public Buses(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void startMoving() {
        System.out.println("Автобус начала движение.");
    }

    @Override
    public void finishTheMove() {
        System.out.println("Автобус закончила движение.");
    }

    @Override
    public void pitStop() {
        System.out.println("Автобусу " +getBrand()+ " необходимо заехать на Пит-стоп!");
    }

    @Override
    public void bestLapTime() {
        System.out.println("Лучшее время круга было у автобуса " +getBrand()+ "!");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость на этом заезде была у автобуса " +getBrand()+ "!");
    }
}
