import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        OneDArray oneDArray = new OneDArray();
        oneDArray.initOneDArray(scanner);

        RotateInsertOneDArray rotateInsertOneDArray =
                new RotateInsertOneDArray();
        rotateInsertOneDArray.playWithArray(scanner);

        CopyArrayReverseCopyAndIncreaseSize copyArrayReverseCopyAndIncreaseSize =
                new CopyArrayReverseCopyAndIncreaseSize();
        copyArrayReverseCopyAndIncreaseSize.playWithArray(scanner);

        TwoDMatrices matrices = new TwoDMatrices();
        matrices.matrices(scanner);
        scanner.close();
    }
}