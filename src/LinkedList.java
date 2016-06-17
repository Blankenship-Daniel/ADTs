public class LinkedList implements LinkedListInterface {

    private int size;
    private Node head;

    public LinkedList() {
        this.size = 0;
    }

    @Override
    public void insertHead(Object value) {
        if (head == null) {
            this.head = new Node(value, null);
        } else {
            Node newNode = new Node(value, this.head);
            this.head = newNode;
        }

        this.size++;
    }

    @Override
    public void insertTail(Object value) {
        if (head == null) {
            this.head = new Node(value, null);
        } else {
            Node curr = this.head;
            Node newNode = new Node(value, null);

            while (curr.getNext() != null) {
                curr = curr.getNext();
            }

            curr.setNext(newNode);
        }

        this.size++;
    }

    @Override
    public void insertAfter(Object value, Object insertionValue) {
        Node curr = this.head;

        while (curr != null && curr.getValue() != value) {
            curr = curr.getNext();
        }

        curr.setNext(new Node(value, curr.getNext()));
        this.size++;
    }

    @Override
    public void remove(Object value) {
        Node curr = this.head;
        Node trail = this.head;

        while (curr != null && curr.getValue() != value) {
            trail = curr;
            curr = curr.getNext();
        }

        if (curr != null) {
            if (curr == this.head) {
                this.head = this.head.getNext();
            } else {
                curr = curr.getNext();
                trail.getNext().setNext(curr);
            }
        }

        this.size--;
    }

    @Override
    public void clear() {
        this.head = null;
        this.size = 0;
    }

    @Override
    public Object at(int index) {
        Node curr = this.head;

        for (int i = 0; i < index; i++) {
            if (curr == null)
                return null;

            curr = curr.getNext();
        }

        return curr.getValue();
    }

    @Override
    public int size() {
        return this.size;
    }

    public String toString() {
        String output = "";
        Node curr = this.head;

        Integer i = 0;
        while (curr != null) {
            output += i.toString() + ": " + curr.getValue().toString() + "\n";
            curr = curr.getNext();
            i++;
        }

        return output;
    }
}
