/*import java.util.Scanner;
public class bubblesort{
    public static void Bubble(int arr[])
    {

        for(int i=0; i<arr.length-1; i++)
        {
            for (int j=0; j<arr.length-1; j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n,arr[];
        n=sc.nextInt();
        arr=new int[n];
        for (int i=0; i<n; i++)
        {
            arr[i]=sc.nextInt();
        }
        Bubble(arr);
        for(int i=0; i<n; i++){
            System.out.println(arr[i]+" ");
        }
    }
}*/


import java.util.Scanner;
public class bubblesort{
    public static int linearsearch(int arr[],int key){
        for(int i=0;i<arr.length;i++){
            if(key==arr[i])
                return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,k,arr[];
        n=sc.nextInt();
        k=sc.nextInt();
        arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int res=linearsearch(arr,k);
        System.out.println("key is found at "+res);
    }
}
