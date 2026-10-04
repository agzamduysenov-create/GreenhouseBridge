package greenhouse;

// Refined Abstraction: strawberries need moderate water and nutrients
public class Strawberry extends Plant {
    public Strawberry(GrowingSystem system) {
        super(system);
    }

    @Override
    protected String getName() { return "Strawberry"; }

    @Override
    protected int getWaterNeed() { return 300; }

    @Override
    protected int getNutrientNeed() { return 15; }
}