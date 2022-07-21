import java.lang.annotation.Target;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int [] firstArray = new int[3];
        firstArray[0] = 1;
        firstArray[1] = 2;
        firstArray[2] = 3;
        System.out.println(Arrays.toString(firstArray));
        for (int i = firstArray.length - 1; i >= 0; i --){
            if (i == 0){
                System.out.print(firstArray[i]);
            }
            else {
                System.out.print(firstArray[i] + ",");
            }
        }
        System.out.println(" ");
        int p;
        for ( int j = 0; j<= firstArray.length-1; j ++) {
            if ((firstArray[j] % 2) != 1) {
                continue;
            }
            p = firstArray[j];
            System.out.print(p + 1 + " ");
        }


        System.out.println(" ");





     double [] secondArray = {1.57, 7.654, 9.986};
        System.out.println(Arrays.toString(secondArray));
     for (int i = secondArray.length - 1; i >= 0; i --){
         if (i == 0){
             System.out.print(secondArray[i]);
         }
         else {
             System.out.print(secondArray[i] + ",");
         }
     }



        System.out.println(" ");






     long [] myArray = new long[4];
        myArray[0] = 3;
        myArray[1] = 6;
        myArray[2] = 9;
        myArray[3] = 0;
        System.out.println(Arrays.toString(myArray));
     for (int i = myArray.length - 1; i >= 0; i --){
            if (i == 0){
                System.out.print(myArray[i]);
            }
            else {
                System.out.print(myArray[i] + ",");
            }
        }



    }
}