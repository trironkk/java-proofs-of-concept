package trironkk.personal;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        new App().appExecute(42, "Hello world!", 3.14);
    }

    @ExampleAnnotation
    private void appExecute(
            final int arg1,
            final String arg2,
            final double arg3) {
        System.out.println("arg1: " + arg1);
        System.out.println("arg2: " + arg2);
        System.out.println("arg3: " + arg3);
    }
}
