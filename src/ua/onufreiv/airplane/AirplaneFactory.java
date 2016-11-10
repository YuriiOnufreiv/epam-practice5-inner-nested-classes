/**
 * Inner & Nested classes. Task 1
 */
package ua.onufreiv.airplane;

/**
 * Factory class for creating new objects of {@link Airplane} class
 *
 * @version 1.0
 * @author Yurii Onufreiv
 */
public class AirplaneFactory {
    /**
     * Creates the new object of {@link Airplane} class with the specified vendor and model
     * @param vendor
     * @param model
     * @return
     */
    public static Airplane createAirplane(String vendor, String model) {
        Airplane airplane = new Airplane(vendor, model);
        airplane.setLeftEngine(airplane.new AirplaneEngine(EngineType.LEFT));
        airplane.setRightEngine(airplane.new AirplaneEngine(EngineType.RIGHT));
        return airplane;
    }
}
