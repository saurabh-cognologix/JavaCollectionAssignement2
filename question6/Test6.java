package JavaCollectionAssignment2.question6;




import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
class VoterData{
     Integer id;
     Integer vote;


    public VoterData(Integer id, Integer vote) {
        this.id = id;
        this.vote = vote;
    }

    public void getCandidateById(String[] st){
        if(this.vote < Integer.parseInt(st[3].trim())){
            this.vote = Integer.parseInt(st[3].trim());
            this.id = Integer.parseInt(st[0].trim());
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
public class Test6 {

     Map<String, VoterData> tempMap = new HashMap<>();
    public  void splitEmployeeData(ArrayList<String> arrayList){
        for(String token : arrayList){
            String[] arr = token.split(",");
            if( tempMap.containsKey(arr[2].trim())){
                tempMap.get(arr[2].trim()).getCandidateById(arr);
            }else{
                tempMap.put(arr[2].trim(),new VoterData(Integer.parseInt(arr[0].trim()),Integer.parseInt(arr[3].trim())));
            }

        }
    }
    public static void main(String[] args) {
        List<String> inputList = new ArrayList<>();
        try{
            File file6 = new File("src/JavaCollectionAssignment2/question6/input.txt");
            BufferedReader br = new BufferedReader(new FileReader(file6));
            String st;
            while((st = br.readLine()) != null){
                inputList.add(st);
            }
        }catch (IOException ex){
            System.out.println("File not found");
        }
       // System.out.println(inputList);
        Test6 objTest6 = new Test6();
        objTest6.splitEmployeeData((ArrayList<String>) inputList);
        System.out.println(objTest6.tempMap.get("Aundh").id);
        System.out.println(objTest6.tempMap.get("Baner").id);
    }
}
