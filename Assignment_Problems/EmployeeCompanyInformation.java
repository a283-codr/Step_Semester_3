class EmployeeCompanyInformation {

    String empName;
    double salary;

    static String companyName =
    "Bright Horizon Technologies";

    static int employeeCount=0;


    EmployeeCompanyInformation(String empName,double salary){

        this.empName=empName;
        this.salary=salary;
        employeeCount++;
    }


    static void printCompanyInfo(){

        System.out.println(companyName);
        System.out.println("Employees on record: "+employeeCount);
    }


    public static void main(String[] args){

        EmployeeCompanyInformation e1=
        new EmployeeCompanyInformation("A",50000);

        EmployeeCompanyInformation e2=
        new EmployeeCompanyInformation("B",60000);

        EmployeeCompanyInformation e3=
        new EmployeeCompanyInformation("C",70000);


        EmployeeCompanyInformation.printCompanyInfo();
    }
}
