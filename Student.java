public class Student 
{
    String rollNum,sname,branch;
    float cgpa;
    boolean isPlaced,isPlaceddream;
    String companyName,dreamcompany;
    float pack,dreampackage;
    
    public Student(String rno,String name,String dept,float cgpa,String Company,float pack)
    {
        rollNum=rno;
        sname=name;
        branch=dept;
        this.cgpa=cgpa;
        isPlaced=true;
        companyName=Company;
        this.pack=pack;
    }
    public Student(String rno,String name,String dept,float cgpa,String Company,float pack,String dreamcom,float dreampack)
    {
        rollNum=rno;
        sname=name;
        branch=dept;
        this.cgpa=cgpa;
        isPlaceddream=true;
        companyName=Company;
        this.pack=pack;
        dreamcompany=dreamcom;
        dreampackage=dreampack;
    }
    public Student(String rollNum,String sname,String branch,float cgpa)
    {
        this.rollNum=rollNum;
        this.sname=sname;
        this.branch=branch;
        this.cgpa=cgpa;
    }
    public void getDetails()
    {
        System.out.println("Roll Num: "+rollNum);
        System.out.println("Name: "+sname);
        System.out.println("Branch: "+branch);
        System.out.println("CGPA: "+cgpa);
    }
    public void getPlacementInfo()
    {
        if(isPlaced)
         {
            System.out.println("Company Name: "+companyName);
            System.out.println("Package: "+pack);
         }
         else if(isPlaceddream){
            System.out.println("Company Name: "+companyName);
            System.out.println("Package: "+pack);
            System.out.println("Dream company: "+dreamcompany);
            System.out.println("Dream package: "+dreampackage);
         }
         else
         System.out.println("Not yet selected. Wish you all the best!");
    }
    public static void main(String[] args) 
	{
        Student s1=new Student("21A91A01234","Rajesh","CSE",9.5f,"Wipro",6);
        Student s2=new Student("22A91A05C5","Bhanu","IT",6.9f);
        Student s3=new Student("23A91A6195","Meghana","AIML",9.8f,"TCS",18,"Google",100);
        s1.getDetails();
        s1.getPlacementInfo();
        System.out.println("----------------------------------");
        s2.getDetails();
        s2.getPlacementInfo();
        System.out.println("----------------------------------");
        s3.getDetails();
        s3.getPlacementInfo();
    }
}
