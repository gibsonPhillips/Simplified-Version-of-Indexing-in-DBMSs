import java.util.Scanner;

// Main class to run the program
public class Main {

    // helper method to do user io
    public static void hUserIo(BufferPool bufferPool) {
        Scanner scanner = new Scanner(System.in);
        String command;

        while (true) {
            System.out.print("Enter command (GET, SET, PIN, UNPIN): ");
            command = scanner.nextLine().toUpperCase();

            switch (command) {
                case "GET":
                    System.out.println("GET command selected.");
                    // Implement GET command logic here
                    break;
                case "SET":
                    System.out.println("SET command selected.");
                    // Implement SET command logic here
                    break;
                case "PIN":
                    System.out.println("PIN command selected.");
                    // Implement PIN command logic here
                    break;
                case "UNPIN":
                    System.out.println("UNPIN command selected.");
                    // Implement UNPIN command logic here
                    break;
                case "EXIT":
                    System.out.println("Exiting program.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid command. Please try again.");
            }
        }
    }
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java Main <buffer_pool_size>");
            System.exit(1);
        }

        int buffSize = Integer.parseInt(args[0]); // Parse buffer pool size from command line argument
        BufferPool bufferPool = new BufferPool(buffSize); // Create buffer pool with specified size
        System.out.println("The program is ready for the next command.");

        hUserIo(bufferPool);
        // You can implement command processing here
    }
}