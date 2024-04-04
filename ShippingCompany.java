import java.util.ArrayList;
import java.util.HashSet;

public class ShippingCompany extends HashSet<Transport> {
    private String name;
    private ArrayList<Transport> inService;

    public ShippingCompany(String name) {
        this.name = name;
        this.inService = new ArrayList<Transport>();
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Transport> getInService() {
        return this.inService;
    }

    public void setInService(ArrayList<Transport> inService) {
        this.inService = inService;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();

        for (Transport transport : this) {
            sb.append(transport.toString());
        }

        return sb.toString();
    }
}
