import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Легковые автомобили");

          Cars Lada = new Cars("Lada","Granta", 1.7);
//        System.out.println(Lada);
//        Lada.pitStop();
//        Lada.bestLapTime();
//        Lada.maxSpeed();
//        Cars Audi = new Cars("Audi","A8", 2.8);
//        System.out.println(Audi);
//        Cars BMW = new Cars("BMW","Z8", 3.0);
//        System.out.println(BMW);
        Cars KIA = new Cars("KIA","Sportage", 2.4);
//        System.out.println(KIA);
//        KIA.startMoving();
//        KIA.finishTheMove();
//
//        System.out.println("Грузовые автомобили");

        Trucks Kamaz = new Trucks("КамАЗ","5490", 11.97);
//        System.out.println(Kamaz);
//        Kamaz.pitStop();
//        Kamaz.bestLapTime();
//        Kamaz.maxSpeed();
//        Trucks Man = new Trucks("MAN","TGX", 10.5);
//        System.out.println(Man);
//        Trucks MAZ = new Trucks("МАЗ","544018", 11.95);
//        System.out.println(MAZ);
//        Trucks Hyundai = new Trucks("Hyundai","HD500", 12.34);
//        System.out.println(Hyundai);
//        Kamaz.startMoving();
//        Hyundai.finishTheMove();

//        System.out.println("Автобусы");

//        Buses Nefaz = new Buses("НефАЗ","5299", 6.7);
//        System.out.println(Nefaz);
//        Nefaz.pitStop();
//        Nefaz.bestLapTime();
//        Nefaz.maxSpeed();
//        Buses Volvo = new Buses("Volvo","9700", 10.8);
//        System.out.println(Volvo);
//        Buses Scania = new Buses("Scania","Touring", 9.00);
//        System.out.println(Scania);
        Buses PAZ = new Buses("ПАЗ","Vector-Next", 4.43);
//        System.out.println(PAZ);
//        PAZ.startMoving();
//        PAZ.finishTheMove();

//        System.out.println("Водители");
//
        DriverB Vladimir = new DriverB ("Владимир", true,5, "B");
//        Vladimir.getIn(KIA);
//        Vladimir.startMoving();
//        Vladimir.refuelTheCar();
//        Vladimir.stay();
//
        DriverС Alexander = new DriverС ("Александр", true,7, "D");
//        Alexander.getIn(Kamaz);
//        Alexander.startMoving();
//        Alexander.refuelTheCar();
//        Alexander.stay();
//
        DriverD Ivan = new DriverD ("Иван", true, 9,"C");
//        Ivan.getIn(PAZ);
//        Ivan.startMoving();
//        Ivan.refuelTheCar();
//        Ivan.stay();

//        System.out.println("Диагностика");
//        passDiagnostics(Lada,Audi,BMW,KIA,
//                       Kamaz,Man,MAZ, Hyundai,
//                       Nefaz,Volvo,Scania,PAZ);

//        System.out.println("Спонсоры и механики");

        Mechanic<Transport> Tolyn = new Mechanic<>("Анатолий","Анатольев", "Гаража7");
        Mechanic<Cars> Vasay =new Mechanic<Cars>("Вася", "Васильев", "Гаража1");
        Mechanic<Transport> Sergey =new Mechanic<Transport>("Сергей", "Сергеев", "Гаража2");
        Sponsor Bank1 = new Sponsor( "Банк 1",5_000_000);
        Sponsor Bank2 = new Sponsor( "Банк 2",3_000_000);
        Sponsor Bank3 = new Sponsor( "Банк 3",7_000_000);

        System.out.println("Информация без повторов");
        Set<Mechanic> Mechanic = new HashSet<>();
        Mechanic.add(Tolyn);
        Mechanic.add(Vasay);
        Mechanic.add(Tolyn);
        Mechanic.add(Sergey);
        System.out.println(Arrays.toString(Mechanic.toArray()));

        Set<Sponsor> Bank = new HashSet<>();
        Bank.add(Bank1);
        Bank.add(Bank2);
        Bank.add(Bank1);
        Bank.add(Bank3);
        System.out.println(Arrays.toString(Bank.toArray()));

        Set<Transport> Transport = new HashSet<>();
        Transport.add(Lada);
        Transport.add(PAZ);
        Transport.add(Lada);
        Transport.add(Kamaz);
        System.out.println(Arrays.toString(Transport.toArray()));

        Set<Driver> Driver = new HashSet<>();
        Driver.add(Vladimir);
        Driver.add(Alexander);
        Driver.add(Vladimir);
        Driver.add(Ivan);
        System.out.println(Arrays.toString(Driver.toArray()));


//        Lada.addDriver(new DriverB ("Роман", true,9, "В"));
//        Lada.addMechanic(Tolyn);
//        Lada.addSponsor(Bank3);
//
//        KIA.addDriver(new DriverB ("Александр", true,7, "В"));
//        KIA.addMechanic(Vasay);
//        KIA.addSponsor(Bank1);
//
//        Kamaz.addDriver(new DriverС ("Александр", true,7, "C"));
//        Kamaz.addMechanic(Sergey);
//        Kamaz.addSponsor(Bank2);
//
//        PAZ.addDriver(new DriverD ("Иван", true, 9,"D"));
//        PAZ.addMechanic(Sergey);
//        PAZ.addSponsor(Bank2);
//
//        List<Transport> transports = List.of(Lada, KIA,Kamaz,PAZ);
//
//        ServiceStation serviceStation = new ServiceStation();
//        serviceStation.addCar(Lada);
//        serviceStation.addTruck(Kamaz);
//        serviceStation.passDiagnostics();
//        serviceStation.passDiagnostics();
////
//        for (Transport transport : transports) {
//            printInfo(transport);
//        }

    }

    private static void printInfo (Transport transport){
        System.out.println("Информация по автомобилю " + transport.getBrand() + " " + transport.getModel());
        System.out.println("Водители:" + transport.getDrivers());
        System.out.println("Спонсоры:" + transport.getSponsors());
        System.out.println("Механики:" + transport.getMechanics());
        System.out.println();
    }

    private static void passDiagnostics(Transport... transports) {
        for (Transport transport : transports){
            passDiagnosticsTransport(transport);
        }
    }

    private static void passDiagnosticsTransport(Transport transport) {
        try {
            if (!transport.passDiagnostics()){
                throw new RuntimeException("Автомобиль "+ transport.getBrand()+ " "+ transport.getModel()+ " не прошел диагностику");
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
