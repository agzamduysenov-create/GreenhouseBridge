package greenhouse;

// Concrete Implementor: plants grow in water
public class HydroSystem implements GrowingSystem {
    @Override
    public void deliverWater(int milliliters) {
        System.out.println("  [Hydro] Adding " + milliliters + " ml of water to the solution tank");
    }

    @Override
    public void deliverNutrients(int grams) {
        System.out.println("  [Hydro] Dissolving " + grams + " g of nutrients in the solution");
    }
}