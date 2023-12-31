public class Tubo {
    private double innerRadius;
    private double outerRadius;
    private double height;

    public Tubo(double innerRadius, double outerRadius, double height) {
        this.innerRadius = innerRadius;
        this.outerRadius = outerRadius;
        this.height = height;
    }

    public double getInnerRadius() {
        return innerRadius;
    }

    public double getOuterRadius() {
        return outerRadius;
    }

    public double getHeight() {
        return height;
    }

    public void setInnerRadius(double innerRadius) {
        this.innerRadius = innerRadius;
    }

    public void setOuterRadius(double outerRadius) {
        this.outerRadius = outerRadius;
    }

    public void setHeight(double height) {
        this.height = height;
    }


    public double calculateVolume() {
        double innerVolume = Math.PI * Math.pow(innerRadius, 2) * height;
        double outerVolume = Math.PI * Math.pow(outerRadius, 2) * height;
        return outerVolume - innerVolume;
    }

    public double calculateOuterSurfaceArea() {
        double outerTopArea = 2 * Math.PI * Math.pow(outerRadius, 2);
        double outerLateralArea = 2 * Math.PI * outerRadius * height;
        return outerTopArea + outerLateralArea;
    }

    public double calculateInnerSurfaceArea() {
        double innerTopArea = 2 * Math.PI * Math.pow(innerRadius, 2);
        double innerLateralArea = 2 * Math.PI * innerRadius * height;
        return innerTopArea + innerLateralArea;
    }

    public String toString() {
        return "Tube{" +
                "innerRadius=" + innerRadius +
                ", outerRadius=" + outerRadius +
                ", height=" + height +
                '}';
    }

}
