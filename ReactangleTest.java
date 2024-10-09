class Reactangle{
    int length;
    int breadth;

    public void Area(){
        System.out.println(length*breadth);
    }
    public void Perimeter(){
        System.out.println(2*length*breadth);
    }

}
class ReactangleTest{
    public static void main(String[] args){
        Reactangle R1 = new Reactangle();
        R1.length=4;
        R1.breadth=5;
        R1.Area();
        Reactangle R2 = new Reactangle();
        R2.length=6;
        R2.breadth=7;
        R2.Perimeter();
    }
}