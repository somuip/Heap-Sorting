import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 7, 2, 4 ,6};
        heapSort obj = new heapSort();
        obj.sort(arr);
        for(int x:arr){
            System.out.print(x+" ");
        }
    }
}

//steps: 1.build max heap
//       2.down heapify