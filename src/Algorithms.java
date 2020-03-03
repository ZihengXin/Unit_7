import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Algorithms {
    public static ArrayList<Integer> fileDuplicates() throws FileNotFoundException {
        ArrayList<Integer> ListOne = new ArrayList<>();
        ArrayList<Integer> ListTwo = new ArrayList<>();
        ArrayList<Integer> ListThree = new ArrayList<>();
        Scanner inputOne = new Scanner(new File("src/file1.txt"));
        Scanner inputTwo = new Scanner(new File("src/file2.txt"));
        while (inputOne.hasNext())
            ListOne.add(inputOne.nextInt());
        while (inputTwo.hasNext())
            ListTwo.add(inputTwo.nextInt());
        for (int i = 0; i < ListOne.size(); i++) {
            for (int a = 0; a < ListTwo.size(); a++) {
                if (ListOne.get(i).equals(ListTwo.get(a))) {
                    ListThree.add(ListOne.get(i));
                }
            }
        }
        return ListThree;
    }

    public static ArrayList<String> fileDuplicatesTwo() throws FileNotFoundException {
        ArrayList<String> ListOne = new ArrayList<>();
        Scanner input = new Scanner(new File("src/names.txt"));
        while (input.hasNext())
            ListOne.add(input.next());
        System.out.println(ListOne);
        for (int i = 0; i < ListOne.size(); i++) {
            String word = ListOne.get(i);
            for (int a = i + 1; a < ListOne.size(); a++) {
                if (word.equals(ListOne.get(a))) {
                    ListOne.remove(a);
                    a--;
                    i--;
                }
            }
        }
        return ListOne;
    }

    public static ArrayList<Integer> orderedList() throws FileNotFoundException {
        ArrayList<Integer> List = new ArrayList<>();
        Scanner input = new Scanner(new File("src/file1.txt"));
        List.add(input.nextInt());
        while (input.hasNext()) {
            int value = input.nextInt();
            for (int i = 0; i < List.size(); i++) {
                if (value < List.get(i)) {
                    List.add(i, value);
                    break;
                }
                if(i == List.size() - 1){
                    List.add(value);
                    break;
                }
            }
        }
        return List;
    }
}
