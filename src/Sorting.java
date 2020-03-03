import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Sorting {
    public static ArrayList<Integer> getUnsorted() throws IOException {
        Scanner input = new Scanner(new File("src/sortedData.txt"));
        ArrayList<Integer> List = new ArrayList<>();
        for(int i = 0; i <= 8; i++)
            List.add(input.nextInt());

        return List;
    }
    public static boolean isSorted(ArrayList<Integer> List){
        for(int i = 0; i < List.size() - 1; i++){
            if(List.get(i) > List.get(i + 1))
                return false;
        }
        return true;
    }
}