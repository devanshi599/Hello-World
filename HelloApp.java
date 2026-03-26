public class HelloApp {

    public static void main(String[] args) {
       feature/UC5-enhanced-for-loop


        main
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            for (String name : args) {
                System.out.println("Hello, " + name + "!");
            }
        }
    }
}