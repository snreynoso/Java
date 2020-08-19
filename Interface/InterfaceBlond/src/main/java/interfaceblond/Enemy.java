
package interfaceblond;

public class Enemy implements Character {
    
    public String weapon = "lightsaber";
    
    @Override
    public void attack(){
        System.out.println("The enemy attacks you");
    }
    
    @Override
    public void heal(){
        System.out.println("The enemy heals himself");
    }
    
    @Override
    public String getWeapon(){
        return weapon;
    }
    
    // Puede tener mas fuciones ademas de las de las interfaces
    public void weaponDraw(){
        System.out.println("draw out weapon");
    }
}
