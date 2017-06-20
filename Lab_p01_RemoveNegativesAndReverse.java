import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by Vilcho on 6/19/2017.
 */
public class Lab_p01_RemoveNegativesAndReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> intList = Stream.of((scanner.nextLine().split(" "))).map(Integer::valueOf).collect(Collectors.toList());

        List<Integer> reversedIntList = new ArrayList<Integer>();

        for (int i = intList.size()-1; i >= 0; i--)

        {
            if (intList.get(i) < 0) {
                intList.remove(intList.get(i));
            } else {
                reversedIntList.add(intList.get(i));
            }
        }

        if (intList.size() != 0) {
            System.out.println(reversedIntList);
        } else {
            System.out.println("empty");
        }
    }
}
