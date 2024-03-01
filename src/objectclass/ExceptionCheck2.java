package objectclass;

//2-File check

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
public class ExceptionCheck2 {
    public ArrayList<String> numberCheck(String str) {
        ArrayList<String> result = new ArrayList<>();
        for (char c : str.toCharArray()) {
            try {
                int num = Integer.parseInt(String.valueOf(c));
                result.add(String.valueOf(num));
            } catch (NumberFormatException e) {
                result.add("For input string: \"" + c + "\"");
            }
        }
        return result;
    }
    public String fileCheck(String filename) {
        try {
            File file = new File(filename);
            if (file.exists()) {
                return "File Found";
            } else {
                throw new FileNotFoundException();
            }
        } catch (FileNotFoundException e) {
            return e.toString();
        }
    }
    public static void main(String[] args) {
        ExceptionCheck2 ec = new ExceptionCheck2();
        // Test numberCheck method
        String str = "10ASD";
        System.out.println("numberCheck result: " + ec.numberCheck(str));
        // Test fileCheck method
        String filename = "abc.txt";
        System.out.println("fileCheck result: " + ec.fileCheck(filename));
    }
}
