public class Bank {
    String acno,cusname;
    double balance;
    String branch;
    String mobile;

    public Bank(){
        System.out.println("Properties are initializwd with default values");
    }
    public Bank(String accountno, String customername, double amount,String branchname,String contact){
        acno=accountno;
        cusname=customername;
        balance=amount;
        branch=branchname;
        mobile=contact;
    }
    public void displaycustomerinfo(){
        System.out.println("Customer Account number:"+acno);
        System.out.println("Customer name:"+cusname);
        System.out.println("Balance amount:"+balance);
        System.out.println("Branch name:"+branch);
        System.out.println("Customer mobile number:"+mobile);
    }
    public void deposit(double amt){
        balance = balance+amt;
        System.out.println(amt+" is credited successfully into your account");
    }
    public void withdraw(double amt){
        if(balance-amt<5000){
            System.out.println("There is no sufficient amount to withdraw");
        }
        else{
            balance=balance-amt;
            System.out.println(amt+" is debited successfully from your account");
        }
    }
    public double checkbal(){
        return balance;
    }
    public static void main(String[] args) {
        Bank cust1=new Bank("7451299423367","Meghana magapu",1500000,"SBI","9959177738");
        cust1.displaycustomerinfo();
        cust1.deposit(1550000);
        cust1.displaycustomerinfo();
        cust1.withdraw(50000);
        System.out.println("Current balance:"+cust1.checkbal());  
    }
}
