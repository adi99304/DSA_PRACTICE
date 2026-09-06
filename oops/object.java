package oops;

public class object {
    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.eat();
        Dog d1= new Dog();
        d1.legs=4;
        System.out.println(d1.legs);
    }
}
class Animal{
    String color;
    void eat(){
        System.out.println("eating");
    }
    void breath(){
        System.out.println("breathing");
    }
}
class Mammal extends Animal{
    int legs;
}
class Dog extends Mammal{
    String breed;
}



class Fish extends Animal{
    int fins;
    void swim(){
        System.out.println("Swims in water");
    }
}
class Bird extends Animal{
    void fly(){
        System.out.println("flying");
    }
}