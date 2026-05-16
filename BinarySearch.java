import java.util.Scanner;
public class BinarySearch {
    public static int binarySearch(int[] arr, int target) {
        int start =0;
        int end = arr.length-1;
        return arr.length;
    }
    public static void createArray(Scanner i, int[] ar){
        for(int j =0;j<ar.length;j++){
            System.out.print("Enter the element at index "+j+": ");
            ar[j] = i.nextInt();
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int length = input.nextInt();
        int[] arr = new int[length];
        createArray(input, arr);
        input.close();
        //System.out.println(binarySearch());
    }
}