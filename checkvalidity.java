import java.util.*;
public class checkvalidity {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] h = new long[n];

        for (int i = 0; i < n; i ++) h[i] = sc.nextLong();

        long r = sc.nextLong();

        long l = 0;
        long ans = 0;
        long m = 0;

        for (long i : h)
            m = Math.max(i, m);
        
        if (r == 0) {
            System.out.println(m);
            System.exit(0);
        }

        while (l <= m) {
            long mid = l + (m - l) / 2;

            if (checkValidity(h, mid, r)) {
                ans = mid;
                l = mid + 1;
            } else {
                m = mid - 1;
            }
        }

        System.out.println(ans);
    }

    public static boolean checkValidity (long[] trees, long cut, long req) {
        long obt = 0;
        
        for (long i : trees)
            obt += i <= cut ? 0 : i - cut;

        return obt >= req;
    }
}

5th
