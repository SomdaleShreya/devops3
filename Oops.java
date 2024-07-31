class Pen{
    String color;
    String type;

    public void write(){
        System.out.println("Write Something");
    }
}
class Student{
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Student(Student s2){
        this.name=s2.name;
        this.age=s2.age;
    }
    Student(){
        
    }

}
public class Oops{
public static void main(String[] args){
    //Pen pen1=new Pen();
    //pen1.color="red";
    //pen1.type="gel";
    //pen1.write();

    //Pen pen2=new Pen();
    //pen2.color="Green";
    //pen2.type="ballpoint";
    //pen2.write();
    //Student s1=new Student("shreya",21);
    Student s1=new Student();
    s1.name="Shreya";
    s1.age=21;

    Student s2=new Student(s1);
    s2.printInfo();
}
}