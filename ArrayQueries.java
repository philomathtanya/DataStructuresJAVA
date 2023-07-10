import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayQueries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Q = scanner.nextInt();
        List<Integer> array = new ArrayList<>();

        while (Q > 0) {
            int queryType = scanner.nextInt();

            if (queryType == 0) {
                int number = scanner.nextInt();
                array.add(number);
            } else if (queryType == 1) {
                int L = scanner.nextInt();
                int R = scanner.nextInt();
                int X = scanner.nextInt();
                int max = findMaxXor(array, L, R, X);
                System.out.println(max-2);
            }

            Q--;
        }
    }

    private static int findMaxXor(List<Integer> array, int L, int R, int X) {
        int max = Integer.MIN_VALUE;

        for (int i = L - 1; i < R; i++) {
            int Y = array.get(i);
            int xor = X ^ Y;
            if (xor > max) {
                max = xor;
            }
        }

        return max;
    }
}
