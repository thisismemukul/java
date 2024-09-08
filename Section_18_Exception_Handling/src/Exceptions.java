public class Exceptions {
    public void multipleCatch() {
        try {
            int A[] = {10, 0, 3, 4, 5, 6};
            int r = A[0] / A[3];
            System.out.println(r);
            System.out.println(A[10]);
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException | NullPointerException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void NestedTryCatch() {
        try {
            int []A = {10, 0, 3, 4, 5, 6};
            try {
                int r = A[0] / A[1];
                System.out.println(r);
            }catch (ArithmeticException e) {
                System.out.println(e);
            }
            System.out.println(A[10]);
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }
}
