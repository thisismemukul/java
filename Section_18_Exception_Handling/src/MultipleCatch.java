public class MultipleCatch {
    public void handleExceptions() {
        try {
            int A[] = {10, 0, 3, 4, 5, 6};
            int r = A[0] / A[3];
            System.out.println(r);
            System.out.println(A[10]);
        } catch (ArithmeticException e) {
            System.out.println(e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        } catch (NullPointerException e) {
            System.out.println(e);
        }catch (Exception e) {
            System.out.println(e);
        }
    }
}
