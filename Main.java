import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {
        ShippingCompany company = new ShippingCompany("RELIABLE-MOVING");

        company.add(new GroundTransportation("A412"));
        company.add(new AirTransportation("Boeing737", 100));
        company.add(new AirTransportation("Boeing737", 150));
        company.add(new Lorry("H675", 20, 1));
        company.add(new Van("U423", 25));

        System.out.println(company);
    }
}
