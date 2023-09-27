public class TuboTest {
    public static void main(String[] args) {
        Tubo t1 = new Tubo(20,22,10);

        System.out.println("The volume of the tube is: " + t1.calculateVolume());

        System.out.println("The external surface area is: " + t1.calculateOuterSurfaceArea());
    }
}
