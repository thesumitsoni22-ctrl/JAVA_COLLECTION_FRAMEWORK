package SET_COLLECTION_FRAMEWORK;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetBasics {
    public static void main(String[] args) {

//        Set<Integer> st1 = new HashSet<>();
//        Set<Integer> st2 = new HashSet<>();
//
//        st1.add(1);
//        st1.add(2);
//        st1.add(3);
//        st1.add(4);
//        st2.add(3);
//        st2.add(4);
//        st2.add(5);
//        st2.add(6);
//
//        System.out.println("Before retain :" + st1);
//        st1.retainAll(st2); // here st1 me st2 ke common or., st1 or st2 ke interactions store ho jayenge
//        // mean st1 and st2 ke common elements hi st1 me store honge like intersection
//        System.out.println("After retain :" + st1);
//        System.out.println(st2);
//        System.out.println(st1.containsAll(st2));
//        System.out.println(st2.containsAll(st1));

//         TC -> O(logn) -> BST

        Set<Integer> st = new TreeSet<>();
        st.add(10);
        st.add(10);
        st.add(10);
        st.add(23);
        st.add(20);
        st.add(20);
        st.add(30);
        System.out.println(st);


    }
}
