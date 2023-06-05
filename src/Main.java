import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {2,34,56,23,0,-4546,56,98};
        array = mergeSort(array);
        System.out.println(Arrays.toString(array));
    }
    public static boolean isSorted(int[] array){
        for (int i = 0; i < array.length - 1; i++){
            if(array[i] > array[i + 1]){
                return false;
            }
        }
        return true;
    }
    public static int[] merge(int[] left, int[] right){
        int[] array = new int[left.length + right.length];
        int arrayIndex = 0;
        int leftIndex = 0;
        int rightIndex = 0;
        while (int i = 0; i < array.length && rigthIndex < rigth.length && leftIndex < left.length){
            if(left[leftIndex] < rigth[rightIndex]){
                array[arrayIndex] = left[leftIndex];
                leftIndex++;
            }else{
                array[arrayIndex] = right[rightIndex];
                rightIndex++;
            }
            arrayIndex++;
        }
        while (rightIndex < rigth.length){
            array[arrayIndex] = rigth[rightIndex];
            leftIndex++;
            arrayIndex++;
        }
        return null;
    }

    public static int[] merge(int[] array){
        if(isSorted(array)){
            return array;
        }
        int[] left = Arrays.copyOfRange(array,0,array.length / 2);
        int[] right = Arrays.copyOfRange(array,array.length / 2, array.length);
        left = mergeSort(left);
        right = mergeSort(rigth);
        int[] merged = merge(left,rigth);
        return null;
    }
}