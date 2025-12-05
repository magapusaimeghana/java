import java.util.Scanner;

public class minandmax {
    public static int minimum(int arr[]){
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min)
                min=arr[i];
        }
        return min;
    }
    public static int maximum(int arr[]){
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max)
                max=arr[i];
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,x[];
        n=sc.nextInt();
        x=new int[n];
        for(int i=0;i<n;i++){
            x[i]=sc.nextInt();
        }
        int min=minimum(x);
        int max=maximum(x);
        System.out.println(min);
        System.out.println(max);
    }
}
