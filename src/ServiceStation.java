import java.util.ArrayDeque;
import java.util.Queue;

public class ServiceStation {

    private final Queue<Transport> transports = new ArrayDeque<>();

    private void add(Transport transport){
        transports.offer(transport);
    }

    public void addCar(Cars cars) {
        add(cars);
    }

    public void addTruck(Trucks trucks){
        add(trucks);
    }

    public void passDiagnostics(){
        if (!transports.isEmpty()){
            Transport transport = transports.poll();
            boolean result = transport.passDiagnostics();
            if (!result){
                transport.repair();
            }
        }
    }
}
