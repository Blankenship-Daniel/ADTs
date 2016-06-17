public interface ArrayBasedStackInterface {

    /**
     * Returns the size of the stack
     * @return int the number of elements in the stack
     */
    int size();

    /**
     * See if the stack is empty
     * @return boolean true if the stack is empty, false otherwise
     */
    boolean isEmpty();

    /**
     * Returns the top element in the stack
     * @return Object the top element
     * @throws Exception if called on an empty stack
     */
    Object top() throws Exception;

    /**
     * Push an object onto the top of the stack
     * @param element the object to be placed on the top of the stack
     */
    void push (Object element);

    /**
     * Return and remove the top element of the stack
     * @return Object the top element of the stack
     * @throws Exception if called on an empty stack
     */
    Object pop() throws Exception;
}
