import java.util.*;
public class SetIntersectionAtleasttwo {
    public static int intersectionSizeTwo(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> {
            if (a[1] != b[1]) return Integer.compare(a[1], b[1]);
            return Integer.compare(b[0], a[0]);
        });

        Set<Integer> set = new HashSet<>();

        for (int[] data : intervals) {

            int start = data[0];
            int end = data[1];

            int count = 0;
            for (int x : set) {
                if (x >= start && x <= end) count++;
            }

            // If already 2 → continue
            if (count >= 2) continue;

            for (int x = end; x >= start && count < 2; x--) {
                if (!set.contains(x)) {
                    set.add(x);
                    count++;
                }
            }
        }

        return set.size();
    }


    public static void main(String[] args) {
        int[][] intervals = {{1, 3}, {1, 4}, {2, 3},{3,5}};
        int result = intersectionSizeTwo(intervals);
        System.out.println(result);
    }
}
