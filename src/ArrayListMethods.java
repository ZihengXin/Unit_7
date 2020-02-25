import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListMethods {
    public static Scanner input = new Scanner(System.in);

    public static ArrayList<Integer> numberList() {
        ArrayList<Integer> List = new ArrayList<>();
        List.add(0);
        List.add(-5);
        List.add(7);
        List.add(12);
        List.add(-1);
        List.add(2, 10);
        List.set(1, 9);
        System.out.println(List);
        List.remove(4);
        System.out.println(List);
        return List;
    }

    public static ArrayList<Double> firstAndLast() {
        System.out.println("Enter the numbers:");
        ArrayList<Double> list = new ArrayList<Double>();
        while (input.nextDouble() != 0) ;
        {
            list.add(input.nextDouble());
        }
        System.out.println(list.size() + 1);
        System.out.println(list.subList(0, 1));
        System.out.println(list.subList(list.size() - 1, list.size()));
        return list;
    }

    public static ArrayList<Double> getNumbers() {
        double one = input.nextDouble();
        double two = input.nextDouble();
        double three = input.nextDouble();
        ArrayList<Double> List = new ArrayList<Double>(3);
        List.add(one);
        List.add(two);
        List.add(three);
        return List;
    }

    public static ArrayList<Double> arrangeList(ArrayList<Double> numbers) {
        double min = numbers.get(0);
        for (int i = 0; i < 3; i++) {
            if (numbers.get(i) < min) {
                min = numbers.get(i);
            }
        }
        double max = numbers.get(0);
        for (int i = 0; i < 3; i++) {
            if (numbers.get(i) < max) {
                max = numbers.get(i);
            }
        }
        double mid = numbers.get(0);
        for (int i = 0; i < 3; i++) {
            if (min < numbers.get(i) && numbers.get(i) < max) {
                mid = numbers.get(i);
            }
        }
        numbers.set(0, min);
        numbers.set(1, mid);
        numbers.set(2, max);
        return numbers;
    }
}
