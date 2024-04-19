import java.util.Arrays;


// Frame class representing a single buffer (memory frame)
public class Frame {
    private byte[] content; // Array of bytes to hold file content
    private boolean dirty; // Flag indicating if the content of this block has changed and needs to be written to disk
    private boolean pinned; // Flag indicating if there is a request to keep this block in memory
    private int blockId; // ID of the block stored in this frame

    // Constructor
    public Frame() {
        content = new byte[4096]; // Initialize content array with size 4KB
        dirty = false;
        pinned = false;
        blockId = -1; // -1 indicates an empty frame
    }

    // Getters and Setters
    public byte[] getContent() {
        return content;
    }

    public void setContent(byte[] content) {
        this.content = content;
    }

    public boolean isDirty() {
        return dirty;
    }

    public void setDirty(boolean dirty) {
        this.dirty = dirty;
    }

    public boolean isPinned() {
        return pinned;
    }

    public void setPinned(boolean pinned) {
        this.pinned = pinned;
    }

    public int getBlockId() {
        return blockId;
    }

    public void setBlockId(int blockId) {
        this.blockId = blockId;
    }

    // Other methods for accessing/updating specific records can be added here
}