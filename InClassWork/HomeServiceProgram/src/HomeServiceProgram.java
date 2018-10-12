
import java.util.ArrayList;

/**
 *
 * @author su7613rx
 */
public class HomeServiceProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList <Service> serviceList = new ArrayList<> ();
        
        serviceList.add(new RegularService(50, 101, "Jane", "Doe", 50.0, 20.0));
        serviceList.add(new Weekendservice(2, 102, "John", "Doe", 60.0, 21.0));
        serviceList.add(new EmergencyService(5, 103, "Doe", "Doe", 78.0, 22.5));
        
        for(Service service : serviceList) {
            System.out.println(service.toString());
            System.out.println("Cost: $" + service.calculateCost() + "\n");
        }
    }
    
}
