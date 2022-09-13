package JavaCollectionAssignment2.question7;
import java.util.*;
public class Test7 {
    public static void main(String[] args) {
        List<Integer> list1 = List.of(4,5,10,25,35,15);
        List<Integer> list2 = List.of(4,5,10,25,35,15);
        int sizeOfList1 = list1.size();
        int sizeOfList2 = list2.size();
        if(list1.containsAll(list2) && sizeOfList1 == sizeOfList2){
            System.out.println("list are equal");
        }else if(list1.containsAll(list2)){
            System.out.println("list 2 is subset of list 1");
        }else if(list2.containsAll(list1)){
            System.out.println("list 1 is subset of list 2");
        }else{
            System.out.println("Not subset");
        }

    }
}
