package oops;

public class stat {
    public static void main(String[] args) {
        Horse h1= new Horse();
        System.out.println(h1.color);

    }
    
}
class Student{
    String name;
    int age;
    static String school;

}
class Animal{
    String color;
    Animal(){
        System.out.println("CONSTRUCTOR CLALLED");
    }
}
class Horse extends Animal{
        Horse(){
            super.color="brwon";
            System.out.println("Horse called");
        }
}