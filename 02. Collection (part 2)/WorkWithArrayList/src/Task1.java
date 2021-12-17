import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many items you want to contribute to Array ");
        int count = scanner.nextInt();
        System.out.println("contribute Array of numbers");
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            list.add(scanner.nextInt());
        }
        Set<Integer> set = new HashSet<Integer>(list);
        for (Integer r : set) {
            System.out.println(r + " - " + Collections.frequency(list, r));
        }

    }
}
