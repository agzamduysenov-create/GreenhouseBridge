package greenhouse;

// Abstraction: a plant that is grown using some GrowingSystem
public abstract class Plant {
    protected GrowingSystem system; // the "bridge" (composition)

    protected Plant(GrowingSystem system) {
        this.system = system;
    }

    // Switch the implementation at runtime (transplant the plant)
    public void setSystem(GrowingSystem system) {
        this.system = system;
    }

    // High-level operation: the plant decides HOW MUCH, the system decides HOW
    public void care() {
        System.out.println(getName() + ":");
        system.deliverWater(getWaterNeed());
        system.deliverNutrients(getNutrientNeed());
    }

    protected abstract String getName();
    protected abstract int getWaterNeed();
    protected abstract int getNutrientNeed();
}