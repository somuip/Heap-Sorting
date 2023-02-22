public class heapSort {
    public void sort(int arr[]){
        int n = arr.length;
        buildMaxHeap(arr, n);
        for(int i = n -1;i >= 0; i--){
            swap(arr, 0 ,i);
            downHeapify(arr, 0, i);
        }
    }
    public void buildMaxHeap(int arr[], int n){
        for(int i=n-1;i>=0;i--){
            downHeapify(arr, i, n);
        }
    }

    public void downHeapify(int arr[], int pi, int limit){
        int lci = (2*pi) +1;
        int rci = (2*pi) +2;
        int maxi = pi;
        if(lci < limit && arr[lci] > arr[maxi]){
            maxi = lci;
        }
        if(rci < limit && arr[rci] > arr[maxi]){
            maxi = rci;
        }
        if(pi != maxi){
            swap(arr, pi, maxi);
            downHeapify(arr, maxi, limit);
        }
    }

    public void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
