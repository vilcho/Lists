    import java.util.ArrayList;
    import java.util.Comparator;
    import java.util.List;
    import java.util.Scanner;
    import java.util.stream.Collectors;
    import java.util.stream.Stream;

    /**
     * Created by Vilcho on 6/20/2017.
     */
    public class Lab_p06_SquareNumbers {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            List<Integer> list = Stream.of(scanner.nextLine().trim().split(" ")).map(Integer::valueOf).collect(Collectors.toList());

            List<Integer> squaresList = new ArrayList<Integer>();

            for (int i = list.size()-1; i>=0; i--) {
                if (Math.sqrt(list.get(i)) == (int)Math.sqrt(list.get(i))){
                    squaresList.add(list.get(i));
                }
            }
            squaresList.sort(Comparator.reverseOrder());

            for (Integer sqareNum:squaresList) {
                System.out.print(sqareNum + " ");
            }
        }
    }
