/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emploeeProject.staticEX;

/**
 *
 * @author moha7150
 */
public class blobMaker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        blob a,b,c;
        System.out.println("i start with "+blob.getBlobCount()+" blobs");
        a = new blob("Joey");
        b = new blob("Franky");
        c = new blob("Moe");
        System.out.println("i have "+blob.getBlobCount()+" blobs");
        System.out.println("My blobs are called: ");
        System.out.println(a.getName());
        System.out.println(b.getName());
        System.out.println(c.getName());
    }
    
}
