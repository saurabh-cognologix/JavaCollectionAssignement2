package JavaCollectionAssignment2.question2;



import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Employee2{
    Integer price;
    String customerName;

    public Employee2(Integer price, String customerName) {
        this.price = price;
        this.customerName = customerName;
    }

    //price  --> 4
    //customer name : ---> 0
    public void setEmployeeByName(String str[]){
        if(this.price > Integer.parseInt(str[4].trim())){
            this.price = Integer.parseInt(str[4].trim());
            this.customerName = str[0].trim();
        }
    }
}
public class Test2 {



     Map<String,Employee2> tempMap = new HashMap<>();
     Map<String,Employee2> mainMap = new HashMap<>();
    public  void splitEmployeeData(ArrayList<String> arrayList){
        for(String token : arrayList){
           // System.out.println(token);
            String[] str = token.split(",");
            // index position :  3 ---> product Name
            if (tempMap.containsKey(str[3].trim())){
                tempMap.get(str[3].trim()).setEmployeeByName(str);
                mainMap.put(str[3].trim(),new Employee2(Integer.parseInt(str[4].trim()),str[0].trim()));
            }else{
                // 4 ---> price
                // 0 ----> customerName
                tempMap.put(str[3].trim(),new Employee2(Integer.parseInt(str[4].trim()),str[0].trim()));
            }
        }
    }

    public static void main(String[] args) {
        List<String> inputData = new ArrayList<>();
        Test2 obj = new Test2();
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
       obj.splitEmployeeData((ArrayList<String>) inputData);



        System.out.println(obj.tempMap.get("Samsung Battery").customerName);
  //      System.out.println(mainMap.get("Samsung Battery").customerName);
        System.out.println(obj.tempMap.get("Earphones").customerName);
        System.out.println(obj.tempMap.get("USB Cable").customerName);
        System.out.println(obj.tempMap.get("Motorola Battery").customerName);
    }
}
