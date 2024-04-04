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


    private Transport getTransportation(String id) {
        for (Transport transport : this) {
            if(transport.getId().equals(id))
                return transport;
        }
        return null;
    }


    public void makeTransportation(String id, String origin, String destination, double price) {
        Transport transport = getTransportation(id);
        if(transport != null) {
            if(transport.isAvailable()) {
                transport.setAvailable(false);
                transport.setPrice(price);
                transport.setDestination(destination);
                transport.setOrigin(origin);
                inService.add(transport);
                this.remove(transport);
            }
        }
    }


    public void finalizeTransportation(String id) {
        Transport transport = getTransportation(id);
        if(transport!= null) {
            inService.remove(transport);
            transport.setAvailable(true);
            transport.setPrice(0.0);
            transport.setDestination("");
            transport.setOrigin("");
            this.add(transport);
        }
    }
}
