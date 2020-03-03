import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Traversing {
    private static Scanner input = new Scanner(System.in);

    public static ArrayList<String> getStates() {
        System.out.print("Enter the name of a state or \"Stop\" to quit: ");
        ArrayList<String> List = new ArrayList<>();
        String name = input.next();
        List.add(name);
        while (!name.equals("Stop")) {
            System.out.print("Next state or \"Stop\": ");
            name = input.next();
            if (name.equals("Stop"))
                break;
            List.add(name);
        }
        return List;
    }

    public static String createList(ArrayList<String> states) {
        String output = "";
        int listLength = states.size();
        for (int i = 0; i < listLength - 1; i++) {
            output += states.get(i) + " -> ";
        }
        output += states.get(listLength - 1);
        return output;
    }

    public static ArrayList<Integer> largestAndSmallest() throws IOException {
        Scanner input = new Scanner(new File("src/numbers.txt"));
        ArrayList<Integer> List = new ArrayList<>();
        while (input.hasNext()) {
            List.add(input.nextInt());
        }
        int min = List.get(0);
        int max = List.get(0);
        for(int i = 0; i < List.size(); i++){
            if(List.get(i) < min)
                min = List.get(i);
            else if(List.get(i) > max)
                max = List.get(i);
        }
        List.remove(List.indexOf(max));
        List.add(max);
        List.remove(List.indexOf(min));
        List.add(0, min);
        return List;
    }
}