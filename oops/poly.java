package oops;
import java.util.*;
public class poly {
    public static void main(String[] args) {
        // Calculator c1= new Calculator();
        // System.out.println(c1.sum(1.5f,2.5f));
        Deer d1= new Deer();
        d1.eat();
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
    }
}

//method overloading or compile time polymorphism
class Calculator{
    int sum(int a ,int b){
        return a +b;
    }
    float sum (float a , float  b){
        return a+b;
    }
    int sum(int a ,int b , int c){
        return a+b+c;
    }
}
//method overriding or runtime polymorphism
class Animal{
void eat(){
    System.out.println("will eat anything");
}
}
class Deer extends Animal{
    void eat(){
        System.out.println("eat grass");
    }
}