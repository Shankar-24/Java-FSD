package Methods;

public class Student {
	
	int s1,s2,s3;
    String name;
    int age;
    char section;
    char gender;
    int total;
    double percent;
    public Student()
    { 
   	 s1=0;
    }
    public Student(String name,int age,char section,char gender,int s1,int s2,int s3)
    {
    	this.age=age;
	    this.name=name;
     	this.section=section;
	    this.gender=gender;
    	this.s1=s1;
   	    this.s2=s2;
	    this.s3=s3;
    }
    public Student(String name,int age,char section,char gender,int s2,int s3)
    {
	    this.age=age;
	    this.name=name;
	    this.section=section;
    	this.gender=gender;
    	this.s2=s2;
   	    this.s3=s3;
    }
    public int total()
    {
    	total=this.s1+this.s2+this.s3;
	    return total;
    }
    public double percent()
    {
     	percent=(total/3);
    	return percent;
    }
    public void display()
    {
	    System.out.println("Student details:"+this. name+" "+this.age+" "+this.section+" "+this.gender);
	    System.out.println("Total marks:"+total());
	    System.out.println("Percent:"+percent());
    }

	 public static void main(String[] args) {
		 
        Student s1=new Student("Shankar",21,'A','M',85,80,90);
        Student s2=new Student("Kiruba",22,'B','M',89,80);
        Student s3=new Student("Aakash",22,'C','M',70,78,90);
        Student s4=new Student("Logesh",20,'D','M',65,60);
        s1.display();
        s2.display();
        s3.display();
        s4.display();
	}


}
