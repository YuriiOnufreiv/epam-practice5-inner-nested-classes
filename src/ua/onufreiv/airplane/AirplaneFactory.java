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
     * Creates the new object of {@link Airplane} class with the specified manufacturer and model
     * @param manufacturer manufacturer of the airplane
     * @param model model of the airplane
     * @return new airplane object
     */
    public static Airplane createAirplane(String manufacturer, String model) {
        Airplane airplane = new Airplane(manufacturer, model);
        airplane.setLeftEngine(airplane.new AirplaneEngine(EngineType.LEFT));
        airplane.setRightEngine(airplane.new AirplaneEngine(EngineType.RIGHT));
        return airplane;
    }
}
