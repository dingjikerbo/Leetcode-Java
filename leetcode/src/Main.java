import java.util.*;

public class Main {

    public static int totalFruit(int[] tree) {
        int max = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0, j = 0; j < tree.length; j++) {
            int value = tree[j];

            map.put(value, map.getOrDefault(value, 0) + 1);

            for ( ; map.size() > 2; i++) {
                int val = tree[i], cnt = map.get(val);
                if (cnt == 1) {
                    map.remove(val);
                } else {
                    map.put(val, cnt - 1);
                }
            }
            max = Math.max(max, j - i + 1);
        }

        return max;
    }

    public static void main(String[] args) {
        int n = totalFruit(new int[]{
                1, 2, 1
        });
        System.out.println(n);
    }
}
