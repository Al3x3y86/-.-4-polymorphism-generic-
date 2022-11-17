import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public abstract class Transport {

    private String brand;
    private String model;
    private double engineVolume;
    private List<Driver<?>> drivers = new ArrayList<>();
    private List<Mechanic<?>> mechanics = new ArrayList<>();
    private List<Sponsor> sponsors = new ArrayList<>();

    public Transport(String brand, String model, double engineVolume) {
        if (brand != null || !brand.isEmpty() || !brand.isBlank()) {
            this.brand = brand;
        }
        if (model != null || !model.isEmpty() || !model.isBlank()) {
            this.model = model;
        }
        if (engineVolume < 0) {
            this.engineVolume = engineVolume;
        }
    }

    public void addDriver(Driver<?>... driver) {
        this.drivers.addAll(Arrays.asList(driver));
    }

    public void addMechanic(Mechanic<?>... mechanic) {
        this.mechanics.addAll(Arrays.asList(mechanic));
    }

    public void addSponsor(Sponsor... sponsor) {
        this.sponsors.addAll(Arrays.asList(sponsor));
    }

    public abstract void startMoving();
    public abstract void finishTheMove();
    public abstract boolean passDiagnostics();
    public abstract void repair();

    public List<Driver<?>> getDrivers() {
        return drivers;
    }

    public List<Mechanic<?>> getMechanics() {
        return mechanics;
    }

    public List<Sponsor> getSponsors() {
        return sponsors;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (brand != null || !brand.isEmpty() || !brand.isBlank()) {
            this.brand = brand;
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model != null || !model.isEmpty() || !model.isBlank()) {
            this.model = model;
        }
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume < 0|| !model.isEmpty() || !model.isBlank()) {
            this.engineVolume = engineVolume;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return Double.compare(transport.engineVolume, engineVolume) == 0 && Objects.equals(brand, transport.brand)
                && Objects.equals(model, transport.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineVolume);
    }
}