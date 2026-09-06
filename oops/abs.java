package oops;

public class abs {
    public static void main(String[] args) {
        Horse h1= new Horse();
        h1.walk();
        Chicken c1= new Chicken();
        c1.walk();
        System.out.println(h1.color);
    }
}
abstract class Animal{
    String color;
    Animal(){
        color="brown";
        System.out.println("constructor called");
    }
    void eat(){
        System.out.println("Animal eats");
    }
    abstract void walk();

    
}
class Horse extends Animal{
    Horse(){
        System.out.println("horse class called");
    }
    void changecolor(){
        color="red";
    }
    void walk(){
        System.out.println("walks on four legs");
    }
}
class Chicken extends Animal{
    void walk(){
        System.out.println("walks on two legs");
    }
}