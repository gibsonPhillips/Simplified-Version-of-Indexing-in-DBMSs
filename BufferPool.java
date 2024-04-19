import java.util.Arrays;

// BufferPool class representing the entire available buffer pool
public class BufferPool {
    private Frame[] buffers; // Array of Frame objects
    private int size; // Size of the buffer pool

    // Constructor
    public BufferPool(int size) {
        this.size = size;
        buffers = new Frame[size];
        initialize(); // Initialize the buffer pool
    }

    // Initialize the buffer pool
    private void initialize() {
        for (int i = 0; i < size; i++) {
            buffers[i] = new Frame(); // Create new Frame objects and store them in the array
        }
    }

    // Method to print the buffer pool for testing purposes
    public void printBufferPool() {
        for (int i = 0; i < size; i++) {
            System.out.println("Buffer " + i + ": " + Arrays.toString(buffers[i].getContent()));
        }
    }
}