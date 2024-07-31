class Car{
    String name;
    int price;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.price);
    }

    Car(Car c2) {
        this.name=c2.name;
        this.price=c2.price;
    }
    Car(){
        
    }
}

public class Cons {
    public static void main(String args[]){
        Car c1=new Car();
        c1.name="shreyu";
        c1.price=1000000;

        Car c2=new Car(c1);
        c2.printInfo();
    }
}
