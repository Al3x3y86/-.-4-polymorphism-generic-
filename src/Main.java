
public class Main {
    public static void main(String[] args) {
        System.out.println("Легковые автомобили");

        Cars Lada = new Cars("Lada","Granta", 1.7);
        System.out.println(Lada);
        Lada.pitStop();
        Lada.bestLapTime();
        Lada.maxSpeed();
        Cars Audi = new Cars("Audi","A8", 2.8);
        System.out.println(Audi);
        Cars BMW = new Cars("BMW","Z8", 3.0);
        System.out.println(BMW);
        Cars KIA = new Cars("KIA","Sportage", 2.4);
        System.out.println(KIA);
        Lada.startMoving();
        KIA.finishTheMove();

        System.out.println("Грузовые автомобили");

        Trucks Kamaz = new Trucks("КамАЗ","5490", 11.97);
        System.out.println(Kamaz);
        Kamaz.pitStop();
        Kamaz.bestLapTime();
        Kamaz.maxSpeed();
        Trucks Man = new Trucks("MAN","TGX", 10.5);
        System.out.println(Man);
        Trucks MAZ = new Trucks("МАЗ","544018", 11.95);
        System.out.println(MAZ);
        Trucks Hyundai = new Trucks("Hyundai","HD500", 12.34);
        System.out.println(Hyundai);
        Kamaz.startMoving();
        Hyundai.finishTheMove();

        System.out.println("Автобусы");

        Buses Nefaz = new Buses("НефАЗ","5299", 6.7);
        System.out.println(Nefaz);
        Nefaz.pitStop();
        Nefaz.bestLapTime();
        Nefaz.maxSpeed();
        Buses Volvo = new Buses("Volvo","9700", 10.8);
        System.out.println(Volvo);
        Buses Scania = new Buses("Scania","Touring", 9.00);
        System.out.println(Scania);
        Buses PAZ = new Buses("ПАЗ","Vector-Next", 4.43);
        System.out.println(PAZ);
        Nefaz.startMoving();
        PAZ.finishTheMove();

        System.out.println("Водители");


        DriverB Vladimir = new DriverB ("Владимир", true,5);
        Vladimir.getIn(Lada);
        Vladimir.startMoving();
        Vladimir.refuelTheCar();
        Vladimir.stay();

        DriverС Alexander = new DriverС ("Александр", true,7);
        Alexander.getIn(Kamaz);
        Alexander.startMoving();
        Alexander.refuelTheCar();
        Alexander.stay();

        DriverD Ivan = new DriverD ("Иван", true, 9);
        Ivan.getIn(Nefaz);
        Ivan.startMoving();
        Ivan.refuelTheCar();
        Ivan.stay();


    }
}