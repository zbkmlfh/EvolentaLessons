import java.util.*;

public class Task2x20 {
    private final static int ARRAY_SIZE = 20;

    public static void main(String[] args) {
        Map<Integer, Integer> countMap = new HashMap<>();
        Random random = new Random();
        int[] num = new int[ARRAY_SIZE];
        for (int i = 0; i < num.length - 1; i++) {
            num[i] = random.nextInt(1, 15);
        }

        System.out.println(Arrays.toString(num));

        for (int i = 0; i < num.length - 1; i++) {
            int key = num[i];
            if (countMap.containsKey(key)) {
                Integer value = countMap.get(key);
                value++;
                countMap.put(key, value);
            } else {
                countMap.put(key, 1);
            }
        }
        Set<Integer> keySet = countMap.keySet();
        countMap.keySet().stream().forEach(
                key -> {
                    Integer count = countMap.get(key);
                    if (count > 1) {
                        System.out.println("Число " + key + " встречается " + count + " раза");
                    }
                }
        );
    }
}
