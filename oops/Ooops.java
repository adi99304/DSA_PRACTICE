package oops;

public class Ooops {
    public static void main(String[] args){
        // Pen p1= new Pen();
        // p1.setcolor("red");
        // System.out.println(p1.getcolor());
        // p1.settip(5);
        // System.out.println(p1.gettip());   
        //   Bankaccount b1= new Bankaccount(); 
        // b1.username="Aditya";
        // b1.setpass("Aditya");
        // System.out.println(b1.username) ;
        // // System.out.println(b1.password); 
        // System.out.println(p1.gettip());
        // Pen p2 = new Pen();
        // p2.settip(2);
        // System.out.println(p1.gettip());
        // System.out.println(p2.gettip());
        // Student s2= new Student("Aditya");
        Student s1= new Student();
        s1.name="Aditya";
        s1.age=22;
        s1.password="xyz";
        s1.marks[0]=100;
        s1.marks[1]=90;
        s1.marks[2]=80;
        Student s2 = new Student(s1);
        s1.marks[0]=30;
        for(int i =0;i<3;i++){
            System.out.println(s2.marks[i]);
        }
        int[] ages= new int[4];
        
    
    }
      
}
class Pen{
    //prop+ functions
    private String color;
    private int tip;
    void setcolor(String newcolor){
         this.color= newcolor;
    }
    int gettip(){
        return this.tip;
    }
    String getcolor(){
        return this.color;
    }
    void settip(int newtip){
        this.tip=newtip;
    }
}
class Student{
    String name;
    int age;
    String password;
    float percentage;
    int[] marks= new int[3];
    void calpercentage(int phy,int chem,int math){
        percentage=(phy+chem+math)/3*100;
    }
//     Student(){
//         System.out.println("student object created");
//     }
//     Student(String name){
//         this.Name= name;
//         System.out.println("Student object with name created");
//     }
//     Student(int age){
//         this.age=age;
//         System.out.println("Student object with age crewated");
//     }
Student(){
    System.out.println("New constructor is created");
}
// Shallow copy constructor
//     Student(Student s){
//         this.name= s.name;
//         this.age=s.age;
//         this.marks=s.marks;
//     }

 //deep copy
 Student(Student s ){
    marks= new int[3];
    this.name=s.name;
    this.age=s.age;
    for(int i =0;i<marks.length;i++){
        this.marks[i]=s.marks[i];
    }
 }
  }
class Bankaccount{
    public String username;
    private String password;
    public void setpass(String pwd){
        password=pwd;
    }

}