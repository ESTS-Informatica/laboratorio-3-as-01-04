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

    @Override
    public double getPriceWithFees() {
        return super.getPriceWithFees();
    }

    @Override
    public String getTransportType() {
        return "Transporte Terrestre";
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(super.toString());

        sb.append(String.format("%15s: %s\n", "Matricula", licensePlate));

        return sb.toString();
    }
}


