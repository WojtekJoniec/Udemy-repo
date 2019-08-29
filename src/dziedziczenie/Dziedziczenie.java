/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dziedziczenie;
import dziedziczenie.potwory.Potwor;
import dziedziczenie.potwory.Szkielet;
import dziedziczenie.potwory.Zombie;
/**
 *
 * @author M6800
 */
public class Dziedziczenie {
    
    
    public static void main(String[] args) {
        //Potwór - klasa bazowa, superklasa
        //Zombie - subklasa
        //Szkielet - subklasa
        
        Potwor p = new Potwor(10, 100);
        System.out.println(p.predkoscChodzenia);
        Szkielet s = new Szkielet(20, 50);
        System.out.println(s.predkoscChodzenia);
        Zombie z = new Zombie(); 
        System.out.println(z.zywotnosc);
        
        
        
    } 
}
