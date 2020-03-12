import java.util.ArrayList;

/**
 * @author Charly Xin
 * @since 3/11/20
 * The method should be able to search number in the list and move the number to the front.
 * If the number is not found, then it will be added in the front.
 */

public class SelfAdjusting {
    private ArrayList<Integer> List;

    /**
     * Constructor
     * @param List Integer ArrayList input
     */
    public SelfAdjusting(ArrayList<Integer> List){
        this.List = List;
    }

    /**
     * Accessor method for List
     * @return List, the Integer ArrayList input
     */
    public ArrayList<Integer> getList(){
        return List;
    }

    /**
     *      Search for a list of even numbers from two to twenty
     *      When it finds the numbers in the list, it moves that number to the front of the list
     *      If it does not find the number in the list, it adds it in the front
     */
    public void adjustList(){
        List.remove(List.size() - 1); // delete the 0, which is at the end of the list.

        ArrayList<Integer> result = new ArrayList<>();
        for(int i = 2; i <= 20; i += 2)
            result.add(i);
        // adds all evens numbers from 2 to 20 to the list.

        boolean findValueInList = false;
        for(int i = 0; i < List.size(); i++){
            int num = List.get(i);
            for(int a = 0; a < result.size(); a++){
                if(num == result.get(a)){
                    // finds if the value you want is in the list, then move it to the front.
                    result.remove(a);
                    result.add(0, num);
                    findValueInList = true;
                }
            }
            if(!findValueInList)
                // if the value is not found,  adds it to the front.
                result.add(0, num);
            findValueInList = false;
        }
        List = result;
    }
}