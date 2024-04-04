public class GroundTransportation extends Transport {
    String licensePlate;


    public GroundTransportation(String licensePlate) {
        super();
        this.licensePlate = licensePlate;
        super.setFees(3.0);
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getLicensePlate() {
        return this.licensePlate;
    }
}
