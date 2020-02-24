import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListMethods {
    public static Scanner input = new Scanner(System.in);

    public static ArrayList<Integer> numberList() {
        ArrayList<Integer> List = new ArrayList<>();
        List.add(0);List.add(-5);List.add(7);List.add(12);List.add(-1);
        List.add(2,10);
        List.set(1,9);
        System.out.println(List);
        List.remove(4);
        System.out.println(List);
        return List;
    }
    public static ArrayList<Double> firstAndLast(){
        System.out.println("Enter the numbers:");
        ArrayList<Double> list = new ArrayList<Double>();
        while (input.nextDouble() != 0);{
            list.add(input.nextDouble());
        }
        System.out.println(list.size()+1);
        System.out.println(list.subList(0,1));
        System.out.println(list.subList(list.size()-1,list.size()));
        return list;
    }
    public static ArrayList<Double> getNumbers(){
        
    }

}
