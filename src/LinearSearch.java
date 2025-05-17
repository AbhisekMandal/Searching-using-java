import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target element: ");
        int target = sc.nextInt();
        boolean found =false;
        for (int i = 0; i < size; i++) {
            if (target == arr[i]) {
                System.out.println("Element Found");
                found =true;
                break;

            }
        }if (!found){
            System.out.println("Element not found.");
        }

    }
}
