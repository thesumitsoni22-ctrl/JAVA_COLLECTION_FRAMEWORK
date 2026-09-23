import java.util.*;

public class Stack_Main {
    public static void main(String[] args){
        //list or Collection -> Interface (so can't create the object )

//        Stack -> concrete class

        Stack<Integer> list = new Stack<>();


//        List<Integer> list = new Stack<>();
//        Collection<Integer> collection = new Stack<>();

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
        List<Integer> list2 = new Stack<>();
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
        List<Integer>  list3 = new Stack<>();
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

// sort a Stack
        Collections.sort(list);
        System.out.println("Printing Entire sorted list :" + list); // ascending order sort default
        Collections.sort(list,Collections.reverseOrder());
        System.out.println("Printing Entire descending order sorted list :" + list); // descending order sort

//        clone
        Stack<Integer> newlist = (Stack<Integer>)list.clone(); // mean type cast ho gya ki clone bn ke aa rha wo arraylist of int typ ka aa rha hai
        System.out.println("Newlist of clone : " + newlist);

//        Ensurecapacity()
        Stack<Integer> marks = new Stack<>();
        marks.ensureCapacity(100);

//        empty
        System.out.println(newlist.isEmpty());
        System.out.println(marks.isEmpty());

// Indexof()
        System.out.println("newlist :" + newlist);
        System.out.println(newlist.indexOf(30));


//        Specific Methods Of Stack

        Stack<Integer> stk = new Stack<>();
        System.out.println("Stack Operations");
        stk.push(10);
        System.out.println(stk);
        stk.push(20);
        stk.push(34);
        System.out.println(stk);
        stk.pop();
        System.out.println(stk);

        System.out.println(stk.peek());

        System.out.println(stk.search(20));
        System.out.println(stk.search(33));

        System.out.println(stk.isEmpty());







    }
}

