package myproject_java_package;
import java.util.Scanner;
public class RemovingDuplicatesInArray {
    public static void removeDuplicates(int[] arr) {
        int n = arr.length;
        boolean[] visited = new boolean[n]; // marks duplicate positions
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < n; i++) {
            if (visited[i]) continue;
            boolean isDuplicate = false;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    isDuplicate = true;}}
            // print only first occurrence
            System.out.print(arr[i] + " ");}}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        removeDuplicates(arr);
        sc.close();
    }
}