import java.util.Arrays;

public class TestDriver {

    public static void printStackInfo(ArrayBasedStack stack) {
        System.out.println();
        System.out.println("size: " + stack.size());
        System.out.println("isEmpty(): " + stack.isEmpty());

        try {
            System.out.println("top(): " + stack.top().toString());
        } catch (Exception e) {
            System.out.println("top() exception: " + e.toString());
        }

        try {
            stack.pop();
            System.out.println("pop(): " + stack.size());
        } catch (Exception e) {
            System.out.println("pop() exception: " + e.toString());
        }

        System.out.println();
    }

    public static void testStack() {
        ArrayBasedStack stack = new ArrayBasedStack();
        printStackInfo(stack);

        for (int i = 0; i < 10; i++) {
            stack.push(i);
        }

        printStackInfo(stack);

        for (int i = 0; i < 9; i++) {
            try {
                stack.pop();
            } catch (Exception e) {
                System.out.println("pop() exception: " + e.toString());
            }
        }

        printStackInfo(stack);

        for (int i = 0; i < 10000; i++) {
            stack.push(i);
        }

        printStackInfo(stack);
    }

    public static void testLinkedList() {
        LinkedList list = new LinkedList();

        for (int i = 0; i < 1000; i++) {
            list.insertTail(i);
        }

        list.clear();

        for (int i = 0; i < 1000; i++) {
            list.insertHead(i);
        }

        System.out.println(list.toString());
    }

    public static String reverseStr(String str) {
        if (str.length() <= 1) {
            return str;
        }

        return reverseStr(str.substring(1)) + str.charAt(0);
    }

    public static int[] bubbleSort(int[] unsorted) {
        for (int i = 0; i < unsorted.length - 1; i++) {
            for (int j = 1; j < unsorted.length - i; j++) {
                if (unsorted[j - 1] > unsorted[j]) {
                    int temp = unsorted[j];
                    unsorted[j] = unsorted[j - 1];
                    unsorted[j - 1] = temp;
                }
            }
        }

        return unsorted;
    }

    public static void main(String[] args) {
        //testStack();
        //testLinkedList();
        //System.out.println(reverseStr("My name is Daniel Blankenship!"));
        int[] unsorted = {1, 5, 7, 90, 2, 4, 6, 78, 3, 4, 56, 24};
        int[] sorted = bubbleSort(unsorted);
        System.out.println(Arrays.toString(sorted));
    }
}
