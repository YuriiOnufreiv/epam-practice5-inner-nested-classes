/**
 * Inner & Nested classes. Task 2,3,4
 */
package ua.onufreiv.inner;

/**
 * Factory class for obtaining different implementations of {@link IMessenger}
 * interface with the help of nested, local and anonymous classes
 *
 * @version 1.0
 * @author Yurii Onufreiv
 */
public class MessengerFactory {
    /**
     * Creates the instance of {@link IMessenger} with the help of nested class
     * and returns its instance
     *
     * @return new instance of {@link IMessenger} class
     */
    public IMessenger getConsoleMessengerNested(String name) {
        return new ConsoleMessengerNested(name);
    }

    /**
     * Creates the instance of {@link IMessenger} with the help of local class
     * and returns its instance
     *
     * @return new instance of {@link IMessenger} class
     */
    public IMessenger getConsoleMessengerLocal(String name) {
        class ConsoleMessengerLocal implements IMessenger {

            @Override
            public void printMessage(String message) {
                System.out.println(name + " (local) -> " + message);
            }
        }
        return new ConsoleMessengerLocal();
    }

    /**
     * Creates the instance of {@link IMessenger} with the help of anonymous
     * class and returns its instance
     *
     * @return new instance of {@link IMessenger} class
     */
    public IMessenger getConsoleMessengerAnonymous(String name) {
        String nameLocalVar = name;
        return new IMessenger() {
            @Override
            public void printMessage(String message) {
                System.out.println(nameLocalVar + " (anonymous) -> " + message);
            }
        };
    }

    /**
     * Implementation of IMessenger interface in the form of nested class
     */
    private static class ConsoleMessengerNested implements IMessenger {

        private String messengerName;

        private ConsoleMessengerNested(String name) {
            this.messengerName = name;
        }

        @Override
        public void printMessage(String message) {
            System.out.println(messengerName + " (nested) -> " + message);
        }
    }
}
