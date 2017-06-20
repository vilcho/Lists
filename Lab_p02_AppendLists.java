

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Vilcho on 6/19/2017.
 */
public class Lab_p02_AppendLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> stringsBySplit = Stream.of((scanner.nextLine().split("\\|"))).collect(Collectors.toList());

        List<String> stringsListLastToFirst = new ArrayList<String>();

        for (int i = stringsBySplit.size() - 1; i >= 0; i--) {
            List<String> elementsFromStringsBySplit = Stream.of(stringsBySplit.get(i).trim().split("\\s+")).collect(Collectors.toList());
            for (int j = 0; j < elementsFromStringsBySplit.size(); j++) {
                stringsListLastToFirst.add(elementsFromStringsBySplit.get(j));
            }

        }
        System.out.println(stringsListLastToFirst);
    }

}

