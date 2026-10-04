# GreenhouseBridge

Assignment #3 — Bridge Pattern (ShP-2216 Software Design Patterns, Astana IT University).

Domain: smart greenhouse (continuation of Assignment #2). Two dimensions vary independently:
**what** is grown (the plant) and **how** it is grown (the growing system).

## Bridge structure

| Role | Class | Responsibility |
|---|---|---|
| Abstraction | `Plant` | Holds a reference to a `GrowingSystem` (the bridge); `care()` decides **how much** water and nutrients |
| Refined Abstraction | `Tomato`, `Strawberry` | Provide each plant's name and needs |
| Implementor | `GrowingSystem` | Low-level operations: `deliverWater()`, `deliverNutrients()` |
| Concrete Implementor | `HydroSystem`, `SoilSystem` | Decide **how** resources are delivered (water tank vs soil) |
| Client | `Main` | Composes plants with systems and switches the system at runtime |

The two hierarchies are connected by **composition** (`Plant` has a `GrowingSystem` field), not inheritance.
Any plant works with any system, so 2 plants × 2 systems need only 4 classes instead of 4 combination classes.

## Runtime switching

```java
Plant tomato = new Tomato(new SoilSystem());
tomato.care();                        // soil
tomato.setSystem(new HydroSystem());  // transplant
tomato.care();                        // hydro
```

## Project structure
```
src/main/java/greenhouse/
├── GrowingSystem.java   # Implementor
├── HydroSystem.java     # Concrete Implementor
├── SoilSystem.java      # Concrete Implementor
├── Plant.java           # Abstraction (holds the bridge)
├── Tomato.java          # Refined Abstraction
├── Strawberry.java      # Refined Abstraction
└── Main.java            # Client
```

## Run
Open in IntelliJ IDEA (JDK 17) and run `greenhouse.Main`.