/**
 * Inner & Nested classes. Task 1
 */
package ua.onufreiv.airplane;

/**
 * Class describes airplane functionality containing also the following classes:
 * <p>1. {@code public class Airplane.AirplaneEngine implements IEngine}
 * <p>2. {@code public class Airplane.AirplaneEngine.Engine}
 *
 * @version 1.0
 * @author Yurii Onufreiv
 */
public class Airplane {

    public class AirplaneEngine implements IEngine {

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
    }

    private String vendor;
    private String model;
    private AirplaneEngine leftEngine;
    private AirplaneEngine rightEngine;

    public Airplane(String vendor, String model) {
        this.vendor = vendor;
        this.model = model;
    }

    public void setLeftEngine(AirplaneEngine leftEngine) {
        this.leftEngine = leftEngine;
    }

    public void setRightEngine(AirplaneEngine rightEngine) {
        this.rightEngine = rightEngine;
    }

    public void startFly() {
        System.out.println("===== STARTING FLY =====");
        rightEngine.startEngine();
        leftEngine.startEngine();
    }

    public void endFly() {
        System.out.println("=====  ENDING FLY  =====");
        rightEngine.stopEngine();
        leftEngine.stopEngine();
    }

    @Override
    public String toString() {
        return vendor + " " + model;
    }
}
