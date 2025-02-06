/**
* This program greets my friend and asks them how they are.
*
* @author Santiago Hewett
* @version 1.0
* @since   2025/02/05
*/

final class HelloWorldStyle {

    /**
     * This is a private constructor used to satisfy the
     * style checker.
     *
     * @exception IllegalStateException Utility class.
     * @see IllegalStateException
    */
    private HelloWorldStyle() {
        throw new IllegalStateException("Utility class");
    }

    /**
     * This is the main method.
     *
     * @param args Unused.
     */
    public static void main(String[] args) {
        // print greeting to friend
        System.out.println("Hello, Remy Skelton.");
        System.out.println("How are you?");
    }
}
