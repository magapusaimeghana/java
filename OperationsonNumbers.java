//Complete this Code
import java.util.Scanner;
class OperationsonNumbers
{
		public static int findDigits(int n)
		{
	       int digits_count=(int)Math.log10(n)+1;
		   return digits_count;
		}
	
		// Sum of Digits:  input= 123 => Output: 1+2+3 => 6
		public static int sumOfDigits(int n)
		{
	     
		  int sum=0;
		  while(n>0)
		  {
		      int r=n%10;
			  sum=sum+r;
			  n=n/10;
		  }
		 return sum;
		}

         // Product of Digits: input: 123 =>  Output: 1*2*3 => 6
         public static int productOfDigits(int n)
         {
           
           // Write your code here
		   int pro=1;
		   while(n>1){
			int r=n%10;
			pro=pro*r;
			n=n/10;
		   }
          return pro;
         }

         // Find the  difference between Product of Digits and Sum of Digits
         public static int difference(int n)
         {
            //Write your code here.
            return productOfDigits(n)-sumOfDigits(n);
         }

		// Find the count of even digits: input: 12345  => Output: 2 [2 and 4 are  only even digits]
        public static int findEvenDigits(int n){
            // Write your code here.
            int e=0;
            while(n>0){
                int r=n%10;
                if(r%2==0)
                e++;
                n=n/10;
            }
            return e;
        }

        // Find the count of odd digits: input=12345  =>  Output: 3  [1,3,5 are only odd digits]
        public static int findOddDigits(int n){
           // Write your Code here.
           int o=0;
            while(n>0){
                int r=n%10;
                if(r%2!=0){
                    o++;
                }
                n=n/10;
            }
            return o;
        }

		// Find the number  contains any digit zero or not: input=1203 =>Output: true [because 0 contains as a digits]
		public static boolean findZeroAvailability(int n)
		{
			// Write your Code here.
            int r;
            if(n%10==0)
            return true;
            else
            return false;
		}

        public static void main(String args[])
	 {
	    Scanner sc=new Scanner(System.in);
		int n;
		n=sc.nextInt();
		
		System.out.println("Digits Count = "+OperationsonNumbers.findDigits(n));
	 
	    System.out.println("Sum of Digits = "+OperationsonNumbers.sumOfDigits(n));
        System.out.println("Product of Digits = "+OperationsonNumbers.productOfDigits(n));
        System.out.println("Difference of Digits = "+OperationsonNumbers.difference(n));
        System.out.println("Even digits = "+OperationsonNumbers.findEvenDigits(n));
        System.out.println("Odd digits = "+OperationsonNumbers.findOddDigits(n));
        System.out.println("the avaliability of zero is "+OperationsonNumbers.findZeroAvailability(n));
	    //Call the methods here.
	 
	 } 
}