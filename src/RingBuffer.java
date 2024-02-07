public class RingBuffer {
    char[] items;
    int front;
    int rear;
    int last;

    public RingBuffer(int capacity){
        items = new char[capacity + 1];
        front = 0;
        rear = 0;
        last = capacity;
    }

    /**
     *      10) Write a void method flush( ) that empties the queue.
     */
    public void flush(){

    }

    /**
     *      11) Write a boolean method isEmpty( )
     */
    public boolean isEmpty(){
        return false;
    }

    /**
     *      12) Write a boolean method add(char ch). The method should return true if the operation is successful and false if the queue is full.
     */
    boolean add(char ch){
        return false;
    }



}
