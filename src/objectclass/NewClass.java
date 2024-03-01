package objectclass;

//import java.util.Arrays;
//
//public class NewClass {
//    static boolean isAnagram(String string1, String string2) {
// 
//        string1 = string1.replaceAll("\\s", "").toLowerCase();
//        string2 = string2.replaceAll("\\s", "").toLowerCase();     
//        char[] strArr1 = string1.toCharArray();
//        char[] strArr2 = string2.toCharArray();
// 
//        Arrays.sort(strArr1);
//        Arrays.sort(strArr2);
// 
//        return (Arrays.equals(strArr1, strArr2));
// 
//    }
//
// 
//    static int[] mostCommonAnagram(String[] strArray) {
//        int[] result = new int[3];
//        String mostCommon = "";
//        int numOfUniCol = 0, numOfMostFr = 0, score = 0, totalmatchings = 0;
// 
//        for (int i = 0; i < strArray.length; i++) {
//            for (int j = i + 1; j < strArray.length; j++) {
//                if (isAnagram(strArray[i], strArray[j])) {
//                    System.out.println(strArray[i] + " is anagram of " + strArray[j]);
//                    totalmatchings++;                   
//                    score++;
//                    if (numOfMostFr < score) {
//                        numOfMostFr = score;                       
//                        mostCommon = strArray[i];;                      
//                        score = 0;
//                    }
//                }
//            }
//        }
// 
//        numOfUniCol = strArray.length - (totalmatchings+1);
//        result[0] = totalmatchings+1;
//        result[1] = numOfUniCol;
//        result[2] = numOfMostFr+1; 
//        char[] sorted = mostCommon.toCharArray();
//        Arrays.sort(sorted);
//        mostCommon = Arrays.toString(sorted);
//        System.out.println("The most frequent string contains: " + mostCommon);
//        return result;
//    }
// 
//   
//    public static void main(String args[]) {
//        String[] test = {"good","dogo","oogd","morning","gnniorm","test"};
//        int[] res = mostCommonAnagram(test);
// 
//        System.out.println("Total anagrams:        " + res[0]);
//        System.out.println("Unique strings:        " + res[1]);
//        System.out.println("Most frequent anagram: " + res[2]);
// 
//        
// 
//    }
//}
// 

