/**
 * Inner & Nested classes. Task 2,3,4
 */
package ua.onufreiv.inner;

/**
 * Runner class for demonstrating the solution for Task 2 - nested, local and
 * anonymous classes
 *
 * @version 1.0
 * @author Yurii Onufreiv
 */
public class MessengerRunner {
    public static void main(String[] args) {
        MessengerFactory messengerFactory = new MessengerFactory();
        IMessenger messengerInstance;

        messengerInstance = messengerFactory.getConsoleMessengerNested("NESTED");
        messengerInstance.printMessage("Hello NESTED world!");

        messengerInstance = messengerFactory.getConsoleMessengerLocal("LOCAL");
        messengerInstance.printMessage("Hello LOCAL world!");

        messengerInstance = messengerFactory.getConsoleMessengerAnonymous("ANONYMOUS");
        messengerInstance.printMessage("Hello ANONYMOUS world!");
    }
}
