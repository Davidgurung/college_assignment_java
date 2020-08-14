public class JuniorDeveloper extends Developer
{
    //declare instance variables
    private float salary;
    private String appointedDate;
    private String evaluationPeriod;
    private String terminationDate;
    private String specialization;
    private String appointedBy;
    private boolean joined;
    public JuniorDeveloper(String platform,String interviewer_name,int working_hours,float salary,String appointedBy,String terminationDate){
        //initialize instance variables
        super(platform,interviewer_name,working_hours);
        this.salary=salary;
        this.appointedBy=appointedBy;
        this.terminationDate=terminationDate;
        this.appointedDate="";
        this.evaluationPeriod="";
        this.specialization="";
        boolean joined=false;
    }
    public String getAppointedDate()
    {
            return appointedDate;
    }
    public String getEvaluationPeriod()
    {
        return evaluationPeriod;
    }
    public String getTerminationDate()
    {
        return terminationDate;
    }
    public String getSpecialization()
    {
        return specialization;
    }
    public String getAppointedBy()
    {
        return appointedBy;
    }
    public boolean getJoined()
    {
        return joined;
    }
    public void setsalary(float salary)
    {
        if (joined==false){
            this.salary=salary;
        }else{
            System.out.println("The developer is already appointed.");
            System.out.println("It is not possible to change the salary.");
        }
    }
    public void appoint_developer(String developer_name,String appointedDate,String terminationDate,String specialization){
        if (joined==false){
            super.setDeveloper_name(developer_name);
            this.appointedDate=appointedDate;
            this.terminationDate=terminationDate;
            this.specialization=specialization;
            joined=true;
        }else{
            System.out.println("The developer has already been appointed.");
            System.out.println("Appointed on :"+getAppointedDate());
            }
    }
    public void display_details(){
       System.out.println("The name of the palatform is: "+super.getPlatform());
       System.out.println("The interviewer name  is: "+super.getInterviewer_name());
       System.out.println("The total working hours is: "+super.getWorking_hours());
       if(joined==true){
           System.out.println("The appointed date of the developer is: "+getAppointedDate());
           System.out.println("The respective developer name is:"+super.developer_name);
           System.out.println("The period for evaluation is : "+getEvaluationPeriod());
           System.out.println("The date of termination is : "+getTerminationDate());
           System.out.println("The salary of the developer is : "+salary);
           System.out.println("The developer's specialization is : "+getSpecialization());
           System.out.println("The developer was appointed by: "+getAppointedBy());
        }
    }
}