import java.util.ArrayList;

/**
 * this is the driver program for SelfAdjusting
 */
public class SelfAdjustingDriver {
    public static void main(String[] args){
        ArrayList<Integer> List1 = new ArrayList<>();
        List1.add(12);List1.add(14);List1.add(8);List1.add(2);List1.add(0);

        SelfAdjusting output1 = new SelfAdjusting(List1);
        System.out.println("Test 1 Input: " + output1.getList());
        output1.adjustList();
        System.out.println("Test 1 Output: " + output1.getList());
        System.out.println();


        ArrayList<Integer> List2 = new ArrayList<>();
        List2.add(11);List2.add(14);List2.add(11);List2.add(8);List2.add(13);List2.add(0);
        SelfAdjusting output2 = new SelfAdjusting(List2);
        System.out.println("Test 2 Input: " + output2.getList());
        output2.adjustList();
        System.out.println("Test 2 Output: " + output2.getList());
    }
}