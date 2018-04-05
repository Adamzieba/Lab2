public abstract class MaterialPoint {
    protected double mass;

    public MaterialPoint() {
        this.mass = 1.0;
    }

    public MaterialPoint(double mass) {
        this.mass = mass;
    }

    public double getMass() {
        return this.mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public double getCentralMomentOfInertia() {
        return 0.0;
    }

    public double getParallelMomentOfInertia(double distance) {
        return this.getCentralMomentOfInertia() + this.mass * Math.pow(distance, 2);
    }

    @Override
    public String toString() {
        return "Material point";
    }

    abstract void present();
}
