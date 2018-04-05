public class Rod extends MaterialPoint {
    private double length;

    public Rod() {
        super();
        this.length = 1.0;
    }

    public Rod(double length, double mass) {
        super(mass);
        this.length = length;
    }

    public double getLength() {
        return this.length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getCentralMomentOfInertia() {
        return this.getMass() * Math.pow(this.length, 2) / 12.0;
    }

    @Override
    public String toString() {
        return "Rod";
    }

    @Override
    public void present() {
        String central = App.format(this.getCentralMomentOfInertia());

        String information = this.toString() + "\n" + "  "
                + "Mass: " + this.getMass() + "\n" + "  "
                + "Length: " + this.getLength() + "\n" + "  "
                + "Moment of inertia: " + central;

        System.out.println(information);
    }
}
