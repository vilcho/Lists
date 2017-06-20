import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Vilcho on 6/19/2017.
 */
public class Lab_p03_SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> intList = Stream.of(scanner.nextLine().trim().split("\\s+")).map(Double::valueOf).collect(Collectors.toList());

       // while (true){
            for (int i = 1; i < intList.size(); i++) {
                if (intList.get(i).equals(intList.get(i - 1))) {
                    double sum = intList.get(i - 1) + intList.get(i);
                    intList.remove(i);
                    intList.set(i - 1, sum);
                    i = 0;
                }
            }

            System.out.println(intList);

        }
    }
//}
