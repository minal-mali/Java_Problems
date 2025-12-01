import java.util.Arrays;

public class ArrayAdd {
    public static void main(String[] args) {

        int[] a = {1, 2, 3};
        int[] b = {4, 5, 6};
        int[] c = new int[3];

        for (int i = 0; i < 3; i++) {
            c[i] = a[i] + b[i];
        }

        System.out.println("Resultant Array: " + Arrays.toString(c));
    }
}
