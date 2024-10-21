public class PolarCoordinates {

    public double r;
    public double phi;
    public PolarCoordinates(double r, double phi) {
        if(r >= 0 && -Math.PI < phi && phi < Math.PI) {
            this.r = r;
            this.phi = phi;
        } else {
            throw new IllegalArgumentException("Niepoprawny argument!");
        }
    }

    @Override
    public String toString() {
        return "(r=" + this.r + ", phi=" + this.phi + ")";
    }

    public CartesianCoordinates PolarToCartesian() {
        return new CartesianCoordinates(r * Math.cos(this.phi), r * Math.sin(this.phi));
    }
}
