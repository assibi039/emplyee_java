class Employee
{
    private
     String name,add;
     int year;
     double sal;
    public 
     void setname(String name)
    {
        this.name=name;
    }
     void setyear(int year)
    {
        this.year=year;
    }
     
     void setadd(String add)
    {
        this.add=add;
    }
     String getname()
    {
        return name;
    }
     int getyear()
    {
        return year;
    }
     
     String getadd()
    {
        return add;
    }
    
}
 public class employee
{
     public static void main(String[] args) {
            Employee e1 = new Employee();
            e1.setname("Robert");
            e1.setyear(1994);
            e1.setadd("64C- WallsStreet");
            
            Employee e2 = new Employee();
            e2.setname("Sam");
            e2.setyear(2004);
            e2.setadd("68D- WallsStreet");
            
            Employee e3 = new Employee();                    
            e3.setname("John");
            e3.setyear(1999);
            e3.setadd("26B- WallsStreet");
            
            System.out.println("Name\t\tYear of joining\t\tAddress\t\t");
            
            System.out.print(e1.getname()+"\t\t");
            System.out.print( e1.getyear()+"\t\t");
            System.out.print(e1.getadd()+"\t\t");
            System.out.println();
            
            System.out.print(e2.getname()+"\t\t");
            System.out.print(e2.getyear()+"\t\t");
            System.out.print(e2.getadd()+"\t\t");
            System.out.println();
            
            System.out.print(e3.getname()+"\t\t");
            System.out.print(e3.getyear()+"\t\t");
            System.out.print(e3.getadd()+"\t\t");
            System.out.println();
        
        
    }
}
