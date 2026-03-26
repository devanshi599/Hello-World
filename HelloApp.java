public class HelloApp {

    public static void main(String[] args) {
       feature/UC5-enhanced-for-loop


        main
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            // Join all names with comma and space
            String result = String.join(", ", args);

            System.out.println("Hello, " + result + "!");
        }
    }
}