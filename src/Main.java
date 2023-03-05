import java.util.*;

public class Main {
    public static void line() {
        System.out.println("----------------------------------------------");
    }

    static List<Integer> nums = new ArrayList<>(List.of( 1, 1, 2, 3, 4, 4, 5, 250, 5, 6, 7));

    static List<String> text = new ArrayList<>(List.of(
            "great","word","called","word","called","house","horse", "enemy",
            "called","word","great","word","word","house","horse", "enemy", "base"));

    public static boolean evenCheck(Integer num) {
        boolean check = num % 2 == 0;
        return check;
    }

    public static void task1() {
        for (Integer num : nums) {
            if (!evenCheck(num)) {
                System.out.println(num);
            }
        }
        line();
    }

    public static void task2() {
        Collections.sort(nums);
        Set<Integer> mass = new HashSet<>(nums);
        for (Integer values : mass) {
            if (evenCheck(values)) {
                System.out.println(values);
            }
        }
        line();
    }

    public static void task3() {
        System.out.println(new HashSet<>(text));
        line();
    }

    public static void task4() {
        Map<String, Integer> countReapeats = new HashMap<>();
        for (String s : text) {
            if (countReapeats.get(s) == null) {
                countReapeats.put(s, 1);
            } else {
                countReapeats.put(s, countReapeats.get(s) + 1);
            }
        }
         for (Map.Entry<String, Integer> entry : countReapeats.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry);
            }
        }
    }

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }
}