public class HelloApp {

    public static void main(String[] args) {
       feature/UC5-enhanced-for-loop


        main
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            String result = "";

            // Add names with delimiter
            for (String name : args) {
                result += name + ", ";
            }

            // Remove trailing ", " using substring
            result = result.substring(0, result.length() - 2);

            System.out.println("Hello, " + result + "!");
        }
    }
}