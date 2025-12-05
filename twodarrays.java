import java.util.Scanner;
public class twodarrays
{
    public static void add(int arr1[][],int arr2[][],int r,int c)
    {
        int i,j;
        int arr3[][]=new int[r][c];
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                arr3[i][j]=arr1[i][j]+arr2[i][j];
            }
        }
         for(i=0;i<r;i++){
                for(j=0;j<c;j++){
                    System.out.println(arr3[i][j]+" ");
                }
                System.out.println();
            }
    }
    public static void main(String args[])
    {
        int r,c;
        Scanner sc=new Scanner(System.in);
        r=sc.nextInt();
        c=sc.nextInt();
        int arr1[][]=new int[r][c];
        int arr2[][]=new int[r][c];
        int i,j;
        for(i=0;i<r;i++){
        for(j=0;j<c;j++){
            arr1[i][j]=sc.nextInt();
        }
        }
        for(i=0;i<r;i++){
            for(j=0;j<c;j++){
                arr2[i][j]=sc.nextInt();
            }
            }
            twodarrays.add(arr1,arr2,r,c);
    }
}