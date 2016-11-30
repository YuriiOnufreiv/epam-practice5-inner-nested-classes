/**
 * Inner & Nested classes. Task 1
 */
package ua.onufreiv.airplane;

/**
 * Class describes airplane functionality containing also the following classes:
 * <p>1. {@code public class Airplane.AirplaneEngine implements IEngine}
 * <p>2. {@code public class Airplane.AirplaneEngine.Engine}
 *
 * @author Yurii Onufreiv
 * @version 1.0
 */
public class Airplane {

    private String manufacturer;
    private String model;
    private AirplaneEngine leftEngine;
    private AirplaneEngine rightEngine;

    public Airplane(String manufacturer, String model) {
        this.manufacturer = manufacturer;
        this.model = model;
    }

    public void setLeftEngine(AirplaneEngine leftEngine) {
        this.leftEngine = leftEngine;
    }

    public void setRightEngine(AirplaneEngine rightEngine) {
        this.rightEngine = rightEngine;
    }

    public void startFly() {
        System.out.println("STARTING FLY");
        rightEngine.startEngine();
        leftEngine.startEngine();
    }

    public void endFly() {
        System.out.println("ENDING FLY");
        rightEngine.stopEngine();
        leftEngine.stopEngine();
    }

    @Override
    public String toString() {
        return manufacturer + " " + model;
    }

    public class AirplaneEngine implements IEngine {

        private Engine childEngine;

        AirplaneEngine(EngineType engineType) {
            this.childEngine = this.new Engine(engineType);
        }

        public void startEngine() {
            System.out.println(" -> " + childEngine.engineType + " engine of "
                    + Airplane.this + " is started");
        }

        public void stopEngine() {
            System.out.println(" -> " + childEngine.engineType + " engine of "
                    + Airplane.this + " engine is stopped");
        }

        private class Engine {
            private EngineType engineType;

            private Engine(EngineType type) {
                this.engineType = type;
            }

            @Override
            public String toString() {
                return "Engine{" +
                        "type='" + engineType +
                        '}';
            }
        }
    }
}
