abstract class Channel {
    /**
     * This method reads up to a specified number of bytes from the channel into the given buffer.
     * It is a blocking operation, meaning it will only return once at least one byte has been read.
     *
     * @param bytes the buffer to read into.
     * @param offset the offset in the buffer to start reading into.
     * @param length the maximum number of bytes to read.
     * @return the number of bytes read, or -1 if the channel is disconnected.
     */
    abstract int read(byte[] bytes, int offset, int length);
    /**
     * Write up to length bytes from the given buffer to the channel.
     *
     * @param bytes the buffer to write from.
     * @param offset the offset in the buffer to start writing from.
     * @param length the number of bytes to write.
     * @return the number of bytes written once it succeed and -1 if the channel is disconnected.
     */
    abstract int write(byte[] bytes, int offset, int length);
    // Disconnect the channel.
    abstract void disconnect();
    // Check if the channel is disconnected.
    abstract boolean disconnected();
}