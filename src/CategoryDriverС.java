public class CategoryDriverС <T extends Transport, D extends Driver>{

    private String name;
    private boolean driversLicense;
    private int experience;

    public CategoryDriverС(String name, boolean driversLicense, int experience) {
        if (name != null || !name.isEmpty() || !name.isBlank()) {
            this.name = name;
        }
        this.driversLicense = driversLicense;
        if (experience < 0) {
            this.experience = experience;
        }
    }

    public void getIn (T Trucks){
        System.out.println("Водитель "+name+ " управляет автомобилем " +Trucks.getBrand()+ " и будет участвовать в заезде");
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null || !name.isEmpty() || !name.isBlank()) {
            this.name = name;
        }
    }

    public boolean isDriversLicense() {
        return driversLicense;
    }

    public void setDriversLicense(boolean driversLicense) {
        this.driversLicense = driversLicense;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        if (experience < 0) {
            this.experience = experience;
        }
    }
}
