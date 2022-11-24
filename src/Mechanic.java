public class Mechanic <T extends Transport> {

    private final String name;
    private final String surname;
    private final String company;

    public Mechanic(String name, String surname, String company) {
        this.name = name;
        this.surname = surname;
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getCompany() {
        return company;
    }

    public boolean passDiagnostics(T transport) {
        return transport.passDiagnostics();
    }

    public void repair (T transport) {
        transport.repair();
    }

    @Override
    public String toString() {
        return name + " " + surname + " из " + company;
    }
}
