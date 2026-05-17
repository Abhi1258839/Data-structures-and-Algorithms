import java.util.Scanner;
public class BasicDS {
    // work only on sorted array
    public static int binarySearch(int[] arr, int target) {
        int start =0;
        int end = arr.length-1;
        while(start<= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] < target){
                start = mid +1;
            }
            else{
                end = mid -1;
            }
        }
        return -1;
    }
    
    public static void createArray(Scanner i, int[] ar){
        for(int j =0;j<ar.length;j++){
            System.out.print("Enter the element at index "+j+": ");
            ar[j] = i.nextInt();
        }
    }
    public static void printArray(int[] ar){
        for(int i =0;i<ar.length;i++){
            System.out.print(ar[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int length = input.nextInt();
        int[] arr = new int[length];
        createArray(input, arr);
        //printArray(arr);
        System.out.println(binarySearch(arr, 7));
        input.close();
    }
}