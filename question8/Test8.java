package JavaCollectionAssignment2.question8;

import java.util.Arrays;

public class Test8 {
    static boolean checkIsogram(String str){
        boolean flag = true;
        str = str.toLowerCase();
        char arr[] = str.toCharArray();
        Arrays.sort(arr);
        for(int i=0;i<str.length()-1;i++){
            if(arr[i+1] == arr[i]){
                flag = false;
            }
        }
        return flag;
    }
    public static void main(String[] args) {
        String str = "saurabh";
        boolean result = checkIsogram(str);
        System.out.println(result);
    }
}