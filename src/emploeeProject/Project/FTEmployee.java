/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emploeeProject.Project;

/**
 *
 * @author moha7150
 */
public class FTEmployee extends Employee{

    @Override
    public double getPay() {
            double pay = rate * 40 + (hours - 40) * (rate * 2);
            totalPay += pay;
            return pay;
    }
    
    
}
