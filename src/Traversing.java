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
    public static String createList(ArrayList<String> states){
        String output = "";
        int listLength = states.size();
        for(int i = 0; i < listLength-1; i++){
            output += states.get(i)+" -> ";
        }
        output += states.get(listLength-1);
        return output;
    }
}