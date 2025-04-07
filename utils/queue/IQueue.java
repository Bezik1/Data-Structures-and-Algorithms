package utils.queue;

public interface IQueue<T>{
    boolean isEmpty();
    boolean isFull();
    T dequeue() throws EmptyQueueException;
    void enqueue(T elem) throws FullQueueException;
    int size(); // return the number of element in a queue
    T first() throws EmptyQueueException;
    // return first element without removing it
}