import java.util.*;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int arr_size = 0;
        if (sc.hasNextInt()) {
            arr_size = sc.nextInt();
        }
        int[] arr = new int[arr_size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < arr_size; i++) {
            if (sc.hasNextInt()) {
                arr[i] = sc.nextInt();
            }
        }
        System.out.println("The elements of the array are:");
        for (int i = 0; i < arr_size; i++) {
            System.out.println(arr[i] + " ");
        }
        int sum = 0;
        int max = arr[0]; 
        int min = arr[0]; 
        for (int i = 0; i < arr_size; i++) {
            sum += arr[i];
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        double avg = (double) sum / arr_size; 
        System.out.println("The maximum element of the array is: " + max); 
        System.out.println("The minimum elements of the array is: " + min); 
        System.out.println("The average of the elements of the array is: " + avg); 
        System.out.println("The sum of the elements of the array is: " + sum); 

        int[] arr2 = {6, 19, 3, 17, 9, 8, 14, 26, 15};
        int n = 9;
        for(int i=0;i<n-1;i++)
             {
           for(int j=i+1;j<n;j++)
               {
             int temp=0;
             if(arr2[i]>arr2[j]){
                temp=arr2[i];
                arr2[i]=arr2[j];
                arr2[j]=temp;
                  }
              }
          }
   System.out.println("Sorted Array: " + Arrays.toString(arr2));
        sc.close();
    }
}
