import java.text.DecimalFormat;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Vilcho on 6/20/2017.
 */
public class Lab_p05_SortNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        DecimalFormat df = new DecimalFormat("############.#######################");

        List<Double> doublesList = Stream.of(scanner.nextLine().trim().split(" ")).map(Double::valueOf).collect(Collectors.toList());


        doublesList.sort(Comparator.naturalOrder());

        for (int i = 0; i < doublesList.size()-1 ; i++) {
            System.out.print(df.format(doublesList.get(i))+ " <= ");
        }
        System.out.println(df.format(doublesList.get(doublesList.size()-1)));

    }
}
