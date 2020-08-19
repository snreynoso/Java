
package interfaceblond;

import java.util.Random;

public class InterfaceBlond {
    
    public static Character summonCharacter(){
        Random rand = new Random();
        if (Math.abs(rand.nextInt())%2 == 0){
            return new Enemy();
        } else {
            return new Hero();
        }
    }
    
    public static void main(String[] args) {
        
        Enemy DarVea = new Enemy();
        Hero ObiWan = new Hero();
        DarVea.attack();
        ObiWan.attack();
        DarVea.heal();
        ObiWan.heal();
        System.out.println("Enemy weapon: " + DarVea.getWeapon());
        System.out.println("Hero weapon: " + ObiWan.getWeapon());
        Character spy = summonCharacter();
        spy.attack();
        spy.heal();
    }
}
