package exercises;

/**
 * Created by henry on 7/22/18.
 */
public class ArrayListAndStrings {
    public static void main(String[] args) {
        String words [] = {"Angel", "Bob", "George", "Daniel", "Henry", "Anna", "Sammy"};

        for(int i = 0; i < words.length; i++) {
            if(words[i].length() == 5) {
                System.out.println(words[i]);
            }
        }
    }
}
