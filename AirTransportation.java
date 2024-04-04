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
        this.numberOfContainers = numberOfContainers;
    }
}
