public class AcademicCourse extends Course{
    int numberofassessments;
    String lecturername, Level, credit, StartingDate, CompletionDate;
    boolean isRegistered;
    public AcademicCourse(String Level, String credit, String courseID, String CompletionDate ,String coursename,int duration){
        super(courseID,coursename,duration);
        this.Level=Level;
        this.credit=credit;
        this.numberofassessments=numberofassessments;
        lecturername="";
        StartingDate="";
        CompletionDate="";
        isRegistered=false;
        }
        public String getlecturername(){
            return lecturername;
        }
        public String getLevel(){
            return Level;
        }
        public String getcredit(){
            return credit;
        }
        public String getStartingDate(){
            return StartingDate;
        }
        public String getCompletionDate(){
            return CompletionDate;
        }
        public int getnumberofassessments(){
            return numberofassessments;
        }
        public boolean getisRegistered(){
            return isRegistered;
        }
        public void setlecturername(String lecturername){
            this.lecturername=lecturername;
        }
        public void setnumberofassessments(int numberofassessments){
            this.numberofassessments=numberofassessments;
        }
        public void register(String courseleader,String lecturername,String StartingDate,String CompletionDate){
            if (isRegistered==true){
                System.out.println("The course is already registered");
                System.out.println("The courseleader is : "+courseleader);
                System.out.println("The StartingDate is : "+StartingDate);
                System.out.println("The CompletionDate is : "+CompletionDate);
            }else{
                super.setcourseleader(courseleader);
                this.lecturername=lecturername;
                this.StartingDate=StartingDate;
                this.CompletionDate=CompletionDate;
                this.isRegistered=true;
            }
        }
        public void display(){
            super.display();
            if (isRegistered==true){
                System.out.println("The lecturername is : "+lecturername);
                System.out.println("The Level is : "+Level);
                System.out.println("The credit is : "+credit);
                System.out.println("The StartingDate is : "+StartingDate);
                System.out.println("The CompletionDate is : "+CompletionDate);
                System.out.println("The numberofassessments is : "+numberofassessments);
            }
        }
}