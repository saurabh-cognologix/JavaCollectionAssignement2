package JavaCollectionAssignment2.question8;

public class Main {
    public static void main(String[] args) {
        String str = "background";
        Isogram isogram = new Isogram();
        boolean result = isogram.checkIsogram(str);
        System.out.println(result);
    }
}
