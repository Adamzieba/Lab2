public class Ball extends MaterialPoint {
    private double radius;

    public Ball() {
        super();
        this.radius = 1.0;
    }

    public Ball(double radius, double mass) {
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
