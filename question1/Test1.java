package JavaCollectionAssignment2.question1;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test1 {
        static class SoftwareDetails{
        private String version;
        private String server;

            public SoftwareDetails(String version, String server) {
                this.version = version;
                this.server = server;
            }
            public  void getOldVersion(String arr[]){

            }
        }

    static Map<String, SoftwareDetails> tempMap = new HashMap<>();

    // 0 ---> Server
    // 2 ---> Applcation
    // 3 ---> Version

    public static void splitData(ArrayList<String> arrayList){
        for(String token : arrayList){
            String[] values = token.split(",");
            if(tempMap.containsKey(values[2].trim())){
                tempMap.get(values[2].trim()).getOldVersion(values);
            }else{
                tempMap.put(values[2].trim(),new SoftwareDetails(values[3].trim(),values[0]));
            }
        }
    }



    public static void main(String[] args) {
        List<String> inputData = new ArrayList<>();
        try{
            File file1 = new File("src/JavaCollectionAssignment2/question1/input1.txt");
            BufferedReader br = new BufferedReader(new FileReader(file1));
            String st;
            while ((st = br.readLine()) != null){
                // Print the string
                //System.out.println(st);
                inputData.add(st);
            }
            //System.out.println(inputData);
        }catch (IOException exc){
            System.out.println("File not found");
        }
        splitData((ArrayList<String>) inputData);
    }
}
