public class Ball extends MaterialPoint {
    private double radius;

    // Default constructor with reference to superclass
    public Ball() {
        super();
        this.radius = 1.0;
    }

    // Parameterized constructor with reference to superclass
    public Ball(double radius, double mass) {
        super(mass);
        this.setRadius(radius);
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        // Radius cannot be less than zero
        if (radius < 0) {
            radius = 1.0;
        }
        this.radius = radius;
    }

    @Override
    public double getCentralMomentOfInertia() {
        return this.getMass() * Math.pow(this.radius, 2) * 0.4;
    }

    @Override
    public String toString() {
        return "Ball";
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
