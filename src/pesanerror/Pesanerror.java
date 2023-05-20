/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pesanerror;

/**
 *
 * @author hp
 */
public class Pesanerror {
    public static void main(String[] args) {
        int a = 20;
        int b;
        
        try {
            b = a/1;
        } catch (Exception i){
            i.printStackTrace();
            System.out.println("Error karena program dibagi dengan nol");
        }
        
        b=a/1;
        System.out.println("b");
    }
    
}
