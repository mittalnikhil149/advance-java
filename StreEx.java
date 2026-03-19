class Student  {
    private int sid;
    private String name;
    private int marks;
    Student(int sid,String name,int markds){
        this.sid=sid;
        this.name=name;
        this.marks=marks;
    }
    public int getsid(){
        return sid;

    }
    public String getname(){
        return name;

    }
    public int getmarks(){
        return marks;

    }
    @Override
    public String toString(){
        return "Student[sid =" + sid+"name ="+ name+"marks =" +marks+"]";
    }
    
}
public class StreEx{
    
}
