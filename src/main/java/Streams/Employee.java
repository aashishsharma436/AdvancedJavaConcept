package Streams;

public class Employee {
    private int empId;
    private String empName;
    private String designation;
    private String organisation;

    public Employee(int empId, String empName, String designation,String organisation){
        this.empId = empId;
        this.empName = empName;
        this.designation = designation;
        this.organisation = organisation;
    }

    public int getEmpId(){
        return this.empId;
    }

    public String getEmpName(){
        return this.empName;
    }

    public String getDesignation(){
        return this.designation;
    }

    public String getOrganisation(){
        return this.organisation;
    }

    @Override
    public String toString(){
        return "EmpId: "+this.empId+" EmpName: " +this.empName+" Designation: "+this.designation+" Organisation: "+this.organisation;
    }
}
