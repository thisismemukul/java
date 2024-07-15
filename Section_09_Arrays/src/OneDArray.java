public class OneDArray {

    public void initOneDArray() {
        int A[] = new int[5];
        int B[] = {1, 2, 3, 4, 5};
        int C[];
        C = new int[5];
        int[] D = new int[5];
        D[2]=9;

        System.out.println("Array A:");
        printArray(A);

        System.out.println("Array B:");
        printArray(B);

        System.out.println("Array C:");
        printArray(C);

        System.out.println("Array D:");
        printArray(D);
    }

    private void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

}
