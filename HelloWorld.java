
public class HelloWorld {
    public static void main(String[] args) {
        // args[0] is the first word typed after the command
        if (args.length > 0) {
            String name = args[0];
            System.out.println("Hello, " + name + "!");
        } else {
            // Fallback if you forget to type a name
            System.out.println("Hello, World!");
        }
    }
}