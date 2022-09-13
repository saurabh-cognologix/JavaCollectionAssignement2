package JavaCollectionAssignment2.question6;




import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
public class Test6 {
    static class VoterData{
        private int id;
        private int vote;

        public VoterData(int id, int vote) {
            this.id = id;
            this.vote = vote;
        }

        public void getCandidateById(String[] st){
            if(this.vote < Integer.parseInt(st[3].trim())){
                this.vote = Integer.parseInt(st[3].trim());
                this.id = Integer.parseInt(st[0].trim());
            }
        }
    }
    static Map<String, VoterData> tempMap = new HashMap<>();
    public static void splitEmployeeData(ArrayList<String> arrayList){
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
        System.out.println(inputList);
        splitEmployeeData((ArrayList<String>) inputList);
        System.out.println(tempMap.get("Aundh").id);
        System.out.println(tempMap.get("Baner").id);
    }
}
