package objectclass;




//7--Encryption
 
import java.util.HashSet;
import java.util.Set;

public class Source2 {

    public int uniqueMorseRepresentations(String[] words) {

        String[] morseCodes = {

            ".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."

        };

        Set<String> transformations = new HashSet<>();

        for (String word : words) {

            StringBuilder sb = new StringBuilder();

            for (char c : word.toCharArray()) {

                sb.append(morseCodes[c - 'a']);

            }

            transformations.add(sb.toString());

        }

        return transformations.size();

    }

    public static void main(String[] args) {

        Source2 source = new Source2();

        String[] MORSE = new String[]{"gin", "zen", "gig", "msg"};


        System.out.println(source.uniqueMorseRepresentations(MORSE)); // Output: 2

    }

}
 
 