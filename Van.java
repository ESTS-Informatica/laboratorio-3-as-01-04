public class Van extends GroundTransportation {

    int numberOfPackages;

    public Van(String licensePlate, int numberOfPackages) {
        super(licensePlate);
        this.numberOfPackages = numberOfPackages;
    }

    public int getPackages() {
        return numberOfPackages;
    }

    public void setPackages(int packages) {
        this.numberOfPackages = packages;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(super.toString());
        sb.append(String.format("%15s: %s\n", "Nº Pacotes", numberOfPackages));
        return sb.toString();
    }
}
