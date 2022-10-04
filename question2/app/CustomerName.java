package JavaCollectionAssignment2.question2.app;


import JavaCollectionAssignment2.question2.model.Model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerName {
    static Map<String,Model> tempMap = new HashMap<>();
    static Map<String,Model> mainMap = new HashMap<>();
    public  static void splitData(ArrayList<String> arrayList){
        for(String token : arrayList){
            String[] str = token.split(",");
        }
    }

    public static void main(String[] args) {
        List<String> inputData = new ArrayList<>();
        try{
            File file2 = new File("src/JavaCollectionAssignment2/question2/input2.txt");
            BufferedReader br = new BufferedReader(new FileReader(file2));
            String str;
            while((str = br.readLine()) != null){
                inputData.add(str);

            }
        }catch (IOException exc){
            System.out.println("File not Found");
        }
        System.out.println(inputData);

        //calling the spilitData function
        splitData((ArrayList<String>) inputData);
    }
}
