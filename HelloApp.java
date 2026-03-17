public class HelloApp {
    public static void main(String[] args) {
feature/UC3-display-name-default
        String name;

        
        if (args.length > 0) {
            name = args[0];
        } else {
            name = "World";
        }

        System.out.println("Hello, " + name + "!");

        // args[0] captures the first word typed after the run command
        if (args.length > 0) {
            System.out.println("Hello, " + args[0] + "!");
        } else {
            System.out.println("Hello, World !");


            
        }
main
    }
}