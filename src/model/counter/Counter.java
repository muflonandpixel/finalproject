package model.counter;

public class Counter implements AutoCloseable {
    private int count = 0;
    private boolean closed = false;

    public void add() throws Exception {
        if (closed) {
            throw new Exception("Counter is closed!");
        }
        count++;
    }

    public int getCount() {
        return count;
    }

    @Override
    public void close() {
        closed = true;
        System.out.println("Counter closed.");
    }
}
