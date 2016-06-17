public interface LinkedListInterface {

    /**
     * Insert the value at the beginning of the list
     * @param value the value to be inserted
     */
    void insertHead(Object value);

    /**
     * Insert the value at the end of the list
     * @param value the value to be inserted
     */
    void insertTail(Object value);

    /**
     * Insert a given value after another value that may or may not exist in the list
     * @param value the value that may or may not exist in the list
     * @param insertionValue the value to be inserted
     */
    void insertAfter(Object value, Object insertionValue);

    /**
     * Remove the given value from the list. The value may or may not exist in the list
     * @param value the value to be removed
     */
    void remove(Object value);

    /**
     * Empty the list
     */
    void clear();

    /**
     * Returns the value of the node at a given index. The list begins at 0.
     * @param index the location of the node to be retrieved
     * @return Object the value of a node at a given location
     */
    Object at(int index);

    /**
     * Return the size of the list
     * @return int the size of the linked list
     */
    int size();
}
