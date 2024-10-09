class Pens {
    String color;
    String type;
    
    public void Write(){
        System.out.println("Writing somthing");
    }
    public void printcolor(){
        System.out.println(this.type);
        System.out.println(this.type);
    }
}
class Studen {
    String  name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);

    }
    // Studen(){                                //non-parameterized constructor 
    //     System.out.println("Construcot called here:");
    // }

    // Studen(String nam, int agee){             //parameterized constructor
    //     this.name = nam;
    //     this.age=agee;
    // }

    Studen(Studen s2){                           //Copy constructor
        this.name=s2.name;
        this.age=s2.age;
    }
    Studen(){

    }

}
public class Trys{
    public static void main(String[] args){
    // Pens pen1 = new Pens();
    // pen1.color="pink";
    // pen1.type="gelPen";
    // pen1.Write();
    // Pens pen2 = new Pens();
    // pen2.color="red";
    // pen2.type="ball";
    // // pen1.printcolor();
    // pen2.printcolor();

    Studen stud = new Studen();
    stud.name = "Shreyu";
    stud.age= 21;
     

    Studen s2 = new Studen(stud);
    s2.printInfo();
}
}