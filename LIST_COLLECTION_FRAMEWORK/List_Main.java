package LIST_COLLECTION_FRAMEWORK;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class List_Main {
    public static void main(String[] args){
        //list or Collection -> Interface (so can't create the object )

        //        ArrayList -> concrete class
        //        Hum arraylist create krke uska obect ka reference kaise v rkh skte hai jaise
        //        kii list collection wagera ki class bn nhi skti toh v reference name bna skte hai...

        ArrayList<Integer> list = new ArrayList<>();

        //        List<Integer> list = new ArrayList<>();
        //        Collection<Integer> collection = new ArrayList<>();

        //add
        list.add(10);
        list.add(30);
        list.add(20);
        System.out.println(list);

        list.add(50);
        System.out.println(list);

        list.remove(2);
        System.out.println(list);

        //        addAll
        List<Integer> list2 = new ArrayList<>();
        list2.add(101);
        list2.add(200);
        list2.add(20);

        list.addAll(list2); // mean list me list2 add krdo sare
        System.out.println(list);
        list.removeAll(list2); //list se list 2 sara remove hoga
        System.out.println(list);

        //        for know size
        System.out.println(list.size());

        System.out.println("Printing list2 : " + list2);
        list2.clear();
        System.out.println(list2.size());

        //        iterator
        //        -> loop ke through hum krte hai but ye standard way diya jise use kr hum travel kr skte hai
        //          arraylist -> iterator
        //          linkedlist -> iterator
        //          stack -> iterator
        //          vector -> iterator
        //        mean sbka ek alag iterator hota and insbhi ke upr travel krna hai so in sbki alag alag iterator ki need hoti hai
        //       so in sbhi ke specific typ of iterator ko create krne ke liye hum iterator() fun use kr skte hai

        //        i want to traverse list using iterator
        Iterator<Integer> iterator = list.iterator();

        while(iterator.hasNext()){
            System.out.println("Element: " + iterator.next());
        }

        //          get set method of list
        List<Integer>  list3 = new ArrayList<>();
        list3.add(11);
        list3.add(12);
        list3.add(13);
        System.out.println(list3.get(0));
        System.out.println("Before set :" + list3);
        list3.set(0,17);
        System.out.println("After set : " + list3);

        //         toArray -> kaisa v collection ya DS ho stack, queue,Linkedlist, Vector iska use se wo Array me convert ho jayenge
        Object[] arr = list3.toArray();
        for(Object obj: arr) {
            System.out.println(obj); // list3 converted into array
        }

        //         contains
        System.out.println( list3.contains(100));
        System.out.println( list3.contains(13));

        list.add(23);
        list.add(21);
        System.out.println("Printing Entire list: " + list);

        // sort an arraylist
        Collections.sort(list);
        System.out.println("Printing Entire sorted list :" + list); // ascending order sort default
        Collections.sort(list,Collections.reverseOrder());
        System.out.println("Printing Entire descending order sorted list :" + list); // descending order sort

        //        clone
        ArrayList<Integer> newlist = (ArrayList<Integer>)list.clone(); // mean type cast ho gya ki clone bn ke aa rha wo arraylist of int typ ka aa rha hai
        System.out.println("Newlist of clone : " + newlist);

        //        Ensurecapacity()
        ArrayList<Integer> marks = new ArrayList<>();
        marks.ensureCapacity(100);

        //        empty
        System.out.println(newlist.isEmpty());
        System.out.println(marks.isEmpty());

        // Indexof()
        System.out.println("newlist :" + newlist);
        System.out.println(newlist.indexOf(30));

    }
}


