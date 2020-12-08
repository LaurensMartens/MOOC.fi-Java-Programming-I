
import java.util.Arrays;


public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};
        MainProgram.sort(array);
    }
    
    public static int smallest(int[] array) {
        if (array.length == 0) {
            return 0;
        }

        int smallest = array[0];
        for (int e : array) {
            if (e < smallest) {
                smallest = e;
            }

        }
        return smallest;

    }

    public static int indexOfSmallest(int[] array) {

        int index = 0;
        int smallest = array[0];
        int smallestIndex = 0;

        for (int e : array) {
            if (e < smallest) {

                smallest = e;
                smallestIndex = index;

            }
            index++;
        }
        return smallestIndex;
    }
    
    public static int indexOfSmallestFrom(int[] array, int startIndex) {
        int min = array[startIndex];
        int index = startIndex;
        
        for (int i = startIndex; i < array.length; i++) {
            
            if (array[i] < min) {
                min = array[i];
                index = i;
            }
 
        }
        return index;
    }
    
    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
    
    public static void sort(int[] array) {

        System.out.println(Arrays.toString(array)); System.out.print("Before sort:");
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            
            swap(array,i , indexOfSmallestFrom(array, i));

            System.out.println(Arrays.toString(array));

        }
    }
}
