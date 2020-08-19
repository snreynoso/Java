
package person;

import static person.HairColor.*;

public class Person {
    
    HairColor hairColor = BROWN;
    
    public Person(){
        
    }
    
    public static void main(String[] args) {
        Person peterParker = new Person();
        Person spiderMan = peterParker;
        
        peterParker.hairColor = PINK;
        
        System.out.println("Hair Color Peter: " + peterParker.hairColor);
        System.out.println("Hair Color Spider: " + spiderMan.hairColor);
    }
    
}
