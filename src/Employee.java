public class Employee
{
    int Employee_id;
    String name;
    double basic_salary;
    double hra;
    double da;
    Employee(int Employee_id,String name,double basic_salary)
    {
        this.Employee_id=Employee_id;
        this.name=name;
        this.basic_salary=basic_salary;
    }
    public void BA()
    {
        System.out.println("Basic Allowance: "+basic_salary);
    }
    public void HRA(double percent)
    {
         hra=(basic_salary*percent)/100;
        System.out.println("House Rent Allowance: "+hra);
    }
    public void GS()
    {
        double gs=basic_salary+hra+da;
        System.out.println("Gross salary: "+gs);
    }
    public void da(double percent)
    {
        da=(basic_salary*percent)/100;
        System.out.println("Dearness Allowance: "+da);
    }
    public void ns()
    {
        double pf = (basic_salary * 5) / 100;
        double grossSalary = basic_salary + hra + da;
        double netSalary = grossSalary - pf;

        System.out.println("PF: " + pf);
        System.out.println("Net Salary: " + netSalary);
    }

    public static  void main (String[]args)
    {
        Employee e1=new Employee(101,"Arun",50000);
        e1.BA();
        e1.HRA(15);
        e1.da(30);
        e1.ns();
        e1.GS();
    }

}
