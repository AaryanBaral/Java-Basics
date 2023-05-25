public class MainClass{
    public static void main(String[] args){
        Student a= new Student() ;
        a.setName("Aaryan Baral");
        a.setRoll(211606);
        System.out.println(a.getName());
        System.out.println(a.getRoll());
        Student.college = "Mero College";
        System.out.println(a.getCollege());
    }
}
class Student {
    static String college = "Nepal College of Information Technology";
    private String name;
    private int roll;
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setRoll(int roll){
        this.roll = roll;
    }
    public int getRoll(){
        return roll;
    }
    public String getCollege(){
        return college;
    }
}


