import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Vilcho on 6/20/2017.
 */
public class Lab_p07_CountNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> list = Stream.of(scanner.nextLine().trim().split("\\s+")).map(Integer::valueOf).collect(Collectors.toList());

        list.sort(Comparator.naturalOrder());

        int counterOfRedundantNum = 1;
        int currentNum = 0;

        if (list.size() > 1) {
            for (int i = 0; i < list.size() - 1; i++) {
                currentNum = list.get(i);
                if (list.get(i).equals(list.get(i + 1))) {
                    counterOfRedundantNum++;
                } else {
                    System.out.println(currentNum + " -> " + counterOfRedundantNum);
                    counterOfRedundantNum = 1;
                }
            }
            if (currentNum == list.get(list.size() - 2) && counterOfRedundantNum > 1) {
                System.out.println(currentNum + " -> " + counterOfRedundantNum);
            } else if (currentNum == list.get(list.size() - 2) && counterOfRedundantNum == 1) {
                System.out.println((list.get(list.size() - 1)) + " -> " + counterOfRedundantNum);
            }
        } else {
            System.out.println(list.get(list.size()-1) + " -> " + 1);
        }
    }
}




