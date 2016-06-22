public interface QuickSortInterface {
    void sortAll();
    int medianOfThree(int left, int right);
    int partition(int left, int right, int pivotIndex);
    int getSize();
    void addToArray(int value) throws Exception;
    boolean createArray(int size);
    void clear();
}
