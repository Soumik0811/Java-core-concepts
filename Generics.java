//Generics
/*
What are Generics in Java?
 --- Generics means writing code that can work with any type of data, while still keeping type safety.
*/
//Creating a pair<k,v> class 
import java.util.*;
public class Pair<K,V>{
    private K first;
    private V second;
    
    public Pair(K first, V second){
        this.first = first;
        this.second = second;
    }
    
    public K getFirst(){
        return first;
    }
    public V getSecond(){
        return second;
    }
    public static void main(String[] args){
        Pair<String, Integer> pair = new Pair<>("Soumik", 21);
        String name = pair.getFirst();
        int age = pair.getSecond();
        System.out.println("Name is: "+name+" and age is "+age);
    }
}

//Bounding type parameters
import java.util.*;
    public class Bounding<T extends Number>{
    private T value;
    public Bounding(T value){
        this.value = value;
    }
    
    public T getValue(){
        return value;
    }
    public static void main(String[] args){
        Bounding<Integer> obj = new Bounding<>(234);
        System.out.println("Value is: "+ obj.getValue());
        
        Bounding<Double> dec = new Bounding<>(23.45);
        System.out.println("Decimal Value is: "+ dec.getValue());
        
        //This will not work because it is not part of the Number object
        // Bounding<String> str = new Bounding<>("Name");
        // System.out.println("String Value is: "+ str.getValue());
    }
}

