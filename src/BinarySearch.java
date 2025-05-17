import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]= sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Enter the target element: ");
        int target = sc.nextInt();
        int l=0,r=arr.length;
        boolean found = false;
        while (l<=r){
            int mid = (l+r)/2;
            if (arr[mid]==target){
                System.out.println("Element found  at the index of: "+mid);
                found=true;
                break;
            } else if (arr[mid]<target) {
                l=mid+1;
            }else {
                r=mid-1;
            }
        }
        if (!found){
            System.out.println("Element not found");
        }
    }
}
