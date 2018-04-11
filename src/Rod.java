public class Rod extends MaterialPoint {
    private double length;

    // Default constructor with reference to superclass
    public Rod() {
        super();
        this.length = 1.0;
    }

    // Parameterized constructor with reference to superclass
    public Rod(double length, double mass) {
        super(mass);
        this.setLength(length);
    }

    public double getLength() {
        return this.length;
    }

    public void setLength(double length) {
        // Length cannot be less than zero
        if (length < 0) {
            length = 1.0;
        }
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
