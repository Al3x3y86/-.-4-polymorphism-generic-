public class Cars extends Transport implements Competing{

    public Cars(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void startMoving() {
        System.out.println("Легковая машина начала движение.");
    }

    @Override
    public void finishTheMove() {
        System.out.println("Легковая машина закончила движение.");
    }

    @Override
    public boolean passDiagnostics() {
        return Math.random() > 0.6;
    }

    @Override
    public void pitStop() {
        System.out.println("Легковому автомобилю " +getBrand()+ " необходимо заехать на Пит-стоп!");
    }

    @Override
    public void bestLapTime() {
        System.out.println("Лучшее время круга было у легкового автомобиля " +getBrand()+ "!");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость на этом заезде была у легкового автомобиля " +getBrand()+ "!");
    }
}