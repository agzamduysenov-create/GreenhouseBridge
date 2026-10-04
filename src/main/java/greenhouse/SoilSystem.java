package greenhouse;

// Concrete Implementor: plants grow in soil
public class SoilSystem implements GrowingSystem {
    @Override
    public void deliverWater(int milliliters) {
        System.out.println("  [Soil] Watering the soil with " + milliliters + " ml");
    }

    @Override
    public void deliverNutrients(int grams) {
        System.out.println("  [Soil] Mixing " + grams + " g of fertilizer into the soil");
    }
}