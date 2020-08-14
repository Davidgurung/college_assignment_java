public class Developer
{
    //declare instance variables
    String platform;
    String interviewer_name;
    String developer_name;
    int working_hours;
    
    public Developer(String platform,String interviewer_name,int working_hours)
    {
        //initialize instance variable
        this.platform=platform;
        this.interviewer_name=interviewer_name;
        this.developer_name="";
        this.working_hours=working_hours;
    }
    public String getPlatform()
    {
        return platform;
    }
    public String getInterviewer_name()
    {
        return interviewer_name;
    }    
    public int getWorking_hours()
    {
        return working_hours;
    }
    public void setDeveloper_name(String developer_name)
    {
        this.developer_name=developer_name;
    }
    public void display()
    {
        System.out.println("The name of the platform is :"+getPlatform());
        System.out.println("The total working hours is :"+getWorking_hours());
        System.out.println("The name of the interviewer is :"+ getInterviewer_name());
        if (!developer_name.equals("")){
        System.out.println("The developer name is :"+developer_name);
        }
    }
}
