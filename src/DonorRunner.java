import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class DonorRunner {
    public static ArrayList<Donor> readFile()throws FileNotFoundException {
        Scanner input = new Scanner(new File("src/donors.txt"));
        ArrayList<Donor> List = new ArrayList<>();
        while(input.hasNextLine()){
            String Line = input.nextLine();
            String name = Line.substring(0, Line.indexOf(" "));
            String number = Line.substring(Line.indexOf(" "));
            Donor result = new Donor(name,Double. parseDouble(number) );
            List.add(result);
        }
        return List;
    }
    public static void sortDonors(ArrayList<Donor> List) {
        for (int i = 0; i < List.size(); i++) {
            int max = i;
            for (int a = i+1; a < List.size(); a++) {
                if (List.get(max).getAmount() < List.get(a).getAmount()) {
                    max = a;
                }
            }
            Donor name = List.get(i);
            List.set(i, List.get(max));
            List.set(max, name);
        }
    }
}
