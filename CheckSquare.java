import java.util.*;

public class CheckSquare {

    public static boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        int[] dist = new int[] {
                distsq(p1, p2),
                distsq(p1, p3),
                distsq(p1, p4),
                distsq(p2, p3),
                distsq(p2, p4),
                distsq(p3, p4),
        };
        Arrays.sort(dist);

        if (dist[0] == 0)
            return false;

        return dist[0] == dist[1] &&
                dist[1] == dist[2] &&
                dist[2] == dist[3] &&
                dist[4] == dist[5] &&
                dist[4] == 2 * dist[0];
    }

    public static int distsq(int[] a, int[] b) {
        int dx = a[0] - b[0];
        int dy = a[1] - b[1];

        return dx * dx + dy * dy;
    }

    public static void main(String[] args) {
        int[] p1 = { 0, 0 };
        int[] p2 = { 1, 1 };
        int[] p3 = { 1, 0 };
        int[] p4 = { 0, 1 };

        System.out.println("Is this valid square? " + validSquare(p1, p2, p3, p4));
    }

}
