public class AirTransportation extends Transport{
    private String name;
    private int numberOfContainers;


    public AirTransportation(String name, int numberOfContainers) {
        super();
        this.name = name;
        this.numberOfContainers = numberOfContainers;
        super.setFees(4.0);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfContainers() {
        return this.numberOfContainers;
    }

    public void setNumberOfContainers(int numberOfContainers) {
        if(numberOfContainers >= 0)
            this.numberOfContainers = numberOfContainers;
    }


    @Override
    public double getPriceWithFees() {
        return super.getPriceWithFees();
    }

    @Override
    public String getTransportType() {
        return "Transporte Aereo";
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(super.toString());

        sb.append(String.format("%15s: %s\n", "Nome", getName()));
        sb.append(String.format("%15s: %d\n", "NºContentores", getNumberOfContainers()));

        return sb.toString();
    }
}
