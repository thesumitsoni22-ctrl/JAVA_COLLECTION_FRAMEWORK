import java.util.*;

public class LinkedList_Main {
    public static void main(String[] args){
        //list or Collection -> Interface (so can't create the object )

//        ArrayList -> concrete class
//        Hum arraylist create krke uska obect ka reference kaise v rkh skte hai jaise
//        kii list collection wagera ki class bn nhi skti toh v reference name bna skte hai...

        LinkedList<Integer> list = new LinkedList<>();

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
        List<Integer> list2 = new LinkedList<>();
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

//          get set method of linkedlist
        List<Integer>  list3 = new LinkedList<>();
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

// sort an Linkedlist
        Collections.sort(list);
        System.out.println("Printing Entire sorted list :" + list); // ascending order sort default
        Collections.sort(list,Collections.reverseOrder());
        System.out.println("Printing Entire descending order sorted list :" + list); // descending order sort

//        clone
        LinkedList<Integer> newlist = (LinkedList<Integer>)list.clone(); // mean type cast ho gya ki clone bn ke aa rha wo arraylist of int typ ka aa rha hai
        System.out.println("Newlist of clone : " + newlist);
        newlist.add(50);
         newlist.add(50);
        System.out.println(newlist);


//        Ensurecapacity()
        ArrayList<Integer> marks = new ArrayList<>();
        marks.ensureCapacity(100);  //--------------------------------------------

//        empty
        System.out.println(newlist.isEmpty());
        System.out.println(marks.isEmpty());

// Indexof()
        System.out.println("newlist :" + newlist);
        System.out.println(newlist.indexOf(30));

// lastIndexOf()
        System.out.println(newlist);
        System.out.println(newlist.lastIndexOf(10));

//        addFirst() addLast()
        System.out.println("Printing Original list : " + list);
        list.addFirst(12);
        list.addLast(65);
        System.out.println(list);

//        getfirst() removefirst() , getlast() , removelast()
        list.getFirst();
        list.getLast();
        list.removeFirst();
        list.removeLast();
        System.out.println(list);

// Peek , Poll , Offer

        System.out.println(list.peek());
        System.out.println(list.poll());
        System.out.println(list);
        list.offer(50);
        System.out.println(list);

    }
}

