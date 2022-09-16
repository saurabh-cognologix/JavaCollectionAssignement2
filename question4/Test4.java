package JavaCollectionAssignment2.question4;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

 class StudentMarks{
    private int id;
    private int marks;

    public StudentMarks(int id, int marks) {
        this.id = id;
        this.marks = marks;
    }


}

public class Test4 {


   List<Integer> idList= new ArrayList<>();
   // static int minmumId = 0;
    public  void splitStudentMarks(ArrayList<String> arrayList){
        for(String token : arrayList){
            String[] arr = token.split(",");
            idList.add(Integer.parseInt(arr[0].trim()));

        }
        int minimumId = Collections.min(idList);
       // System.out.println("minimum id is " +minimumId);
        int sum = 0,count =0;
        for(String newToken :arrayList){
            String[] newArr = newToken.split(",");
            if(Integer.parseInt(newArr[0].trim()) == minimumId){
                sum += Integer.parseInt(newArr[2].trim());
                count++;
            }
        }
       // System.out.println(sum);
        double avg = sum/count;
        System.out.println(avg);
    }

    public static void main(String[] args) {
        List<String> inputList = new ArrayList<>();
        try{
            File file4 = new File("src/JavaCollectionAssignment2/question4/input4.txt");
            BufferedReader br =new BufferedReader(new FileReader(file4));
            String st;
            while((st = br.readLine()) != null){
                inputList.add(st);
            }
        }catch (IOException e){
            System.out.println("File not Found");
        }
        //System.out.println(inputList);
        Test4 obj = new Test4();
        obj.splitStudentMarks((ArrayList<String>) inputList);
    }
}
