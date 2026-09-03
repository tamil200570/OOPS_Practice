class Student
{
    private String name;
    private int rollno;
    private String Department;
    private int mark1;
    private int mark2;
    private int mark3;
    private int mark4;
    private int mark5;
    double percentage=0.0;
    Student(String name,int rollno,String Department)
    {
        this.name=name;
        this.rollno=rollno;
        this.Department=Department;
    }
    public void setMarks(int mark1,int mark2,int mark3,int mark4,int mark5)
    {
        this.mark1=mark1;
        this.mark2=mark2;
        this.mark3=mark3;
        this.mark4=mark4;
        this.mark5=mark5;
    }
    public void Display_Details()
    {
        System.out.println("Name: "+name);
        System.out.println("rollno: "+rollno);
        System.out.println("Department: "+Department);
    }
    public void Calculate_percentage()
    {
        double total=(double) (mark1+mark2+mark3+mark4+mark5);
        percentage=total/5;
        System.out.println("Percentage: "+percentage);
    }

    public void grade()
    {
        if(percentage>=90)
        {
            System.out.println("Grade: "+"A+");
        }
        else if(percentage>=80)
        {
            System.out.println("Grade: "+"A");
        }
        else if(percentage>=70)
        {
            System.out.println("Grade: "+"B+");
        }
        else if(percentage>=60)
        {
            System.out.println("Grade: "+"B");
        }
        else if(percentage>=45)
        {
            System.out.println("Grade: "+"C");
        }
        else
        {
            System.out.println("Grade: "+"Fail");
        }

    }
    public static void main(String[]args)
    {
        Student s1=new Student("Tamilselvan",112,"AI&DS");
        s1.setMarks(89,67,89,87,49);
        s1.Display_Details();
        System.out.println("------------------------------------------------------------");
        s1.Calculate_percentage();
        System.out.println("------------------------------------------------------------");
        s1.grade();


    }

}