/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaceEX;

/**
 *
 * @author moha7150
 */
public class MonsterFarm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Monster x[] = new Monster[6];
        for (int i = 0; i < 6; i++) {
            if(i<2){
                x[i] = new Vampire("Monster"+(i+1));
            }
            else if(i<2){
                x[i] = new Zombie("Monster"+(i+1));
            }
            else{
                x[i] = new Werewolf("Monster"+(i+1));
            }
            
        }
        for (int i = 0; i < 6; i++) {
            x[i].identify();
            x[i].attack();
            //casting to vampire
            if (x[i] instanceof Vampire) {
                
            
            ((Vampire)x[i]).changeToBat();
            }
        }
    }
    
}
