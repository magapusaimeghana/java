import java.util.Scanner;
	class VoterEligibility
	{
		public static void main(String args[])
	    {
	        Scanner sc=new Scanner(System.in);
		    int age;
		    age=sc.nextInt()
		    String msg=age>=18?"Eligible for Vote":"Not Eligible for Voting";
		    System.out.println(msg);
		    sc.close();
	    }
	}
