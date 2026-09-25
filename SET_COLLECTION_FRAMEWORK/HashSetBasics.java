package SET_COLLECTION_FRAMEWORK;

import java.util.HashSet;
import java.util.Set;

public class HashSetBasics {
    public static void main(String[] args) {

//        custom example of creation own class of student
        HashSet<Student> set = new HashSet<>();
        Student s1 = new Student(1,"Sanu");
        Student s2 = new Student(1,"Sanu");
        Student s3 = new Student(1,"Sonu");
        set.add(s1);
        set.add(s2);
        set.add(s3);

        System.out.println(set);




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
//                            // mean st1 and st2 ke common elements hi st1 me store honge like intersection
//        System.out.println("After retain :" + st1);
//        System.out.println(st2);
//        System.out.println(st1.containsAll(st2));
//        System.out.println(st2.containsAll(st1));

//        TC -> O(1)

//        Set<Integer> st = new HashSet<>();
//        st.add(10);
//        st.add(10);
//        st.add(10);
//        st.add(20);
//        st.add(20);
//        st.add(30);
//        System.out.println(st);


    }
}
