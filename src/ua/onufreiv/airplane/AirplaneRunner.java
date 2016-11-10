/**
 * Inner & Nested classes. Task 1
 */
package ua.onufreiv.airplane;

/**
 * Runner class for demonstrating the solution for Task 1 - creating of
 * {@link Airplane} class object
 *
 * @version 1.0
 * @author Yurii Onufreiv
 */
public class AirplaneRunner {
    public static void main(String[] args) {
        Airplane airplane = AirplaneFactory.createAirplane("An", "225");
        airplane.startFly();
        airplane.endFly();
    }
}
