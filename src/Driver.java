import java.util.Objects;

public abstract class Driver {

    private String name;
    private boolean driversLicense;
    private int experience;

    public Driver(String name, boolean driversLicense, int experience) {
        this.name = name;
        this.driversLicense = driversLicense;
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Водитель" + name + ", наличие водительских прав" + driversLicense +", стаж" + experience +'.';
    }

    public abstract void startMoving();
    public abstract void stay();
    public abstract void refuelTheCar();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        this.experience = experience;
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
