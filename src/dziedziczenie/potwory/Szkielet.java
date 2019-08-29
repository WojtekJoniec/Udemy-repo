/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dziedziczenie.potwory;

/**
 *
 * @author M6800
 */
public class Szkielet extends Potwor {
    
    String typBroni;
    
    public Szkielet(){
        System.out.println("Domyślny konstruktor - Szkielet");
    }
    
    public Szkielet(double predkoscChodzenia, double zywotnosc){
        super(predkoscChodzenia, zywotnosc);
        System.out.println("NIE - dsomyślny konstruktor - Szkielet");
    }
    
    public Szkielet(double predkoscChodzenia, double zywotnosc, String typBroni){
        super(predkoscChodzenia, zywotnosc);
        this.typBroni = typBroni;
        System.out.println("NIE - dsomyślny konstruktor - Szkielet + broń");
    }
}
