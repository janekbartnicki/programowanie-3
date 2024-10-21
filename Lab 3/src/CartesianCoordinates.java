public class CartesianCoordinates {
    public double x;
    public double y;

    public CartesianCoordinates(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(x=" + this.x + ", y=" + this.y + ")";
    }
    public PolarCoordinates CartesianToPolar(){
        double r = Math.sqrt(this.x * this.x + this.y * this.y);
        double phi = Math.atan2(this.y, this.x);

        return new PolarCoordinates(r, phi);
    }

}
