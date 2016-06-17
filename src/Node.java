public class Node {
    private Object value;
    private Node next;

    public Node(Object value, Node next) {
        this.value = value;
        this.next = next;
    }

    public Node getNext() {
        return this.next;
    }

    public void setNext(Node newNode) {
        this.next = newNode;
    }

    public Object getValue() {
        return this.value;
    }
}
