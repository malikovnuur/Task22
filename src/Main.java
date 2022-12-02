import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list= new ArrayList<>();
        ArrayList<Integer>oddNumber=new ArrayList<>();
        ArrayList<Integer>evenNumber=new ArrayList<>();
        Random random=new Random();

        for (int i = 0; i < 50; i++) {
            int number = random.nextInt(1,100);
            if(number%2==1)oddNumber.add(number);
            else {
                evenNumber.add(number);
            }

        }
        list.add(oddNumber);
        list.add(evenNumber);
        System.out.println("odd number: "+oddNumber);
        System.out.println("even number: "+evenNumber);
        System.out.println("In one array: "+ list);
    }
}