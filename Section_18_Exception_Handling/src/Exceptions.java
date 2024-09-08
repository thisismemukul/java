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
    public static void methodThatUsesThrow() {
        try {
            System.out.println("Inside methodThatUsesThrow()");
            methodThatThrows();
        } catch (CustomException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }

    public static void methodThatThrows() throws CustomException {
        System.out.println("Inside methodThatThrows()");
        throw new CustomException("This is a CustomException from methodThatThrows()");
    }

    public void finallyDemo(){
        try {
            System.out.println(10/0);
        }catch (Exception e) {
            System.out.println("Inside finallyDemo() exception");
            System.out.println(e);
        }finally {
            System.out.println("Inside finallyDemo()");
        }

    }
}


