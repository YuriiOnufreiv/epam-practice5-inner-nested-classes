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
    private static int staticField = 5;
    private int nonStaticField = 10;

    /**
     * Creates the instance of {@link IMessenger} with the help of nested class
     * and returns its instance
     *
     * @return new instance of {@link IMessenger} class
     */
    public IMessenger getConsoleMessengerNested(String name) {
        return new ConsoleMessengerNested(name, this);
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
                System.out.println(name + " (local) -> " + message + " "
                        + MessengerFactory.getFromStaticMethod() + " "
                        + new MessengerFactory().getFromNonStaticMethod());
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
        return new IMessenger() {
            @Override
            public void printMessage(String message) {
                System.out.println(name + " (anonymous) -> " + message);
            }
        };
    }

    /**
     * Implementation of IMessenger interface in the form of nested class
     */
    private static class ConsoleMessengerNested implements IMessenger {

        private String messengerName;
        private int sumOfFields;

        private ConsoleMessengerNested(String name, MessengerFactory messengerFactory) {
            this.messengerName = name;
            sumOfFields = MessengerFactory.staticField + messengerFactory.nonStaticField;
        }

        @Override
        public void printMessage(String message) {
            System.out.println(messengerName + " (nested) -> " + message + "; fields sum =  " + sumOfFields);
        }
    }

    public static String getFromStaticMethod() {
        return "StaticFactoryMethod";
    }

    public String getFromNonStaticMethod() {
        return "NonStaticFactoryMethod";
    }
}
