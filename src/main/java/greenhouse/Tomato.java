package greenhouse;

// Refined Abstraction: tomatoes need a lot of water and nutrients
public class Tomato extends Plant {
    public Tomato(GrowingSystem system) {
        super(system);
    }

    @Override
    protected String getName() { return "Tomato"; }

    @Override
    protected int getWaterNeed() { return 500; }

    @Override
    protected int getNutrientNeed() { return 30; }
}