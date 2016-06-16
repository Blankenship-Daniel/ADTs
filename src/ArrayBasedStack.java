public class ArrayBasedStack implements ArrayBasedStackInterface {

    private int capacity;
    private int size;
    private int top;
    private Object[] stack;

    private void reallocate() {
        this.capacity += 10000;
        Object[] stackTemp = this.stack;
        this.stack = new Object[this.capacity];

        for (int i = 0; i < this.size; i++) {
            this.stack[i] = stackTemp[i];
        }
    }

    public ArrayBasedStack() {
        this.capacity = 1000;
        this.size = 0;
        this.top = -1;
        this.stack = new Object[this.capacity];
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return (size == 0);
    }

    @Override
    public Object top() throws Exception {
        if (this.size == 0)
            throw new Exception("Illegal operation, calling top() on empty stack");

        return this.stack[this.top];
    }

    @Override
    public void push(Object element) {
        if (this.size == this.capacity)
            this.reallocate();

        this.size++;
        this.top++;
        this.stack[this.top] = element;
    }

    @Override
    public Object pop() throws Exception {
        if (this.size == 0)
            throw new Exception("Illegal operation, calling pop() on empty stack");

        Object elem = this.stack[this.top];
        this.size--;
        this.top--;

        return elem;
    }
}
