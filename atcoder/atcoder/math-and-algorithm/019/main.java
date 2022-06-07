import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            sc.nextLong();

            Map<Long, Long> countMap = new HashMap<>();
            while (sc.hasNext()) {
                long key = sc.nextLong();
                if (countMap.containsKey(key)) {
                    long currentCount = countMap.get(key);
                    countMap.put(key, ++currentCount);
                } else {
                    countMap.put(key, 1L);
                }
            }
            solve(countMap);
        }
    }

    static void solve(Map<Long, Long> countMap) {
        long result = 0L;
        if (countMap.containsKey(1L)) {
            result += calcItem(countMap.get(1L));
        }
        if (countMap.containsKey(2L)) {
            result += calcItem(countMap.get(2L));
        }
        if (countMap.containsKey(3L)) {
            result += calcItem(countMap.get(3L));
        }
        System.out.println(result);
    }

    static long calcItem(long count) {
        return ((count * count) - count) / 2;
    }
}
