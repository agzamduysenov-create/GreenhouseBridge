package greenhouse;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Bridge: Plant x GrowingSystem ===\n");

        // Compose a Refined Abstraction with a Concrete Implementor
        Plant tomato = new Tomato(new SoilSystem());
        Plant strawberry = new Strawberry(new HydroSystem());

        tomato.care();
        strawberry.care();

        // Switch the implementation at runtime: transplant the tomato into hydroponics
        System.out.println("\n--- Transplanting tomato from Soil to Hydro ---\n");
        tomato.setSystem(new HydroSystem());
        tomato.care();
    }
}