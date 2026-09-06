package collections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Demo {
    public static void main(String[] args) {
    Map<String,Integer> students= new HashMap<>();
    students.put("Aditya", 18);
    students.put("aryan", 23);
    students.put("ninad",34);
    students.put("jermia",45);
    for(String x:students.keySet()){
        System.out.println(students.get(x));
    }
    }
    
    
}
