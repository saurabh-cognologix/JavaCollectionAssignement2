package JavaCollectionAssignment2.question7;
import java.util.*;
public class Test7 {
    public String comparingList(List<Integer> l1, List<Integer> l2){
        int sizeOfList1 = l1.size();
        int sizeOfList2 = l2.size();
        String s = null;
        if(l1.containsAll(l2) && sizeOfList1 == sizeOfList2){
           // System.out.println("list are equal");
            s= "list are equal";
        }else if(l1.containsAll(l2)){
           // System.out.println("list 2 is subset of list 1");
            s="list 2 is subset of list 1";
        }else if(l2.containsAll(l1)){
            //System.out.println("list 1 is subset of list 2");
            s="list 1 is subset of list 2";
        }else{
           // System.out.println("Not subset");
            s="Not subset";
        }
        return s;
    }
    public static void main(String[] args) {
        List<Integer> list1 = List.of(4,5,10,25,35,15);
        List<Integer> list2 = List.of(4,5,10,25,35,15);
        Test7 obj = new Test7();
        String result = obj.comparingList(list1,list2);
        System.out.println(result);


    }
}
