public class NestedLoops {
    public static void main(String arg[]) {
        NestedLoops nestedLoops = new NestedLoops();
        nestedLoops.basicNestedLoops();
        nestedLoops.printMatrix();
        nestedLoops.printMatrixCount();
        nestedLoops.printMatrixTriangle();
        nestedLoops.printMatrixTriangleCount();

    }

    public void basicNestedLoops() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("(" + i + "," + j + ") ");
            }
            System.out.println("");
        }
    }

    public void printMatrix() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(i + j + "\t");
            }
            System.out.println("");
        }
    }


    public void printMatrixCount() {
        int count = 0;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.format("%02d ", count++);
            }
            System.out.println("");
        }
    }

    public void printMatrixTriangle() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.format("%02d ", j);
            }
            System.out.println("");
        }
    }
    public void printMatrixTriangleCount() {
        int count=0;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                count++;
                System.out.format("%02d ", count);
            }
            System.out.println("");
        }
    }
}
