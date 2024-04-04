public class Lorry extends GroundTransportation{
    private int numberOfPallets;
    private int trailers;

    public Lorry(String licensePlate, int numberOfPallets, int trailers) {
        super(licensePlate);
        this.numberOfPallets = numberOfPallets;
        this.trailers = trailers;
    }

    public int getNumberOfPallets() {
        return numberOfPallets;
    }

    public void setNumberOfPallets(int numberOfPallets) {
        this.numberOfPallets = numberOfPallets;
    }

    public int getTrailers() {
        return trailers;
    }

    public void setTrailers(int trailers) {
        this.trailers = trailers;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(super.toString());

        sb.append(String.format("%15s: %s\n", "NºPaletes", numberOfPallets));
        sb.append(String.format("%15s: %s\n", "NºTrailers", trailers));

        return sb.toString();
    }
}
