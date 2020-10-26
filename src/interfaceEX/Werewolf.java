
package interfaceEX;


public class Werewolf implements Monster{
    private String name;
    Werewolf(String n){
        name = n;
    }
    
    @Override
    public void attack() {
        System.out.println("");
    }

    @Override
    public void identify() {
        System.out.println("i am "+name +"the Werewolf");
    }
    
}
