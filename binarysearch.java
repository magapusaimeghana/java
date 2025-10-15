 
import java.util.Scanner;
public class binarysearch {
    public static int bin(int arr[], int key) {
        int low = 0, high = arr.length - 1, mid;
        while (low <= high) {
            mid = (low + high) / 2;
            if (arr[mid] == key)
                return mid;
            else if (arr[mid] > key)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, k, arr[];
        n = sc.nextInt();
        k = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int res = bin(arr, k);

        if (res != -1)
            System.out.println("Key is found at index " + res);
        else
            System.out.println("Key not found");
    }
}  
/* 
import java.util.Scanner;
public class binarysearch{
    public static int Peak(int arr[])
    {
        int n=arr.length;
        if (arr[0]>arr[1])
        return 0;

        for (int i=1; i<n-1; i++)
        {
            if (arr[i]>arr[i-1] && arr[i]>arr[i+1])
            return i;
        }
        if (arr[n-1]>arr[n-2])
           return n-1;
        return -1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int n,arr[];
        n = sc.nextInt();
        arr= new int[n];
        for (int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int res=Peak(arr);
        System.out.println("Peak value is at "+res);
    }
}*/