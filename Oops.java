class Pen{
    String color;
    String type;

    public void write(){
        System.out.println("Write Something");
    }
}
class Students{
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Students(Students s2){
        this.name=s2.name;
        this.age=s2.age;
    }
    Students(){
        System.out.println("Constructor is called here");
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
    Students s1=new Students();
    s1.name="Shreya";
    s1.age=21;

     
    s1.printInfo();

}
}