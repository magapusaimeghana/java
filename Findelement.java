import java.util.Scanner;
public class Findelement {
    public static int count(int arr[],int key){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(key==arr[i]){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,x[],ele;
        n=sc.nextInt();
        x=new int[n];
        for(int i=0;i<n;i++){
            x[i]=sc.nextInt();
        }
        ele=sc.nextInt();
        System.out.println(count(x,ele));
    }
}
