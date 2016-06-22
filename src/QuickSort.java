public class QuickSort implements QuickSortInterface {

    private int numItems;
    private int size;
    private int[] arr;

    public QuickSort() {
        this.numItems = 0;
        this.size = 0;
        this.arr = null;
    }

    private void swap(int a, int b) {
        int tempA = this.arr[a];
        this.arr[a] = this.arr[b];
        this.arr[b] = tempA;
    }

    private void quickSort(int left, int right) {
        int pivotElement;

        if (left < right) {
            pivotElement = this.partition(left, right, this.medianOfThree(left, right));
            this.quickSort(left, pivotElement - 1);
            this.quickSort(pivotElement + 1, right);
        }
    }

    @Override
    public void sortAll() {
        this.quickSort(0, this.numItems - 1);
    }

    @Override
    public int medianOfThree(int left, int right) {
        int middle = (left + right) / 2;

        if (this.numItems > 0 && left >= 0 && left < size
                && right >= 0 && right < size && left < right) {

            if (this.arr[middle] < this.arr[left])
                this.swap(left, middle);
            if (this.arr[right] < this.arr[middle])
                this.swap(middle, right);
            if (this.arr[middle] < this.arr[left])
                this.swap(left, middle);

            return middle;
        }

        return -1;
    }

    @Override
    public int partition(int left, int right, int pivotIndex) {
        if (pivotIndex >= 0 && pivotIndex <= right &&
                this.numItems > 0 && left >= 0 && left < this.size &&
                right >= 0 && right < this.size && left < right) {

            this.swap(pivotIndex, left);
            int up = left + 1;
            int down = right;

            do {
                while ((up != right) && !(this.arr[left] < this.arr[up])) ++up;
                while (this.arr[left] < this.arr[down]) --down;

                if (up < down)
                    swap(up, down);
            } while (up < down);

            swap(left, down);

            return down;
        }

        return -1;
    }

    @Override
    public int getSize() {
        return this.size;
    }

    @Override
    public void addToArray(int value) throws Exception {
        if (this.numItems < this.size) {
            this.arr[this.numItems] = value;
            this.numItems++;
        } else {
            throw new Exception("Array at max capacity");
        }
    }

    @Override
    public boolean createArray(int size) {
        if (size > 0) {
            this.numItems = 0;
            this.size = size;
            this.arr = new int[this.size];

            return true;
        }

        return false;
    }

    @Override
    public void clear() {
        this.size = this.numItems = 0;
        this.arr = null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < this.size; i++) {
            sb.append(this.arr[i] + "\n");
        }

        return sb.toString();
    }
}
