
package interfaceEX;

public class Zombie implements Monster {
    String name;
    Zombie(String n){
        name = n;
    }
    @Override
    public void attack() {
        System.out.println("Zombie is eating your brain");
    }

    @Override
    public void identify() {
        System.out.println("I am "+ name +"the zombie");
    }
    
}
