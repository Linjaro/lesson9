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
public class PTEmployee extends Employee{

    @Override
    public double getPay() {
            double pay = rate*hours;
            totalPay += pay;
            return pay;
    }
}
