package exercises;

/**
 * Created by henry on 7/22/18.
 */
public class ArrayList {
    public static void main(String[] args) {
        int numbers [] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int total = 0;

        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] % 2 == 0) {
                total += numbers[i];
            }
        }
        System.out.println("Total of even numbers is : " + total);
    }
}
