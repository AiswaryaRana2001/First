package objectclass;
//
////Collection 
////
////1.(TV show)
//
//import java.util.ArrayList;
//
//public class Source {
//
//    public String printIndex(ArrayList<String> list, int ind) {
//        if (ind >= 0 && ind < list.size()) {
//            return list.get(ind);
//        } else {
//            return "Index out of bounds";
//        }
//    }
//
//    public ArrayList<String> addAfter(ArrayList<String> a, String m, String n) {
//        int index = a.indexOf(m);
//
//        if (index != -1) {
//            a.add(index + 1, n);
//        }
//
//        return a;
//    }
//
//    public ArrayList<String> pickIndexAndAppend(ArrayList<String> p, int ind) {
//        if (ind >= 0 && ind < p.size()) {
//            String pickedElement = p.get(ind);
//            p.add(pickedElement);
//        }
//
//        return p;
//    }
//
//    public static void main(String[] args) {
//        Source3 source = new Source3();
//
//        ArrayList<String> myList = new ArrayList<>();
//        myList.add("Breaking Bad");
//        myList.add("Young Sheldon");
////        myList.add("Friends");
//        myList.add("Sherlock");
//        myList.add("Stranger Things");
//
//        // Print element at index 2
//        System.out.println(source.printIndex(myList, 2));
//
//        // Add "Friends" after "Young Sheldon"
//        ArrayList<String> afterAddList = source.addAfter(myList, "Young Sheldon", "Friends");
//        System.out.println(afterAddList);
//
//        // Pick element at index 4 and append it to the end
//        ArrayList<String> afterPickAndAppendList = source.pickIndexAndAppend(myList, 4);
//        System.out.println(afterPickAndAppendList);
//    }
//}
//
//5-Student Information

import java.util.ArrayList;

class S {
    public ArrayList<String> changeOccurrence(ArrayList<String> a, String m, String n) {
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).equals(m)) {
                a.set(i, n);
            }
        }
        return a;
    }
    public String listIndex(ArrayList<String> list) {
        return list.get(0);
    }
    public ArrayList<String> listAfter(ArrayList<String> a, String m, String n) {
        ArrayList<String> result = new ArrayList<>();
        for (String s : a) {
            result.add(s);
            if (s.equals(m)) {
                result.add(n);
            }
        }
        return result;
    }
}
public class Test {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        S source = new S();
        // Change all occurrences of "C" to "S"
        System.out.println(source.changeOccurrence(list, "C", "S"));
        source.changeOccurrence(list,"S","C");
        // Get the element present in the list at index 0
        System.out.println(source.listIndex(list));
        // Add string "E" after the string "D"
        System.out.println(source.listAfter(list, "D", "E"));
    }
}	