package PracticeFiles;

public class EmployeeData {
    String department;
    String employeeName;
    int DOB;
    char gender;

    public EmployeeData(String employeeName,String department,char gender,int DOB){
        this.department = department;
        this.employeeName = employeeName;
        this.DOB = DOB;
        this.gender = gender;

    }

    public static void main (String[] args){
        EmployeeData record001 = new EmployeeData("Kelvin","Product",'M',1994);
        System.out.println("First Employee Name: " + record001.employeeName);
    }

}
