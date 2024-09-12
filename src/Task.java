/**
 * Represents an abstract Task that extends the Thread class.
 * This class should be extended to create specific tasks.
 */
abstract class Task extends Thread {
    Broker broker;
    /**
     * Constructs a Task object with the given Broker and Runnable.
     *
     * @param b The Broker object associated with the task.
     * @param r The Runnable object representing the task to be executed.
     */
    Task(Broker b, Runnable r){
        throw new UnsupportedOperationException("Should be overridden");
    }

    /**
     * Returns the broker.
     *
     * @return the broker.
     */
    static Broker getBroker(){
        throw new UnsupportedOperationException("Should be overridden");
    }
}