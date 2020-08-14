public class SeniorDeveloper extends Developer
{
        //declare instance variables
    private float salary;
    private String joiningDate;
    private String staffRoomNumber;
    private int contractPeriod;
    private float advanceSalary;
    private boolean appointed;
    private boolean terminated;
   
    public SeniorDeveloper(String platform,String interviewer_name,int working_hours,int salary,int contactPeriod)
    {
        //initialize instance variables
        super(platform,interviewer_name,working_hours);  // calling from parent class which is Developer class
        this.salary=salary;
        this.contractPeriod=contractPeriod;
        joiningDate="";
        staffRoomNumber="";
        advanceSalary=0.0f;
        appointed=false;
        terminated=false;
    }
    public String getJoiningDate()
    {
        return joiningDate;
    }
    public String getStaffRoomNumber()
    {
        return staffRoomNumber;
    }
    public float getAdvanceSalary()
    {
        return advanceSalary;
    }
    public boolean getAppointed()
    {
        return appointed;
    }
    public boolean getTerminated()
    {
        return terminated;
    }
    public void setSalary(float salary)
    {
        //change the salary of current developer
        this.salary=salary;
    }
    public void setContractPeriod(int contractPeriod)
    {
        this.contractPeriod=contractPeriod;
    }
    public void hire_developer(String developer_name,String joiningDate,float advanceSalary,String staffRoomNumber)
    {
        if (appointed==true){
            System.out.println("The developer have already been appointed");
            System.out.println("The name of current developer is :"+developer_name);
            System.out.println("The Staff room number of current developer is :"+getStaffRoomNumber());
        }else{
            // it is used for hiring new developer.
            super.setDeveloper_name(developer_name);
            this.joiningDate=joiningDate;
            this.staffRoomNumber=staffRoomNumber;
            this.advanceSalary=advanceSalary;
            appointed=true;
            terminated=false;
        }
    }
    public void contract_termination()
    {
        // it is used to terminate the current developer.
        if (terminated==true){
            System.out.println("The contact is terminated.");
        }else{
            // new values are formed after the termination
            super.setDeveloper_name("");
            this.joiningDate="";
            this.advanceSalary=0.0f;
            appointed=false;
            terminated=true;
        }
    }
    public void print()
    {
        System.out.println("The name of platform is :"+super.getPlatform());
        System.out.println("The name of the intervieweris :"+super.getInterviewer_name());
        System.out.println("The salary of the developer is :"+salary);
        // super is used to call from the parent class which is Developer class.
    }
    public void display_the_detail_of_developer()
    {
        System.out.println("The name of the platform is :"+ super.getPlatform());
        System.out.println("The total working hours is :"+ super.getWorking_hours());
        System.out.println("The name of the interviewer is :"+ super.getInterviewer_name());
        if (appointed==true){
            System.out.println("The terminated status is :"+getTerminated());
            System.out.println("The joining date is:"+getJoiningDate());
            System.out.println("The advance salary is :"+getAdvanceSalary());
            System.out.println("The name of the developer is :"+super.developer_name);
        }
    }
}
