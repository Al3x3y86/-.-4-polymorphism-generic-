import java.util.Objects;

public abstract class Driver < T extends Transport >{

    private String name;
    private boolean driversLicense;
    private int experience;
    private String category;

    public Driver(String name, boolean driversLicense, int experience,String category) {

        if (name != null || !name.isEmpty() || !name.isBlank()) {
            this.name = name;
        }
        this.driversLicense = driversLicense;
        if (experience < 0) {
            this.experience = experience;
        }
        setCategory(category);
    }

    public abstract void startMoving();
    public abstract void stay();
    public abstract void refuelTheCar();
    public abstract void getIn (T transport);

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        if (category == null){
            throw new IllegalArgumentException("Необхлдимо указать категорию прав!");
        }
        this.category = category;
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


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver driver = (Driver) o;
        return driversLicense == driver.driversLicense && experience == driver.experience && Objects.equals(name, driver.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, driversLicense, experience);
    }
}

