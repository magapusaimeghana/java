public class exceptiondemo2 {
    public static void main(String[] args) {
        int A[]={10,20,30,40,50};
        try{
            for(int i=0;i<=A.length;i++){
                System.out.println(A[i]+" ");
            }
        }
        catch(Exception obj){
            System.out.println("i values crosses the array index range");
        }
        System.out.println("Task completed");
    }
}
