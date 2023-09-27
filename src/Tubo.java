public class Tubo {
    private double innerRadius;
    private double outerRadius;
    private double height;

    public Tubo(double innerRadius, double outerRadius, double height) {
        this.innerRadius = innerRadius;
        this.outerRadius = outerRadius;
        this.height = height;
    }

    public double calculateVolume() {
        double innerVolume = Math.PI * Math.pow(innerRadius, 2) * height;
        double outerVolume = Math.PI * Math.pow(outerRadius, 2) * height;
        return outerVolume - innerVolume;
    }

}
