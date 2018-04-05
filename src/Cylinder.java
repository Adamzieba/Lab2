public class Cylinder extends MaterialPoint {
    private double radius;

    public Cylinder() {
        super();
        this.radius = 1.0;
    }

    public Cylinder(double radius, double mass) {
        super(mass);
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getCentralMomentOfInertia() {
        return this.getMass() * Math.pow(this.radius, 2) * 0.5;
    }

    @Override
    public String toString() {
        return "Cylinder";
    }

    @Override
    public void present() {
        String central = App.format(this.getCentralMomentOfInertia());

        String information = this.toString() + "\n" + "  "
                + "Mass: " + this.getMass() + "\n" + "  "
                + "Radius: " + this.getRadius() + "\n" + "  "
                + "Moment of inertia: " + central;

        System.out.println(information);
    }
}
