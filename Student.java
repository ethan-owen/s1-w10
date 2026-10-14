public class Student{
    public String myClub;
    public String myName;

    public Student(String myName, String myClub){
        this.myClub = myClub;
        this.myName = myName;
    }

    public String getClub(){
        return this.myClub;
    }

    public String getName(){
        return this.myName;
    }

    public boolean isSameClub(Student stud){
        return stud.myClub.equals(this.myClub);
    }
}