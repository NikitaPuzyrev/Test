import java.awt.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        for(int i = 0; i < 100; i++){
          int[] numberArray;
          numberArray = new int [10];
int a = (int) Math.random()*100;
numberArray[i] = a;
System.out.println(numberArray);
        }
    }
}